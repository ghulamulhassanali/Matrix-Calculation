/*
Author: Ghulam Ul Hassan Ali. NUST - SEECS
CS213 Advanced Programming - Lab01
Date: 18th - February - 2015

 */
package pk.edu.nust.seecs.bscs2.advancedprogramming.lab1;

public class Matrix{
     //define attributes of this class here
     private int[][] matrix;     
    
    
    //constructors 
     public Matrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
        System.out.println(rows + " x " + columns + " sized matrix created.");
    }      
          
    public Matrix() {
    }  
    
    //Getters and Setters
    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
        
    
    public void setMatrixElement(int row, int column, int element){
        this.matrix[row][column] = element;
    }
    
    public int getMatrixElement(int row, int column){
        return this.matrix[row][column];
    }
    
    
      
      
    @Override
    public String toString() {
        System.out.print("\nMatrix{");
        for(int i =0; i<this.matrix.length;i++){
            System.out.println();
            for(int j=0; j < this.matrix[0].length;j++)
                System.out.print(this.matrix[i][j]+" ");
        }
        System.out.println("}\n");        
        return "";
    }   
}
    
     
