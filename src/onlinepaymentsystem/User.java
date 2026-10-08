package onlinepaymentsystem;
//this is encapuslation
//isma hum class koprivate rakhta ha
//or constructor ki help sa usko public karta ha

public class User {
    private String name;
    private String accountNumber;
    User(){

    }

    public User(String name ,String accountNumber){
        this.name =name;
        this.accountNumber=accountNumber;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
