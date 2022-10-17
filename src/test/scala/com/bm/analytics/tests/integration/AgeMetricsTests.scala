package com.bm.analytics.tests.integration

import java.math.BigDecimal

import com.bm.analytics.utils.Constants.Decimals20p4s
import com.bm.analytics.{BM, TestConstructor}
import org.apache.spark.sql.functions.{call_udf, col}

class AgeMetricsTests extends TestConstructor{

  override def beforeAll(): Unit = {
    super.beforeAll()
    SparkTestConstructor.start()
  }

  test("Age Metrics [age category] should be populated in a spark dataframe") {

    val spark = SparkTestConstructor.spark_session()
    BM.start(spark)
    import spark.implicits._

    val sq = Seq(null.asInstanceOf[Int], 0, -1, 29, 30, 31, 49, 50, 51, 200)

    val df = sq.toDF("age")
    val actual = df
      .withColumn("age_category",
        call_udf("age_category", col("age")))
      .select("age_category")
    val expected = Seq(1,1,-1,1,2,2,2,3,3,3)
      .toDF("age_category")

    compare(actual.collect() === expected.collect())
  }

}
