name := "repo-seed-scala"

scalaVersion := "2.13.5"

enablePlugins(ScriptedPlugin)

scriptedLaunchOpts ++= Seq(
  "-Xms1g",
  "-Xmx1g",
  "-XX:ReservedCodeCacheSize=128m",
  "-Xss2m",
  "-Dfile.encoding=UTF-8"
)
