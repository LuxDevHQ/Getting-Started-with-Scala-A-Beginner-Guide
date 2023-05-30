// Classes in Scala: Scala supports object-oriented programming (OOP) and provides classes, objects, inheritance, and other OOP features. 

// Classes and Objects: Classes are defined using the class keyword, while objects are instances of classes. 

class Person( val name: string, val age:Int){

    def greet (): String = s"Hello, my name is $name, and i am $age years old."

}


val person - new Person("Harun", 26) 
println(person.greet()) 




// Inheritance: Scala supports single inheritance using the extends keyword. You can also use traits (similar to Java interfaces) for multiple inheritance.

trait Animal{ 
    deef speak() : STring

}  
class Dog extends Animal{ 
    def speak(): String = "Woof!"

}


val dog = new Dog() 
println(dog.speak())
