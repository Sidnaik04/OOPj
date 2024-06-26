// Bank System

import java.util.Scanner;
import java.util.Vector;

public class Bank {
    private String accName;
    private String accType;
    private int accNum;
    private double accBalance;

    public Bank(String name, int num, String type, double balance) {
        this.accName = name;
        this.accNum = num;
        this.accType = type;
        this.accBalance = balance;
    }

    public void deposit(double amount) {
        accBalance += amount;
        System.out.println("Amount deposited");
    }

    public void withdraw(double amount) {
        if (accBalance >= amount) {
            accBalance -= amount;
            System.out.println("Amount withdrawn");
        } else {
            System.out.println("Less balance");
        }
    }

    public void display() {
        System.out.println("Account Name: " + accName);
        System.out.println("Account Type: " + accType);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Bank> account = new Vector<>();

        int ch;
        int accountNumber;

        System.out.println("Enter the following: ");
        do {
            System.out.println("1)Create Account\t 2)Deposit Amount\t 3)Withdraw\t 4)Display\t 5)Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the name: ");
                    String aName = sc.next();

                    System.out.println("Enter the account Number: ");
                    Integer aNum = sc.nextInt();

                    System.out.println("Enter the account type: ");
                    String aType = sc.next();

                    System.out.println("Enter the amount: ");
                    Double aAmount = sc.nextDouble();

                    Bank a1 = new Bank(aName, aNum, aType, aAmount);
                    account.add(a1);
                    System.out.println("Created succesfully");
                    break;

                case 2:
                    System.out.println("Enter the account number: ");
                    accountNumber = sc.nextInt();

                    System.out.println("Enter the amount to deposit: ");
                    double dA = sc.nextDouble();

                    for (Bank i : account) {
                        if (i.accNum == accountNumber) {
                            i.deposit(dA);
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter the account number: ");
                    accountNumber = sc.nextInt();

                    System.out.println("Enter the amount to withdraw: ");
                    Double wA = sc.nextDouble();

                    for (Bank i : account) {
                        if (i.accNum == accountNumber) {
                            i.withdraw(wA);
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Enter the account number: ");
                    accountNumber = sc.nextInt();

                    for (Bank i : account) {
                        if (i.accNum == accountNumber) {
                            i.display();
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 5);
    }
}
