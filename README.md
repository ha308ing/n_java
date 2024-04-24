# Java Intro Examples

from
- [w3schools](https://www.w3schools.com/java/)
- [dev.java](https://dev.java/learn)

## Main (Garage)

```
javac -cp "./w3schools;./w3schools/garage/mypackage" -d "./build/w3schools" Main.java
java -cp "./build/w3schools" Main
```

1. Asks for data:
    - number of spots
    - person name
    - car brand, color
    - garage spot
2. Prints inputs

**Used**: _ArrayList_, _inheritance_, _abstract class_, _Scanner_, _loop_, _for .. in_

**Classes**: 

- _Main_
- _Person_
- _Vehicle_
- _Car_
- _GarageSpot_
- _Garage_
- _Time_
- _mypackage_

<br />

- _Main_
    - imports local package
    - use _Scanner_ for input
    - use
- _Car_ extends abstract class _Vehicle_
    - _brand_
    - _color_
- _Person_
    - _name_
- _GarageSpot_
    - _car_: _Car_
    - _owner_: _Person
    - _spotNumber_
- _Garage_: array of _GarageSpot_'s 
- _Time_
    - imports
        - _java.time.LocalDateTime_
        - _java.time.format.DateTimeFormatter_
    - returns formatted _now()_ string

## File Handling

```
javac -d "./build/w3schools/fileHandling" "./w3schools/FileHandling.java"
java -cp "./build/w3schools/fileHandling" FileHandling
```

- Creates a file
- Writes to the file
- Reads from the file
- Gets file info
- Deletes the file

**imports**:

- `java.io.File`
- `java.io.FileWriter`
- `java.io.IOException`
- `java.util.Scanner`

## Goods

```
javac -d "./build/w3schools/goods" "./w3schools/Goods.java"
java -cp "./build/w3schools/goods" Goods
```

- Creates a _HashSet_
- Add items to the _HashSet_
- Removes an item
- Iterates through the _HashSet_ and removes an item with an _iterator_

**imports**:

- `java.util.Iterator`
- `java.util.HashSet`

## Numbers

```
javac -d "./build/w3schools/numbers" "./w3schools/Numbers.java"
java -cp "./build/w3schools/numbers" Numbers
```

- Asks for the array size
- Gets the array items with `Scanner(System.in)`
- Sorts the array with `Collections.sort`
- Prints original and sorted array with a static method

**imports**:

- `java.util.Scanner`
- `java.util.ArrayList`
- `java.util.Collections`
- `java.util.function.Consumer`

## PrintFormatted

```
javac -d "./build/w3schools/printFormatted" "./w3schools/PrintFormatted.java"
java -cp "./build/w3schools/printFormatted" PrintFormatted
```

Use lamda for a string transformation and output

## StringSearch

```
javac StringSearch.java
java StringSearch
```

User a regular expression for string search
