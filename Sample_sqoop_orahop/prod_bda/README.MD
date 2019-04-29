 
  1.) Execution as :

[oracle@ixpbda09 sqoop]$ bash -x run_command.sh passwordfile.txt sqoop_command_oraop
+ echo ' bash -f <<PASSWORDFILE>> <<EXECUTIONFILE>> '
 bash -f <<PASSWORDFILE>> <<EXECUTIONFILE>>
++ pwd
+ PASSWORDFILE=/home/oracle/projects/sqoop/passwordfile.txt
++ pwd
+ EXECUTIONFILE=/home/oracle/projects/sqoop/sqoop_command_oraop
+ echo ' |||| ----- EXECUTION PRINTED WITH CONNECTION SCTRING ----- |||| '
 |||| ----- EXECUTION PRINTED WITH CONNECTION SCTRING ----- ||||
+ IFS=
+ read -r line
+ LOCAL_PASSWORD=DUMMYPASSWORD
+ bash -f /home/oracle/projects/sqoop/sqoop_command_oraop DUMMYPASSWORD
sqlplus: error while loading shared libraries: libsqlplus.so: cannot open shared object file: No such file or directory
Warning: /opt/cloudera/parcels/CDH-5.9.0-1.cdh5.9.0.p0.21/bin/../lib/sqoop/../accumulo does not exist! Accumulo imports will fail.
Please set $ACCUMULO_HOME to the root of your Accumulo installation.
17/05/25 12:41:14 INFO sqoop.Sqoop: Running Sqoop version: 1.4.6-cdh5.9.0
17/05/25 12:41:14 WARN tool.BaseSqoopTool: Setting your password on the command-line is insecure. Consider using -P instead.
17/05/25 12:41:14 INFO manager.SqlManager: Using default fetchSize of 1000
17/05/25 12:41:15 WARN oracle.OraOopManagerFactory: Unable to determine the Oracle-type of the object named EXT_DAZN_LOGS owned by BDA_OWNER.
Error:
ORA-00942: table or view does not exist

17/05/25 12:41:15 WARN oracle.OraOopManagerFactory: Unable to determine whether the Oracle table "BDA_OWNER"."EXT_DAZN_LOGS" is an index-organized table.
Error:
ORA-00942: table or view does not exist

17/05/25 12:41:15 INFO oracle.OraOopManagerFactory:
**************************************************
*** Using Data Connector for Oracle and Hadoop ***
**************************************************
17/05/25 12:41:15 INFO oracle.OraOopManagerFactory: Oracle Database version: Oracle Database 12c Enterprise Edition Release 12.1.0.2.0 - 64bit Production
17/05/25 12:41:15 INFO oracle.OraOopManagerFactory: This Oracle database is a RAC.


