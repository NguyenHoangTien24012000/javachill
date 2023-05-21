package Nested;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(new Employee("Tien", 1000, 2), new Employee("Cam", 1001, 3), new Employee("Dao", 1002, 1)));
//        var comparator = new Employee().E
        employees.sort(new Employee.EmployeeComparator<>("year").reversed());
        for(Employee e : employees){
            System.out.println(e);
        }
        //
        List<StoreEmployee> employeeStore = new ArrayList<>(List.of(new StoreEmployee("A", 100, 2020, "a"), new StoreEmployee("B", 101, 2023, "b")));
        var compareStore = new StoreEmployee().new StoreComparator<>();
        employeeStore.sort(compareStore);
//        System.out.println(employeeStore);
        for (var ele : employeeStore){
            System.out.println(ele);
        }

        System.out.println("--------");
        addPigLatinName(employeeStore);

    }

    public static void addPigLatinName(List<? extends StoreEmployee> list){
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee>{
            private String pigLatinName;

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }

            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }
        }
        List<DecoratedEmployee> newList = new ArrayList<>(list.size());
        for (Employee employee : list){
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));

        }
        for (DecoratedEmployee decoratedEmployee : newList){
            System.out.print(decoratedEmployee.getName() + decoratedEmployee.pigLatinName);
        }
    }

}
