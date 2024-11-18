package com.github.ajcode404

fun main() {

    val pool = ConnectionPool(200)

    executeQuery(pool) {
        it.execute("SELECT  ")
    }
}
