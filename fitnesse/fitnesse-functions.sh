#!/bin/bash


pushd `dirname $0` > /dev/null
SCRIPTPATH=`pwd`
popd > /dev/null

function check_devices() {
    echo ">Checking if device is available"
    playerCount=`ps -ef | grep player | grep -v 'grep' | wc -l`
    adbRunning=`ps -ef | grep adb | grep -v 'grep' | wc -l`
    adbDevices=`adb devices | grep -v 'devices' | wc -l`

    if [ $playerCount -eq 0 ]
    then
        echo "We have no Genymotion instances running...checking for devices"
        if [ $adbRunning -eq 0 ]
        then
          echo "adb is not running so start it up"
            adb start-server
            echo "adb started"
        fi

        echo "adb is running"
        if [ $adbDevices -gt 1 ]
        then
            echo "we have a device"
        else
            osascript -e 'tell app "System Events" to display dialog "No Genymotion instance or attached device.  When you launch your fitnesse build be sure to execute:\n\n adb forward tcp:8099 tcp:8099\n\n on the command line or stuff just wont work"'
            return 1
        fi
        return 0
    fi
}

function adb_forward() {

    FIT_PORT=8099
    echo ">redirecting adb port"
    adb forward tcp:$FIT_PORT tcp:$FIT_PORT

    if [ $? -ne 0 ]; then
       echo "Port $FIT_PORT is used by someone else"
       echo "Running check.."
       sudo lsof -i -n -P | grep TCP | grep $FIT_PORT
       return 1
    fi
return 0
}

