import java.io.*;
import java.util.*;
class MatrixDemo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size and column size of the matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter "+(r*c)+" elements into 1st matrix:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the matrix are:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}       
