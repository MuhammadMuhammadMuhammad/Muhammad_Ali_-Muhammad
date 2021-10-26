
package account;

import java.util.Date;

public class Account
{
    private int id;
    private double balance,annualEnterestRate;
    private java.util.Date dateCreated;

    public Account() 
    {
        dateCreated=new java.util.Date();
    }

    public Account(int id, double balance,double annualEnterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualEnterestRate=annualEnterestRate;
          dateCreated=new java.util.Date();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public double getAnnualEnterestRate()
    {
        return annualEnterestRate;
    }

    public void setAnnualEnterestRate(double annualEnterestRate)
    {
        this.annualEnterestRate = annualEnterestRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }
    
    
   public double getMonthlyInseretRate()
   {
       return annualEnterestRate/12;
   }
   
   public void withdraw(double d)
   {
       balance-=d;
   }
   
   public void deposit(double d)
   {
       balance+=d;
   }
    public static void main(String[] args) 
    {
       Account a=new Account(112, 20000,4.5);
       a.withdraw(2500);
       a.deposit(3000);
       System.out.println("The plance is "+a.getBalance());
       System.out.println("The monthly insert rate is "+a.getMonthlyInseretRate());
        System.out.println("The date is "+a.getDateCreated());
        
    }
    
}
