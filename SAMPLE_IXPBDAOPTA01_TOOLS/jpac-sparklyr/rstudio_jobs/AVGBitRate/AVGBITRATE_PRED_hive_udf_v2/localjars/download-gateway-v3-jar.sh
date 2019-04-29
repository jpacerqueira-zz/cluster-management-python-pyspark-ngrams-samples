#!/usr/bin/env bash
scp analyticsdb@ixpbdaopta01.prod.ix.perform.local:~/h2omodels-v2-avg-bitrate/h2o-genmodel.jar .
scp analyticsdb@ixpbdaopta01.prod.ix.perform.local:~/h2omodels-v2-avg-bitrate/gbm_grid1_model_53.java .
mv  gbm_grid1_model_53.java GBMAvgBitRateMo53.loc1.java
sed "s,gbm_grid1_model_53,GBMAvgBitRateMo53,g"  GBMAvgBitRateMo53.loc1.java > GBMAvgBitRateMo53.loc2.java
# 
sed "s,import,package ai.h2o.hive.udf; import,1" GBMAvgBitRateMo53.loc2.java > GBMAvgBitRateMo53.java
#
cp GBMAvgBitRateMo53.java ../src/main/java/ai/h2o/hive/udf/GBMAvgBitRateMo53.java
rm GBMAvgBitRateMo53.loc*.java 
