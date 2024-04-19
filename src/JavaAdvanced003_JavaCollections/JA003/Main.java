package JavaAdvanced003_JavaCollections.JA003;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty() ? "List is empty" : "List is not empty");
        for (String listItem : list) {
            System.out.println(listItem);
        }

        list.add("Thomas");
        list.add("Peter");
        list.add("Mary");
        list.add("Alex");
        list.add("David");
        list.add("Jane");
        list.add("Kate");
        list.add("Lisa");
        list.add("John");
        list.add("Sarah");

        System.out.println(list.isEmpty() ? "List is empty" : "List is not empty");
        for (String listItem : list) {
            System.out.println(listItem);
        }

    }
}
