public class bankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public bankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void despoiteMoney(double money){
        
        if (money<=0) {
            System.out.println("Invalid Despoite Money");
            
        }else{
            balance +=money;
        }
    }

    public double withdrawMoney(double money){
        
        
        if (balance>=money) {
            balance -=money;
            
        }else if (money<=0) {
            System.out.println("Invalid Withdraw");
        }else{
            money=balance;
            balance=0;
        }
        return money;
    }
    public static void main(String[] args) {
        bankAccount account = new bankAccount("001", "Rahul");
        account.despoiteMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.despoiteMoney(4000);
        System.out.println(account.withdrawMoney(4000));
        account.withdrawMoney(8020);
       
    }
}
