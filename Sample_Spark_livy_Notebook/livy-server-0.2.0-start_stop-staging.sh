#!/usr/bin/env bash
VAR=$1
#set environment variables for Livy
export SPARK_HOME=/opt/cloudera/parcels/CDH/lib/spark
export JAVA_HOME=/usr/java/jdk1.8.0_91

#export HADOOP_CONF_DIR=/var/run/cloudera-scm-agent/process/2076-hue-HUE_SERVER/yarn-conf
#autodiscover latest HUE config location
HUE_CONF_DIR=`find /var/run/cloudera-scm-agent/process/ -type d -name "*-hue-HUE_SERVER" |sort -r |head -1`
export HADOOP_CONF_DIR=${HUE_CONF_DIR}/yarn-conf
export HUE_SECRET_KEY=oracle

rm -rf /usr/lib/livy-server-0.2.0/logs
mkdir /usr/lib/livy-server-0.2.0/logs
chmod 777 /usr/lib/livy-server-0.2.0/logs 

#run Livy. You must run Livy as a user who has access to hdfs, for example, the superuser hdfs.
nohup su oracle  /usr/lib/livy-server-0.2.0/bin/livy-server $VAR &
