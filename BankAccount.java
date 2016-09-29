
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int pin;
    private double balance;
    private String acctName;
    private Address home;
    
    
    public BankAccount()
    {
        pin = 0;
        balance = 0;
        acctName = "";
        home = new Address(); //Calling the default constructor
    }

    public BankAccount(int pin, double balance, Address home, String acctName)
    {
        this.pin = pin;
        this.balance = balance;
        this.home = home;
        this.acctName = acctName;
    }

    public void printBalance()
    {
        System.out.println("Your balance is " + balance);
    }
    
    public String toString()
    {
        String str = (acctName + " and balance " + balance);
        str += "\n" + home.toString();
        
        return str;
    }
    
    public void withdraw(double val)
    {
        if (balance > val)
            balance -= val;
        else
            System.out.println("Insufficient funds!");
    }
    
    public void setAddress(String addr, String city, String state, String zip)
    {
        home.setAddress(addr, city, state, zip);
    }
    
    public String getAddress()
    {
        return home.toString();
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String getAcctName()
    {
       return acctName; 
    }
    
    public void setAcctName(String acctName)
    {
       this.acctName = acctName; 
    }
    
    public void setPin(int pin)
    {
        this.pin = pin;
    }
}
