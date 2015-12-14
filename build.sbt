name := "MLibGBTsDemo"

version := "1.0"

scalaVersion := "2.10.6"

scalacOptions ++= Seq("-encoding", "UTF-8")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.2",
  "org.apache.spark" %% "spark-mllib"  % "1.5.2"
)

