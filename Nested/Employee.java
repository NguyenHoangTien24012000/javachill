package Nested;

import java.util.Comparator;

public class Employee {
    private String name;
    private int employeeId;
    public Employee() {
    }
    public Employee(String name, int employeeId, int yearStarted) {
        this.name = name;
        this.employeeId = employeeId;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    private int yearStarted;

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
    // muc dich khong muon public thang yearStarted
    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
        private String sortType;
        public EmployeeComparator() {
            this("id");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            switch (sortType){
                case "name" -> {
                    return o1.name.compareTo(o2.name);
                }
                case "year" -> {
                    return o1.yearStarted - o2.yearStarted;
                }
                default -> {
                    return o1.employeeId - o2.employeeId;
                }
            }
        }
    }

}
