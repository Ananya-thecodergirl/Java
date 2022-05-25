import java.util.Scanner;
public class mainn {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer: ");
        int f1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int f2 = input.nextInt();
        int sum = f1+f2;
        System.out.println(sum);
    }
}
