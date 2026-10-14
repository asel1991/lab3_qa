# Java Lab: Classes, Encapsulation, Overloading, Inheritance

Project for IntelliJ IDEA. Every task is in its own package (`task01` ... `task21`),
and every package has its own `Main` class that you can run.

## How to open it in IntelliJ IDEA

1. Open IntelliJ IDEA and choose **New Project** (or File -> New -> Project).
2. Choose **Java**, pick any JDK (17 or 21 is fine), name the project `JavaLab`, click **Create**.
3. Unzip `JavaLab.zip` somewhere.
4. Open the folder `JavaLab/src` from the zip and select all the folders `task01` ... `task21`.
5. Drag them (or Ctrl+C / Ctrl+V) into the `src` folder of your new project in the Project panel
   on the left. Click **OK / Refactor** if IntelliJ asks.
6. Wait for indexing to finish. There must be no red lines.

## How to run one task

1. Open the package, for example `task01`, and double-click `Main`.
2. Click the green triangle next to `public static void main` and choose **Run 'Main.main()'**.
3. The result appears in the **Run** window at the bottom.

(Each package has a class with the name `Main`, so always run the `Main` from the package you need.)

## Tasks

| Task | Package | What is inside |
|------|---------|----------------|
| 1 | task01 | Rectangle, 3 objects, all 4 methods |
| 2 | task02 | Car, speed never below 0 |
| 3 | task03 | Phone, class box in a comment, 4 method types |
| 4 | task04 | Reference vs object (a, b, c) |
| 5 | task05 | BankAccount with deposit / withdraw |
| 6 | task06 | final accountNumber, error messages in `Main` comments |
| 7 | task07 | Point, this(0, 0), method chaining |
| 8 | task08 | Employee with static nextId |
| 9 | task09 | MathUtils, static methods |
| 10 | task10 | Static / non-static table (in `Main` comment) and the check |
| 11 | task11 | Printer, 4 overloaded print methods |
| 12 | task12 | area() overloading, rules in a comment |
| 13 | task13 | Student, 3 constructors with this(...) |
| 14 | task14 | show() overloading, predictions in comments |
| 15 | task15 | Shape, Circle, Square, super.describe() |
| 16 | task16 | Vehicle[] array and start() |
| 17 | task17 | Constructor order LivingBeing, Animal, Dog |
| 18 | task18 | type, this.type, super.type |
| 19 | task19 | Overriding and overloading of sound() |
| 20 | task20 | Animal a = new Dog(), line that does not compile is in a comment |
| 21 | task21 | toString() override, before / after output in `Main` comment |

## Lines that do not compile

In tasks 6, 10 and 20 some lines are in comments on purpose, because they give a compile error.
If you want to see the red error in IntelliJ yourself, remove `//` from that line and hover on it.
