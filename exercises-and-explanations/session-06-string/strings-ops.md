# Useful String / Array methods

1. __str.length()__ -> number of characters  
"Hello".length() -> 5  

2. __str.isEmpty()__ -> true for null, ""  
String str = null;  
str.isEmpty() -> true  
"".isEmpty() -> true  

3. __str.isBlank()__ -> true for null, "" and "   "  
String str = null;  
str.isBlank() -> true  
"".isBlank() -> true  
" ".isBlank() -> true  

4. __str.toCharArray()__ -> break down string into character array  
"Hello".length() -> [ 'W', 'o', 'r', 'l', 'd' ]  

5. __java.util.Arrays.sort( arr )__ -> sort the array in-place  
[ 'W', 'o', 'r', 'l', 'd' ].sort() : [ 'W', 'd', 'l', 'o', 'r' ]  

6. __str.split( delimiterStr )__ -> breaks string into an array of strings. the items are the pieces broken by the delimiter.  
"Hello world how do you do?".split( " " ) -> [ "Hello", "world", "how", "do", "you", "do?" ]  
"Hello".split( "" ) -> [ "H", "e", "l", "l", "o" ]  

7. __str.toUpperCase() / str.toLowerCase()__ -> new string with letters all in upper case / lower case   
"Hello".toUpperCase() -> "HELLO"  
"Hello".toLowerCase() -> "hello"  