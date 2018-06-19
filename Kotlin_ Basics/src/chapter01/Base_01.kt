package chapter01

import java.math.BigInteger

fun main(args: Array<String>) {
    var str1 = "Andy"
    var str2 = "andy"
    println(str1.equals(str2, true))

//    var nums = 1 .. 100 //[1,100]
    var nums = 1 until 100 //[1,100)
    for (num in nums) {
        println(num)
    }

    var nums2 = 1..16
    for (a in nums2 step 2) {
        println(a)
    }

    var nums3 = nums2.reversed()
    for (a in nums3) {
        println(a)
    }

    var result = add(3, 5)
    println("result=" + result)

    var i = { x: Int, y: Int -> x + y }
    var result2 = i(3, 5)
    println("result2=" + result2)

    var j: (Int, Int) -> Int = { x, y -> x + y }
    var result3 = j(3, 5)
    println("result3=" + result3)

    var num = BigInteger("100")
    //计算100的阶乘
    println(fact(num))

    println("请输入第一个数字:")
    var num1Str = readLine()
    println("请输入第二个数字:")
    var num2Str = readLine()

    try {
        var num1: Int = num1Str!!.toInt()
        var num2: Int = num2Str!!.toInt()
        println("${num1} + ${num2} = ${num1 + num2}")
    } catch (e: Exception) {
        println("请输入数字")
    }

}

fun add(x: Int, y: Int): Int = x + y

fun fact(num: BigInteger): BigInteger {
    if (num == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return num * fact(num - BigInteger.ONE)
    }
}
