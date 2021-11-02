addSbtPlugin("com.github.sbt" % "sbt-unidoc" % "0.5.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.2")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.3")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.3")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.0.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.4.1")
addSbtPlugin("com.github.sbt" % "sbt-protobuf" % "0.7.1")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.31")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")
addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.5.5")

libraryDependencies ++= Seq(
  "com.github.os72" % "protoc-jar" % "3.11.4"
)
