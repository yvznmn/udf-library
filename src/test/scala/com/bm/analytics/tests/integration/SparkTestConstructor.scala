package com.bm.analytics.tests.integration

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession

import scala.xml.XML

object SparkTestConstructor {

  private val app_name = "BMA-ANALYTIC"
  private val master = "local[*]"
  private var sc: SparkContext = _
  private var ss: SparkSession = _
  private val spark_driver_host = "127.0.0.1"
  private val spark_driver_bindAddress = "127.0.0.1"

  def get_jar_path(): String = {
    val pom = XML.loadString(XML.loadFile("./pom.xml").toString())
    val artifact_id = (pom \\ "project" \ "artifactId").text
    val version = (pom \\ "project" \ "version").text
    val path = s"./target/$artifact_id-$version.jar"
    println(path)
    path
  }

  def start(): Unit = {

    val spark_configuration = new SparkConf()
      .set("spark.driver.host", spark_driver_host)
      .set("spark.driver.bindAddress", spark_driver_bindAddress)

    val spark_session = SparkSession
      .builder()
      .master(master)
      .appName(app_name)
      .config(spark_configuration)
      .getOrCreate()

    sc = spark_session.sparkContext
    ss = spark_session

    sc.addJar(get_jar_path())
  }

  def spark_context(): SparkContext = {
    sc
  }

  def spark_session(): SparkSession = {
    ss
  }


}
