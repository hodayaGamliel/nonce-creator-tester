#! /bin/bash

PATH_TO_SCALA_FILE="/Users/takipimbp1/Projects/takipi/test/nonce/scala/app/controllers"
SCALA_FILE="$PATH_TO_SCALA_FILE/Nonce1.scala"
TEST_SCALA_FILE="$PATH_TO_SCALA_FILE/test.scala"
PATH_TO_ROUTES="/Users/takipimbp1/Projects/takipi/test/nonce/scala/conf"
ROUTES_FILE="$PATH_TO_ROUTES/routes"
TEST_ROUTES_FILE="$PATH_TO_ROUTES/test.txt"
JAVA_OPTS="-agentlib:TakipiAgent"
CURRENT_NAME="throwExcep1"

#CURRENT_NAME="nonce1"
#NEW_DIR=2

set -x

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

  cp $SCALA_FILE $TEST_SCALA_FILE
  sed "s/$CURRENT_NAME/$NEW_NAME/g" $TEST_SCALA_FILE > $SCALA_FILE

  cp $ROUTES_FILE $TEST_ROUTES_FILE
  sed "s/$CURRENT_NAME/$NEW_NAME/g" $TEST_ROUTES_FILE > $ROUTES_FILE
}

function dir_name()
{
  if [ $NEW_DIR -eq "1" ]; then
  NUM=$1
  DATE=`date +%Y-%m-%d-%H-%M-%S`
  DIR_NAME="$DATE-takipi-$NUM"
  elif [ $NEW_DIR -eq "2" ]; then
  DIR_NAME="takipi"
  fi
  echo $DIR_NAME
}


function run_scala_program
{
  curl -i http://localhost:9000/Nonce1\?nav\=aaa
}

# This function clears the java file before execution.
function clear()
{
  CURRENT_NAME=$1
  FIRST_NAME=$2

  change $CURRENT_NAME $FIRST_NAME
}

function close()
{
  # PID=ps -ef | grep activator | awk '{print $2}' | head -n 1
  # kill -9 $PID
  kill -9 `ps -ef | grep activator | awk '{print $2}' | head -n 1`
}

function run()
{
  CURRENT_NAME=$1
  NUM=$2

  NEW_NAME=$(get_new_name $CURRENT_NAME)
  change $CURRENT_NAME $NEW_NAME
  run_scala_program
}

function main()
{
  OPTION="$1"
  TIMES="$2"
  A="$3"
  check_if_entered_name $A
  FIRST_NAME=$CURRENT_NAME
#  option $OPTION
  for i in `seq 1 $TIMES`;
  do
    echo run number: $i
    run $CURRENT_NAME $i
    CURRENT_NAME=$NEW_NAME
  done

  clear $CURRENT_NAME $FIRST_NAME
  close
}

main $@

#$A $CURRENT_NAME $OPTION $TIMES $SCALA_FILE $CLASS_NAME
