//Writing a program in Java implementing the linear search algorithm
public class Lineartest{    
    public static int lineartest(int[] arr, int key){    
            for(int i=0;i<arr.length;i++){    
                if(arr[i] == key){    
                    return i;    
                }    
            }    
            return -1;    
        }    
        public static void main(String a[]){    
            int[] a1= {20,50,30,50,60,70};    
            int key = 60;    
            System.out.println(key+" is found at index: "+lineartest(a1, key));    
        }    
    }    