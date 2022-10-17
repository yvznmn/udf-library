package com.bm.analytics.salary_metrics
import java.math.BigDecimal
import com.bm.analytics.utils.{PropertyStore, Constants}

import scala.math.BigDecimal.javaBigDecimal2bigDecimal

class ExceededSalaryTag {

  def call(salary: BigDecimal): Int = {

    val exceeded_salary_limit = PropertyStore.get_bigdecimal(Constants.SalaryMetricsConsts.exceeded_salary_limit)

    if (salary != null) {
      if (salary > exceeded_salary_limit) {
        1
      } else {
        0
      }
    } else {
      -1
    }
  }

}
