package com.bm.analytics.utils
import java.math.BigDecimal

object PropertyStore {

  def start(): Unit = {
    PropertyStoreConsts.start()
  }

  private var prop_bigdecimal = Map.empty[String, BigDecimal]
  private var prop_int = Map.empty[String, Int]

  def set_bigdecimal(key: String, value: BigDecimal): Unit = {
    prop_bigdecimal = prop_bigdecimal + (key -> value)
  }

  def set_int(key: String, value: Int): Unit = {
    prop_int = prop_int + (key -> value)
  }

  def get_bigdecimal(key: String): BigDecimal = {
    prop_bigdecimal.get(key).get
  }

  def get_int(key: String): Int = {
    prop_int.get(key).get
  }

}
