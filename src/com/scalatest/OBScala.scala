package com.scalatest

object OBScala {
  //入口函数编写方式一
  def main(args: Array[String]): Unit = {
    println("hello,scala")

    //定义变量的两种方式

    //第一种方式:val修饰的变量
    //特点:值不可以修改,相当于java里面的final修饰的变量

    val x=10
    //x=20
    println(x)

    //第二种方式:var修饰的变量
    //特点:值是可以修改的
    var y=20
    y = 300
    println(y)

    //显式声明变量类型
    //变量名在前,类型在后
    val a: Int = 100
    val b: String = "xxxlll"//
    println(a+b)
  }
}
