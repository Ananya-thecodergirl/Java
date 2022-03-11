import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        double num1 , num2, cal=0;
        char oper;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter an operator (+ , - , * ,/ )");
        oper = sc.next().charAt(0);
        Switch(oper) {
            case '+':
                cal = num1 + num2;
                break;
            case '-':
                cal = num1 - num2;
                break;
            case '*':
                cal = num1*num2;
                break;
            case '/':
                cal = num1/num2;11
                break;
            default:
                System.out.println("Enter correct inputs");
                break;

        }
        System.out.println("Result : ");
        System.out.println();
        System.out.println(num1 + " " + oper + " " + num2 + " = " + cal);

    }
