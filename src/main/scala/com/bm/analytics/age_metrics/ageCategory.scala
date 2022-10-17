package com.bm.analytics.age_metrics
import com.bm.analytics.utils.{PropertyStore, Constants}

class ageCategory {

  def _get(age: Int): Int = {

    if (age != null) {

      if (age < PropertyStore.get_int(Constants.AgeMetricsConsts.age_category_30)) {
        1
      }

      else if (age >= PropertyStore.get_int(Constants.AgeMetricsConsts.age_category_30) && age < PropertyStore.get_int(Constants.AgeMetricsConsts.age_category_50)) {
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
