import java.util.*;
class FuelConsumption{
    public static void main (String[] args) {
        double fuel, distance;
        double miles, gallons, lpk, mpg;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank ");
        fuel=Sc.nextInt();
        if(fuel<=0)
        {
            System.out.println((int)fuel+" is an Invalid Input");
            return;
        }
        System.out.println("\nEnter the distance covered ");
        distance=Sc.nextInt();
        
        if(distance<=0)
        {
            System.out.println((int)distance+" is an Invalid Input");
            return;
        }
        else
        {
            lpk=(fuel/distance)*100;
            miles=(distance*0.6214);
            gallons=(fuel*0.2642);
            mpg=miles/gallons;
            String lpk1=String.format("%.2f",lpk);
            String mpg1=String.format("%.2f",mpg);
            System.out.println("\nLiters/100KM\n"+lpk1);
            System.out.println("\nMiles/gallons\n"+mpg1);
        }
    }
} 
      