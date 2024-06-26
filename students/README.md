# Instructions

The assignment consists of writing a math compiler using Miguel's math interpreter solution as a starting point. Note that if you solved all parts of assignment 2, you are free to use your solution as a starting point instead.

In this assignment, the interpreter should be replaced by a code generator, following the standard Xtext generator template using IFileSystemAccess2 to write a file. You must generate a single Java class that:  (i) has as public instance variables all the variable bindings of your program (i.e., the variables defined with 'var') and (ii) contains a public method 'compute' that computes the value of each mathematical expression and assigns this value to the variables. The solution should support basic arithmetic operators and external functions.

The generated class should follow a simple version of the Dependency Injection pattern to support external functions when you have external calls. When having external calls, the generated class should contain a single constructor that receives the type 'External'. Moreover, the generated class should define the interface 'External' with the definition of all the external calls. If there are no external calls, there must be no constructor in your generated class and no interface.

For the following math expression program:

```java
program MathComputation
external sqrt(int)
var x = 2 + 2
var y = sqrt(x)
```

One possible generated class that passes the tests of the assignment is:

```java
package math_expression;
public class MathComputation {

  public int x;
  public int y;

  private External external;
  
  public MathComputation(External external) {
    this.external = external
  }

  public void compute() {
    x = 2 + 2;
    y = this.external.sqrt(x);
  }

  interface External {
    public int sqrt(int n);
  }
}
```

Notice two new aspects of the example:

  - the new keyword 'program'
  - the package of the generated class.

The keyword `program` is used to give a name to the generated class.
The package `math_expression` is used for other classes to import your generated classes.
In particular, we import your classes in the provided test class.

## Testing your solution

To test your implementation, we provide a folder 'math_expression' that contains several math files and Java tests.
You should add these files to the src folder of your running Xtext eclipse application (right-click in the Xtext repository and select 'Run As > Eclipse Application').

The math files are programs you should parse and generate Java class accordingly.
The math files have the extension .math; we suggest you use the same extension for your implementation, but you can always rename every file.
The test folder contains two classes: `MathTest` and `ExternalImpl`.
The class `MathTest` contains all the tests used to test your application, and it expects a specific structure from your generated classes: the generated classes should be in the package `math_expression`.

The class `ExternalImpl` should implement three methods: `pi()` that returns 3, `sqrt(int n)` that returns the square root of `n`, and `pow(n,m)` that returns the pow operation (`n` raised to `m`).

When the classes are generated, you can add the src-gen folder to the build path by right-clicking the folder and selecting 'Build Path > Use as Source Folder'. 

## Summary

 - Generate Java code that computes the value of the expressions
 - For each class, the method `compute` should fill the values of the variables defined with `var`.
 - The variables should be defined in the class as public instance variables.
 - The generated class should be in the package `math_expression`
 - When there are external functions defined:
   - Create an interface inside the generated class
   - A new method should be generated in the interface representing the external function for each external function.
   - A constructor should be added that receives this generated interface.
 - For testing:
   - Use `math` extension for your programs
   - Implement the methods `pi()`, `sqrt(int n)` and `pow(n, m)` of the `ExternalImpl` class.
   - Add the src-gen in the build path.

## Handing-in

Hand in your response as a single PDF that includes

1. A brief description of the status of your assignment, in particular, which JUnit tests it passes
2. Your Xtext file
3. Your generator file