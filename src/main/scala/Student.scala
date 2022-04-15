/**
 * classname Student
 * description TODO
 * create 2022-04-14 11:13 
 */
class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
    println((name + " " + age + " " + Student.school) * 3)
    printf("%d %s %s", age, name, Student.school)
    println(s"${name} ${age} ${Student.school}")
    println(s"$name $age ${Student.school}")

  }
}

object Student {
  val school: String = "家里蹲"

  def main(args: Array[String]): Unit = {
    val bob = new Student("bob", 18)
    val tom = new Student("tom", 18)
    bob.printInfo()
    tom.printInfo()


    var a3: Integer = null
    var + : Int = 1
    val str =
      """
        |
        |
        |""".stripMargin
  }
}
