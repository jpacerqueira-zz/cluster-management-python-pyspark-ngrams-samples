PASSVAR=$1
# echo $PASSVAR
sqoop import -D \
    mapred.job.name='default oraoop' --direct --connect \
    jdbc:oracle:thin:@'(DESCRIPTION=(LOAD_BALANCE=YES)(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=bigdatalite.localdomain)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orcl)))' \
  --username moviedemo --password $PASSVAR --table PROSPECTS --as-textfile --delete-target-dir --target-dir /tmp/sqoop_test
#    jdbc:oracle:thin:@'(DESCRIPTION=(LOAD_BALANCE=YES)(ADDRESS=(PROTOCOL=TCP)(HOST=ixpexadbadm01)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=ixpexadbadm02)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=dbadb)))' \
#  --username bds --password $PASSVAR --table orcl_dpi --as-textfile --delete-target-dir --target-dir /tmp/sqoop_test
