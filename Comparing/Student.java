package Comparing;

import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student>{
    private static int LAST_INT = 1000;
    private static Random random = new Random();
    private String name;

    private int id;

    public Student(String name) {
        this.name = name;
        id = LAST_INT++;
        gpa = random.nextDouble(1.0, 4.0);
    }
    protected double gpa;

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }


//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student o) {
        Student other = (Student) o;
        return Integer.valueOf(id).compareTo(Integer.valueOf(other.id));
    }
}
class StudentGPAComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}