
object Main {

  def main(args: Array[String]): Unit = {
    val natoMap: Map[Char, String] = List(
      "alpha",    "beta",      "charlie",  "delta",
      "echo",     "foxtrot",   "golf",     "hotel",
      "india",    "julia",     "kilo",     "lima",
      "mike",     "november",  "oscar",    "papa",
      "quebec",   "romeo",     "sierra",   "tango",
      "uniform",  "victor",    "whiskey",  "x-ray",
      "yankee",   "zulu"
    ).map(s => {
      (s.toLowerCase.charAt(0) -> s.toLowerCase)
    }).toMap ++
      Map('.' -> "dot", '@' -> "At-Sign", '#' -> "Pound Sign") ++
      Map(
        '0' -> "zero",
        '1' -> "one",
        '2' -> "two",
        '3' -> "three",
        '4' -> "four",
        '5' -> "five",
        '6' -> "six",
        '7' -> "seven",
        '8' -> "eight",
        '9' -> "nine",
      )

    def charLookup(a: Char) = natoMap.getOrElse(a, s"$a$a$a")

    args.mkString(" ").toLowerCase.foreach(c => println(charLookup(c)))
  }
}
