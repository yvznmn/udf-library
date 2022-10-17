package com.bm.analytics.utils

import java.math.BigDecimal

object PropertyStoreConsts {

  def start(): Unit = {
    PropertyStore.set_bigdecimal(Constants.SalaryMetricsConsts.exceeded_salary_limit, BigDecimal.valueOf(100000))
    PropertyStore.set_int(Constants.AgeMetricsConsts.age_category_30, 30)
    PropertyStore.set_int(Constants.AgeMetricsConsts.age_category_50, 50)
  }

}
