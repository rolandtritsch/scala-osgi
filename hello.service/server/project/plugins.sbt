addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.0.10")

addSbtPlugin("com.typesafe.sbtosgi" % "sbtosgi" % "0.2.0")

resolvers += Resolver.url(
  "sbt-plugin-releases", 
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("com.github.retronym" % "sbt-onejar" % "0.7")