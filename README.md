## rwscript

This is an interpreted scripting language creating using the java programming language and ANTLR 3.5.
ANTLR is a framework for creating compilers, interpreters etc...  In this project it was used to create a grammar 
parser for rwscript. ANTLR must be downloaded to run this program.
You can download antlr at [http://www.antlr3.org/download.html](http://www.antlr3.org/download.html) <br> <br>
There are 4 sample programs that can be used to test the interpreter or it is possible to write your own programs using the rwscript syntax.

To compile the project use this at the command line: <br>
javac -classpath ../antlr-3.5-complete.jar *.java

To run your script written in rwscript use this at the command line: <br>
java -classpath .:../antlr-3.5-complete.jar RwscriptMain testProgram1.txt 
