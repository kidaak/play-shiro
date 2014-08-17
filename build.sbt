name := "play-shiro"

version := "1.0.1"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  "org.jasypt" % "jasypt" % "1.9.2",
  "org.apache.shiro" % "shiro-core" % "1.2.3"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
