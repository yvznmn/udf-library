package com.bm.analytics.utils

object Constants {

  final private val prefix : String = "com.bm.analytics"

  object SalaryMetricsConsts {
    final val exceeded_salary_limit : String = prefix + ".exceededSalaryLimit."
  }

  object AgeMetricsConsts {

    final val age_category_null : String = prefix + ".ageCategoryNull."
    final val age_category_30 : String = prefix + ".ageCategory30."
    final val age_category_50 : String = prefix + ".ageCategory50."

  }

}
