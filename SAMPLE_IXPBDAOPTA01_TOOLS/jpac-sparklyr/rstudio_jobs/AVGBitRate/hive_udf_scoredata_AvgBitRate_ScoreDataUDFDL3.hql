ADD JAR hdfs:///user/analyticsdb/H2O/UDFtest/DLAvgBitRateM3Lib/v4.0/h2o-genmodel.jar;
ADD JAR hdfs:///user/analyticsdb/H2O/UDFtest/DLAvgBitRateM3Lib/v4.0/ScoreDataUDFGBMAVGMUEX-1.0-SNAPSHOT.jar;

CREATE TEMPORARY FUNCTION scoredatavg AS 'ai.h2o.hive.udf.ScoreDataUDFGBMAVGM17';
USE default;
SHOW TABLES;
DROP TABLE IF EXISTS conviva_avgbitrate_1asset_pred;
CREATE TABLE conviva_avgbitrate_1asset_pred AS SELECT asset, deviceos, country, state, city, asn, isp, starttimeunixtime,startuptimems, playingtimems, bufferingtimems, interrupts, startuperror, sessiontags, ipaddress, cdn, browser, convivasessionid, streamurl, errorlist, percentagecomplete, averagebitratekbps,
 scoredatavg(asn, starttimeunixtime, startuptimems, playingtimems, bufferingtimems, interrupts, startuperror, percentagecomplete) 
 as predict_averagebitratekbps FROM conviva_avgbitrate_1asset
  LIMIT 30000;
