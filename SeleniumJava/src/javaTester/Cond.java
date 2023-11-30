package javaTester;




import java.util.Scanner;

public class Cond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reverse = 0;
        int original = num;
        while (original != 0) {
            int digit = original % 10;
            reverse = reverse * 10 + digit;
            original /= 10;
        }
        if (reverse == num) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
