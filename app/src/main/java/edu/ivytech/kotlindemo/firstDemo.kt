package edu.ivytech.kotlindemo

import kotlin.random.Random

fun main (args:Array<String>) {
    val x : Int by lazy {getNum(1)}
    val x2 : Int by lazy { getNum(2)}
    val x3 : Int by lazy { x }
    println(x2)
    println(x3)
    println(x)
}

fun getNum(num : Int) : Int {
    println("Getting Random Num . . . $num")
    return Random.nextInt(1,10)
}

