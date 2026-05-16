import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hellowwwww " + name);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("your age is : " + age + " years old");

        System.out.println("Enter your weight: ");
        double weight = scanner. nextDouble();
        System.out.println("your weight is : " + weight + " kg");

        System.out.println("Enter your height:");
        double height = scanner.nextDouble();
        System.out.println("your height is : " + height + " cm");




    }
}
