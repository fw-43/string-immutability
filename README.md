# String Immutability

## Description
This is just to showcase String immutability in Java.

1. You can run this simple Java app from terminal using the usual:
```
javac StringImmutability.java
java StringImmutability
```

2. Then open another terminal and run:
```
ps -ef | grep 'java StringImmutability'
```

3. Then from the output, find a line like below:
```
USER         10823    6590  0 11:56 pts/2    00:00:00 java StringImmutability
```
use the number "10823" as the process id (PID), and run the command below:
```
jmap -histo 10823 | grep java.lang.String
```
the output would be like below:
```
   3:          9575         229800  java.lang.String (java.base@21.0.11)
  15:           165          12072  [Ljava.lang.String; (java.base@21.0.11)
  40:           115           2760  java.lang.StringBuilder (java.base@21.0.11)
 170:             1            120  [[Ljava.lang.String; (java.base@21.0.11)
 381:             1             16  java.lang.String$CaseInsensitiveComparator (java.base@21.0.11)
```
The 9575 (java.lang.String) is the number of instances of java.lang.String class.
