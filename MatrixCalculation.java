//Write a program in Java to multiply two matrices

public class MatrixCalculation{  
    public static void main(String args[]){  
    int a[][]={{2,2,2},{1,1,1},{3,3,3}};    
    int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
    int c[][]=new int[3][3];   
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    c[i][j]=0;      
    for(int k=0;k<3;k++)      
    {      
    c[i][j]+=a[i][k]*b[k][j];      
    }
    System.out.print(c[i][j]+" ");   
    }  
    System.out.println();  
    }    
    }}  