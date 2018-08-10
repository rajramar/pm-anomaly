#!/bin/bash

today=$(date +%Y-%m-%d)
currentTime=$(date +%Y-%m-%d-%H-%M-%S)

function checkAnomaly(){
  metricNames=$1
  metricValues=$2
  echo $1 $2
  count=$(mysql --silent -h localhost -P 3306 -u root -pwipro@123 -D PlatformMonitor<<<"select count(*) as return_code from MetricsAnomalyRange where $2 between lowerlimit and upperlimit AND metricsName='$1'")
 
 if [ $count -eq 0 ]
 then
     #echo "Metrics is Within Range : "$1 |& tee -a log_$today.txt
      echo "Anomaly Detected at "$currentTime " for the metrics : "$1" with value :  "$2 |& tee -a anomalyResult_$today.txt
 fi

}


checkAnomaly "cpu_user" $1
checkAnomaly "cpu_system" $2
checkAnomaly "cpu_idle" $3
checkAnomaly "cpu_wio" $4
checkAnomaly "mem_free" $5
checkAnomaly "mem_cached" $6

