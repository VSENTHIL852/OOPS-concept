import java.util.*;
class Student{
    int age;
    String name;
    void display(){
        System.out.println(name+" "+age);
    }
    Student(){
        System.out.println("Without create and obj for me im specializedd method");
    }
}
public class ClassProgram{
    public static void main(String[] args){
        Student st=new Student();
        st.age=21;
        st.name="SENTHILKUMAR V";
        st.display();
    }
}
