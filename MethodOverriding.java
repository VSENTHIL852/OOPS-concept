import java.util.*;
class Mor{
    void display(){
       System.out.println("Hello"); 
    }
}
class Animal extends Mor{
    void display(){
        System.out.println("world");
    }
    
}
public class MethodOverriding{
    public static void main(String[] args){
       Mor m=new Animal();
        m.display();
    }
}
