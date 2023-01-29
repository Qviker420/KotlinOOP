package com.example.myapp

import kotlin.math.cos

fun main()
{
    val sofo : Person = Person("sofo", 1, "asda")
    sofo.getData()
}

class Person(private var name: String, private var age: Int, private var address: String) {

    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
        require(age > 0) { "Age must be a positive number" }
    }

    fun getData() {
        println("Name: $name, Age: $age, Address: $address")
    }

    fun setData(name: String, age: Int, address: String) {
        require(name.isNotBlank()) { "Name cannot be blank" }
        require(age > 0) { "Age must be a positive number" }
        this.name = name
        this.age = age
        this.address = address
    }
}