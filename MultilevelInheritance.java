import java.util.*;
class Animal{
    void display(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("Barkiong");
    }
}
class babydog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}
public class MultilevelInheritance{
    public static void main(String[] args){
        babydog b= new babydog();
        b.display();
        b.barks();
        b.weep();
    }
}
