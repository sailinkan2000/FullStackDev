//Writing a program in Java implementing the quick sort algorithm
public class QuickSort  
{  
int partition (int a[], int start, int end)  
{  
    int pivot = a[end]; // pivot element  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
         
        if (a[j] < pivot)  
        {  
            i++;  
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
  
 
void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */  
{  
    if (start < end)  
    {  
        int p = partition(a, start, end); 
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
  
  
void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) {  
    int a[] = { 25, 27, 2, 13, 18, 19};  
    int n = a.length;  
    System.out.println("\nBefore sorting array elements are - ");  
    QuickSort q1 = new QuickSort();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    q1.printArr(a, n);  
    System.out.println();  
    }  
} 