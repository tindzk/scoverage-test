import sbt._
import sbt.Keys._
import scoverage.ScoverageSbtPlugin._
import scala.scalajs.sbtplugin.ScalaJSPlugin._

object Build extends sbt.Build {
  val buildOrganisation = "org.example"
  val buildVersion = "0.1-SNAPSHOT"
  val buildScalaVersion = "2.11.2"
  val buildScalaOptions = Seq(
    "-unchecked", "-deprecation",
    "-encoding", "utf8")

  lazy val main = Project(id = "example", base = file("."))
    .settings(scalaJSSettings: _*)
    .settings(instrumentSettings: _*)
    .settings(
      organization := buildOrganisation,
      version := buildVersion,
      scalaVersion := buildScalaVersion,
      scalacOptions := buildScalaOptions,
      ScalaJSKeys.persistLauncher := true)
}
