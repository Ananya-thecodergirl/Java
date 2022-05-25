//Sum of two numbers
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
------------------------------------------------------------------------------------------------------
//Divide two numbers
import java.util.Scanner;
public class mainn {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer: ");
        int f1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int f2 = input.nextInt();
        int ans = f1/f2;
        System.out.println(ans);
    }
}
-------------------------------------------------------------------------------------------------------
//Multiplication of two numbers
import java.util.Scanner;
public class mainn {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer: ");
        int f1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int f2 = input.nextInt();
        int ans = f1*f2;
        System.out.println(ans);

    }
}
-----------------------------------------------------------------------------------------------------------
//Printing all arithmetic operations together
import java.util.Scanner;
public class mainn {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer: ");
        int f1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int f2 = input.nextInt();
        int ans1 = f1+f2;
        int ans2 = f1*f2;
        int ans3 = f1-f2;
        int ans4 = f1/f2;
        int ans5 = f1%f2;
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);

    }
}
