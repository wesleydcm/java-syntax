# Reserved Keyword in Java

Reserved keywords in Java are those that have predefined meanings and cannot be used as identifiers (variable names, method names, etc.) within Java programs. These reserved keywords are crucial for defining the syntax and structure of Java programs and are enforced by the Java compiler.

So while all the keywords listed are part of the Java language, it's important to distinguish between those that are reserved keywords and those that are not.


### Access Control

| Keyword    | Description                                                 |
|------------|-------------------------------------------------------------|
| `public`   | Accessible from any other class.                            |
| `protected`| Accessible within the same package or subclasses.           |
| `private`  | Accessible only within the same class.                      |

### Class

| Keyword        | Description                                                 |
|----------------|-------------------------------------------------------------|
| `class`        | Defines a new class.                                        |
| `interface`    | Defines a new interface.                                    |
| `enum`         | Defines a new enumeration type.                             |
| `extends`      | Indicates a class is derived from another class (inheritance). |
| `implements`   | Indicates a class implements one or more interfaces.        |

### Control Flow

| Keyword      | Description                                                 |
|--------------|-------------------------------------------------------------|
| `if`, `else`| Conditional branching based on a condition.                 |
| `switch`     | Multi-way branching based on a value.                       |
| `case`, `default` | Defines case labels within a switch statement.           |
| `while`, `do`, `for` | Looping constructs for iteration.                       |
| `break`, `continue` | Control loop execution flow.                            |
| `return`     | Exits a method and optionally returns a value.              |
| `assert`     | Evaluates a boolean expression for debugging purposes.       |

### Exception Handling

| Keyword      | Description                                                 |
|--------------|-------------------------------------------------------------|
| `try`, `catch`| Implements exception handling mechanism.                     |
| `finally`    | Specifies code that should always be executed after a try block. |
| `throw`      | Throws an exception explicitly.                              |
| `throws`     | Indicates which exceptions may be thrown by a method.        |

### Object Creation

| Keyword      | Description                                                 |
|--------------|-------------------------------------------------------------|
| `new`        | Creates a new object.                                       |
| `this`       | Refers to the current object instance.                      |
| `super`      | Refers to the superclass of the current object instance.    |

### Packages

| Keyword      | Description                                                 |
|--------------|-------------------------------------------------------------|
| `package`    | Defines a package.                                          |
| `import`     | Imports classes or packages.                                |

### Data Types

| Keyword      | Description                                                 |
|--------------|-------------------------------------------------------------|
| `boolean`    | Represents boolean values (true or false).                  |
| `byte`       | Represents 8-bit integers.                                  |
| `short`      | Represents 16-bit integers.                                 |
| `int`        | Represents 32-bit integers.                                 |
| `long`       | Represents 64-bit integers.                                 |
| `float`      | Represents single-precision floating-point numbers.         |
| `double`     | Represents double-precision floating-point numbers.         |
| `char`       | Represents a Unicode character.                             |
| `void`       | Indicates a method does not return a value.                 |

### Modifiers

| Keyword      | Description                                                 |
|--------------|-------------------------------------------------------------|
| `static`     | Indicates that a method or variable belongs to the class, not instances. |
| `final`      | Specifies that a variable cannot be modified or a method cannot be overridden. |
| `abstract`   | Indicates a method or class lacks implementation details.   |
| `synchronized` | Controls access to shared resources by multiple threads.   |
| `volatile`   | Indicates a variable may be modified asynchronously.         |
| `transient`  | Indicates a variable should not be serialized.               |
| `native`     | Indicates a method is implemented in native code.            |
| `strictfp`   | Ensures consistent floating-point calculations across platforms. |

### Miscellaneous

| Keyword      | Description                                                 |
|--------------|-------------------------------------------------------------|
| `instanceof`| Tests if an object is an instance of a particular class or interface. |
| `null`       | Represents the absence of a value.                          |
| `true`, `false` | Represents boolean literals.                              |
| `const`      | Reserved but not used in Java.                              |
| `goto`       | Reserved but not used in Java.                              |


## Non-Reserved Keywords in Java:

From the list, there are exceptions: of keywords that are not strictly reserved, but are part of the Java language, as they can be used for other purposes, such as Boolean literals (``true``, ``false``), the null literal (``null``) or are reserved, but are not used in Java (``const``, ``goto``).