import java.util.Scanner;

public class Reverse {
    public static void main (String[] args) {


        Reverse rs= new Reverse();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        sc.close();
        String reversed = reversestr(str);


    }
    static String reversestr(String s){

        if(s.isEmpty())
            return s;
        return reversestr(s.substring(1))+s.charAt(0);   //using recursion
        
    }
}
