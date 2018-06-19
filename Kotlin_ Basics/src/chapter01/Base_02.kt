package chapter01


fun main(args: Array<String>) {
    //累加操作
    var result = 0
    println(ollAdd(100, result))
}


fun ollAdd(num: Int, result: Int): Int {
    println("计算机第${num}次运算，result=${result}")
    if (num == 0) {
        return 1
    } else {
        return ollAdd(num - 1, result + num)
    }
}