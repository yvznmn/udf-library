package com.bm.analytics

import com.bm.analytics.age_metrics.AgeCategory
import com.bm.analytics.salary_metrics.ExceededSalaryTag
import com.bm.analytics.utils.PropertyStore
import org.apache.spark.sql.api.java.{UDF1}
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.sql.types.DataTypes
import java.math.BigDecimal

object BM {

  def start(session: SparkSession): Unit = {
    PropertyStore.start()
    registerSqlUdfs(session.sqlContext)
  }

  private def registerSqlUdfs(sql_context: SQLContext): Unit = {
    register_age_metrics(sql_context)
    register_salary_metrics(sql_context)
  }

  private def register_age_metrics(sql_context: SQLContext): Unit  = {
    val age_category = new AgeCategory() with UDF1[Int, Int]
    sql_context.udf.register("age_category", age_category, DataTypes.IntegerType)
  }

  private def register_salary_metrics(sql_context: SQLContext): Unit = {
    val exceeded_salary_tag = new ExceededSalaryTag() with UDF1[BigDecimal, Int]
    sql_context.udf.register("exceeded_salary_limit", exceeded_salary_tag, DataTypes.IntegerType)
  }

}
