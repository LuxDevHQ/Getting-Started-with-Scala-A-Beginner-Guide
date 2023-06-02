/* Example 2, the createMultiplier function takes an integer factor as an 
argument and returns a new function that multiplies a given integer by the factor. 

We create two multiplier functions, multiplyByTwo and multiplyByThree,by invoking 
createMultiplier with different factors. We can then use  these functions to 
numbers by their corresponding factors.
*/


//Higher Order Function taht returns a function 
def createMultiplier(factor: Int): Int => Int = { 

    (x: Int)  => x * factor 

} 

val multiplyByTwo = createMultiplier(2)
val multiplyByThree = createMultiplier(3)

val result1 = multiplyByTwo(5)  // Result: 10
val result2 = multiplyByThree(5)  // Result: 15

println(result1) 

println(result2)
