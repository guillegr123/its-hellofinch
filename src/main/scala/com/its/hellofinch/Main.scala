package com.its.hellofinch

import com.twitter.finagle.Http
import com.twitter.util.Await

import io.finch._
import io.finch.circe._
import io.finch.syntax._
import io.circe.generic.auto._

case class MessageResponse(msg: String)

object Main extends App {
  private val apiPath = "api" :: "v1"

  val hello: Endpoint[MessageResponse]
    = get(apiPath :: "hello") {
        () => Ok(MessageResponse("Hello world"))
    }

  val server = Http.server.serve(":8080", hello.toService)

  Await.ready(server)
}
