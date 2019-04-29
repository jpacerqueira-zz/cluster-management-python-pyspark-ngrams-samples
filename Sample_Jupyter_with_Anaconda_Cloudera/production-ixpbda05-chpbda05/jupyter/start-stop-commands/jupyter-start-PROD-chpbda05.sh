#!/usr/bin/env bash
# USING OPTION : pip install findspark

#set environment variables for Jupyter

# user access active for user:userclass initiation services in hadoop
#########################################################################################
export KRB5CCNAME=/tmp/krb5cc_$(id -u)
#########################################################################################
kinit -kt ~/.keytabs/$(whoami).keytab $(whoami)/chpbda@BDA2.PERFORMGROUP.COM -c /tmp/krb5cc_$(id -u)
klist /tmp/krb5cc_$(id -u)

# Spark.1.6 
#echo "spark.1.6"
#export SPARK_HOME=/opt/cloudera/parcels/CDH/lib/spark
# Spark.2.3
echo "spark.2.3.0.cloudera2"
export SPARK_HOME=/opt/cloudera/parcels/SPARK2/lib/spark2
export JAVA_HOME=/usr/java/latest/

export PYSPARK_DRIVER_PYTHON=jupyter
export PYSPARK_DRIVER_PYTHON_OPTS='notebook'
 
export PYSPARK_PYTHON=/opt/cloudera/parcels/Anaconda/bin/python

cd /home/analyticsdb/projects/opta_datascience ; /opt/cloudera/parcels/Anaconda/bin/python2.7 /opt/cloudera/parcels/Anaconda/bin/jupyter notebook --port 9003 --no-browser --ip=0.0.0.0  
