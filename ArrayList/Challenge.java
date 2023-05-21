package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {
    public static Scanner scanner = new Scanner(System.in);
    public static void sprintArr(){
        System.out.println("Enter chose: \n" +
                "0: Exits \n" +
                "1: Add item \n" +
                "2: Remove item");
    }
    public static void addItem(ArrayList<String> myArrayList){
        System.out.println("Enter product you want add to arrList: ");
        String[] items = scanner.nextLine().split(",");
        for (String item: items){
            String check = item.trim();
            if(myArrayList.indexOf(check) < 0){
                myArrayList.add(check);
            }
        }
    }
    public static void deleteItem(ArrayList myArrList){
        System.out.println("Enter product you delete from arrList: ");
        String[] items = scanner.nextLine().split(",");
        for(String item: items){
            String itemCheck = item.trim();
            if(myArrList.contains(item)){
                myArrList.remove(itemCheck);
            }else{
                System.out.println("No exist product " + itemCheck);
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<String> newArrList = new ArrayList<>();
        boolean flag = true;

        while (flag){
            System.out.println("MyArrList: " + newArrList);
            sprintArr();
            int chose;
            while (true){
                Scanner scanner1 = new Scanner(System.in);
                if(scanner1.hasNextInt()){
                    chose = scanner1.nextInt();
                    break;
                }else {
                    System.out.println("Enter type number");
                }
            }
            if(chose == 0){
                flag = false;
                System.out.println("Bye");
            }else if(chose == 1){
                addItem(newArrList);
            }else if(chose == 2){
                deleteItem(newArrList);
            }else {
                System.out.println("enter number 0, 1, 2");
            }
            System.out.println("MyArrList: " + newArrList);
            System.out.println("-".repeat(50));
        }
    }
}
