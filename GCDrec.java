import java.util.Scanner;

class GCDrec {

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers to find GCD:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

    // Method to calculate GCD using recursion
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
