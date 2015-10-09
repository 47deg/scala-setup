package com.fourtysevendeg

import org.specs2._

class TestHello extends Specification {
  def is = s2"""
    Testing Hello class
       hello method $t1
    """

  def t1 = Hello.hello mustEqual "Hello World"
}
