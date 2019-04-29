
 - Run Hive N-Grams pattern group queries, where top 30 pattern groups are fetched : 



 - SELECT asset,deviceos FROM  staged_akamai.conviva_logs where country = '"japan"' limit 10 ;
 - SELECT explode(ngrams(sentences(lower(asset)), 8, 30)) AS top30of8 FROM  staged_akamai.conviva_logs where country = '"japan"' limit 30 ;
 - SELECT asset,deviceos FROM  staged_akamai.conviva_logs where country <> '"japan"' limit 10 ;
 - SELECT explode(ngrams(sentences(lower(asset)), 5, 30)) AS top30of5 FROM  staged_akamai.conviva_logs  where country <> '"japan"' limit 30 ;



 - Sample beeline Run :


 [oracle@ixpbda09 conviva]$ bash -x beeline-hive-conviva-production.sh password.file hive_ngrams-production.hql

 echo '<<beeline -f>>  PASSWORDFILE EXECUTIONFILE '
  <<beeline -f>>  PASSWORDFILE EXECUTIONFILE
   pwd
   PASSWORDFILE=/home/oracle/projects/dazn_ott/conviva/password.file
   pwd
   EXECUTIONFILE=/home/oracle/projects/dazn_ott/conviva/hive_ngrams-production.hql


 
 INFO  : OK

 +----------------------------------------------------+--+
 
 |------------------- top30of5 --------------------------|
 
 +----------------------------------------------------+--+
 
 | {"ngram":["1wsnpsnfc801z19xk9tk4925lc","real","madrid","real","betis"],"estfrequency":132636.0} |
 
 | {"ngram":["wta","indian","wells","tag","4"],"estfrequency":31862.0} |
 
 | {"ngram":["wta","indian","wells","tag","5"],"estfrequency":27628.0} |
 
 | {"ngram":["3ixq52ze9du31oljmdbnqgv03","wta","indian","wells","tag"],"estfrequency":17630.0} |
 
 | {"ngram":["l1adjf5k34pa1gbatemzgc52r","wta","indian","wells","tag"],"estfrequency":16013.0} |
 
 | {"ngram":["1b47h8pbn53301baemovw8y7n4","real","madrid","real","betis"],"estfrequency":15993.0} |
 
 | {"ngram":["ndh3ab1xe9s610wei6zu5zxdz","wta","indian","wells","tag"],"estfrequency":15849.0} |
 
 | {"ngram":["wta","indian","wells","tag","3"],"estfrequency":10937.0} |
 
 | {"ngram":["di9hrn115yhw1tonttlfzu36b","wta","indian","wells","tag"],"estfrequency":10748.0} |
 
 | {"ngram":["16bicsw67dmp1u5z7fii7gh5j","wta","indian","wells","tag"],"estfrequency":9998.0} |
 
 | {"ngram":["vancouver","tag","1","session","2"],"estfrequency":9744.0} |
 
 | {"ngram":["vancouver","tag","1","session","1"],"estfrequency":8558.0} |
 
 | {"ngram":["vancouver","tag","2","session","1"],"estfrequency":8289.0} |

 | {"ngram":["real","madrid","v","real","betis"],"estfrequency":7993.0} |

 | {"ngram":["1f9h2edvqf3go16fd71spvpt82","real","madrid","real","betis"],"estfrequency":7946.0} |

 | {"ngram":["tfmol8tsr5vt15zuy5jdk9a31","perm","zenit","st","petersburg"],"estfrequency":7254.0} |

 | {"ngram":["1k72irce49gcf1jcj09vd6o5g4","real","madrid","v","real"],"estfrequency":6636.0} |

 | {"ngram":["1gjdjvg8fjo1i1ksk8dje53hlg","vancouver","tag","1","session"],"estfrequency":6424.0} |

 | {"ngram":["uhq18bd66br416xp1khua3sjs","vancouver","tag","1","session"],"estfrequency":6387.0} |

 | {"ngram":["1pk6917f92hm11eay0cixebwaz","vancouver","tag","2","session"],"estfrequency":6192.0} |

 | {"ngram":["12vbuf5k6yluh1e3q6jhrwb7tp","perm","zenit","st","petersburg"],"estfrequency":5155.0} |

 | {"ngram":["vancouver","tag","1","session","3"],"estfrequency":4958.0} |

 | {"ngram":["firestone","grand","prix","of","st"],"estfrequency":4635.0} |

 | {"ngram":["grand","prix","of","st","petersburg"],"estfrequency":4635.0} |

 | {"ngram":["indycar","firestone","grand","prix","of"],"estfrequency":4394.0} |

 | {"ngram":["1d3wf0ugy2iwa1i6lz710mdw9l","vancouver","tag","1","session"],"estfrequency":4156.0} |

 | {"ngram":["top","10","tore","vom","wochenende"],"estfrequency":3848.0} |

 | {"ngram":["eazzfy6z00fy160tuo68p9s4z","top","10","tore","vom"],"estfrequency":3844.0} |

 | {"ngram":["60xevj9q1rgv1rsj56cvaxhny","indycar","firestone","grand","prix"],"estfrequency":3665.0} |

 | {"ngram":["cavv21955zw0109vkb7aj5xxp","vancouver","tag","1","session"],"estfrequency":3357.0} |

 +----------------------------------------------------+--+

 30 rows selected (7.285 seconds)

 0: jdbc:hive2://ixpbda04:10000/staged_akamai> 

 [oracle@ixpbda09 conviva]$ 


