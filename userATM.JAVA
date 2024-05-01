import java.util.Scanner;
interface ATM{
    public void withdraw(double amount);
    public void deposit(double amount);
    public void checkbalance();
}
class ATMMachine implements ATM{
    private double balance; // instance variable to maintain the balance

    public ATMMachine(double initialBalance) {
        this.balance = initialBalance; // initialize balance
    }
    public void withdraw(double amount){
        if (amount>0 && balance>=amount){
            balance-=amount;
            System.out.println("Withdrawal succesful");
            System.out.println("The amount remaning"+amount);
        }
        else{
            System.out.println("Transaction failed");
        }
    }
        public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Transaction succesful");
            System.out.println("The new amount"+amount);
        }
        else{
            System.out.println("Transaction failed");
        }
    }
        public void checkbalance(){
            System.out.println("The total amount in the bank "+balance);
        }
        
    }
    public class userATM {
        
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the balance of account");
            double initialBalance=sc.nextDouble();
            ATMMachine atm=new ATMMachine(initialBalance);
            int choice;
            do{
                System.out.println("enter 1 for withdrawal");
                System.out.println("enter 2 for deposit");
                System.out.println("enter 3 for checking balance");
                System.out.println("enter 4 for exiting");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter the amount for withdrawal");
                        double Ramount=sc.nextDouble();
                        atm.withdraw(Ramount);
                        break;
                    case 2:
                        System.out.println("Enter the amount for deposit");
                        double Namount=sc.nextDouble();
                        atm.deposit(Namount);
                        break;
                    case 3:
                        atm.checkbalance();
                        break;
                    case 4:
                        System.out.println("Exiting bank,goodbye");
                        break;
                    default:
                        System.out.println("Invalid number");
                        break;
                }
                
            }
            while (choice!=4);
        }
    }

