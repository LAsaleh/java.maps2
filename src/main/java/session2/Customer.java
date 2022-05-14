package session2;

public class Customer {
    private String ssn;
    private String fullName;
    private String address;
    private double balance;


    public Customer(String ssn, String fullName, String address, double balance) {
        this.ssn = ssn;
        this.fullName = fullName;
        this.address = address;
        this.balance = balance;
    }
    public Customer(){

    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ssn='" + ssn + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                '}';
    }
}
