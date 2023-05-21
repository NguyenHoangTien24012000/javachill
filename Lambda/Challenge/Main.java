package Lambda.Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        int result = calculator((a,b)-> a + b, 3, 1);
        System.out.println("Value " + result);
        List<String> newList = new ArrayList<>(List.of("1","2"));
        newList.forEach(e -> System.out.println(e));

        var newList1 = Arrays.asList(
                new double[]{100.0, 101.0},
                new double[]{102.0, 103.0},
                new double[]{103.0, 104.0}
        );

        //newList1.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> test = (e1, e2) ->{
            System.out.printf("Toa do: [%f, %f]%n", e1, e2);
        };

        newList1.forEach(e -> processPoint(e[0], e[1], test));

        Consumer<String> test1 = (ele) ->{
            String[] newArr= ele.split(" ");
            for(var ele1 : newArr){
                System.out.println(ele1);
            }
        };
        String test2 = "safasdf asfasdf afa afasd afa3";
//        printString(test2,test1);
        test1.accept(test2);

//        Function<String, String> test3 = (str) ->{
//          StringBuilder stringBuilder = new StringBuilder();
//          for(int i = 0; i < str.length(); i++){
//              if(i % 2 == 1){
//                    stringBuilder.append(str.charAt(i));
//              }
//          }
//          return stringBuilder.toString();
//        };

        UnaryOperator<String> splitAppend = (str) ->{
            StringBuilder stringBuilder = new StringBuilder();
          for(int i = 0; i < str.length(); i++){
              if(i % 2 == 1){
                    stringBuilder.append(str.charAt(i));
              }
          }
          return stringBuilder.toString();
        };
        System.out.println(splitAppend.apply("saf afa asfa"));

        Function<String, String> strTest = (str) ->{
            System.out.println(str + " Test");
            return str;
        };
        newList.forEach((e) -> printStr1(strTest, e));
    }
    public static <T> T calculator(Operation<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("Result " +  result);
        return result;
    }

    public static String printStr1(Function<String, String> func, String str){
        return func.apply(str);
    }


    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer){
        consumer.accept(t1, t2);
    }

    public static <T> void printString(T t1, Consumer<T> consumer){
        consumer.accept(t1);
    }

}
