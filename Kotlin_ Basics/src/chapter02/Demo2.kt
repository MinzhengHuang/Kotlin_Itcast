package chapter02


class Girl(var chactor: String, var voice: String) {
    fun smile() {
        println("妹子笑了一下")
    }

    fun cry() {
        println("妹子哭了")
    }
}

fun main(args: Array<String>) {
    var girl = Girl("彪悍", "甜美")
    println("这妹子的声音是:${girl.voice}")
    girl.cry()
    girl.smile()
}