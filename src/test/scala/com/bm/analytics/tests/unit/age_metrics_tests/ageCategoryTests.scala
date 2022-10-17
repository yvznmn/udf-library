package com.bm.analytics.tests.unit.age_metrics_tests

import com.bm.analytics.TestConstructor
import com.bm.analytics.age_metrics.ageCategory

class ageCategoryTests extends TestConstructor{

  test("The Calculation should return 1 if age is smaller than 30") {
    val ageCategory = new ageCategory()
    val actual = ageCategory._get(28)
    val expected = 1
    compare(actual === expected)
  }


}
