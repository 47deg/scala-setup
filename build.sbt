name := "scala-setup"

organization := "com.47deg"

version := "1.0.0"

scalaVersion := "2.12.1"

viewSettings

testFrameworks += new TestFramework("com.fortysevendeg.lambdatest.sbtinterface.LambdaFramework")

scalacOptions ++= Seq("-deprecation", "-unchecked")

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "com.fortysevendeg" % "lambda-test_2.12" % "1.3.0" % "test"
)
