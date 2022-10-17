package com.bm.analytics.tests.unit.salary_metrics_tests

import com.bm.analytics.TestConstructor
import com.bm.analytics.salary_metrics.ExceededSalaryTag

class exceededSalaryTagTests extends TestConstructor{

  test("The calculation should return -1 if salary is null") {
    val exceededSalaryTag = new ExceededSalaryTag()
    val actual = exceededSalaryTag.call(null)
    val expected = -1
    compare(actual === expected)
  }

}
