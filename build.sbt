name := "bm-simple"

version := "0.1"

scalaVersion := "2.12.8"
lazy val benchJvmSettings = Seq(
  Test / fork := true,
  Test / javaOptions := Seq("-Xmx3G")
)
lazy val noPublishSettings = Seq(
  publish := {},
  publishLocal := {},
  publishArtifact := false
)

lazy val `quick-bench` = 
  (project in file(".")) 
  .settings(benchJvmSettings)
  .settings(noPublishSettings)
  .enablePlugins(JmhPlugin)
