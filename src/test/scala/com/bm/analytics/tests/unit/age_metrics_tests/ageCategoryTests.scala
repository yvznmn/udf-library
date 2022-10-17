package com.bm.analytics.tests.unit.age_metrics_tests

import com.bm.analytics.TestConstructor
import com.bm.analytics.age_metrics.AgeCategory

class ageCategoryTests extends TestConstructor{

  test("The Calculation should return 1 if age is smaller than 30") {
    val ageCategory = new AgeCategory()
    val actual = ageCategory.call(28)
    val expected = 1
    compare(actual === expected)
  }


}
