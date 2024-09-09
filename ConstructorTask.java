package Java_Assignment_2nd;

// Task-3
public class ConstructorTask {

    void ConstructorTask(){
        System.out.println("In Constructor");
    }

    int result=0;
    void sum(int x, int y){

        result=x+y;
        System.out.println("Sum of two numbers: "+result);
    }

    void sum(int x, int y, int z){
        result=x+y+z;
        System.out.println("Sum of three numbers: "+result);
    }
    
    public static void main(String[] args) {
        
        ConstructorTask obj=new ConstructorTask();

        obj.sum(12,10);
        obj.sum(3,5,8);
    }
}
