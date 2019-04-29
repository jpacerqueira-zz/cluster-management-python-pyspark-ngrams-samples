ADD JAR hdfs:///user/joao.cerqueira/my_libraries/mongodb/mongodb-driver-3.4.2.jar;
ADD JAR hdfs:///user/joao.cerqueira/my_libraries/mongodb/mongo-hadoop-core-2.0.2.jar;
ADD JAR hdfs:////user/joao.cerqueira/my_libraries/mongodb/mongo-hadoop-hive-2.0.2.jar ;
ADD JAR file:///opt/oracle/mongodb/libraries/mongodb-driver-3.4.2.jar;
ADD JAR file:///opt/oracle/mongodb/libraries/mongo-hadoop-core-2.0.2.jar;
ADD JAR file:///opt/oracle/mongodb/libraries/mongo-hadoop-hive-2.0.2.jar;

CREATE EXTERNAL TABLE published_ott_dazn.articles
 ( indexes ARRAY<STRUCT<v:INT, key:STRUCT<PublishDate:INT>, name:STRING, ns:STRING, background:BOOLEAN>>
 )
ROW FORMAT SERDE "com.mongodb.hadoop.hive.BSONSerDe"
STORED AS INPUTFORMAT 'com.mongodb.hadoop.mapred.BSONFileInputFormat'
OUTPUTFORMAT 'com.mongodb.hadoop.hive.output.HiveBSONFileOutputFormat'
LOCATION 'hdfs:///user/joao.cerqueira/data/raw/ott_dazn/misl_content_catalogue/articles/data/Articles.bson'
TBLPROPERTIES ('mongo.properties.path'='hdfs:///user/joao.cerqueira/data/raw/ott_dazn/misl_content_catalogue/articles/schema/articles.metadata.json');

