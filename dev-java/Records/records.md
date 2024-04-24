# Record

A record is an immutable class declared with the `record` keyword.

`public record Point(int x, int y) {}`

This class extends the `java.lang.Record` class.  
So record cannot extend any class.

Compiler adds overrides methods from Object class
- toString()
- equals()
- hashCode()

*Cannot be added to a Record*:
- no instance field that would not correspond to a component
- no field, instance initializers

Static fields can be created with initializers and static initializers.


## Canonical constructor
*Canonical constructor* - compiler-created constructor, that takes the componens of the record as arguments and copies their values to the fields of the record class.  
Override *canonical constructor*:
- if need to validate the state of the record
- if need to make a defensive copy of a mutable component


### Compact constructor

*Validation rule example*:
```java
public record Range(int start, int end) {

    public Range {
        if (start > end ) {
            throw new IllegalArgumentException("End cannot be lesser than start");
        }

        if (start < 0) start = 0;
        if (end < 0) end = 0;
    }
    
}
```

### Non-compact form

```java
public record Range(int start, int end) {

    public Range (int start, int end) {
        if (start > end ) {
            throw new IllegalArgumentException("End cannot be lesser than start");
        }

        if (start < 0) {
            this.start = 0;
        } else {
            this.start = start;
        }

        if (end < 0) {
            this.end = 0;
        } else {
            this.end = end;
        }
    }
    
}
```
