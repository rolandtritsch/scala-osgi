name := "My Scala OSGi Hello Client"

version := "0.1"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "com.weiglewilczek.slf4s" % "slf4s_2.9.1" % "1.0.7",
  "org.slf4j" % "slf4j-log4j12" % "1.6.4",
  "org.apache.felix" % "org.osgi.core" % "1.4.0",
  "default" % "my-scala-osgi-hello-service_2.9.1" % "0.1"
)

seq(osgiSettings: _*)

OsgiKeys.bundleActivator := Some("org.tritsch.scala.osgi.hello.client.HelloClient")

OsgiKeys.exportPackage := Seq("org.tritsch.scala.osgi.hello.client")
