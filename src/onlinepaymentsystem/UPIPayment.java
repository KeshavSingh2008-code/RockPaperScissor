package onlinepaymentsystem;

public class UPIPayment implements Payment {

    @Override
    public void pay(double amount, User user) {
        System.out.println("user name: "+user.getName()+"\n"+
                "Payment of :"+amount +"\n"+
                "done via upi : " +"\n"+
                "From Account number : "+user.getAccountNumber());
    }
}
