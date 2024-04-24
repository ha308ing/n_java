# Nested Classes

- static  
    associated with its outer class - cannot refer directly to instance variables, methods of the enclosing class *
- non-static  
    associated with instance - cannot have static members  
    has access to the enclosing class members
- local  
    inner class within the body of a method  
    defined in a block (for loop, if clause...)  

    local classes defined in static methods,  
    can only refer to static members of the enclosing class  

    local classes are non-static because they have access to instance members
    of the enclosing block -  
    so they cannot contain most kind of static declarations  
    interfaces are inherently static, so cannot be declared inside a block  
    **BUT** a local class can contain `static final member`
- anonymous  
    inner class within the body of a method without naming  
    declare and instantiate a class at the same time  
    use when need a local class only once  

    anonymous class is an expression  
    `HelloWorld frenchGreeting = new HelloWorld() {...}` instead of  
    ```java
    class FrenchGreeting implements HelloWorld { ... }
        
    FrenchGreeeting frenchGreeting = new FrenchGreeting();
    ```  

    syntax:  
    ```
    [<i/c>] ... = 
    new [interface to implement / class to extend <i/c>]
    ( [arguments to a constructor (empty for an interface)] )
    { [body (class declaration body)] };
    ```


## Reason

1. logically group classes in one place
2. increase encapsulation
    no need to change modifier for outide classes
3. readability / maintainability

```
class OuterClass {
    ...
    class NestedClass {}

    class InnerClass{}

    static class StaticNestedClass {}

    {
        ...
        StaticNestedClass staticNestedObject = new StaticNestedClass();
    }

}

OuterClass outerObject = new OuterClass();
OuterClass.InnerClass = outerObject.new InnerClass();
```
