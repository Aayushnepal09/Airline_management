package Aireline_management;

import javax.swing.*;
import java.awt.*;

public class about extends JFrame {

    public static void main(String[] args){

        new about().setVisible(true);
    }

    public about() {
        super("ABOUT");

        getContentPane().setBackground(Color.orange);
        getContentPane().setFont(new Font("arial", Font.PLAIN, 13));
        setSize(920, 523);
        setVisible(true);

        JLabel about = new JLabel("ABOUT");
        about.setFont(new Font("arial", Font.BOLD, 31));
        about.setForeground(Color.RED);
        about.setBounds(10, 20, 570, 35);
        add(about);

        JLabel info=new JLabel("This is just a sample of Airline management system i build for" +
                " my final assignment");
        info.setFont(new Font("arial", Font.PLAIN, 25));
        info.setForeground(Color.BLUE);
        info.setBounds(10, 5, 1000, 35);
        add(info);
    }

}
