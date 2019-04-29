#!/usr/bin/env bash
scp analyticsdb@ixpbdaopta01.prod.ix.perform.local:~/h2omodels-v5-avg-bitrate-dl/h2o-genmodel.jar .
scp analyticsdb@ixpbdaopta01.prod.ix.perform.local:~/h2omodels-v5-avg-bitrate-dl/dl_grid1_model_18.java .
mv  dl_grid1_model_18.java DLAvgBitRateMo18.loc1.java
sed "s,dl_grid1_model_18,DLAvgBitRateMo18,g"  DLAvgBitRateMo18.loc1.java > DLAvgBitRateMo18.loc2.java
# 
sed "s,import,package ai.h2o.hive.udf; import,1" DLAvgBitRateMo18.loc2.java > DLAvgBitRateMo18.java
#
cp DLAvgBitRateMo18.java ../src/main/java/ai/h2o/hive/udf/DLAvgBitRateMo18.java
rm DLAvgBitRateMo18.loc*.java 
