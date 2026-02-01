import java.util.*;
abstract class AbstractionConcept{
    abstract void sound();
    void add(){
        System.out.println("Added point");
    }
}
class Senthil extends AbstractionConcept{
    void sound(){
        System.out.println("Abstract concpet ");
    }
}
public class AbstractClass{
    public static void main(String[] args){
        AbstractionConcept a=new Senthil();
        a.add();
        a.sound();
    }
}
