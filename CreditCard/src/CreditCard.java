/**
 * @author: Sarbajit Ghosh
 */

public class CreditCard {
    String customer, bank, acnt;
    int limit; double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
        this.customer = cust;
        this.bank = bk;
        this.acnt = acnt;
        this.limit = lim;
        this.balance = initialBal;
    }

    public String getCustomer(){ return this.customer;}

    public String getBank(){ return this.bank;}

    public boolean charge (double price){
        if (price + this.balance > this.limit)
            return false;
        
        this.balance += price;
        return true;
    }

    public void makePayment(double amount){
        this.balance -= amount;
    }

    public String toString(){
        String welcome = "This is your credit card information";
        String bank = "Bank: " + this.bank;
        String acnt = "Account: " + this.acnt;
        String limit = "Allowed Limit: " + this.limit;
        String balance = "Balance: " + this.balance;

        String out = welcome + '\n' + bank + '\n' + acnt + '\n' + limit + '\n' + balance;
        return out;
    }

}
