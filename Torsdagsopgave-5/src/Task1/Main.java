package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mariam", "Elmir", "Mariam04"));
        customers.add(new Customer("Maja", "Wasilewska", "Maja01"));
        customers.add(new Customer("Khattab", "Elmir", "khat03"));

        printCustomers(customers);

    }
    static void printCustomers(ArrayList<Customer> customers) {
        for(Customer c : customers){
            System.out.println(c);
        }
    }
}
