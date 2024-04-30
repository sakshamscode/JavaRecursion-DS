package Recursion;

import java.util.Scanner;

public class findingFactorialOfNumber {

    public static long factorialFinding(long n) {
        long result=0;
        if (n == 0 || n == 1)                          //Base Case Condition
        {
            return 1;
        } else {
            result = n * factorialFinding(n - 1);    //Recursive function call
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n= sc.nextInt();

        long result=factorialFinding(n);
        System.out.println("Factorial of given number is "+result);
    }
}
