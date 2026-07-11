
# Method Header

* **public**: access modifier
* **static**: static modifier
* *void*: return type

```java
public static void displayMessage() {
    System.out.println("Hello World!");
}

# Explanations

* Access modifier** determines the visibility, `public` is open to the world and always accessible.
* Static modifier** allow us to call the method through the class name.
* Return type** determines if the method returns a value. If the return type is `void`, the method does not return any value.
* Parenthesis** method name is always followed by a set of parenthesis `()` that can have parameter(s).

Return Value Rules
Declare the return type in the method header to specify the type of value that the method will return.

Use the return keyword followed by the value that we want to return.

If the method has a void return type, no value is returned, it just stops the execution of the method.

After the return statement, no code will be executed in that method.

A method can have multiple return statements inside of the conditional statements, but only one of them will be executed.
