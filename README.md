# bri-code-challenge

## Coding Exercise:
* Using recursion or iteration, write a program that prints the Fibonnaci sequence of numbers based on a user’s input. For example, if a user enters 100, then the expected output should be the first 100 numbers within the Fibonnaci sequence.
* Use any programming language you are comfortable with: C, C++,C#, Java (preferred), JavaScript, Python, etc.
Include any instructions needed to run the code so that it prints the Fibonnaci sequence of numbers specified by the user.
* Include the output of the run (i.e. the Fibonnaci sequence).
* Expected output is: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 etc…
* Write the appropriate unit test case(s).
* Include comments in the code to explain your logic and any appropriate documentation.

# Dependencies

To run program requires the following be installed on your local system.
* Java 8 (or higher) (https://www.oracle.com/java/technologies/jdk8-downloads.html or equivalent)
* Maven 3.3 (or higher) (https://maven.apache.org/download.cgi)

# Build and Run Program
````
cd generate-fib/
mvn install
mvn exec:java -Dexec.mainClass="com.brighterion.generate_fib.FibGenerator"
````

## Sample output

````
Please specify number of fibonacci numbers to generate (or <=0 to quit):
100
0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986,102334155,165580141,267914296,433494437,701408733,1134903170,1836311903,2971215073,4807526976,7778742049,12586269025,20365011074,32951280099,53316291173,86267571272,139583862445,225851433717,365435296162,591286729879,956722026041,1548008755920,2504730781961,4052739537881,6557470319842,10610209857723,17167680177565,27777890035288,44945570212853,72723460248141,117669030460994,190392490709135,308061521170129,498454011879264,806515533049393,1304969544928657,2111485077978050,3416454622906707,5527939700884757,8944394323791464,14472334024676221,23416728348467685,37889062373143906,61305790721611591,99194853094755497,160500643816367088,259695496911122585,420196140727489673,679891637638612258,1100087778366101931,1779979416004714189,2880067194370816120,4660046610375530309,7540113804746346429,12200160415121876738,19740274219868223167,31940434634990099905,51680708854858323072,83621143489848422977,135301852344706746049,218922995834555169026

---------------------------------------------

Please specify number of fibonacci numbers to generate (or <=0 to quit):
10
0,1,1,2,3,5,8,13,21,34

---------------------------------------------

Please specify number of fibonacci numbers to generate (or <=0 to quit):
0
bye.
````
