#!\bin\bash
TABLE_PATH=$1
TABLE_NAME_SCHEMMA=$2
# 1. Import Sample to GET SCHEMMA
hadoop fs -rm -r -skipTrash ${TABLE_PATH}/data || true
sqoop import --connect jdbc:oracle:thin:@localhost:1521/orcl \
               --username MOVIEDEMO --password welcome1 -m 1 \
               --table VDP_EVENTS --as-avrodatafile --create-hive-table --hive-table published_vdp.vdp_events \
               --target-dir ${TABLE_PATH}/data
# 2. Generate AVRO SCHEMA AND UPLOAD TO HDFS PATH
hdfs dfs -get ${TABLE_PATH}/data/part-m-00000.avro
java -jar /usr/lib/avro/avro-tools-1.7.6-cdh5.5.1.jar getschema part-m-00000.avro > ${TABLE_NAME_SCHEMMA}
hdfs dfs -copyFromLocal vdp_events.avsc ${TABLE_PATH}
# 3. DEFINE HIVE TABLE IN PATH
TABLE_SCHEMMA=${TABLE_PATH}/${TABLE_NAME_SCHEMMA}
hive -f table_manager.hql -hiveconf HV_TABLE_SCHEMMA=${TABLE_SCHEMMA}
# 4. IMPORT WITH SQOOP DATA FROM RDBMS 12C into HIVE
hadoop fs -rm -r -skipTrash ${TABLE_PATH}/data || true
sqoop import --connect jdbc:oracle:thin:@localhost:1521/orcl \
               --username MOVIEDEMO --password welcome1 -m 1 \
               --table VDP_EVENTS --as-avrodatafile --create-hive-table --hive-table published_vdp.vdp_events \
               --target-dir ${TABLE_PATH}/data
# 5. LOAD DATA INTO HIVE TABLE
TABLE_DATA_PATH=${TABLE_PATH}/data
hive -f table_loader.hql -hiveconf HV_TABLE_DATA_PATH=${TABLE_DATA_PATH}
hadoop fs -rm -r -skipTrash ${TABLE_PATH}/data || true
rm -rf ./*.avro || true
