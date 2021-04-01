name := "$name$"
organization := "$organization$"

version := "0.1.0"
scalaVersion := "2.13.5"

scalacOptions ++= List(
  "-Ywarn-unused"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.7" % "test"
)
