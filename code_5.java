// File handling payslip

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class code_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the employee name: ");
        String name = sc.next();

        System.out.println("Enter the employee id: ");
        Integer id= sc.nextInt();

        System.out.println("Enter the employee phone: ");
        Integer phNo=sc.nextInt();

        System.out.println("Enter the employee bas: ");
        Double bas=sc.nextDouble();


        double da=0.34 * bas;
        double hra=0.18*(da+bas);
        double ta=3600+(0.34*3600);
        double gross = bas+da+hra+ta;
        double gpf=0.1*gross;
        double tax=0.2*gross;
        double deduction = gpf+tax;
        double net = gross - deduction;

        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("Number: "+phNo);
        System.out.println("Salary: "+bas);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("TA: "+ta);
        System.out.println("Gross: "+gross);
        System.out.println("Tax: "+tax);
        System.out.println("GPF: "+gpf);
        System.out.println("Deduction: "+deduction);
        System.out.println("Net: "+net);

        try{
            File f1 = new File(name);
            f1.createNewFile();

        }catch(IOException e1){
            System.out.println(e1);
        }

        try{
            FileWriter w = new FileWriter(name);
            w.write("******************\n");
            w.write("Employee Playslip\n");
            w.write("******************\n");
            w.write("Name: "+name+"\n");
            w.write("id: "+id);
            w.write("phno: "+phNo);
            w.write("Salary: "+bas);
            w.write("Name: "+name);
            w.write("Name: "+name);
            w.write("Name: "+name);
            w.write("Name: "+name);
            w.close();



        }catch(IOException e2){
            System.out.println(e2);
        }


    }
}
