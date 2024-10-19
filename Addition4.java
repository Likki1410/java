import java.io.*;
import java.util.*;
class Addition4 {
    int x,y,z;
    int add(int x,int y)
    {
        z=x+y;
        return z;
    }
    public static void main(String args[]) {
        Addition4 a=new Addition4();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for addition:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=a.add(x,y);
        System.out.println("Sum of "+x+" and "+y+" is " +z);
    }
}
