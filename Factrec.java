import java.io.*;
import java.util.Scanner;
class Factrec{
    int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Factrec ob=new Factrec();
        System.out.println("Enter number to find factorial:");
        int num=sc.nextInt();
        System.out.println("The factorial of "+num+" is "+ob.factorial(num));
    }
}
