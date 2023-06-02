/* 

In this example, we define two functions, increment and double, which increment and 
double a given integer, respectively. The compose function takes two functions, 
f and g, as arguments and returns a new function that applies f to the result of g. 


We compose the double and increment functions using compose to create a new function
incrementAndDouble. This function first increments a number and then doubles it. 


When we invoke incrementAndDouble(5), we obtain 12 as the result.

*/

// Functions for incrementing and doubling a number
def increment(x: Int): Int = x + 1
def double(x: Int): Int = x * 2

// Function to compose two functions
def compose(f: Int => Int, g: Int => Int): Int => Int = {
  (x: Int) => f(g(x))
}

val incrementAndDouble = compose(double, increment)

val result = incrementAndDouble(5)  // Result: 12
println(result)