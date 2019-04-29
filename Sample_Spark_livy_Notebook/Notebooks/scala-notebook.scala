import org.apache.spark.sql.hive.HiveContext
val sqlContext = new HiveContext(sc)
val flatTracabDf = sqlContext.read.parquet("/data/staged/content/analytics/tracab/parquet/")
flatTracabDf.printSchema
