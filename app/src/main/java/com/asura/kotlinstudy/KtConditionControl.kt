package com.asura.kotlinstudy

/**
 * Created by Liuxd on 2017/9/12 11:01.
 * Kotlin 条件控制
 * http://www.runoob.com/kotlin/kotlin-condition-control.html
 *
 *  2
777
999
c 的值为 9
a：9 不在 1..8 区间内
otherwise
x 不是 1 ，也不是 2
x 在该区间范围内
 */
class KtConditionControl {
    fun main(args: Array<String>) {
        //IF 表达式
        ALog.d(max1(1, 2).toString()) //2
        ALog.d(max2(555, 777).toString()) //777
        ALog.d(max3(666, 999).toString()) //999
//        val c = if (condition) a else b
        var a = 9
        var b = 2
        val c = if (a > b) a else b
        ALog.d("c 的值为 $c") //9

        //使用区间
        if (a in 1..8) {
            ALog.d("a：$a  在 1..8 区间内") //9
        } else {
            ALog.d("a：$a 不在 1..8 区间内")
        }

        //When 表达式
        //和 switch 类似
        var x = 10
        when (x) {//otherwise
            0, 1 -> ALog.d("x == 0 or x == 1")
            else -> ALog.d("otherwise")
        }

        when (x) {//x 不是 1 ，也不是 2
            1 -> ALog.d("x == 1")
            2 -> ALog.d("x == 2")
            else -> { // 注意这个块
                ALog.d("x 不是 1 ，也不是 2")
            }
        }

        when (x) {// 在该区间范围内
            in 0..10  -> ALog.d("x 在该区间范围内")
            else -> ALog.d("x 不在该区间范围内")
        }
//        when 中使用 in 运算符来判断集合内是否包含某实例：
        val items = setOf("apple", "banana", "kiwi")
        when {
            "orange" in items -> ALog.d("juicy")
            "apple" in items -> ALog.d("apple is fine too")
        }

    }

    fun max1(a: Int, b: Int): Int {
        var max = a
        if (a < b) max = b
        return max
    }

    fun max2(a: Int, b: Int): Int {
        var max: Int
        if (a < b) {
            max = b
        } else {
            max = a
        }
        return max
    }

    fun max3(a: Int, b: Int): Int {
        val max = if (a > b) a else b
        return max
    }
}
