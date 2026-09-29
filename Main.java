import java.util.Scanner;

class Student {
    String name;
    String USN;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        name = sc.nextLine();

        System.out.println("Enter USN:");
        USN = sc.nextLine();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + USN);
    }
}

public class Main {
    public static void main(String[] args) {
        Student studentObject = new Student();

        studentObject.accept();
        studentObject.display();
    }
}
