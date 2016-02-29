package com.example

import akka.actor.{ActorRef, ActorSystem, Props}
import com.typesafe.scalalogging.Logger
import org.slf4j.LoggerFactory

/**
  * Created by synerzip on 29/2/16.
  */
object Main extends App {
  val Log = Logger(LoggerFactory.getLogger("LogActor"))
  private val actorOf: ActorRef = ActorSystem.create("Logstash").actorOf(Props[LogActor])
  Log.debug("Logstash Actor System Created")
  (0 to 10).foreach(count => actorOf ! s"Hello Logstash $count")
}
