import java.io.*;
abstract class Base{
    Base(){
        System.out.println("Base class constructor Invoke");
    }
    abstract void fun();
}
class Derived extends Base{
    Derived(){
        super();
        System.out.println("Derived class constructor Invoke");
    }
    void fun(){
        System.out.println("Derived fun is invoke");
    }
}
class Abstractdemo2 {
    public static void main (String[] args){
        Derived d = new Derived();
        d.fun();
    }
}
