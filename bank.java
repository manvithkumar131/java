import java.util.Scanner;

class BankAccount {
    String acc_no;
    String name;
    int balance;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account number:");
        acc_no = sc.nextLine();

        System.out.println("Enter Account holder name:");
        name = sc.nextLine();

        System.out.println("Enter balance:");
        balance = sc.nextInt();
        sc.nextLine();
    }

    public void display() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        acc1.accept();
        acc1.display();

        acc2.accept();
        acc2.display();
    }
}
