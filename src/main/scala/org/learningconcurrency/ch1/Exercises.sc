// Each of the exercises below provides a function skeleton that you should replace.
// Below each function is a set of assertions. Your goal is to make them all evaluate to true.

// Write a function to add one to its arguments
def plusOne(x: Int) = {
  x
}

plusOne(1) == 2


// Write a function that returns true if the number passed in is odd
def isOdd(x: Int) = {
  false
}

isOdd(13) == true
isOdd(42) == false

// Write a function that takes a list of numbers and determines if any of them is odd
def anyOdd(xs: List[Int]) = {
  false
}

anyOdd(List(2, 4, 6)) == false
anyOdd(List(2, 4, 13)) == true

// Write a more general function to detect if all items in a sequence meet a certain predicate
def all[T](xs: Seq[T])(pred: T => Boolean): Boolean = {
  false
}
all(0 until 10)(isOdd) == false
all(0 until 10 by 2)(isOdd) == true

// Things get trickier now...

// Write a method to compose two functions
// compose(g, f) should return a function that is the same as g(f(x))

def compose[A, B, C](g: B => C, f: A => B): A => C = ???
compose(isOdd, plusOne)(2) == true
compose(isOdd, plusOne)(3) == false
// Implement a fuse method with the  signature below.
// If both of the arguments are a value, it returns both of them as a tuple.
// Otherwise it returns Nothing
// Use for-comprehensions.
def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = ???

fuse(Some(2), None) == None
fuse(Some(42), Some("Hello world!")) == Some(Tuple2(42, "Hello world!"))