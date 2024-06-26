import employeepay.*;
import java.util.Scanner;

public class Emppayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of employee: ");
        String name = sc.nextLine();

        System.out.print("Enter the employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter the employee gender: ");
        String gender = sc.next();

        System.out.print("Enter the employee basic pay: ");
        Double bas = sc.nextDouble();

        Emppay e1 = new Emppay(name, id, gender, bas);
        e1.compute();
        e1.display();
    }
}
