


import sbt._
import sbt.Keys._



object ExamplesCoreUtilsBuild extends Build {

  lazy val examplesCoreUtilsSettings = Defaults.defaultSettings ++ Seq(
    name := "examples-core-utils",
    scalaVersion := "2.11.4",
    version := "0.1",
    organization := "com.storm-enroute"
  )

  def repoName = "examples-core-utils"

  lazy val examplesCoreUtils: Project = Project(
    "examples-core-utils",
    file("."),
    settings = examplesCoreUtilsSettings
  )

}
