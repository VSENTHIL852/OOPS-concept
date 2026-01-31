import java.util.*;
class Mo{
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethodOverloading{
    public static void main(String[] args){
        Mo m=new Mo();
        int result1=m.add(10, 20);
        int result2=m.add(10,20,30);
        System.out.println(result1+" "+result2);
    }
}
