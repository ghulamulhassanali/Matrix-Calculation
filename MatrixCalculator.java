/*

Author: Ghulam Ul Hassan Ali. NUST - SEECS
CS213 Advanced Programming - Lab01
Date: 18th - February - 2015

 */

package pk.edu.nust.seecs.bscs2.advancedprogramming.lab1;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author test1
 */
public class MatrixCalculator {
    
    int firstMatrixRows;    
    int firstMatrixColumns;
    int secondMatrixRows;
    int secondMatrixColumns;
    int tempSum;
    
    
    public int[][] addMatrices(int[][] A, int[][] B){
        firstMatrixRows= A.length;
        firstMatrixColumns = A[0].length;
        secondMatrixRows = B.length;
        secondMatrixColumns = B[0].length;
        
        try {
            if (firstMatrixRows != secondMatrixRows || firstMatrixColumns != secondMatrixColumns ){
                throw new IllegalArgumentException("Matrices Addition Exception! Matrices dimensions don't match. \nBoth matrices should be of same dimension. First matrix: " + firstMatrixRows + " x " + firstMatrixColumns + "  Second matrix: "+ secondMatrixRows + " x " + secondMatrixColumns);
            }
        } catch (Exception e){
            System.exit(1);
        }      
        
        
        int[][] sum = new int[firstMatrixRows][firstMatrixColumns];
        
        for(int i=0; i<firstMatrixRows; i++){
            for(int j=0; j<firstMatrixColumns; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }            
        }
        return sum;
    }
    
    public int[][] subtractMatrices(int[][] A, int[][] B){
        firstMatrixRows= A.length;
        firstMatrixColumns = A[0].length;
        secondMatrixRows = B.length;
        secondMatrixColumns = B[0].length;        
        try {
            if (firstMatrixRows != secondMatrixRows || firstMatrixColumns != secondMatrixColumns ){
                throw new IllegalArgumentException("Matrices Subtraction Exception! Matrices dimensions don't match. \nBoth matrices should be of same dimension. First matrix: " + firstMatrixRows + " x " + firstMatrixColumns + "  Second matrix: "+ secondMatrixRows + " x " + secondMatrixColumns);
            }
        } catch (Exception e){
            System.exit(1);
        } 
        int[][] difference = new int[firstMatrixRows][firstMatrixColumns];
        
        for(int i=0; i<firstMatrixRows; i++){
            for(int j=0; j<firstMatrixColumns; j++){
                difference[i][j] = A[i][j] - B[i][j];
            }            
        }
        return difference;
    }
    
    public int[][] multiplyMatrices(int[][] A, int[][] B){
        firstMatrixRows= A.length;
        firstMatrixColumns = A[0].length;
        secondMatrixRows = B.length;
        secondMatrixColumns = B[0].length;
        tempSum=0;
        int[][] product= new int[firstMatrixRows][secondMatrixColumns];
        if (firstMatrixColumns != secondMatrixRows)
            throw new IllegalArgumentException("matrices don't match: " + firstMatrixColumns + " != " + secondMatrixRows);
        
        for(int i=0; i<firstMatrixRows; i++){
            for(int j=0; j<secondMatrixColumns; j++){
                for(int k=0; k<secondMatrixRows; k++){
                    tempSum+= A[i][k] * B[k][j];
                }
                product[i][j] = tempSum;                
                tempSum=0;
            }
        }        
        
        return product;
    }       
      
}
