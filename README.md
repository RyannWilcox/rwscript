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


#### rwscript basic syntax
Variables:
```
  $aVariable;   
  $aVariable = 5;
```
Built in stack data structure:
```
  Stack st;
  
  //puts value on top of the stack
  st.push(45);
  
  //removes a value from the top of the stack
  st.pop();
  
  st.printStack();
  st.stackSort();
```
Function declarations:
```
  //without parameters
  #aSampleFunction(){
   //code goes here
  }
  
  //can have parameters
  #anotherSample(var1,var2){
    //do something..
  }
  
  //can return values from functions
  #finalSample(var1,var2){
   $x = var1;
   $y = var2;
   
   return x + y;
  }
```
If statements and loops:
```
  if(<expression>){
    //compute
  }
  else{
 
  } //optional else

  while(<expression>){
    //do something..
  }

  do{
    //do something..
  }while(<expression>);
```

File Manipulation:
```
  // creates a text file 
  CreateFile();
  
  // allows you to write to a file
  WriteToFile();
  
  // prints a file to the console
  ViewFile();
```

Built in functions:
```
  //creates a frame and draws the square to the dimensions given
  drawSqaure(int1,int2,int3,int4);
  
  //creates a frame and draws the circle to the dimensions givem
  drawCircle(int1,int2,int3,int4);
  
  //returns the greatest out of three values
  $x = GREATEST(val1,val2,val3);
  
  //returns the least of three values
  $x = LEAST(val1,val2,val3);
  
  //returns the length of the string
  $x = LEN("a bunch of characters!");
```


