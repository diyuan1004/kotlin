package com.jiagu.kotlintwo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun test() {
//        var list = listOf(1,24,232,45,32,421,45,24,24432,43)
//        print(list.elementAt(7))

//        val str = "hello world"
//        print("$str.length is ${str.length}")


//        val a: Int? = 10000
//        val b: Int? = 10000
//        println(a == b)
//
//        val boxedA: Int? = a
//        val anotherBoxedA: Int? = a
//        println(boxedA == anotherBoxedA)

//        val a: Int? = 1
//        val b: Long? = a!!.toLong()
//
//
//        // 1.toLong   显式转换
//        val l = 1.toLong() + 5 // long + int => long   隐式转换
//
//        var c = check('9')
//        println(c)

//        var arr = arrayOf(1, 3, 4, 5, 2, 3,221)
//        var arrNull = arrayOfNulls<Int>(9)
//        println(arr.size)
//        println(arrNull.size)

//        var asc = Array(5, { i -> (i * i).toString() })
//
//        val x: IntArray = intArrayOf(1, 2, 4)
//        x[0] = x[1] + x[2]
//        println(x[0])
//        println(x[1])
//        println(x[2])

//        val i = 10
//        val s = "i = $i"
//        print(s)
//        val str = "abc"
//        val s = "$str.length is ${str.length}"
//        print(s)


//        var max =3
        val a = 4
        val b = 5
//        if (a < b) {
//            max = b
//        }else{
//            max = a
//        }
//        print(max)

//        val max = if (a > b){
//            print("a:")
//            a
//        }else{
//            print("b:")
//            b
//        }
//        print("\nmax")

        var x = 4
//        when(x){
//            1, 2 -> print("x == 1 or x == 2")
//            else -> {
//                print("otherwise")
//            }
//        }
//
//        when (x) {
//            in 0..9 -> print("x is in the range")
//            !in 10..20 -> print("x is in charrange")
//            is Int -> print("fsfs")
//            else -> print("none of the above")
//
//        }

//        when {
//            x.isOdd() -> print("x is odd")
//            x.isEven -> print("x is even")
//            else -> print("x is funny")
//        }


//        val arr = arrayOf(1, 3, 4, 5, 6)
//        for (i in arr.indices){
//            println(arr[i])
//        }


//        while (x > 0){
//            x--
//        }
//        print(x)

//        do {
//            x--
//        }while (x > 0)
//        print(x)


//        loop@ for (i in 1..10) {
//            for (j in i..10) {
//                if (j == 10 && i == 2) {
//                    println("i == $i , j == $j ")
//                    break@loop
//                }
//                println("j == $j")
//
//            }
//            println("i === $i")
//
//        }

        foo()

    }


    fun foo() {
        val list = listOf(1, 4, 5, 53, 23, 45)
        list.forEach lit@ {
            if (it == 4) return@lit
            println(it)
        }
    }

    fun check(c: Char): Int {
        if (c !in '0'..'9') {
            throw IllegalArgumentException("")
        }
        return c.toInt() - '0'.toInt()
    }


}