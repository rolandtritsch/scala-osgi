package org.tritsch.scala.osgi

import org.osgi.framework.{BundleActivator, BundleContext}

class HelloWorld extends BundleActivator {
  override def start(context: BundleContext) {
      println("Hello Scala from OSGi!")
  }
  override def stop(context: BundleContext){}
}
