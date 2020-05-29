object Lab2 {
  def main(args: Array[String]) {
    val words = List[String]("test", "hello", "world", "privet")
    println(reverse(words))

    val string = "Test ping hello ping da ping"
    println(pong(string))
  }

  def reverse(words: List[String]) : List[String] = {
    words.map((word: String) => word.reverse)
  }

  def pong(string: String) : String = {
    string.split(' ').map(
      _ match {
        case ping if ping.toLowerCase() == "ping" => ping + " pong"
        case other => other
      }
    ).reduce((word, res) => word + " " + res)
  }
}
