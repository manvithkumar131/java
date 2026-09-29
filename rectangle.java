import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public void accept(Scanner sc) {
        System.out.println("Enter length:");
        length = sc.nextInt();

        System.out.println("Enter breadth:");
        breadth = sc.nextInt();
    }

    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area = " + area);
    }

    public void calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter = " + perimeter);
    }

    public void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        calculateArea();
        calculatePerimeter();
    }
}

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Enter details for Rectangle 1:");
        r1.accept(sc);

        System.out.println("\nEnter details for Rectangle 2:");
        r2.accept(sc);

        System.out.println("\n--- Rectangle 1 ---");
        r1.display();

        System.out.println("\n--- Rectangle 2 ---");
        r2.display();

        sc.close();
    }
}
