# How to find linear order of multiple traits

## Case 1. Linearization for class which extends only multiple traits

### Write down linearization for each traits
    1) L(A) = A
    2) L(C ) = C -> B -> A
    3) L(B) = B -> A
    4) L(D) = D -> A

### Write down the problem
```scala
var d = new A with D with C with B;
```

### Substitute each linearization from above.
**Note: start writing linearization from the right side**
    
    L(B)   -> L(C )       -> L(D)   -> L(A)
    B -> A -> C -> B -> A -> D -> A -> A

### Delete the duplicates from left to right
    1) [B -> A -> C -> B -> A -> D -> A -> A]
    2) [B -> ~~A~~ -> C -> B -> ~~A~~ -> D -> ~~A~~ -> A] Delete A's
    3) [~~B~~ -> ~~A~~ -> C -> B -> ~~A~~ -> D -> ~~A~~ -> A] Delete B
    4) [C -> B -> D -> A]


## Case 2. Linearization for class which extends class and multiple traits

### Write down linearization for each traits and class. 
    1) L(MyShape) = MyShape -> Shape 
    2) L(Shape) = Shape
    3) L(Dotted) = Dotted -> Border -> Shape
    4) L(Blue) = Blue -> Color -> Shape

### Write down the problem
```scala
class MyShape extends Shape with Dotted with Blue
```

### Substitute each linearization from above.
**Note: start writing linearization from the right side**
    
    L(MyShape)       -> L(Blue)                -> L(Dotted)                 -> L(Shape)
    MyShape -> Shape -> Blue -> Color -> Shape -> Dotted -> Border -> Shape -> Shape

### Delete the duplicates from left to right
    1) [MyShape -> Shape -> Blue -> Color -> Shape -> Dotted -> Border -> Shape -> Shape]
    2) [MyShape -> ~~Shape~~ -> Blue -> Color -> ~~Shape~~ -> Dotted -> Border -> ~~Shape~~ -> Shape]
    3) [MyShape -> Blue -> Color -> Dotted -> Border -> Shape]