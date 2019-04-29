#!/usr/bin/env bash
scp analyticsdb@ixpbdaopta01.prod.ix.perform.local:~/h2omodels-v4-avg-bitrate-dl/h2o-genmodel.jar .
scp analyticsdb@ixpbdaopta01.prod.ix.perform.local:~/h2omodels-v4-avg-bitrate-dl/dl_grid1_model_3.java .
mv  dl_grid1_model_3.java DLAvgBitRateMo3.loc1.java
sed "s,dl_grid1_model_3,DLAvgBitRateMo3,g"  DLAvgBitRateMo3.loc1.java > DLAvgBitRateMo3.loc2.java
# 
sed "s,import,package ai.h2o.hive.udf; import,1" DLAvgBitRateMo3.loc2.java > DLAvgBitRateMo3.java
#
cp DLAvgBitRateMo3.java ../src/main/java/ai/h2o/hive/udf/DLAvgBitRateMo3.java
rm DLAvgBitRateMo3.loc*.java 
