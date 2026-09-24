
import java.util.Date;

public class Account{

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    //LocalDate myObj = LocalDate.now();

    public Account(){
        this.id = 01234;
        this.balance = 15000;
        this.annualInterestRate = 5;
        //this.dateCreated.now
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id, double balance){
        this.id = id;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getannualInterestRate(){
        return this.annualInterestRate;
    }

    public void setannualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //public Date getdateCreated(){
    //    return 0;
    //}

    public double getMonthlyInterestRate(double annualInterestRate){
            return annualInterestRate / 12;
        }

    public double withdraw(double balance, double amount){
        return balance -= amount;
    }

    public double deposit(double balance, double amount){
        return balance += amount;
    }



}