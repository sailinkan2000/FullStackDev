//Write a program in Java to find the sum of n number of elements in the range of L and R where 0 <= L <= R <= n-1


public class Range{
    static int sumNatural(int n)
    {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }
    
    static int suminRange(int l, int r)
    {
        return sumNatural(r) - sumNatural(l - 1);
    }
    
    public static void main(String[] args)
    {
        int l = 3, r = 7;
        System.out.println("Sum of Natural numbers from L to R is "+suminRange(l, r));
    
    }
    }
    
