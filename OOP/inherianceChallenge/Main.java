package OOP.inherianceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("tim", "24/01/2000", "01/4/2022");
        System.out.println(tim);
        System.out.println("Age = " + tim.getYear());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee john = new SalariedEmployee("john", "24/01/1999", "01/02/2019", 35000);
        System.out.println(john);
        System.out.println("Age = " + john.getYear());
        System.out.println("John Pay = " + john.collectPay());
        john.retire();
        System.out.println("John Pay = " + john.collectPay());


    }
}
