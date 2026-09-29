import java.util.Scanner;

class Employee {
    String empid;
    String name;
    int salary;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee_ID:");
        empid = sc.nextLine();
	
	System.out.println("Enter Employee name:");
        name = sc.nextLine();

        System.out.println("Enter salary:");
        salary = sc.nextInt();
    }

    public void display() {
	System.out.println("EMP_ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class emp {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
	Employee emp2 = new Employee();

        emp1.accept();
        emp1.display();
	emp2.accept();
        emp2.display();
    }
}
