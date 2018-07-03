scalaVersion := "2.12.3"

name := "zophie2"


// Compiler options
scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Ywarn-unused", "-Xlint")

// Test options
testOptions in Test += Tests.Argument("-oD")
parallelExecution in Test := false

// Dependencies
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
