// Package of Java
import java.util.*;

// ATM Interface class
abstract class ATM_Interface
{
    // Declare input
    String user_account_name;
    long user_account_number, user_card_number;
    int user_pin,choose;
    double amount,withdraw,deposit;
    boolean exit=true;

    // Initialization of input 
    ATM_Interface()
    {
        user_account_name="JayaSurya Jawaharlal Nehru";
        user_account_number=10026543;
        amount = 0;
    }

    // User to withdraw operations
    public void withdraw_Amount(double withdraw) 
    {   
        
            if(withdraw<=amount)
            {
                amount-=withdraw;
                System.out.println("\n Successful debited amount in your account...");
                System.out.println("Balance amount : " + amount);    
            }
            else
            {
                System.out.println("\n Your account balance is insufficient...");
                System.out.println("Balance amount : " + amount);
            }
        
        
    }

    // User to deposit operations
    public void deposit_Amount(double deposit)
    {
        if(amount>=1000000000 || deposit>=1000000000)
        {
            System.out.println("\n Your account Overflow of amount");
            System.out.println("Balance amount : " + amount);
        }
        else
        {
            amount+=deposit;
           System.out.println("\n Successfully credited amount in your account..." );
           System.out.println("Balance amount : " + amount);
        }
    }

    // User to check balance operations
    public void balance_Amount()
    {
        System.out.println("Balance amount: " + amount);
    }

    // User to check Account Details operations
    public void display_Account_Details() 
    {
        System.out.println("User_Account_Name: " + user_account_name);
        System.out.println("User_Account_Number: " + user_account_number);
    }
}

// user bank class 
class User_Bank_Account extends ATM_Interface
{
    Scanner scan=new Scanner(System.in);

    //to User bank Details
    public void set_User_Details()
    {
        System.out.print("\n Enter the ATM Card Number  :   ");
        user_card_number=scan.nextLong();

        System.out.print("\n Enter the ATM Card PIN     :   ");
        user_pin=scan.nextInt();
    }

    // To get Transaction options
    public void get_Bank_Operation()
    {
        System.out.print("\n Please Select Your Transation  :   ");
        choose=scan.nextInt();
    }

    // Switch operation
    public void switch_Operation()
    {
            switch(choose)
            {
                        case 1:
                            withdraw_Amt();
                            withdraw_Amount(withdraw);
                            break;
                        case 2:
                            deposit_Amt();
                            deposit_Amount(deposit);
                            break;
                        case 3:
                            balance_Amount();
                            break;
                        case 4:
                            display_Account_Details();
                            break;
                        case 5:
                            exit=false;
                            break;
                        default:
                            System.out.println("Your Enter the Transaction operation is wrong, please try again.");
            } 
    }

    // To get Transaction options for withdraw amounts
    public void withdraw_Amt()
    {   
        System.out.print("\n Enter your Withdraw amount : ");
        withdraw=scan.nextDouble();
    }

    // To get transaction options for deposit  amount
    public void deposit_Amt()
    {
        System.out.print("\n Enter your Withdraw amount : ");
        deposit=scan.nextDouble();
    }

}

// Main class
class Main
{
    // Main Method 
    public static void main(String[] args)
    {
        // User Access the Account and other Operation
        User_Bank_Account bank = new User_Bank_Account();
        System.out.println("\n\t\t ***** Welcome to XYZ ATM ***** \n");
        bank.set_User_Details();

        for(;;) 
        {

            System.out.println("\n\t\t ***** Select Transation ***** \n");
            System.out.println("\n\t 1. To Withdraw the Amount .");
            System.out.println("\n\t 2. To Deposit the Amount .");
            System.out.println("\n\t 3. To Check the Balance Amount .");
            System.out.println("\n\t 4. To Display the Details .\n");
            System.out.println("\n\t 4. To Exit .\n");
            bank.get_Bank_Operation();

            bank.switch_Operation();

            // exit the transaction operation
            if(bank.exit==false) 
            {
                break;
            }
        } 
        
    }
}