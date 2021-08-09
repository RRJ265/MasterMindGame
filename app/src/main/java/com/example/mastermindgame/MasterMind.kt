package com.example.mastermindgame

fun String.stringComparsion(str2:String):Pair<Int, Int>{
    var maxChar:Int = 0
    var rightPosition:Int = 0
    var duplicate = str2
    if(this.length != str2.length)  return Pair(0,0)
    if(this.equals(str2,false)) return Pair(this.length,str2.length)
    for((index,c) in withIndex()){
        if(c == str2[index]) rightPosition++
        if(duplicate.contains(c,false)){
            maxChar++
            duplicate = duplicate.replace(c.toString(),"")
        }
    }
    return Pair(maxChar,rightPosition)
}

fun main() {

    println("ABCD".stringComparsion("AFCH"))    // 2,2
    println("AAAA".stringComparsion("AFCH"))    // 1,1
    println("ABCD".stringComparsion("ABCD"))    // 4,4
    println("ABCD".stringComparsion("DCBA"))    // 4,0
    println("ABCDP".stringComparsion("DCBA"))   // null
}

