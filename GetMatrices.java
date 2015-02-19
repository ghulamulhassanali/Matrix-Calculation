/*
Author: Ghulam Ul Hassan Ali. NUST - SEECS
CS213 Advanced Programming - Lab01
Date: 18th - February - 2015

 */
package pk.edu.nust.seecs.bscs2.advancedprogramming.lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Home
 */
public class GetMatrices {
    
    int totalMatrices;
    BufferedReader br;
    String currentLine;
    int currentMatrixRows;
    int currentMatrixColumns;
    int matrixCounter;
    
    public GetMatrices(){
        totalMatrices=-1;
        br = null;        
        currentLine = new String();
    }
    
    public int totalMatrices(){
        //this function reads the total number of lines of the file. Returns one less than the total number of lines.                
        try{           
            br = new BufferedReader(new FileReader("E:\\NUST\\6th Semester\\Advanced Programming - AP\\Labs\\Advanced Programming Lab-1\\src\\pk\\edu\\nust\\seecs\\bscs2\\advancedprogramming\\lab1\\matrices.txt") );
            while( (currentLine = br.readLine()) != null){                
                if (currentLine.trim().length() > 0){
                    //System.out.println(totalMatrices+": "+currentLine);                    
                    totalMatrices++;
                }
            }
        }catch(IOException e){
            e.printStackTrace();           
        }finally{            
            try{
                if(br!=null)
                    br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }         
        return totalMatrices;
    }
    
    public void populateMatrices(Matrix arrayOfMatrices[]){
        //this function reads the file containing matrices and populates them in the arrayOfMatrices 
        String[] rows;
        String[] columns;
        matrixCounter=0;
        try{           
            br = new BufferedReader(new FileReader("E:\\NUST\\6th Semester\\Advanced Programming - AP\\Labs\\Advanced Programming Lab-1\\src\\pk\\edu\\nust\\seecs\\bscs2\\advancedprogramming\\lab1\\matrices.txt") );
            br.readLine();  //skipping first line that explains the format of matrices
            while( (currentLine = br.readLine()) != null){                
                if (currentLine.trim().length() > 0){                    
                    //parse the string. Get the rows and columns. Count length of rows and columns. ADD DELETE FEATURE
                    rows = currentLine.split(";");  //get rows of current matrix
                    currentMatrixRows = rows.length;
                    columns = rows[0].split("\\s");  //get each element of current row
                    currentMatrixColumns = columns.length;
                    //call the Matrix parameterized constructor to create a matrix of dimenstions currentMatrixRows x currentMatrixColumns
                    arrayOfMatrices[matrixCounter] = new Matrix(currentMatrixRows, currentMatrixColumns); 
                    
                    for(int i=0; i< rows.length; i++){
                        columns = rows[i].split("\\s");  //get each element of current row                        
                        if(columns.length != currentMatrixColumns){
                            System.out.println("INVALID MATRIX ENTERED. NUMBER OF COLUMNS IN EVERY ROW SHOULD BE EQUAL.");
                            System.exit(0);                            
                        }
                        for(int j=0; j< columns.length ; j++){   
                            arrayOfMatrices[matrixCounter].setMatrixElement(i, j, Integer.parseInt(columns[j]) );
                        }
                    }
                    //matrices.add(temp);
                    totalMatrices++;
                    //arrayOfMatrices[matrixCounter].toString();
                    matrixCounter++;
                    
                }
            }            
        }catch(IOException e){
            e.printStackTrace();           
        }finally{            
            try{
                if(br!=null)
                    br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }       
        
        
//        for(int i=0; i<totalMatrices;i++){
//            arrayOfMatrices[i] = new Matrix(2,3);
//        }
    }
    
    
}
