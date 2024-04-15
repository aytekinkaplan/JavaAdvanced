package JavaAdvanced001_AbstractClassAndInterface.JA002;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        First first = new First(); // First sınıfından bir nesne oluşturuldu

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter your name");
            first.setName(input.nextLine());

            System.out.println("Enter your last name");
            first.setLastName(input.nextLine());

            System.out.println("Enter your age");
            // Kullanıcıdan yaş bilgisini nextLine ile alıp Integer.parseInt ile integera dönüştürdük
            int age = Integer.parseInt(input.nextLine());
            first.setAge(age);

            System.out.println("Enter your gender");
            first.setGender(input.next().charAt(0)); // nextLine yerine next kullanıldı
        }

        input.close();


        System.out.println("Name: " + first.getName());
        System.out.println("Last Name: " + first.getLastName());
        System.out.println("Age: " + first.getAge());
        System.out.println("Gender: " + first.getGender());
    }
}
