Guide for developers working on this codebase on how to run tests, and build an executable.


Prerequisites
-------------
- install the latest version of the Kotlin compiler (currently `1.9.21`) either manually from [Github Releases](https://github.com/JetBrains/kotlin/releases/tag/v1.9.21) or on the command line. On MacOS you can install the compiler via [HomeBrew](https://brew.sh/):
`brew update;
brew install kotlin`
- JUNIT5 ? - added to dependencies in gradle file


Run tests
---------
- (from the command line)


Build
-----
Get an executable (or .jar in this case)
- Navigate to the kotlin sub folder: `cd src/main/kotlin`
- Compile the application: `kotlinc *.kt -include-runtime -d unscramble.jar` 



How to run the program
----------------------
- Navigate to the kotlin sub folder: `cd src/main/kotlin`
- Run `java -jar unscramble.jar`

How to pass arguments to the program
------------------------------------




Assumptions
-----------
Create a section in the README called Usage Notes. List any assumptions you've made about the functionality or known limitations of the program. e.g. "Does not currently handle bad input to the command line args"
