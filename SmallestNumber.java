//Write a program in Java to find the fourth smallest element in an unsorted list



public class SmallestNumber  
{  
public void sortArr(int arr[])  
{  
int size = arr.length;  
  
for(int i = 0; i < size; i++)  
{  
    int temp = i; 

    for(int j = i + 1; j < size; j++)  
    {  
    if(arr[temp] > arr[j])  
    {  
    temp = j;
}  
}  
  if(temp != i)  
{  
    int t = arr[i];  
    arr[i] = arr[temp];  

    arr[temp] = t;   
}  
}  
}  
public int findSmallestNumber(int arr[], int k)  
{  
    sortArr(arr);  
    return arr[k - 1];  
}  
public static void main(String argvs[])  
{  
SmallestNumber obj = new SmallestNumber();  
int arr[] = {90, 87, 30, 9, 12, 41};  
int size = arr.length;  
int k = 4;  
System.out.println("For the array: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(arr[i] + " ");  
}  
int ele = obj.findSmallestNumber(arr, k);  
System.out.println();  
System.out.println("The " + k + "th smallest element of the array is: " + ele);  
}  
}  