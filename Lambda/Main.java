package Lambda;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Main {
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(new Person("Tien", "Nguyen"), new Person("Thuong", "Vu"), new Person("Nguyen", "An")));
        //Using anonymous class
//        var comparatorLastName = ;
//        people.sort(new Comparator<Person>(){
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.lastName().compareTo(o2.lastName());
//            }
//        });
        people.sort(((o1, o2) -> o1.lastName().compareTo(o2.lastName())));
        System.out.println(people);
        var comparatorMixed = new EnhancedComparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };
        people.sort(comparatorMixed);

        int result = calculator((a, b) -> a + b, 1,2);

        List<String> test = new ArrayList<>(List.of("TEST", "OK","safa"));
        test.forEach(item -> System.out.println(item));


        var coords = Arrays.asList(
                new double[]{100, 101},
                new double[]{102,103},
                new double[]{104,105});
        coords.forEach(t -> System.out.println(Arrays.toString(t)));

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        coords.forEach(item -> processPoint(item[0], item[1], (lat, lng) ->{
            System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);
        }));

        test.removeIf(s -> s.equalsIgnoreCase("TEST"));
        test.forEach(item -> System.out.println(item));
        test.addAll(List.of("abc", "bcd", "fast"));
        System.out.println(test);
        test.replaceAll(str -> str.toUpperCase());


        String[] arrStr = new String[10];
        Arrays.fill(arrStr, "");
        System.out.println("Arr str: " + Arrays.toString(arrStr));
        Arrays.setAll(arrStr, (index) -> " " + index);
        System.out.println(Arrays.toString(arrStr));

        String[] arrTest = new String[]{"1", "2", "3", "4", "5", "6"};
        String[] randomStr = randomlySelectedValues(10, arrTest,
                () -> new Random().nextInt(0, arrTest.length));
        System.out.println(Arrays.toString(randomStr));
    }

    interface EnhancedComparator<T> extends Comparator<T>{
        int secondLevel(T o1, T o2);
    }
    public static int deQuy(int x, int total){
        if(x == 0){
            return total;
        }else {
            return deQuy(x - 1, total * x);
        }
    }
    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer){
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for(int i = 0; i < count; i++){
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }


}
