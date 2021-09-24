package Aireline_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginPage implements ActionListener  {
    JFrame fr;
    JLabel lbl_heading,lbl_username,lbl_password,lbl_signup;
    JTextField txt_username;
    JPasswordField txt_password;
    JButton btn_login,btn_cancel,btn_reg,btn_reset;
    Font fon1,fon2;

    //creating login page
    public LoginPage() {
        //Title
        fr = new JFrame("Potato Airlines");

        // font
        fon1 = new Font("arial", Font.BOLD, 24);
        fon2 = new Font("arial", Font.BOLD, 18);



        //heading
        lbl_heading = new JLabel("Welcome to Potato Airlines");
        lbl_heading.setForeground(Color.red);
        lbl_heading.setFont(fon1);
        lbl_heading.setBounds(85, 10, 350, 40);
        fr.add(lbl_heading);

        // label
        lbl_username=new JLabel("Username");
        lbl_username.setForeground(Color.blue);
        lbl_username.setFont(fon2);
        lbl_username.setBounds(50,50,100,40);
        fr.add(lbl_username);

        //Textfield
        txt_username=new JTextField();
        txt_username.setFont(fon2);
        txt_username.setBounds(155,50,220,40);
        fr.add(txt_username);

        //label for password
        lbl_password=new JLabel("Password");
        lbl_password.setForeground(Color.blue);
        lbl_password.setFont(fon2);
        lbl_password.setBounds(50,100,100,40);
        fr.add(lbl_password);

        // Jpasswordfield
        txt_password=new JPasswordField();
        txt_password.setFont(fon2);
        txt_password.setBounds(155,100,220,40);
        fr.add(txt_password);

        //button

        //login Button
        btn_login=new JButton("Login");
        btn_login.setFont(fon2);
        btn_login.setBounds(155,150,100,40);
        fr.add(btn_login);

        //cancel button
        btn_cancel=new JButton("Cancel");
        btn_cancel.setFont(fon2);
        btn_cancel.setBounds(250,150,100,40);
        fr.add(btn_cancel);

        //Reset Button
        btn_reset=new JButton("Reset");
        btn_reset.setForeground(Color.BLACK);
        btn_reset.setBounds(200,190,90,30);
        fr.add(btn_reset);

        //label for signup
        lbl_signup=new JLabel("Don't have an account?");
        lbl_signup.setForeground(Color.red);
        lbl_signup.setFont(fon2);
        lbl_signup.setBounds(125,230,300,30);
        btn_reg.addActionListener(this);
        fr.add(lbl_signup);


        //sign up button
        btn_reg=new JButton("click here");
        btn_reg.setForeground(Color.red);
        btn_reg.setBounds(332,230,90,30);
        fr.add(btn_reg);


        //Windows size and layout
        fr.setSize(450,300);
        fr.setLayout(null);
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        new LoginPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

