//Writing a program in Java implementing the insertion sort algorithm
public class InsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {58,43,11,9,14,3,2,22};    
        System.out.println("Pattern before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);   
           
        System.out.println("Pattern After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    