package com.bm.analytics

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.{Assertion}

trait TestConstructor extends AnyFunSuite {

  def compare(expr: Boolean): Assertion = {
    assert(expr)
  }

}
