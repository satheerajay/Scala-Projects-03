object StringFilter {
  def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val input = List("hello", "world", "Scala", "programming", "is", "fun")
    val filtered = filterStrings(input)
    println(s"Original list: $input")
    println(s"Filtered list: ")
    filtered.foreach(println)
  }
}
