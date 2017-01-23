package com.fortysevendeg

import com.fortysevendeg.lambdatest._

class TestHello extends LambdaTest {
  val act = label("Testing Hello Class") {
    test("Test method hello") {
      assertEq(Hello.hello, "Hello World")
    }
  }
}
