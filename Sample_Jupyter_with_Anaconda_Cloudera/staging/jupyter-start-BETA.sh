#!/bin/bash
# USING OPTION : pip install findspark

#set environment variables for Jupyter

export SPARK_HOME=/opt/cloudera/parcels/CDH/lib/spark
export JAVA_HOME=/usr/java/jdk1.8.0_91

export PYSPARK_DRIVER_PYTHON=jupyter
export PYSPARK_DRIVER_PYTHON_OPTS='notebook'
 
export PYSPARK_PYTHON=/opt/cloudera/parcels/Anaconda-4.2.0/bin/python

/opt/cloudera/parcels/Anaconda/bin/python2.7 /opt/cloudera/parcels/Anaconda/bin/jupyter notebook --port 9003 --no-browser --ip=0.0.0.0 
