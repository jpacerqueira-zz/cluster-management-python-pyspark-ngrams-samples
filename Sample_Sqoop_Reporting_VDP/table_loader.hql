USE published_vdp;
LOAD DATA INPATH '${hiveconf:HV_TABLE_DATA_PATH}'
INTO TABLE published_vdp.vdp_events;
