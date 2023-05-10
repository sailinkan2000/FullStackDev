import java.util.*;

class Bill
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int total_pizza = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int total_puffs = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int total_cooldrinks = sc.nextInt();
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + total_pizza);
        System.out.println("No of puffs:"+ total_puffs);
        System.out.println("No of cooldrinks:" + total_cooldrinks);
        
        int total_price = (total_pizza*100)+(total_puffs*20)+(total_cooldrinks*10);
        
        System.out.println("Total Price:"+total_price);
        
        System.out.println("Enjoy the Show!!!");
        
    }
}