import java.util.*;
class Animal{
    void display(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void show(){
        System.out.println("Dog");
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        Dog d= new Dog();
        d.show();
        d.display();
    }
}
