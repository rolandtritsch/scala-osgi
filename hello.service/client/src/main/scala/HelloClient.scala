package org.tritsch.scala.osgi.hello.client

import org.tritsch.scala.osgi.hello.service.HelloService
import org.osgi.framework.{BundleActivator, BundleContext}

import com.weiglewilczek.slf4s.Logging

class HelloClient extends BundleActivator with Logging {
  override def start(ctx: BundleContext): Unit = {
    logger.debug("Starting client ...")
    assert(ctx != Nil, "Context needs to be set")

    logger.debug("Looking/waiting for hello service ...")
    var hello: HelloService = null 
    while(hello == null) {
      hello = ctx.getService(ctx.getServiceReference("HelloService")).asInstanceOf[HelloService]
      Thread.sleep(1000)
    }

    logger.debug("Invoking on hello service ...")
    while(true) {
      hello.greetMe("Roland")
      Thread.sleep(1000)
    }
  }

  override def stop(ctx: BundleContext): Unit = {
    logger.debug("Stopping client ...")
    assert(ctx != Nil, "Context needs to be set")
  }
}
