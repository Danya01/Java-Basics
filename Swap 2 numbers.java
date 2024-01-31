import java.util.Scanner;

public class swap {
    public static void main (String args[]){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter value of a nos : ");
            int a = scanner.nextInt();

            System.out.println("Enter the value of b nos : ");
            int b = scanner.nextInt();
            
            int temp;
            temp= a;
            a=b;
            b=temp;

            System.out.println("---After Swapping---");
            System.out.println("Value of a is " + a);
            System.out.println("Value of b is " + b);

            scanner.close();
    }

}