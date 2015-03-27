#!/bin/bash

pushd `dirname $0` > /dev/null
SCRIPTPATH=`pwd`
popd > /dev/null

PORT=8113

. $SCRIPTPATH/fitnesse-functions.sh


if ( check_devices && adb_forward ); then
   echo "Launching Fitnesse on port $PORT"
   java -jar $SCRIPTPATH/fitnesse-standalone.jar -p $PORT -v -d $SCRIPTPATH
fi
