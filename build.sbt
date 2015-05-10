name := """testc3"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-3",
  "org.webjars" % "requirejs" % "2.1.17",
  "org.webjars" % "jquery" % "2.1.4",
  "org.webjars" % "d3js" % "3.5.5-1",
  "org.webjars" % "c3" % "0.4.9"
)
