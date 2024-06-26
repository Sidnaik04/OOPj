// Student details arrays

public class code_1 {
    public static void main(String[] args) {
        int rollNo[] = { 1, 2, 3, 4, 5 };
        int sub1[] = { 96, 58, 76, 63, 45 };
        int sub2[] = { 78, 54, 78, 93, 55 };
        int sub3[] = { 64, 68, 88, 63, 44 };
        int size = rollNo.length;
        int total[] = new int[size];

        for (int i = 0; i < size; i++) {
            total[i] = sub1[i] + sub2[i] + sub3[i];
        }

        int highestSub1 = 0, highestSub2 = 0, highestSub3 = 0, highestTotal = 0;

        for (int i = 0; i < size; i++) {
            if (sub1[i] > sub1[highestSub1])
                highestSub1 = i;
            if (sub2[i] > sub2[highestSub2])
                highestSub2 = i;
            if (sub3[i] > sub3[highestSub3])
                highestSub3 = i;
            if (total[i] > total[highestTotal])
                highestTotal = i;
        }

        System.out.println("Roll No \t\t Sub1 \t\t Sub2 \t\t Sub3 \t\t Total");
        for (int i = 0; i < size; i++) {
            System.out.println(rollNo[i] + "\t\t" + sub1[i] + "\t\t" + sub2[i] + "\t\t" + sub3[i] + "\t\t" + total[i]);
        }

        System.out.println("Highest marks in subject 1");
        System.out.println("Roll Number: " + rollNo[highestSub1] + "--> Marks: " + sub1[highestSub1]);

        System.out.println("Highest Marks in subject 2");
        System.out.println("Roll No: " + rollNo[highestSub2] + "--> Marks: " + sub2[highestSub2]);

        System.out.println("Highest Marks in subject 3");
        System.out.println("Roll No: " + rollNo[highestSub3] + "--> Marks: " + sub3[highestSub3]);

        System.out.println("Highest Total marks: ");
        System.out.println("Roll No: " + rollNo[highestTotal] + "--> Marks: " + total[highestTotal]);
    }

}