package JavaAdvanced003_JavaCollections.JA002;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<Object> linkedList = new LinkedList<>();

        // Add elements
        linkedList.add("Ahmet");
        linkedList.add(25);
        linkedList.add(3.14);
        linkedList.add(true);

        // Print the elements
        System.out.println("Contents of the LinkedList:");
        for (Object element : linkedList) {
            System.out.println(element);
        }

        // Remove the first element
        linkedList.removeFirst();

        // Update the second element
        linkedList.set(0, "Mehmet");

        // Print the updated LinkedList
        System.out.println("\nUpdated Contents of the LinkedList:");
        for (Object element : linkedList) {
            System.out.println(element);
        }
    }
}
