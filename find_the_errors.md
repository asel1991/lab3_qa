# Find the errors and Predict the output

## Find the errors

### Program 1

Original code:

```java
public class Person {
    private String name;
    private int age;

    public void Person(String name, int age) {
        name = name;
        age = age;
    }
}
// In Main: Person p = new Person("Asan", 20);
```

I found 2 errors.

**Error 1.** There is `void` before `Person`. A constructor must not have `void`. With `void` it is just a normal method, not a constructor. So `new Person("Asan", 20)` gives an error, because Java can not find a constructor with 2 values. I fix it: I remove `void`.

**Error 2.** `name = name` and `age = age` are wrong. Java thinks that both `name` are the value in the brackets. So it puts the value into itself, and the variable of the class does not change. I fix it: I write `this.name = name`. The word `this` means "this object", so `this.name` is the variable of the class.

Fixed code:

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {   // void removed
        this.name = name;                   // this. added
        this.age = age;                     // this. added
    }

    public String getName() {               // only to check the result
        return name;
    }
}
```

**Is `name` still null after I fix the first error?**
Yes. If I remove only `void`, the error is gone, but `name` is still `null` and `age` is still `0`. It is becouse of Error 2: `name = name` does nothing for the variable of the class. I can check it in Main:

```java
Person p = new Person("Asan", 20);
System.out.println(p.getName());   // null without this., Asan with this.
```

### Program 2

Original code:

```java
class Animal {
    Animal(String name) { }
}
class Dog extends Animal {
    Dog() { }
}
```

Fixed code:

```java
class Animal {
    Animal(String name) { }
}
class Dog extends Animal {
    Dog() { super("Dog"); }
}
```

**Error:** `Dog()` does not call the constructor of `Animal`. Java adds `super()` by itself, with empty brackets. But `Animal` wants a name (String). There is no empty `Animal()`, so we get an error. I fix it: I write `super("Dog")` and give the name. Another way is to add an empty `Animal() { }` in the class `Animal`.

### Program 3

Original code:

```java
class Base {
    public void show() { }
    public final void lock() { }
}
class Child extends Base {
    void show() { }
    public void lock() { }
}
```

Fixed code:

```java
class Base {
    public void show() { }
    public final void lock() { }
}
class Child extends Base {
    public void show() { }      // public added
    // lock() deleted
}
```

There are 2 errors.

**Error 1.** `show()` in `Child` is more closed than in `Base`. In `Base` it is `public` (everybody can use it). In `Child` there is no word, so it is more closed. A child can not make the method more closed than the parent. I fix it: I write `public`.

**Error 2.** `lock()` is `final` in `Base`. `final` means "can not be changed". But `Child` writes its own `lock()`, so we get an error. I fix it: I delete `lock()` from `Child`. Another way is to remove `final` in `Base`, but then the method is not locked anymore.

### Program 4

Original code:

```java
class Counter {
    int count = 0;
    static void increment() {
        count++;
    }
}
```

Fixed code:

```java
class Counter {
    int count = 0;
    void increment() {     // static removed
        count++;
    }
}
```

**Error:** A static method can not use a normal variable. `count` is a normal variable, so every object has its own `count`. A static method works without any object, so Java does not know which `count` to change. I fix it: I remove `static` from `increment()`. Another way is to make `count` static, then there is only one `count` for all objects.

## Predict the output

### Question 1

```java
new C();
```

Output:

```
A
B
C
```

When we make `C`, Java goes up first: from `C` to `B`, and from `B` to `A`. `A` is the top, so it prints first: "A". Then `B` prints "B". Then `C` prints "C". The parent is always first.

### Question 2

```java
Parent p = new Child();
p.hello();
Child c = new Child();
c.hello();
```

Output:

```
Child
Child
```

The variable `p` is a `Parent`, but the object inside is a `Child`. Java uses the method of the real object, so it is the `hello()` of `Child`. The variable `c` is a `Child` too, so it is "Child" again.

### Question 3

```java
Test t1 = new Test();
Test t2 = new Test();
Test t3 = new Test();
System.out.println(Test.a + " " + t1.b);
```

Output:

```
3 1
```

`a` is static, so there is only one `a` for all objects. We make 3 objects, so `a` becomes 1, then 2, then 3. `b` is not static, so every object has its own `b`. In every object `b` goes from 0 to 1. So `Test.a` is 3 and `t1.b` is 1, and it prints `3 1`.
