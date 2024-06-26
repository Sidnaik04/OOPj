import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculator extends JFrame implements ActionListener {

    JFrame f;
    JPanel p;
    JLabel l;
    JButton b;

    public static String str1, op;
    boolean click = false;
    public static int n1, n2, ans;

    public calculator() {

        f = new JFrame("Calculator");
        p = new JPanel();

        l = new JLabel("0", JLabel.RIGHT);
        l.setLayout(new FlowLayout());
        l.setVisible(true);

        p.setLayout(new GridLayout(4, 0));

        for (int i = 0; i < 10; i++) {
            b = new JButton(String.valueOf(i));
            b.addActionListener(this);
            p.add(b);
        }

        JButton b1 = new JButton("+");
        p.add(b1);
        JButton b2 = new JButton("-");
        p.add(b2);
        JButton b3 = new JButton("*");
        p.add(b3);
        JButton b4 = new JButton("/");
        p.add(b4);
        JButton b5 = new JButton("=");
        p.add(b5);
        JButton b6 = new JButton("C");
        p.add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        Container content = f.getContentPane();
        content.setLayout(new BorderLayout());
        content.add(BorderLayout.NORTH, l);
        content.add(BorderLayout.CENTER, p);

        p.setVisible(true);
        f.setVisible(true);
        f.pack();

    }

    public static void main(String[] args) {
        calculator c = new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().toString().equals("+") || e.getActionCommand().toString().equals("-") || e.getActionCommand().toString().equals("*") || e.getActionCommand().toString().equals("/")) {
            click = true;
            op = e.getActionCommand().toString();
        } else {
            if (e.getActionCommand().toString().equals("C")) {
                str1 = "0";
                l.setText(str1);
            } else {
                if (click) {
                    click = false;
                    str1 = l.getText();
                    n1 = Integer.parseInt(str1);
                    str1 = "0";
                    l.setText(str1 + e.getActionCommand().toString());
                } else {
                    str1 = l.getText();
                    l.setText(str1 + e.getActionCommand().toString());
                }
            }
        }

        if (e.getActionCommand().toString().equals("=")) {
            n2 = Integer.parseInt(str1);
            if (op.equals("+")) {
                ans = n1 + n2;
            }

            if (op.equals("-")) {
                ans = n1 - n2;
            }

            if (op.equals("*")) {
                ans = n1 * n2;
            }

            if (op.equals("/")) {
                ans = n1 / n2;
            }
            l.setText(String.valueOf(ans));
        }
    }
}
