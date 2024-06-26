import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

class Staff {
    private int code;
    private String name;

    Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    int getCode() {
        return code;
    }

    String getName() {
        return name;
    }

    void display() {
        System.out.println();
        System.out.println("**** STAFF INFO ****");
        System.out.println("Staff Code: " + code);
        System.out.println("Staff Name: " + name);
    }

}

class Teacher extends Staff {
    private String subject;
    private String publication;

    Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    String getSubject() {
        return subject;
    }

    String getPublication() {
        return publication;
    }

    void display() {
        System.out.println();
        System.out.println("**** TEACHER INFO ****");
        System.out.println("Teacher Code: " + getCode());
        System.out.println("Teacher Name: " + getName());
        System.out.println("Teacher Subject: " + subject);
        System.out.println("Teacher Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    void display() {
        System.out.println();
        System.out.println("**** OFFICER INFO ****");
        System.out.println("Officer Code: " + getCode());
        System.out.println("Officer Name: " + getName());
        System.out.println("Officer Grade: " + grade);
    }
}

class Typist extends Staff {
    private double speed;

    Typist(int code, String name, double speed) {
        super(code, name);
        this.speed = speed;
    }

    double getSpeed() {
        return speed;
    }

    void display() {
        System.out.println();
        System.out.println("**** TYPIST INFO ****");
        System.out.println("Typist Code: " + getCode());
        System.out.println("Typist Name: " + getName());
        System.out.println("Typing Speed: " + speed + " words/min");
    }
}

class Regular extends Typist {
    Regular(int code, String name, double speed) {
        super(code, name, speed);
    }

    void display() {
        System.out.println();
        System.out.println("**** TYPIST INFO ****");
        System.out.println("Typist Code: " + getCode());
        System.out.println("Typist Name: " + getName());
        System.out.println("Typing Speed: " + getSpeed() + " words/min");
    }
}

class Casual extends Typist {
    private double dailyWages;

    Casual(int code, String name, double speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    double getDailyWages() {
        return dailyWages;
    }

    void display() {
        System.out.println();
        System.out.println("**** TYPIST INFO ****");
        System.out.println("Typist Code: " + getCode());
        System.out.println("Typist Name: " + getName());
        System.out.println("Typing Speed: " + getSpeed() + " words/min");
        System.out.println("Daily Wages Rs: " + dailyWages);
    }

}

public class EduInstitueDatabase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Vector<Staff> staff = new Vector<>();
        Vector<Teacher> teacher = new Vector<>();
        Vector<Officer> officer = new Vector<>();
        Vector<Typist> typist = new Vector<>();
        Vector<Regular> regular = new Vector<>();
        Vector<Casual> casual = new Vector<>();

        int ch;
        do {
            System.out.println("**** MENU ****");
            System.out.println("1.ADD STAFF\t\t 2.DISPLAY\t\t 3.EXIT");
            System.out.print("Enter the choice: ");
            ch = Integer.parseInt(reader.readLine());
            switch (ch) {
                case 1:
                    System.out.print("Enter Code: ");
                    int sCode = Integer.parseInt(reader.readLine());
                    System.out.print("Enter Name: ");
                    String sName = reader.readLine();
                    Staff s1 = new Staff(sCode, sName);
                    staff.add(s1);
                    System.out.println("New Staff Added Successfully!");
                    System.out.println();
                    System.out.println("1.Add Teacher\t\t 2.Add Officer\t\t 3.Add Typist\t\t 4.Exit");
                    System.out.print("Enter Choice: ");
                    System.out.println();
                    int dh = Integer.parseInt(reader.readLine());
                    switch (dh) {
                        case 1:
                            System.out.print("Enter Subject: ");
                            String subject = reader.readLine();
                            System.out.print("Enter Publication: ");
                            String publication = reader.readLine();
                            Teacher t1 = new Teacher(s1.getCode(), s1.getName(), subject, publication);
                            teacher.add(t1);
                            System.out.println("New Teacher added successfully");
                            System.out.println();
                            break;
                        case 2:
                            System.out.print("Enter Grade: ");
                            String grade = reader.readLine();
                            Officer o1 = new Officer(s1.getCode(), s1.getName(), grade);
                            officer.add(o1);
                            System.out.println("New Officer added successfully");
                            System.out.println();
                            break;
                        case 3:
                            System.out.print("Enter Speed: ");
                            double speed = Double.parseDouble(reader.readLine());
                            Typist ty1 = new Typist(s1.getCode(), s1.getName(), speed);
                            typist.add(ty1);
                            System.out.println("New Typist added successfully");
                            System.out.println();
                            System.out.println("1.Add Regular Typist\t\t 2.Add Casual Typist\t\t 3.Exit");
                            System.out.print("Enter Choice: ");
                            int th = Integer.parseInt(reader.readLine());
                            switch (th) {
                                case 1:
                                    Regular r1 = new Regular(ty1.getCode(), ty1.getName(), ty1.getSpeed());
                                    regular.add(r1);
                                    System.out.println("New Regular Typist Added Successfully!");
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.print("Enter Daily Wages : ");
                                    double dailyWages = Double.parseDouble(reader.readLine());
                                    Casual c1 = new Casual(ty1.getCode(), ty1.getName(), ty1.getSpeed(), dailyWages);
                                    casual.add(c1);
                                    System.out.println("New Casual Typist Added Successfully");
                                    System.out.println();
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Wrong Input");
                                    break;
                            }

                        case 4:
                            break;
                        default:
                            System.out.println("Wrong Input");
                    }
                    break;

                case 2:
                    System.out.println(
                            "1.Display Staff\t2.Display Teacher\t3.Display Officer\t4.Display Typist\t5.Dispaly Regular Typist\t6.Display Casual Typist\t7.Exit");
                    System.out.print("Enter Choice: ");
                    int ah = Integer.parseInt(reader.readLine());
                    switch (ah) {
                        case 1:
                            System.out.print("Enter code of Staff: ");
                            int sid = Integer.parseInt(reader.readLine());
                            for (Staff i : staff) {
                                if (i.getCode() == sid) {
                                    i.display();
                                }
                            }
                            System.out.println();
                            break;
                        case 2:
                            System.out.print("Enter code of Teacher: ");
                            int tid = Integer.parseInt(reader.readLine());
                            for (Teacher i : teacher) {
                                if (i.getCode() == tid) {
                                    i.display();
                                }
                            }
                            System.out.println();
                            break;
                        case 3:
                            System.out.print("Enter code of Officer: ");
                            int oid = Integer.parseInt(reader.readLine());
                            for (Officer i : officer) {
                                if (i.getCode() == oid) {
                                    i.display();
                                }
                            }
                            System.out.println();
                            break;
                        case 4:
                            System.out.print("Enter code of Typist: ");
                            int tyid = Integer.parseInt(reader.readLine());
                            for (Typist i : typist) {
                                if (i.getCode() == tyid) {
                                    i.display();
                                }
                            }
                            System.out.println();
                            break;
                        case 5:
                            System.out.print("Enter code of Regular Typist: ");
                            int rtyid = Integer.parseInt(reader.readLine());
                            for (Regular i : regular) {
                                if (i.getCode() == rtyid) {
                                    i.display();
                                }
                            }
                            System.out.println();
                            break;
                        case 6:
                            System.out.print("Enter code of Casual Typist: ");
                            int cyid = Integer.parseInt(reader.readLine());
                            for (Casual i : casual) {
                                if (i.getCode() == cyid) {
                                    i.display();
                                }
                            }
                            System.out.println();
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Wrong Input!");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        } while (ch != 3);
    }
}
