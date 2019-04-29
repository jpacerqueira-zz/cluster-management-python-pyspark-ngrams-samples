#!/usr/bin/env bash
# USING OPTION : pip install h2o-3.20.0.5
#
mkdir -p ~/python-additional-libraries/
cd  ~/python-additional-libraries/

#
#
#echo "wget tabulate-0.8.2 source"
#wget https://files.pythonhosted.org/packages/12/c2/11d6845db5edf1295bc08b2f488cf5937806586afe42936c3f34c097ebdc/tabulate-0.8.2.tar.gz  
#        
tar -xvf tabulate-0.8.2.tar.gz  
cd tabulate-0.8.2
ls 
pwd
cd ..
sudo /opt/cloudera/parcels/Anaconda/bin/python2.7 /opt/cloudera/parcels/Anaconda/bin/pip install ./tabulate-0.8.2
#
#
#echo "wget future-0.16.0  source"
#wget https://files.pythonhosted.org/packages/00/2b/8d082ddfed935f3608cc61140df6dcbf0edea1bc3ab52fb6c29ae3e81e85/future-0.16.0.tar.gz
#
tar -xvf future-0.16.0.tar.gz  
cd tabulate-0.8.2
ls 
pwd
cd ..
sudo /opt/cloudera/parcels/Anaconda/bin/python2.7 /opt/cloudera/parcels/Anaconda/bin/pip install ./future-0.16.0
#
#
#
#echo "wget h2o source"
#wget  https://files.pythonhosted.org/packages/6b/f9/59c67ac23f929546c2e5d4b11c4608493ca962f48ffced4ceb422525297c/h2o-3.20.0.5.tar.gz
#
tar -xvf h2o-3.20.0.5.tar.gz
cd h2o-3.20.0.5
ls 
pwd
cd ..
sudo /opt/cloudera/parcels/Anaconda/bin/python2.7 /opt/cloudera/parcels/Anaconda/bin/pip install ./h2o-3.20.0.5
#
