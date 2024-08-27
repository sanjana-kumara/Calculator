package gui;

//import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent d) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    TextField tf;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSubtract, btnMultiply, btnDivide, btnEqual, btnClear, btnSqRt, btnDot, btnNegativeMark, btnPercentage;

    String fv, sv, op;
    Double fdv, sdv, tot;

    cal() {

        Frame f = new Frame();
        f.addWindowListener(new Close());
        f.setBackground(Color.WHITE);
        f.setTitle("My Calculator");
        f.setBounds(700, 200, 400, 600);
        f.setResizable(false);

        Font Segoe_UI_15 = new Font("Segoe UI", Font.PLAIN, 15);
        Font Segoe_UI_24 = new Font("Segoe UI", 0, 24);
        Font Ebrima_24 = new Font("Ebrima", 0, 24);
        Font Segoe_UI_20 = new Font("Segoe UI", 0, 20);
        Font times_36 = new Font("Times New Roman", 0, 36);
        Font times_48 = new Font("Times New Roman", 0, 48);
        Font segeo_55 = new Font("Segoe UI", Font.PLAIN, 55);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi = new MenuItem("Edit");
        MenuItem mi1 = new MenuItem("About");
        m1.add(mi);
        m1.add(mi1);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Online support");
        MenuItem mi3 = new MenuItem("Check for updates");
        m2.add(mi2);
        m2.add(mi3);

        mb.add(m1);
        mb.add(m2);
        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(5, 4, 3, 3);
        p2.setLayout(g1);
        p2.setBackground(Color.black);

        tf = new TextField();
        tf.setFont(segeo_55);
        tf.setEditable(false);
        tf.setBackground(Color.BLACK);
        tf.setForeground(Color.WHITE);
        tf.setPreferredSize(new Dimension(370, 70));
        tf.setText("0");
        tf.setFocusable(false);

        p1.add(tf);

        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnAdd = new Button("+");
        btnSubtract = new Button("-");
        btnMultiply = new Button("×");
        btnDivide = new Button("÷");
        btnEqual = new Button("=");
        btnClear = new Button("C");
        btnSqRt = new Button("SqRt");
        btnDot = new Button(".");
        btnNegativeMark = new Button("+/-");
        btnPercentage = new Button("%");

        btn0.setBackground(new Color(51, 51, 51));
        btn1.setBackground(new Color(51, 51, 51));
        btn2.setBackground(new Color(51, 51, 51));
        btn3.setBackground(new Color(51, 51, 51));
        btn4.setBackground(new Color(51, 51, 51));
        btn5.setBackground(new Color(51, 51, 51));
        btn6.setBackground(new Color(51, 51, 51));
        btn7.setBackground(new Color(51, 51, 51));
        btn8.setBackground(new Color(51, 51, 51));
        btn9.setBackground(new Color(51, 51, 51));
        btnDot.setBackground(new Color(51, 51, 51));
        btnNegativeMark.setBackground(new Color(51, 51, 51));
        btnEqual.setBackground(new Color(102, 198, 221));
        btnAdd.setBackground(Color.black);
        btnSubtract.setBackground(Color.black);
        btnSqRt.setBackground(Color.black);
        btnDivide.setBackground(Color.black);
        btnPercentage.setBackground(Color.black);
        btnClear.setBackground(Color.black);
        btnMultiply.setBackground(Color.black);

        btn0.setForeground(Color.WHITE);
        btn1.setForeground(Color.WHITE);
        btn2.setForeground(Color.WHITE);
        btn3.setForeground(Color.WHITE);
        btn4.setForeground(Color.WHITE);
        btn5.setForeground(Color.WHITE);
        btn6.setForeground(Color.WHITE);
        btn7.setForeground(Color.WHITE);
        btn8.setForeground(Color.WHITE);
        btn9.setForeground(Color.WHITE);
        btnDot.setForeground(Color.WHITE);
        btnNegativeMark.setForeground(Color.WHITE);
        btnEqual.setForeground(Color.BLACK);
        btnAdd.setForeground(Color.WHITE);
        btnSubtract.setForeground(Color.WHITE);
        btnSqRt.setForeground(Color.WHITE);
        btnDivide.setForeground(Color.WHITE);
        btnPercentage.setForeground(Color.WHITE);
        btnClear.setForeground(Color.WHITE);
        btnMultiply.setForeground(Color.WHITE);

        btn0.setFont(Segoe_UI_24);
        btn1.setFont(Segoe_UI_24);
        btn2.setFont(Segoe_UI_24);
        btn3.setFont(Segoe_UI_24);
        btn4.setFont(Segoe_UI_24);
        btn5.setFont(Segoe_UI_24);
        btn6.setFont(Segoe_UI_24);
        btn7.setFont(Segoe_UI_24);
        btn8.setFont(Segoe_UI_24);
        btn9.setFont(Segoe_UI_24);
        btnEqual.setFont(times_36);
        btnAdd.setFont(times_36);
        btnSubtract.setFont(times_48);
        btnNegativeMark.setFont(Segoe_UI_24);
        btnSqRt.setFont(Segoe_UI_20);
        btnDivide.setFont(times_36);
        btnClear.setFont(Segoe_UI_24);
        btnPercentage.setFont(Ebrima_24);
        btnDot.setFont(times_36);
        btnMultiply.setFont(times_36);

        p2.add(btnClear);
        p2.add(btnPercentage);
        p2.add(btnSqRt);
        p2.add(btnDivide);
        p2.add(btn7);
        p2.add(btn8);
        p2.add(btn9);
        p2.add(btnMultiply);
        p2.add(btn4);
        p2.add(btn5);
        p2.add(btn6);
        p2.add(btnSubtract);
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btnAdd);
        p2.add(btnNegativeMark);
        p2.add(btn0);
        p2.add(btnDot);
        p2.add(btnEqual);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDot.addActionListener(this);
        btnNegativeMark.addActionListener(this);
        btnEqual.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnSqRt.addActionListener(this);
        btnPercentage.addActionListener(this);
        btnClear.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.CENTER);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {

            tf.setText("");

        }

        Object o = d.getSource();

        if (o.equals(btn1)) {
            tf.setText(tf.getText() + btn1.getLabel());
        } else if (o.equals(btn2)) {
            tf.setText(tf.getText() + btn2.getLabel());
        } else if (o.equals(btn3)) {
            tf.setText(tf.getText() + btn3.getLabel());
        } else if (o.equals(btn4)) {
            tf.setText(tf.getText() + btn4.getLabel());
        } else if (o.equals(btn5)) {
            tf.setText(tf.getText() + btn5.getLabel());
        } else if (o.equals(btn6)) {
            tf.setText(tf.getText() + btn6.getLabel());
        } else if (o.equals(btn7)) {
            tf.setText(tf.getText() + btn7.getLabel());
        } else if (o.equals(btn8)) {
            tf.setText(tf.getText() + btn8.getLabel());
        } else if (o.equals(btn9)) {
            tf.setText(tf.getText() + btn9.getLabel());
        } else if (o.equals(btn0)) {
            tf.setText(tf.getText() + btn0.getLabel());
        } else if (o.equals(btnAdd)) { // +
            fv = tf.getText();
            op = "+";
            tf.setText("");
        } else if (o.equals(btnSubtract)) { // -
            fv = tf.getText();
            op = "-";
            tf.setText("");
        } else if (o.equals(btnMultiply)) { // *
            fv = tf.getText();
            op = "*";
            tf.setText("");
        } else if (o.equals(btnDivide)) { // /
            fv = tf.getText();
            op = "/";
            tf.setText("");
        } else if (o.equals(btnPercentage)) { // %
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText((fdv / 100) + "");
        } else if (o.equals(btnNegativeMark)) { // +/-
            if (Double.parseDouble(tf.getText()) > 0) {
                fv = tf.getText();
                fdv = Double.parseDouble(fv);
                tf.setText("-" + fdv);
            }
        } else if (o.equals(btnSqRt)) { // √
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.sqrt(fdv) + "");
        } else if (o.equals(btnClear)) { // CE
            tf.setText("0");
            fv = sv = op = null;
            fdv = sdv = tot = null;
        } else if (o.equals(btnEqual)) { // =
            sv = tf.getText();

            try {

                fdv = Double.parseDouble(fv);

            } catch (NullPointerException e) {

                tf.setText("");
                return;

            }

            try {

                sdv = Double.parseDouble(sv);

            } catch (NullPointerException e) {

                tf.setText("");
                return;

            }

            switch (op) {
                case "+":
                    tot = fdv + sdv;
                    break;
                case "-":
                    tot = fdv - sdv;
                    break;
                case "*":
                    tot = fdv * sdv;
                    break;
                case "/":
                    tot = fdv / sdv;
                    break;
            }
            tf.setText(tot + "");
        }
    }
}

public class Calculator {

    public static void main(String[] args) {

        new cal();

    }
}
