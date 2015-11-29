name := "play-shiro"

version := "1.0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  evolutions,
  jdbc,
  "com.typesafe.play" %% "anorm"      % "2.4.0",
  "org.jasypt"         % "jasypt"     % "1.9.2",
  "org.apache.shiro"   % "shiro-core" % "1.2.4"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
