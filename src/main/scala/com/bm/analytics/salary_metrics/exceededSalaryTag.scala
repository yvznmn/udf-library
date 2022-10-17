package com.bm.analytics.salary_metrics
import java.math.BigDecimal
import com.bm.analytics.utils.{PropertyStore, Constants}

import scala.math.BigDecimal.javaBigDecimal2bigDecimal

class exceededSalaryTag {

  def _get(salary: BigDecimal): Int = {
    //null check
    if (salary != null) {
      if (salary > PropertyStore.get_bigdecimal(Constants.SalaryMetricsConsts.exceeded_salary_limit)) {
        1
      } else {
        0
      }
    } else {
      -1
    }
  }

}
