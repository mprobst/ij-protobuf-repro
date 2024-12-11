package org.example

import testpkg.Msg.MyMessage
import testpkg.myMessage

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    val msg = MyMessage.newBuilder().setName("Martins").build()
    val msg2 = myMessage { name = "Martin" }
    println("Msg $msg, $msg2")
    println(App().greeting)
}
