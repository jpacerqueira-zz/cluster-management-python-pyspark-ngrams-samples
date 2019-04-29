#!\bin\bash
# create index soccerevents from folder soccerevents 
sudo -u solr solrctl instancedir --create soccerevents soccerevents
# create shard 1 for the soccerevents index
sudo -u solr solrctl collection --create soccerevents -s 1 -r 1
