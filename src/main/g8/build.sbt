ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "2.13.6"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val $name;format="camel"$ = (project in file("."))
  .settings(
    name := "$name;format="lower,hyphen"$",
    libraryDependencies ++= Seq(
      libScalaCheck,
      libScalaTest
    )
  )

lazy val libScalaCheck = "org.scalacheck" %% "scalacheck" % "1.15.4" % "test"
lazy val libScalaTest  = "org.scalatest"  %% "scalatest"  % "3.2.10"  % "test"

ThisBuild / scapegoatVersion := "1.4.9"
