rm conviva1*.csv
hdfs dfs -cat hdfs://bda-ns//data/raw/ott_dazn/conviva_logs/11.csv | grep 1lk5etpk19woc1mteevfzufr6w | head -n 30000 >> conviva11-1asset.csv
sed -i "s,\",,g" conviva11-1asset.csv
sed -i "1i viewerId,asset,device/os,country,state,city,asn,isp,start time (unix time),startup time (ms),playing time (ms),buffering time (ms),interrupts,average bitrate (kbps),startup error,session tags,ip address,cdn,browser,conviva session id,stream url,error list,percentage complete" conviva11-1asset.csv
hdfs dfs -copyFromLocal -f conviva11-1asset.csv
