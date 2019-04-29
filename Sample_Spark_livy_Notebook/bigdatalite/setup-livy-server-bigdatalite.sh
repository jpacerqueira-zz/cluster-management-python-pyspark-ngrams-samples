#!/usr/bin/env bash
VAR=$1

#download Livy
wget http://archive.cloudera.com/beta/livy/livy-server-0.2.0.zip
sudo unzip livy-server-0.2.0.zip -d /usr/lib/
sudo chown oracle:oinstall -R /usr/lib/livy-server-0.2.0
