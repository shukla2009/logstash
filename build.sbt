name := """logstash"""

version := "1.0"

//packageDescription in Debian := "Logstash Example"

//maintainer in Debian := "Rahul Shukla"

scalaVersion := "2.11.7"
//enablePlugins(JavaAppPackaging, UniversalDeployPlugin,sbtdocker.DockerPlugin)
enablePlugins(JavaAppPackaging, UniversalDeployPlugin)

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3"
libraryDependencies += "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.1.0"
//libraryDependencies += "net.logstash.logback" % "logstash-logback-encoder" % "4.5.1"
libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.4.2"

// Uncomment to use Akka
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.2"

//dockerfile in docker := {
//  val appDir: File = stage.value
//  val targetDir = "/app"
//
//  new Dockerfile {
//    from("isuper/java-oracle")
//    entryPoint(s"$targetDir/bin/${executableScriptName.value}")
//    copy(appDir, targetDir)
//  }
//
//}
//buildOptions in docker := BuildOptions(cache = false)