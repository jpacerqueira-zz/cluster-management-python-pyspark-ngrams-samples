ADD JAR hdfs:///user/joao.cerqueira/my_libraries/mongodb/mongodb-driver-3.4.2.jar;
ADD JAR hdfs:///user/joao.cerqueira/my_libraries/mongodb/mongo-hadoop-core-2.0.2.jar;
ADD JAR hdfs:////user/joao.cerqueira/my_libraries/mongodb/mongo-hadoop-hive-2.0.2.jar ;
ADD JAR file:///opt/oracle/mongodb/libraries/mongodb-driver-3.4.2.jar;
ADD JAR file:///opt/oracle/mongodb/libraries/mongo-hadoop-core-2.0.2.jar;
ADD JAR file:///opt/oracle/mongodb/libraries/mongo-hadoop-hive-2.0.2.jar;

CREATE EXTERNAL TABLE published_ott_dazn.articles
 ( 
  options STRUCT<>,
  indexes ARRAY<
  STRUCT<v:INT, key:STRUCT<_id:INT>, name:STRING, ns:STRING>,STRUCT<v:INT, key:STRUCT<Fixture._id:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<ArticleType._id:INT,Fixture.StartTime:INT,ProductValue.Weight:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<ArticleType._id:INT,Fixture.TournamentCalendar._id:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<Fixture.TournamentCalendar._id:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<PlayCount.Day:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<CountryAvailabilities.CountryAvailability.CountryCode:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<Contestants._id:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<Competition._id:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<PublishDate:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<UnpublishDate:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<AggregatedStartTime:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<LanguageCode:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<LanguageCode:INT,Sport._id:INT,ArticleType._id:INT,Fixture.StartTime:INT,ProductValue.Weight:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<LanguageCode:INT,ArticleType._id:INT,Sport._id:INT,Fixture.Sport._id:INT,Fixture._id:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<PublishDate:INT,UnpublishDate:INT,Fixture._id:INT>, name:STRING, ns:STRING, background:BOOLEAN>,
  STRUCT<v:INT, key:STRUCT<Fixture._id:INT,LanguageCode:INT>, name:STRING, ns:STRING, background:BOOLEAN>>
 )
ROW FORMAT SERDE "com.mongodb.hadoop.hive.BSONSerDe"
STORED AS INPUTFORMAT 'com.mongodb.hadoop.mapred.BSONFileInputFormat'
OUTPUTFORMAT 'com.mongodb.hadoop.hive.output.HiveBSONFileOutputFormat'
LOCATION 'hdfs:///user/joao.cerqueira/data/raw/ott_dazn/misl_content_catalogue/articles/data/Articles.bson'
TBLPROPERTIES ('mongo.properties.path'='hdfs:///user/joao.cerqueira/data/raw/ott_dazn/misl_content_catalogue/articles/schema/articles.metadata.json');
