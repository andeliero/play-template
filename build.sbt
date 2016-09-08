name := "play-template"

version := "1.0.0"

scalaVersion := "2.11.7"
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

javaOptions in Test += "-Dconfig.file=conf/test.conf"

//handling authentications and roles
libraryDependencies +=  "be.objectify" %% "deadbolt-scala" % "2.5.0"