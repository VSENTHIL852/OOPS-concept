import java.util.*;
class Encapsulation{
    private int balance;
   public void setbalance(int b){
        balance=b;
    }
    public int getbalance(){
        return balance;
    }
}
public class EncapsulationExample{
    public static void main(String[] args){
        Encapsulation e=new Encapsulation();
        e.setbalance(1000);
        System.out.println(e.getbalance());
        
    }
}
