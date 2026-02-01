import java.util.*;
interface A{
    void sound();
}
interface B{
    void count();
}
class C implements A,B{
    public void sound(){
        System.out.println("A sound");
    }
    public void count(){
        System.out.println("B count");
    }
}
public class MultipleInheritance{
    public static void main (String[] args) {
        C obj=new C();
        obj.sound();
        obj.count();
    }
}
