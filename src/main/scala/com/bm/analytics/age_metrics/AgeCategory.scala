package com.bm.analytics.age_metrics
import com.bm.analytics.utils.{PropertyStore, Constants}

class AgeCategory {

  def call(age: Int): Int = {

    val age_category_30: Int = PropertyStore.get_int(Constants.AgeMetricsConsts.age_category_30)
    val age_category_50: Int = PropertyStore.get_int(Constants.AgeMetricsConsts.age_category_50)

    if (age != null) {

      if (age < 0) {
        -1
      }

      else if (age < age_category_30) {
        1
      }

      else if (age >= age_category_30 && age < age_category_50) {
        2
      }

      else {
        3
      }
    }

    else {
      -1
    }
  }

}
