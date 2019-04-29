#!/bin/bash
touch /tmp/output-livy.log
chmod 666 /tmp/output-livy.log
bash -x /root/livy-server-0.2.0-start_stop.sh stop >> /tmp/output-livy.log
sleep 5
bash -x /root/livy-server-0.2.0-start_stop.sh start >> /tmp/output-livy.log
