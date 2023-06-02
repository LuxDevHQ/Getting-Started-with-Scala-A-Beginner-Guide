/*

Example 1: the applyOperation function takes an integer x and a function f
as arguments.

It applies the function f to the value x. We define two functions, double and square, 
which double and square an integer, respectively. 

By passing these functions as arguments to applyOperation, we can apply different 
operations to a given number.
*/ 


//Higher Order Function that takes a function as an argument
def applyOperation(x: Int, f: Int =>Int): Int = { 
    f(x)
} 


//Functio to double a number  
def double(x:Int): Int ={ 

    x *2

} 

//Function hat squares a number  
def square(x: Int): Int ={ 
    x*x  
}
 

val result1 = applyOperation(5, double) 
println(result1)

val result2 = applyOperation(5, square)
println(result2)