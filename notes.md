## Exception Handling

* java.lang.Exception
* Any error in your application, JVM constructs an Exception class object
* Populates the object with the error information
* Gives it to your application
* If you have written code to handle it, no problems
* Else it throws it and stops the progress

##Built-in packages

* java.lang is the default package which is imported automatically
* java.util contains all collections
* java.io, java.nio
* java.net
* java.util.stream -> Java 8 Stream API
* java.xml
* java.lang.Object is the base class for all the classes


## Access specifiers

* private - members are accessible only with that class
* package friendly - __default__
* protected - package friendly + any derived class 
* public - members are accessible from anywhere



## ToDO

* Create a Person class
* From the main() method create a loop of random number of Person objects
* Finally print the count of Person object created

### static

* static members are shared members
* You can access them using className.staticMember
* static methods cannot access non-static methods directly
* static methods cannot be OVERRIDDEN

### Naming conventions

* Package names are in lowercase
* Class names begin with Uppercase
* File names also begin with Uppercase
* methods and variables begin with lowercase

* Packages are used for grouping classes
* Package is a physical grouping entity
* When you create a package you are actually creating a folder

* com.intuit.qbooks.staticExamples
* CamelCase naming convention

* Every file can have ONLY ONE public class
* Name of the PUBLIC class should match with the FILE NAME



* jdk 12.x or 13.x
* bin folder contains the executables
* javac, java, javadoc, javap
* __PATH__ tells the OS the path of the bin folder

