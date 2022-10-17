package com.bm.analytics

import com.bm.analytics.utils.{PropertyStore, PropertyStoreConsts}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.{Assertion, BeforeAndAfterAll, BeforeAndAfterEach}

trait TestConstructor extends AnyFunSuite with BeforeAndAfterEach with BeforeAndAfterAll {

  def compare(expr: Boolean): Assertion = {
    assert(expr)
  }

  override def beforeAll(): Unit = {
    PropertyStore.start()
  }

  override def beforeEach(): Unit = {
    PropertyStoreConsts.start()
  }

}
