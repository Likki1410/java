import java.io.*;
class Animal{
    String color = "White";
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    String color="Black";
    void printColor(){
        System.out.println("Dog color is "+color);
        System.out.println("Animal color is "+super.color);
    }
    void eat(){
        System.out.println("Dog is eating");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
    void work(){
        super.eat();
        printColor();
        bark();
        eat();
    }
}
class Superdemo2{
    public static void main(String args[]){
        Dog d= new Dog();
        d.work();
    }
}
