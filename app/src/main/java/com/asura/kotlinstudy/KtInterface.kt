package com.asura.kotlinstudy

import com.asura.kotlinstudy.ktinterface.Child
import com.asura.kotlinstudy.ktinterface.Child2

/**
 * Created by Liuxd on 2017/9/15 15:21.
 * Kotlin 接口
 * http://www.runoob.com/kotlin/kotlin-interface.html
 *
 * 类对接口的具体实现：Child.bar()
MyInterface接口的默认实现：MyInterface.foo()
c.name ：Child
-----------------------------------------------------
MyInterface2接口的默认实现：MyInterface2.bar()
MyInterface接口的默认实现：MyInterface.foo()
MyInterface2接口的默认实现：MyInterface2.foo()
d.name ：Child2
 */
class KtInterface {
    fun main() {
        val c = Child()
        c.bar()
        c.foo()
        ALog.d("c.name ：${c.name}")
        ALog.d("-----------------------------------------------------")
        val d = Child2()
        d.bar()
        d.foo()
        ALog.d("d.name ：${d.name}")
    }
}