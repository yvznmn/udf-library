package com.bm.analytics.salary_metrics
import java.math.BigDecimal

import scala.math.BigDecimal.javaBigDecimal2bigDecimal

class exceededSalaryTag {

  def _get(salary: BigDecimal): Int = {
    //null check
    if (salary != null) {
      if (salary > BigDecimal.valueOf(100000)) {
        1
      } else {
        0
      }
    } else {
      -1
    }
  }

}
