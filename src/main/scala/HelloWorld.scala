import scala.collection.Map
import scala.util.control.Breaks

/**
 * classname HelloWorld
 * create 2022-04-14 11:00
 */
object HelloWorld {

  /**
   * object 关键字 表示单例
   * <p>
   * def method(arg: argType): returnType = {
   * methodBody
   * }
   */

  def main(args: Array[String]): Unit = {
    println("hello world")
    System.out.println("hello scala from java")

    println("hello world" * 3)

    val b1: Byte = 1
    val b2: Byte = 2
    var b3: Byte = (b1 + 1).toByte
    var f1: Float = 1.1f

    for (i <- 1 to 10) println(i)
    for (i <- 1 until 10) println(i)
    for (i <- 1 until 10 if i % 2 == 0) println(i)
    for (i <- 1 until 10 by 2) println(i)

    var a1: IndexedSeq[Int] = for (i <- 1 to 10) yield i

    Breaks.breakable(
      for (i <- 1 to 10) {
        if (i == 4)
          Breaks.break()
        println(i)
      }
    )

  }

}
