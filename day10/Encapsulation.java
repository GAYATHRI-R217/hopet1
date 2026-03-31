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
public double getBalance(){//getters
        return balance;
}
}
public class Encapsulation {
    public static void main(String[] args){
        BankAccount b=new BankAccount();
        b.balance+=-1000;
        System.out.println(b.balance);
    }
}
