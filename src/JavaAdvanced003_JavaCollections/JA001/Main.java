package JavaAdvanced003_JavaCollections.JA001;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();

        linkedList.add("Thomas");
        linkedList.add(25);
        linkedList.add(3.14);
        linkedList.add(true);

        System.out.println("Old linked list: " + linkedList);
        for (Object object : linkedList) {
            System.out.println(object);
        }
        System.out.println("New linked list: " + linkedList);
        linkedList.set(0, "Thomas Jefferson");
        for (Object object : linkedList) {
            System.out.println(object);
        }
    }
}
