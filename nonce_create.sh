JAVA_FILE="Nonce1.java"
CLASS_NAME="Nonce1"
##option - 1 change the method name
##option - 2 change the nonce name
OPTION="$1"
TIMES="$2"
A="$3"
CURRENT_NAME="throwExcep1"
#CURRENT_NAME="nonce1"

#set -x

function counter()
{
  echo `expr $1 + 1`
}

function get_only_num()
{
  echo $CURRENT_NAME | grep -o '[0-9]\+'
}

function get_only_name()
{
  echo $CURRENT_NAME | grep -o '[a-z,A-Z,_]\+'
}

function get_new_name()
{
 COUNTER=$(counter `get_only_num`)
 NAME=$(get_only_name)
 NEW_NAME=$NAME$COUNTER
 echo $NEW_NAME
}

function option()
{
  if [ $OPTION -eq "1" ]; then
    CURRENT_OPTION="method"
  elif [ $OPTION -eq "2" ]; then
    CURRENT_OPTION="field"
  fi
}

function check_if_entered_name()
{
  if [ "$1" ]; then
    CURRENT_NAME=$1
  fi
}

function change()
{
  cp $JAVA_FILE test.java
  sed "s/$CURRENT_NAME/$NEW_NAME/g" test.java > $JAVA_FILE
}

function run_java_program
{
  DATE=`date +%Y-%m-%d-%H-%M-%S`
  DIR_NAME="$DATE-takipi-$i"
  if [ ! -d "$DIR_NAME" ]; then
      mkdir $DIR_NAME
  fi
  cp $CLASS_NAME* $DIR_NAME
  javac $DIR_NAME/$JAVA_FILE
  java -cp $DIR_NAME $CLASS_NAME
}

function clear()
{
  cp $JAVA_FILE test.java
  sed "s/$CURRENT_NAME/$FIRST_NAME/g" test.java > $JAVA_FILE
}

function run()
{
  NEW_NAME=$(get_new_name)
  change
  run_java_program
  CURRENT_NAME=$NEW_NAME
}

function main()
{
  check_if_entered_name $A
  FIRST_NAME=$CURRENT_NAME
  option
  for i in `seq 1 $TIMES`;
  do
    echo run number: $i
    run
  done
  clear
}

main
