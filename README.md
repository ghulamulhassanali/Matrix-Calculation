# Matrix-Calculation

This project is a Matrix Calculator. It takes in input multiple matrices and performs basic operations on them, like 
matrix addition, subtraction and division.

Author: Ghulam Ul Hassan Ali. NUST - SEECS
Date: 18th - February - 2015

This program is free to use, redistribute with or without modifications even commercially. I won't be liable of any Harm done 
due to this program and the user is responsible for whatever the usage consequences are.

Instructions to use:

matrices.txt file:
change the path in GetMatrices.java at line 32 to the current path the file is placed at
matrices.txt contains the matrices. This file has the following format and this format should be followed if modifying this file.
First line of this file is ignored while reading. 
Every line following the first line contains a matrix. And each line must contain a single matrix only.
The format of writing the matrix is similar to the matrix representation in Matlab. To create a matrix that has multiple rows,
separate the rows with semicolons and elements with spaces.
Representation is as following:
3x3 Matrix : 1 2 3; 4 5 6; 7 8 10
3x1 Matrix : 2; 5; 8
1x3 Matrix: 5 3 7

Detailed documentation:

There are 4 classes. The details of classes are described as below:
Matrix.java: This class is a blueprint of a simple Matrix. It's instances are being used for performing basic functionality on matrices.
MatrixCalculator.java: This class contains implementation of operations ( + - / ). UnitTests.java class uses it's core functions 
    to perform operations on matrices.
UnitTests.java: This class contains the unit tests pre-defined. It ensures that the functional requirements of this project is met
    in all it's versions.
GetMatrices.java: This class reads the matrices from a file and load them into memory. Instance of this class is used in UnitTesting.java.

