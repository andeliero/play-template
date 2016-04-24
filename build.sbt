name := "ship&boat-ws"

version := "1.0.0"

scalaVersion := "2.11.7"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

javaOptions in Test += "-Dconfig.file=conf/test.conf"
