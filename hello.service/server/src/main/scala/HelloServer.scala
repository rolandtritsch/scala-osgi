package org.tritsch.scala.osgi.hello.server

import org.tritsch.scala.osgi.hello.service.HelloService
import org.osgi.framework.{BundleActivator, BundleContext, ServiceRegistration}

//import com.weiglewilczek.slf4s.Logging

//class HelloServer extends BundleActivator with HelloService with Logging {  
class HelloServer extends BundleActivator with HelloService {  
  override def start(ctx: BundleContext): Unit = {
    //logger.debug("Starting server ...")
    println("Starting server ...")
    assert(ctx != Nil, "Context needs to be set")
    val registration = ctx.registerService("HelloService", this, new java.util.Properties())
  }

  override def stop(ctx: BundleContext): Unit = {
    //logger.debug("Stopping server ...")
    assert(ctx != Nil, "Context needs to be set")
  }

  override def greetMe(name: String): String = {
    //logger.debug("Enter greetMe() ...")
    assert(!name.isEmpty, "Name cannot be empty")
    "Hello " + name + " at <" + (new java.util.Date).toString + ">"
  }
}
