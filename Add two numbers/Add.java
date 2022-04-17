import java.util.Scanner;

public class Add {
    public static void add() {
        System.out.println("This program adds two numbers");

        System.out.print("Enter the first number > ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();

        System.out.print("Enter the second number > ");
        int n2 = in.nextInt();
        in.close();

        int total = n1 + n2;
        System.out.println("The total is " + total + ".");
    }
    public static void main(String[] args) {
        add();
    }
}
