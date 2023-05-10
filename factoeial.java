import java.util.Scanner;

public class factoeial {
    public static void main(String args[]){
        //factorial number//
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a=sc.nextInt();

        int facto_var=1;


        for(int i=1;i<=a; i++){
            facto_var=facto_var*i;

        }
        System.out.println("Fctorial of the given number "+a+" is: " +facto_var);

    }

}
