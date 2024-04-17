package JavaAdvanced002_Java8Features.JA003;

import java.util.ArrayList;
import java.util.List;

class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("User { id=%d, name='%s', age=%d }", id, name, age);
    }


    public void talk() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Hello");
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

}

public class ANewFeature {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();

        users.add(new User(100, "John", 25));
        users.add(new User(200, "Mary", 30));
        users.add(new User(300, "Peter", 40));
        users.add(new User(400, "Sarah", 35));
        users.add(new User(500, "Alex", 45));
        users.add(new User(600, "David", 50));
        users.add(new User(700, "Jane", 60));
        users.add(new User(800, "Kate", 70));
        users.add(new User(900, "Lisa", 80));
        users.add(new User(1000, "John", 90));

        List<User> filteredUsers = users.stream().filter(u->u.getAge()>40).toList();
        System.out.println(filteredUsers);

        filteredUsers.forEach(User::talk);




    }
}
