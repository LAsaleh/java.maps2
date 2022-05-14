package session2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerManagement {
    public static void main(String[] args) {


//      ssn     Customer
        Map<String, Customer> customers = new HashMap<>();

        Customer customer1 = new Customer("1234567", "Romeo Kitten", "123 main street", 1236.98);
        Customer customer2 = new Customer("1234568", "Kevin lee", "124 main street", 1236566.98);
        Customer customer3 = new Customer("1234569", "Harry Peterson", "125 main street", 123376.98);
        Customer customer4 = new Customer("1234560", "George White", "126 main street", 129536.98);
        Customer customer5 = new Customer("1234561", "Jonny Deep", "127 main street", 123336.98);

        customers.put( customer1.getSsn(), customer1);
        customers.put( customer2.getSsn(), customer2);
        customers.put( customer3.getSsn(), customer3);
        customers.put( customer4.getSsn(), customer4);
        customers.put( customer5.getSsn(), customer5);

        System.out.println(customers + " ");


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("PLEASE ENTER YOUR SSN");
//        String ssn = scanner.nextLine();
//
//        System.out.println("P ENTER YOUR FULL NAME");
//        String fullName = scanner.nextLine();
//
//        System.out.println("ENTER YOUR ADDRESS ");
//        String address = scanner.nextLine();
//
//        System.out.println("ENTER YOUR BALANCE");
//        double balance = scanner.nextDouble();
//
//        Customer customer = new Customer(ssn , fullName, address, balance);
//
//        customers.put(customer.getSsn(), customer);


    }
}
