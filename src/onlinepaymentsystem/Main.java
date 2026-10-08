package onlinepaymentsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        Payment payment;
        payment =new UPIPayment();
        user.setName("keshav");
        user.setAccountNumber("30344484");
        payment.pay(5000,user);
        payment =new CardPayment();
        user.setName("manish");
        user.setAccountNumber("902383847");
        payment.pay(2000,user);
        System.out.println("Platform name " +PaymentService.PLATFORM_NAME);
        System.out.println("Max limit " +TransactionRules.MAX_LIMIT);
    }
}
