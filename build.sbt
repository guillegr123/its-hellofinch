name := "its-hellofinch"

version := "0.1.0"

organization := "com.its"

scalaVersion := "2.12.4"

libraryDependencies ++= {
  val finchVersion = "0.21.0"
  Seq(
    "com.github.finagle" %% "finch-core" % finchVersion,
    "com.github.finagle" %% "finch-circe" % finchVersion,
    "io.circe" %% "circe-generic" % "0.9.0"
  )
}
