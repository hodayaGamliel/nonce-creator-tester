#! /bin/bash

JAVA_FILE="Nonce1.java"
CLASS_NAME="Nonce1"
JAVA_OPTS="-agentlib:TakipiAgent"
##option - 1 change the method name
##option - 2 change the nonce name
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
  CURRENT_NAME=$1
  NEW_NAME=$2

  cp $JAVA_FILE test.java
  sed "s/$CURRENT_NAME/$NEW_NAME/g" test.java > $JAVA_FILE
}

function run_java_program
{
  NUM=$1
  DATE=`date +%Y-%m-%d-%H-%M-%S`
  DIR_NAME="$DATE-takipi-$NUM"

  if [ ! -d "$DIR_NAME" ]; then
      mkdir $DIR_NAME
  fi

  cp $CLASS_NAME* $DIR_NAME
  javac $DIR_NAME/$JAVA_FILE
  java $JAVA_OPTS -cp $DIR_NAME $CLASS_NAME
}

# This function clears the java file before execution.
function clear()
{
  CURRENT_NAME=$1
  FIRST_NAME=$2

  cp $JAVA_FILE test.java
  sed "s/$CURRENT_NAME/$FIRST_NAME/g" test.java > $JAVA_FILE
}

function run()
{
  CURRENT_NAME=$1
  NUM=$2

  NEW_NAME=$(get_new_name $CURRENT_NAME)
  change $CURRENT_NAME $NEW_NAME
  run_java_program $NUM
}

function main()
{
  OPTION="$1"
  TIMES="$2"
  A="$3"
  check_if_entered_name $A
  FIRST_NAME=$CURRENT_NAME
  option $OPTION

  for i in `seq 1 $TIMES`;
  do
    echo run number: $i
    run $CURRENT_NAME $i
    CURRENT_NAME=$NEW_NAME
  done

  clear $CURRENT_NAME $FIRST_NAME
}

main $@
#$A $CURRENT_NAME $OPTION $TIMES $JAVA_FILE $CLASS_NAME
