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
  CURRENT_NAME=$1
  echo $CURRENT_NAME | grep -o '[0-9]\+'
}

function get_only_name()
{
  CURRENT_NAME=$1
  echo $CURRENT_NAME | grep -o '[a-z,A-Z,_]\+'
}

function get_new_name()
{
 CURRENT_NAME=$1
 COUNTER=$(counter `get_only_num   $CURRENT_NAME`)
 NAME=$(get_only_name $CURRENT_NAME)
 NEW_NAME=$NAME$COUNTER
 echo $NEW_NAME
}

function option()
{
  OPTION=$1
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
  JAVA_FILE=$1
  CURRENT_NAME=$2
  NEW_NAME=$3
  cp $JAVA_FILE test.java
  sed "s/$CURRENT_NAME/$NEW_NAME/g" test.java > $JAVA_FILE
}

function run_java_program
{
  JAVA_FILE=$1
  CLASS_NAME=$2
  NUM=$3
  DATE=`date +%Y-%m-%d-%H-%M-%S`
  DIR_NAME="$DATE-takipi-$NUM"
  if [ ! -d "$DIR_NAME" ]; then
      mkdir $DIR_NAME
  fi
  cp $CLASS_NAME* $DIR_NAME
  javac $DIR_NAME/$JAVA_FILE
  java -agentlib:TakipiAgent -cp $DIR_NAME $CLASS_NAME
}

function clear()
{
  JAVA_FILE=$1
  CURRENT_NAME=$2
  FIRST_NAME=$3
  cp $JAVA_FILE test.java
  sed "s/$CURRENT_NAME/$FIRST_NAME/g" test.java > $JAVA_FILE
}

function run()
{
  CURRENT_NAME=$1
  JAVA_FILE=$2
  CLASS_NAME=$3
  NUM=$4
  NEW_NAME=$(get_new_name $CURRENT_NAME)
  change $JAVA_FILE $CURRENT_NAME $NEW_NAME
  run_java_program $JAVA_FILE $CLASS_NAME $NUM
}

function main()
{
  # A=$1
  # CURRENT_NAME=$2
  # OPTION=$3
  # TIMES=$4
  # JAVA_FILE=$5
  # CLASS_NAME=$6
  check_if_entered_name $A
  FIRST_NAME=$CURRENT_NAME
  option $OPTION
  for i in `seq 1 $TIMES`;
  do
    echo run number: $i
    run $CURRENT_NAME $JAVA_FILE $CLASS_NAME $i
    CURRENT_NAME=$NEW_NAME
  done
  clear $JAVA_FILE $CURRENT_NAME $FIRST_NAME
}

main #$A $CURRENT_NAME $OPTION $TIMES $JAVA_FILE $CLASS_NAME
