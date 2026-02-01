import java.util.*;
interface Animal{
    void sound();
}
class elephant implements Animal{
    public void sound(){                    // only it runs by using the public access specifier
        System.out.println("Hello");
    }
}
public class InterfaceCode{
    public static void main(String[] args){
        Animal a=new elephant();
        a.sound();
    }
}
