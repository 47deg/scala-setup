name := "scala-setup"

organization := "com.47deg"

version := "0.0.2"

scalaVersion := "2.11.8"

viewSettings

scalacOptions ++= Seq("-deprecation", "-unchecked")

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "com.persist" % "persist-json_2.11" % "1.1.3",
  "org.apache.spark" % "spark-core_2.11" % "2.0.0",
  "org.apache.spark" % "spark-mllib_2.11" % "2.0.0",
  "org.apache.spark" % "spark-graphx_2.11" % "2.0.0",
  "org.apache.spark" % "spark-sql_2.11" % "2.0.0",
  "org.specs2" %% "specs2-core" % "3.8.5" % "test",
  "junit" % "junit" % "4.12" % "test"
)
