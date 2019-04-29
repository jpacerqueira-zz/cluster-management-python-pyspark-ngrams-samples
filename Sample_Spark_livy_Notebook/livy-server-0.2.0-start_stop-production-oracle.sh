#!/usr/bin/env bash
VAR=$1

#autodiscover latest HUE config location
HUE_CONF_DIR=`find /var/run/cloudera-scm-agent/process/ -type d -name "*-hue-HUE_SERVER" |sort -r |head -1`

#set environment variables for Livy
export JAVA_HOME=/usr/java/default/
export SPARK_HOME=/opt/cloudera/parcels/CDH/lib/spark
export SPARK_CONF_DIR=/opt/cloudera/parcels/CDH/lib/spark/conf

export HADOOP_CONF_DIR=${HUE_CONF_DIR}/yarn-conf
export HUE_USER=oracle
export HUE_SECRET_KEY='0v3rM!n\)'
export ORACLE_HOME=/home/oracle
export PRINCIPAL=oracle/ixpbda@BDA.PERFORMGROUP.COM
export KEYTAB=${HOME}/.keytabs/oracle.keytab


# for ${HUE_USER} Kerberos credentials
export KRB5CCNAME=/tmp/krb5cc_$(id -u ${HUE_USER})
kinit -kt ${ORACLE_HOME}/.keytabs/${HUE_USER}.keytab ${HUE_USER}/ixpbda@BDA.PERFORMGROUP.COM -c ${KRB5CCNAME}
klist ${KRB5CCNAME}

#rm -rf /usr/lib/livy-server-0.2.0/logs
#mkdir /usr/lib/livy-server-0.2.0/logs
touch /usr/lib/livy-server-0.2.0/logs/livy-oracle-server.out
chmod 777 /usr/lib/livy-server-0.2.0/logs

#run Livy. You must run Livy as a user who has access to hdfs, for example, the superuser hdfs.
echo info: HADOOP_CONF_DIR=${HADOOP_CONF_DIR}
nohup su ${HUE_USER} /usr/lib/livy-server-0.2.0/bin/livy-server $VAR &
