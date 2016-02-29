package com.example

import akka.actor.AbstractLoggingActor
import akka.event.LoggingReceive

class LogActor extends AbstractLoggingActor {
  override def receive = LoggingReceive {
    case msg: String => {
      println(msg)
      log.info("Message Processed  :" + msg)
    }
  }


}
