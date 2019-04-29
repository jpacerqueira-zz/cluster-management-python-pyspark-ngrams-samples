#!/bin/bash
kinit -kt ~/.keytabs/$(whoami).keytab $(whoami)/ixpbda@BDA.PERFORMGROUP.COM  && {
  token=`curl -s --negotiate -u : "http://ixpbda02.prod.ix.perform.local:50070/webhdfs/v1/?op=GETDELEGATIONTOKEN&renewer=$(whoami)"`
  token=`echo $token | grep -Po '"urlString":"[^"]*'`
  token=`echo $token | sed 's/"urlString":"//'`
  kdestroy
  curl -s "http://ixpbda02.prod.ix.perform.local:50070/webhdfs/v1/user/mediaetlgam?delegation=$token&op=LISTSTATUS"
}
curl -s "http://ixpbda02.prod.ix.perform.local:50070/webhdfs/v1/user/mediaetlgam?op=LISTSTATUS&delegation=$token"
echo " DELEGATION TOKEN DONE"
echo " LIST FILE STATUS "
curl -i  "http://ixpbda02.prod.ix.perform.local:50070/webhdfs/v1/data/published/media/mediabi/dfp_reports/marek_dfp_testing/?op=GETFILESTATUS&delegation=$token"
echo " "
curl -i  "http://ixpbda02.prod.ix.perform.local:50070/webhdfs/v1/data/published/media/mediabi/dfp_reports/marek_dfp_testing/marek_dfp_testing_07-09-2018_1146AM.csv?op=GETFILESTATUS&delegation=$token"
echo " "
