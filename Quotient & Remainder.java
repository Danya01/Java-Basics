import java.util.Scanner;

public class quoremi {
    public static void main (String args[]){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the diviend value:");
        int diviend = scanner.nextInt();

        System.out.println("Enter the divisor value:");
        int divisor = scanner.nextInt();

        int quotient = diviend/divisor;
        int remainder = diviend % divisor;

        System.out.println("The value of Quotient is "  +   quotient);
        System.out.println("The value of Remainder is  " + remainder);

        scanner.close();
    }
    
}
