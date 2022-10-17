package com.bm.analytics.tests.integration

import com.bm.analytics.{BM, TestConstructor}
import java.math.BigDecimal

import org.apache.spark.sql.functions.{call_udf, col, lit, when}
import com.bm.analytics.utils.Constants.Decimals20p4s
import org.apache.spark

class SalaryMetricsTests extends TestConstructor{

  override def beforeAll(): Unit = {
    super.beforeAll()
    SparkTestConstructor.start()
  }

  test("Salary Metrics [exceeded salary tag] should be populated in a spark dataframe") {

    val spark = SparkTestConstructor.spark_session()
    BM.start(spark)
    import spark.implicits._

    val sq = Seq(
      null,
      BigDecimal.valueOf(0),
      BigDecimal.valueOf(-1),
      BigDecimal.valueOf(99999),
      BigDecimal.valueOf(100000),
      BigDecimal.valueOf(100001),
      BigDecimal.valueOf(999999999)
    )

    val df = sq.toDF("salary").withColumn("salary", col("salary").cast(Decimals20p4s))
    val actual = df
      .withColumn("exceeded_salary_flag",
        call_udf("exceeded_salary_flag", col("salary")))
      .select("exceeded_salary_flag")
    val expected = Seq(-1,0,-1,0,0,1,1)
      .toDF("exceeded_salary_flag")

    compare(actual.collect() === expected.collect())
  }

}
