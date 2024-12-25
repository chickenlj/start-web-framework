#!/bin/bash

armsLicenseKey=$1
functionName=$2
region=$3

wget http://arms-apm-${region}.oss-${region}.aliyuncs.com/ot-dev/4.2.1-llm/aliyun-java-agent.jar

java -javaagent:aliyun-java-agent.jar \
-Darms.licenseKey=${armsLicenseKey} \
-Darms.appName=${functionName}-fc \
-Daliyun.javaagent.regionId=${region} \
-jar \
target/playground-flight-booking-example.jar