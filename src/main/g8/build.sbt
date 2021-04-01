ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "2.13.5"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val $name;format="camel"$ = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++= Seq(
      libScalaCheck,
      libScalaTest
    )
  )

lazy val libScalaCheck = "org.scalacheck" %% "scalacheck" % "1.15.3" % "test"
lazy val libScalaTest  = "org.scalatest"  %% "scalatest"  % "3.2.7"  % "test"

ThisBuild / scapegoatVersion := "1.4.8"
