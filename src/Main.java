/*
Question : Java program to print the first n square number.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a ,square, sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit to find the n square number :");
        a = sc.nextInt();
        System.out.println("Printing the final result :");
        for (int i = 1; i <= a; i++){
            square = sum * sum;
            System.out.print(square + " ");
            sum++;
        }
    }
}