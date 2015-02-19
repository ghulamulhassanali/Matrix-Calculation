/*
Author: Ghulam Ul Hassan Ali. NUST - SEECS
CS213 Advanced Programming - Lab01
Date: 18th - February - 2015
 */

package pk.edu.nust.seecs.bscs2.advancedprogramming.lab1;

/**
 *
 * @author Home
 */
public class UnitTests {
    
    public static void printResult(int[][] matrix){
        System.out.print("\nMatrix{");
        for(int i =0; i< matrix.length; i++){
            System.out.println();
            for(int j=0; j< matrix[0].length; j++)
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println("}\n\n");         
    }
    
    
    public static void main(String[] args) {
        int totalMatrices;
        //Get total number of matrices that are placed in the Matrices file        
        GetMatrices readMatrices = new GetMatrices();
        totalMatrices = readMatrices.totalMatrices();
        System.out.println("Number of Matrices present in file: " + totalMatrices);
        
        //Create Matrix instances array, equal to total matrices
        Matrix arrayOfMatrices[] = new Matrix[totalMatrices]; //function will return the matrices 
        
        //Populate those Matrices i.e. read from the file and save all the matrices in Matrices array
        readMatrices.populateMatrices(arrayOfMatrices);
        
        //check the matrices read from the file  
        System.out.println("Listing all matrices read from file.");
        for(int i=0; i<totalMatrices; i++){
                arrayOfMatrices[i].toString();
        }
       
        
        //Perform basic operations that include
        MatrixCalculator calculator = new MatrixCalculator();
        int [][] tempResult;
        
        //1. Multiply two matrices
        tempResult = calculator.multiplyMatrices(arrayOfMatrices[0].getMatrix(), arrayOfMatrices[1].getMatrix());
        System.out.print("Unit Test 1 Result:");
        printResult(tempResult);
        
        //2. Add 3 matrices
        tempResult = calculator.addMatrices(arrayOfMatrices[0].getMatrix(), arrayOfMatrices[1].getMatrix());
        tempResult = calculator.addMatrices(tempResult, arrayOfMatrices[1].getMatrix());
        System.out.print("Unit Test 2 Result:");
        printResult(tempResult);
        
        //3. Multiply 2 matrices and then add a 3rd one to the result
        tempResult = calculator.multiplyMatrices(arrayOfMatrices[0].getMatrix(), arrayOfMatrices[1].getMatrix());
        tempResult = calculator.addMatrices(tempResult, arrayOfMatrices[1].getMatrix());
        System.out.print("Unit Test 3 Result:");
        printResult(tempResult);
        
        //ADD MORE TESTS HERE FOR TESTING THE PROGRAM.
        
    }   
    
}
