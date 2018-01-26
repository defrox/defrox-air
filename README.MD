Airplane seat arrangement manager
=================================

How to run the application
--------------------------
To run the application, simply execute `java -jar solution.jar /path/to/input/data.txt`  (or, if run in IDE, execute `com.defrox.air.seats.ConsoleApplication` class with argument `/path/to/input/data.txt`).
For instance:
```
java -jar ./target/defrox-air-seats-manager-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/testCases/example.txt
```

Proposed solution
-----------------
The main condition to customer satisfaction is that the group is not divided into different rows. Secondly, the satisfaction for any given customer is binary (customer is seated with its group and (optionally) has a window seat). Therefore the app creates new groups by combining existing ones to achieve the maximum potential satisfaction factor in any given group, and then assign those groups to rows in order (sorted by satisfaction of entire row, descending order). As a last step it fills the remaining gaps with other passengers.

Original task
-------------
You run an Airline that has several planes that fly to different destinations around the world. You pride yourself on having a high customer satisfaction with those that fly with you. This you achieve by ensuring that:
 * Groups of travellers are seated together on the same row.
 * Providing travellers with a window seat if request.

To determine the best sitting arrangements on the flight create a program that takes an input file as a command line argument and prints the results to standard out. An example input file is:

```
4 4
1W 2 3
4 5 6 7
8
9 10 11W
12W
13 14
15 16
```

The first line specifies the dimensions of the plane. The first digit is the number of seats in a row and the second digit is the number of rows on the plane.

Each subsequent line describes a group of travellers. For example, the first line of travelers describes a group of three where the first traveller has a preference for a window seat. Each number uniquely identifies the traveller on the flight.
The output for the above file should be:

```
1 2 3 8
4 5 6 7
11 9 10 12
13 14 15 16
100%
```

The program should aim to maximize customer satisfaction. The last line in the above output indicates the percentage of customers that have had their preferences satisfied. If the plane is over subscribed the program should aim to maximize customer satisfaction of those customers waiting for the flight.
When you are submitting your program please provide a brief description of the approach in a README.txt file and zipped folder that includes a buildable project with the source code and appropriate tests.
