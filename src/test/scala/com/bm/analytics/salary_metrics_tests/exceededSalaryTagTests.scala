package com.bm.analytics.salary_metrics_tests

import com.bm.analytics.TestConstructor
import com.bm.analytics.salary_metrics.exceededSalaryTag

class exceededSalaryTagTests extends TestConstructor{

  test("The calculation should return -1 if salary is null") {
    val exceededSalaryTag = new exceededSalaryTag()
    val actual = exceededSalaryTag._get(null)
    val expected = -1
    compare(actual === expected)
  }

}
