// 1). Comments In Scala

// Single Line Comments use // double forward slash  


/* 

This is  a multi line comments in Scala. 

Another line of comment can be written here. 

*/


//Variables in Scala

var age: Int = 25 // Mutable Variable
 
val name : int = "Jane Doe" //Immutable varaible



//Data types in Scala 


/* 

Scala provides a rich set of data types to handle various kinds of values. Here are the commonly used data types in Scala:

Numeric Types:

Byte: 8-bit signed integer (-128 to 127).
Short: 16-bit signed integer (-32,768 to 32,767).
Int: 32-bit signed integer (-2,147,483,648 to 2,147,483,647).
Long: 64-bit signed integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807).
Float: 32-bit floating-point number.
Double: 64-bit floating-point number.
Boolean Type:

Boolean: Represents logical truth values (true or false).
Character Type:

Char: Represents a single Unicode character.
String Type:

String: Represents a sequence of characters.
Collection Types:

Array: A mutable sequence of elements of the same type.
List: An immutable linked list.
Set: An unordered collection of unique elements.
Map: A collection of key-value pairs.
Tuple Types:

Tuple: An ordered collection of elements of different types. Tuple types are represented as Tuple1, Tuple2, Tuple3, etc., up to Tuple22.
Option Type:

Option: Represents an optional value that can be either Some(value) or None. It helps handle cases where a value may or may not be present.
Any and AnyVal Types:

Any: The root type of all Scala types.
AnyVal: The root type of all value types, including numeric types and Boolean.
Unit Type:

Unit: Represents the absence of a meaningful value. Similar to void in other languages.
Function Types:

Function types are represented using the arrow notation. For example, Int => String represents a function that takes an Int argument and returns a String value.
User-Defined Types:

Scala also allows defining custom data types using classes, case classes, and enumerations (enum).
These are the fundamental data types in Scala. The type system in Scala is strong and supports type inference, allowing the compiler to automatically determine types in many cases. Additionally, Scala provides various type conversion methods and type-safe operations to work with these data types effectively.


*/

// Data types in Scala : Numeric Types

val age: Int = 25
val price: Double = 9.99
val count: Long = 1000000L



// Data types in Scala : Boolean Type
val isSunny: Boolean = true
val isRaining: Boolean = false


// Data types in Scala : Character Type:
val firstInitial: Char = 'J'
val grade: Char = 'A'


// Data types in Scala : String Type
val message: String = "Hello, Scala!"
val firstName: String = "John"


// Data types in Scala :  Collection Types
val numbers: Array[Int] = Array(1, 2, 3, 4, 5)
val fruits: List[String] = List("Apple", "Banana", "Orange")
val uniqueNumbers: Set[Int] = Set(1, 2, 3, 4, 5)
val person: Map[String, Any] = Map("name" -> "John", "age" -> 30)


// Data types in Scala : Tuple Type
val person: (String, Int, Boolean) = ("John", 30, true)
val coordinates: (Double, Double) = (10.5, 20.0)


// Data types in Scala : Option Type
val result: Option[Int] = Some(42)
val notFound: Option[String] = None


// Data types in Scala : Any and AnyVal Types:
val anyValue: Any = "Hello"
val anyNumericValue: AnyVal = 42


// Data types in Scala : Unit Type
def printMessage(): Unit = {
  println("Hello, Scala!")
}


// Data types in Scala : Function Types
val add: (Int, Int) => Int = (a, b) => a + b
val greet: String => Unit = name => println(s"Hello, $name!")


//Operators in Scala 


//control structures in Scala 
