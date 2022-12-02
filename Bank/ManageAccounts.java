public class ManageAccounts
{
public static void main(String[] args)
{
Account acct1, acct2;
//create account1 for Sally with $100
    acct1 = new Account(1000, "Sally", 1111);
//create account2 for Joe with $500
    acct2 = new Account(500, "Joe", 1112);

//deposit $100 to Joe's account
    acct2.deposit(100);
//print Joe's new balance (use getBalance())
    System.out.println("Joe's Balance : "+acct2.getBalance());
//withdraw $50 from Sally's account
    acct1.withdraw(50);
//print Sally's new balance (use getBalance())
    System.out.println("Sally's Balance : "+acct1.getBalance());
//charge fees to both accounts
    System.out.println("Sally's New Balance : "+acct1.chargeFee());
    System.out.println("Joe's New Balance : "+acct2.chargeFee());

//change the name on Joe's account to Joseph
    acct2.changeName("Joseph");
//print summary for both accounts
    acct1.printSummary();

    acct2.printSummary();
}
}