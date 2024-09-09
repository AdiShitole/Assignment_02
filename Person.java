package Java_Assignment_2nd;

import java.util.*;

// Task-1
public class Person {

    void display(String name, int age){

        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String name=sc.next();
        int age=sc.nextInt();

        Person obj=new Person();
        obj.display(name,age);
    }
    
}
