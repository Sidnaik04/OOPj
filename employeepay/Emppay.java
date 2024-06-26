package employeepay;

public class Emppay {
    String name;
    int EmpID;
    String gender;
    double bas;
    double DA, TA, HRA, TAX, Gross, Deduction, GPF, Net;

    public Emppay(String name, int id, String gender, double bas) {
        this.name = name;
        this.EmpID = id;
        this.gender = gender;
        this.bas = bas;
    }

    public void compute() {
        DA = 0.34 * bas;
        TA = 3600 + (0.34 * 3600);
        HRA = 0.18 * (DA + bas);
        Gross = bas + DA + TA + HRA;
        GPF = Gross * 0.1;
        TAX = Gross * 0.2;
        Deduction = GPF + TAX;
        Net = Gross - Deduction;
    }

    public void display() {
        System.out.println("********************************");
        System.out.println("-------Pay Slip Of " + name + "-------");
        System.out.println("********************************");
        System.out.println("Employee ID: " + EmpID);
        System.out.println("Gender: " + gender);
        System.out.println("Basic Pay: \t" + bas);
        System.out.println("DA: \t" + DA);
        System.out.println("TA: \t" + TA);
        System.out.println("HRA: \t" + HRA);
        System.out.println("Gross: \t" + Gross);
        System.out.println("GPF: \t" + GPF);
        System.out.println("TAX: \t" + TAX);
        System.out.println("Deduction: \t" + Deduction);
        System.out.println("Net Pay: \t" + Net);
    }
}