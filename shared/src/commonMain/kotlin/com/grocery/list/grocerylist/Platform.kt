package com.grocery.list.grocerylist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform