package Java_Assignment_2nd;

// Task-2
public class BankAccount {
    
    private float bankBalance=0;

    void deposite(float addBalance){

        if(addBalance>=0){
            bankBalance+=addBalance;
            System.out.println("Deposite ammount: "+addBalance);
        }else{
            System.out.println("Deposite value must be greater than 0");
        }
    }

    void withdraw(float withdraw){

        if(bankBalance>withdraw){
            bankBalance-=withdraw;
            System.out.println("Withdraw ammount: "+withdraw);
        }else{
            System.out.println("Infficient Bank Balance");
        }
    }

    void display(){

        System.out.println("Bank Balanace: "+bankBalance);
    }

    public static void main(String[] args) {
        
        BankAccount obj=new BankAccount();

        obj.deposite(1000);

        obj.withdraw(750);

        obj.display();
    }
}
