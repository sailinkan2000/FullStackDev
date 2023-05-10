
import java.util.Scanner;
public class Basicjavaprogram2 {
    public static void main(String args[]){
        int num1=4, num2=5;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            num1= sc.nextInt();
            System.out.println("Enter the second number:");
            num2: sc.nextInt();
        }
        System.out.println("arithmetic operations is as follwed:");
        System.out.println("\n ----------------------------------------------");
        System.out.println("addition of the numbers is:" + (num1+num2));
        System.out.println("Subtraction of two numbers:"+(num1-num2));
    }
}
