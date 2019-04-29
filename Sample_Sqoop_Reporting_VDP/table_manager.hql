CREATE DATABASE IF NOT EXISTS published_vdp;
DROP TABLE IF EXISTS published_vdp.vdp_events;
CREATE TABLE published_vdp.vdp_events
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED AS
INPUTFORMAT 'org.apache.hadoop.hive.ql.io.avro.AvroContainerInputFormat'
OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.avro.AvroContainerOutputFormat'
TBLPROPERTIES ('avro.schema.url' = '${hiveconf:HV_TABLE_SCHEMMA}');

