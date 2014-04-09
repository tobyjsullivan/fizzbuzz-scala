object FizzBuzz extends App {
  (1 to 100).map {
    _ match {
      case i if i % 5 == 0 && i % 3 == 0 => "FizzBuzz"
      case i if i % 3 == 0 => "Fizz"
      case i if i % 5 == 0 => "Buzz"
      case i => i.toString
    }
  } map { println(_) }
}
