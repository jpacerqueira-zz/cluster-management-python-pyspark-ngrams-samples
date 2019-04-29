#!/usr/bin/env bash
VAR=$1
#set environment variables for Livy
export SPARK_HOME=/usr/lib/spark
export JAVA_HOME=/usr/java/latest

export HADOOP_CONF_DIR=/etc/hadoop/conf
export HUE_SECRET_KEY=oracle

rm -rf /usr/lib/livy-server-0.2.0/logs
mkdir -p /usr/lib/livy-server-0.2.0/logs
chmod 777 /usr/lib/livy-server-0.2.0/logs 

#run Livy. You must run Livy as a user who has access to hdfs, for example, the superuser hdfs.
nohup  /usr/lib/livy-server-0.2.0/bin/livy-server $VAR &
