
- HOW to Fetch with beeline for Apache Hive a Table structure to be used in the BigDataSQL Publication

 [mediaetlgam@IXPBDAODI01 hive_test]$ bash -x beeline-hive-production-params.sh password1.file hive_describe_schema_tablename.hql staged_mediabi clicks
 + echo '<<beeline -f>>  PASSWORDFILE EXECUTIONFILE '
 <<beeline -f>>  PASSWORDFILE EXECUTIONFILE
 ++ pwd
 + PASSWORDFILE=/home/mediaetlgam/hive_test/password1.file
 ++ pwd
 + EXECUTIONFILE=/home/mediaetlgam/hive_test/hive_describe_schema_tablename.hql
 + MYSCHEMA=staged_mediabi
 + MYTABLE=clicks
 + USERNAME1=mediaetlgam
 + echo ' |||| ----- EXECUTION PRINTED WITH CONNECTION SCTRING ----- |||| '
  |||| ----- EXECUTION PRINTED WITH CONNECTION SCTRING ----- ||||
 + IFS=
 + read -r line
 + LOCAL_PASSWORD=<<USER_PASSWORD_MASKED>>
 ++ echo ' !connect jdbc:hive2://ixpbda04:10000/staged_akamai;user=mediaetlgam;password=<<USER_PASSWORD_MASKED>>;principal=hive/ixpbda04.prod.ix.perform.local@BDA.PERFORMGROUP.COM ;'
 + LOCAL_CONNECT=' !connect jdbc:hive2://ixpbda04:10000/staged_akamai;user=mediaetlgam;password=<<USER_PASSWORD_MASKED>>;principal=hive/ixpbda04.prod.ix.perform.local@BDA.PERFORMGROUP.COM ;'
 + sed -i '1i  !connect jdbc:hive2://ixpbda04:10000/staged_akamai;user=mediaetlgam;password=<<USER_PASSWORD_MASKED>>;principal=hive/ixpbda04.prod.ix.perform.local@BDA.PERFORMGROUP.COM ;' /home/mediaetlgam/hive_test/hive_describe_schema_tablename.hql
 + beeline -f /home/mediaetlgam/hive_test/hive_describe_schema_tablename.hql --hiveconf schema=staged_mediabi --hiveconf tablename=clicks
 Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512M; support was removed in 8.0
 2018-01-30 10:29:35,399 WARN  [main] mapreduce.TableMapReduceUtil: The hbase-prefix-tree module jar containing PrefixTreeCodec is not present.  Continuing without it.
 Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512M; support was removed in 8.0
 beeline> !connect jdbc:hive2://ixpbda04:10000/staged_akamai;user=mediaetlgam;password=<<USER_PASSWORD_MASKED>>;principal=hive/ixpbda04.prod.ix.perform.local@BDA.PERFORMGROUP.COM ;
 scan complete in 2ms
 Connecting to jdbc:hive2://ixpbda04:10000/staged_akamai;user=mediaetlgam;password=<<USER_PASSWORD_MASKED>>;principal=hive/ixpbda04.prod.ix.perform.local@BDA.PERFORMGROUP.COM
 Connected to: Apache Hive (version 1.1.0-cdh5.9.0)
 Driver: Hive JDBC (version 1.1.0-cdh5.9.0)
 Transaction isolation: TRANSACTION_REPEATABLE_READ
 0: jdbc:hive2://ixpbda04:10000/staged_akamai> USE ${hiveconf:schema};
 INFO  : Compiling command(queryId=hive_20180130102929_d939e9f4-c457-464b-9e71-f3f671288580): USE staged_mediabi
 INFO  : Semantic Analysis Completed
 INFO  : Returning Hive schema: Schema(fieldSchemas:null, properties:null)
 INFO  : Completed compiling command(queryId=hive_20180130102929_d939e9f4-c457-464b-9e71-f3f671288580); Time taken: 0.022 seconds
 INFO  : Executing command(queryId=hive_20180130102929_d939e9f4-c457-464b-9e71-f3f671288580): USE staged_mediabi
 INFO  : Starting task [Stage-0:DDL] in serial mode
 INFO  : Completed executing command(queryId=hive_20180130102929_d939e9f4-c457-464b-9e71-f3f671288580); Time taken: 0.009 seconds
 INFO  : OK
 No rows affected (0.088 seconds)
 0: jdbc:hive2://ixpbda04:10000/staged_akamai> DESCRIBE ${hiveconf:schema}.${hiveconf:tablename};
 INFO  : Compiling command(queryId=hive_20180130102929_74859de7-cff4-477b-9e25-741f7cfefa09): DESCRIBE staged_mediabi.clicks
 INFO  : Semantic Analysis Completed
 INFO  : Returning Hive schema: Schema(fieldSchemas:[FieldSchema(name:col_name, type:string, comment:from deserializer), FieldSchema(name:data_type, type:string, comment:from deserializer), FieldSchema(name:comment, type:string, comment:from deserializer)], properties:null)
 INFO  : Completed compiling command(queryId=hive_20180130102929_74859de7-cff4-477b-9e25-741f7cfefa09); Time taken: 0.029 seconds
 INFO  : Executing command(queryId=hive_20180130102929_74859de7-cff4-477b-9e25-741f7cfefa09): DESCRIBE staged_mediabi.clicks
 INFO  : Starting task [Stage-0:DDL] in serial mode
 INFO  : Completed executing command(queryId=hive_20180130102929_74859de7-cff4-477b-9e25-741f7cfefa09); Time taken: 0.012 seconds
 INFO  : OK
 +--------------------------+-----------------------+-----------------------+--+
 |         col_name         |       data_type       |        comment        |
 +--------------------------+-----------------------+-----------------------+--+
 | creativeid               | string                |                       |
 | lineitemid               | string                |                       |
 | adunitid                 | string                |                       |
 | orderid                  | string                |                       |
 | advertiserid             | string                |                       |
 | date                     | string                |                       |
 | country                  | string                |                       |
 | region                   | string                |                       |
 | creativesize             | string                |                       |
 | requestedadunitsizes     | string                |                       |
 | devicecategory           | string                |                       |
 | refererurl               | string                |                       |
 | os                       | string                |                       |
 | product                  | string                |                       |
 | browser                  | string                |                       |
 | backfill                 | boolean               |                       |
 | pod                      | string                |                       |
 | edition                  | string                |                       |
 | appversion               | string                |                       |
 | inview                   | string                |                       |
 | videoaudio               | string                |                       |
 | videochannelid           | string                |                       |
 | videocontentinitiation   | string                |                       |
 | videodomain              | string                |                       |
 | videopartner             | string                |                       |
 | videoplayertype          | string                |                       |
 | videoplayerwidth         | string                |                       |
 | videotype                | string                |                       |
 | clicks                   | bigint                |                       |
 | adunitname               | string                |                       |
 | rightsholder             | string                |                       |
 | lineitemname             | string                |                       |
 | ordername                | string                |                       |
 | costtype                 | string                |                       |
 | costperunit              | string                |                       |
 | advertisername           | string                |                       |
 | creativename             | string                |                       |
 | yieldgroupcompanyid      | string                |                       |
 | yieldgroupcompanyname    | string                |                       |
 | revenue                  | string                |                       |
 | dt                       | string                |                       |
 |                          | NULL                  | NULL                  |
 | # Partition Information  | NULL                  | NULL                  |
 | # col_name               | data_type             | comment               |
 |                          | NULL                  | NULL                  |
 | dt                       | string                |                       |
 +--------------------------+-----------------------+-----------------------+--+
 46 rows selected (0.164 seconds)
 0: jdbc:hive2://ixpbda04:10000/staged_akamai>
 0: jdbc:hive2://ixpbda04:10000/staged_akamai>
 Closing: 0: jdbc:hive2://ixpbda04:10000/staged_akamai;user=mediaetlgam;password=<<USER_PASSWORD_MASKED>>;principal=hive/ixpbda04.prod.ix.perform.local@BDA.PERFORMGROUP.COM
 + sed -i 1d /home/mediaetlgam/hive_test/hive_describe_schema_tablename.hql
 + IFS=
 + read -r line
 + [[ -n '' ]]
 [mediaetlgam@IXPBDAODI01 hive_test]$ pwd
 /home/mediaetlgam/hive_test
 [mediaetlgam@IXPBDAODI01 hive_test]$
 [mediaetlgam@IXPBDAODI01 hive_test]$ pwd
 /home/mediaetlgam/hive_test
 [mediaetlgam@IXPBDAODI01 hive_test]$
 

 - DONE :) 

 .
  

