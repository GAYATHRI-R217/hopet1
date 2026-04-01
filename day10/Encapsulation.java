package day10;
//Biniding data and method that use the data in the class
//controlling the access of the data
//declaring private data members data+method
//1.declaring private data members
//2.public methods called getters and setters
class BankAccount{
public double balance;
public void setBalance(double balance){//Setters
    if(balance>0){
        this.balance=balance;
}
else{
    System.out.println("Invalid balance");
}
}
public void withdraw(int amount){
    if(amount>0&&amount<=balance){
        balance-=amount;
        System.out.println("Amount withdrawn: "+amount);
    }
    else{
        System.out.println("Invalid amount");
    }
}
public double getBalance(){//getters
        return balance;
}
public void deposite(int amount){
    if(amount>0){
        balance+=amount;
        System.out.println("Amount credited:"+amount);
    }
    else{
        System.out.println("Entered Invalid number");
    }
}
}
public class Encapsulation {
    public static void main(String[] args){
        BankAccount b=new BankAccount();
        //b.balance+=-1000;
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.setBalance(500);
        System.out.println(b.getBalance());
        b.deposite(9000);
        System.out.println(b.getBalance());
    }
}
