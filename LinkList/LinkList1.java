package LinkList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList1 {
    public static void main(String[] args) {
//        LinkedList<String> placeToVisit = new LinkedList<>();
        var placeToVisit = new LinkedList<String>();
        placeToVisit.add("1");
        placeToVisit.add(0, "0");
        System.out.println(placeToVisit);
        addItem(placeToVisit);
        System.out.println(placeToVisit);
//        removeItem(placeToVisit);
//        System.out.println(placeToVisit);
//        getElement(placeToVisit);

//        printElement3(placeToVisit);
//        printIterator(placeToVisit);
//        printListIterator(placeToVisit);
    }
    public static void addItem(LinkedList<String> myLinkList){
        myLinkList.addFirst("-1");
        myLinkList.addLast("2");
        //Queue First in First out
        myLinkList.offer("3");
        myLinkList.offerFirst("-2");
        myLinkList.offerLast("4");
        //Stack last in first out;
        myLinkList.push("-3");

        //Sta
        myLinkList.add(1,"-4" );
    }
    public static void removeItem(LinkedList<String> myLinkList){
//        myLinkList.remove("1");
//        myLinkList.remove(2);
        String itemRemove = myLinkList.remove();
        System.out.println("Item remove: " + itemRemove);
        String itemFistRemove = myLinkList.removeFirst();
        System.out.println("item first remove: " + itemFistRemove);
        String itemLastRemove = myLinkList.removeLast();
        System.out.println("Item last remove: " + itemLastRemove);
        //Queue
        System.out.println("LinkList queue---------------: " + myLinkList);
        String queueRemove = myLinkList.poll();
        System.out.println("Queue poll: " + queueRemove);
        String queueRemoveFirst = myLinkList.pollFirst();
        System.out.println("Queue poll Fist: " + queueRemoveFirst);
        String queueRemoveLast = myLinkList.pollLast();
        System.out.println("Queue poll last: " + queueRemoveLast);
        System.out.println(myLinkList);
        //Stack
        System.out.println("-".repeat(50));
        myLinkList.push("0");
        String popStack = myLinkList.pop();
        System.out.println("Stack: " + popStack);


    }
    public static void getElement(LinkedList<String> myLinkList){
        System.out.println("Item get stt: 4 value: " + myLinkList.get(3));
        System.out.println("Item get fist: " + myLinkList.getFirst());
        System.out.println("Item get last: " + myLinkList.getLast());
        System.out.println("Item get index of value 0: " + myLinkList.indexOf("0"));
        myLinkList.add("0");
        System.out.println(myLinkList);
        System.out.println("Item get last index of value 0: " + myLinkList.lastIndexOf("0"));
        //Queue
        System.out.println("Queue get element: " +  myLinkList.element());

        //Stack
        System.out.println("Stack get element: " + myLinkList.peek());
        System.out.println("Stack get fist: " + myLinkList.peekFirst());
        System.out.println("Stack get last: " + myLinkList.peekLast());

        //
    }

    public static void printElement1(LinkedList<String> myLinkList){
        System.out.println("Start element: " + myLinkList.getFirst());
        for (int i = 1; i < myLinkList.size(); i++) {
            System.out.println("---> From: " + myLinkList.get(i - 1) + " to: " + myLinkList.get(i));
        }
    }
    public static void printElement2(LinkedList<String> myLinkList){
        System.out.println("Start element: " + myLinkList.getFirst());
        String previousItem = myLinkList.getFirst();
        for (String item: myLinkList){
            System.out.println("---> From: " + previousItem + " to: " + item);
            previousItem = item;
        }

    }

    public static void printElement3(LinkedList<String> myLinkList){
        System.out.println("Start: " + myLinkList.getFirst());
        String previousItem = myLinkList.getFirst();
        ListIterator<String> iterator = myLinkList.listIterator(1);
        while (iterator.hasNext()){
            var nextItem = iterator.next();
            System.out.println("---> From: " + previousItem + " to: " + nextItem);
            previousItem = nextItem;
        }

    }
    //iterator support method remove();
    //ListIterator support method remove() and method add() and set();
    public static  void printIterator(LinkedList<String> myList){
        var listIterator = myList.iterator();
        while (listIterator.hasNext()){
//            System.out.println("item: " + listIterator.next());
            if(listIterator.next().equals("2")){
//                myList.remove(listIterator.next());
                listIterator.remove();
            }
        }
        System.out.println(myList);
    }
    public static void printListIterator(LinkedList<String> myList){
        var listIterator = myList.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next().equals("2")){
                listIterator.add("TEST");
            }
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        System.out.println("---"+ listIterator.next());
        System.out.println(listIterator.previous());

        System.out.println(myList);

    }
}
