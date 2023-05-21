package Boxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500) );
        transactions.add(initialDeposit);
    }
}

class Bank{
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);
    public Bank(String name){
        this.name = name;
    }

    public Customer getCustomer(String customerName){
        for(Customer item: customers){
            if(item.name().equalsIgnoreCase(customerName)){
                return  item;
            }
        }
        System.out.println("Not found customer name: " + customerName);
        return null;
    }
    public void addCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName) == null){
            Customer newCustomer = new Customer(customerName, initialDeposit);
            customers.add(newCustomer);
            System.out.println("New customer add: " + customerName);
        }else {
            System.out.println("Customer exits!");
        }

    }
    public void addTraction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if(customer != null){
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }
        System.out.println("Customer name: " + customer.name());
        System.out.println("-".repeat(50));
        System.out.println("Transaction: ");
        for (double d: customer.transactions()){

        }
    }
}

public class Challenge {
    public static void main(String[] args) {



    }


}
