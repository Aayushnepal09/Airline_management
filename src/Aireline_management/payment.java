package Aireline_management;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class payment extends JFrame{

    JTextField textField;
    JTable table;
    JLabel Sector;
    JLabel FlightCode, Capacity, Classcode, Classname, label;

    public static void main(String[] args) {
        new payment();
    }

    public payment(){
        initialize();
    }

    private void initialize(){
        setTitle("PAYMENT_DETAILS");
        getContentPane().setBackground(Color.WHITE);
        setSize(860,486);
        setLayout(null);

        JLabel Fcode = new JLabel("PNR NO");
        Fcode.setFont(new Font("arial", Font.BOLD, 17));
        Fcode.setBounds(60, 160, 150, 26);
        add(Fcode);

        textField = new JTextField();
        textField.setBounds(200, 160, 150, 26);
        add(textField);

        table = new JTable();
        table.setBounds(45, 329, 766, 87);
        add(table);

        JButton Show = new JButton("SHOW");
        Show.setFont(new Font("arial", Font.BOLD, 17));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
        Show.setBounds(200, 210, 150, 26);
        add(Show);

        Sector = new JLabel("PAYMENT DETAILS");
        Sector.setForeground(Color.black);
        Sector.setFont(new Font("arial", Font.BOLD, 31));
        Sector.setBounds(51, 17, 300, 39);
        add(Sector);

        FlightCode = new JLabel("PNR_NO");
        FlightCode.setFont(new Font("arial", Font.BOLD, 13));
        FlightCode.setForeground(Color.black);
        FlightCode.setBounds(84, 292, 108, 26);
        add(FlightCode);

        Capacity = new JLabel("PAID_AMOUNT");
        Capacity.setFont(new Font("arial", Font.BOLD, 13));
        Capacity.setForeground(Color.black);
        Capacity.setBounds(183, 298, 92, 14);
        add(Capacity);

        Classcode = new JLabel("PAY_DATE");
        Classcode.setFont(new Font("arial", Font.BOLD, 13));
        Classcode.setForeground(Color.black);
        Classcode.setBounds(322, 294, 101, 24);
        add(Classcode);

        Classname = new JLabel("CHEQUE_NO");
        Classname.setFont(new Font("arial", Font.BOLD, 13));
        Classname.setForeground(Color.black);
        Classname.setBounds(455, 298, 114, 14);
        add(Classname);

        JLabel Cardno = new JLabel("CARD NO");
        Cardno.setFont(new Font("arial", Font.BOLD, 13));
        Cardno.setBounds(602, 299, 101, 19);
        add(Cardno);

        JLabel Phoneno = new JLabel("PHONE_NO");
        Phoneno.setFont(new Font("arial", Font.BOLD, 13));
        Phoneno.setBounds(712, 294, 86, 24);
        add(Phoneno);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1550, 1000);
        add(NewLabel);

        setVisible(true);

        Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

               try {
                    String code  = textField.getText();

                    connect c = new connect();
                    String str = "select prrn,paidamount,paiddate,cheq,card,phon from payment where prrn = '"+code+"'";

                    ResultSet rs = c.s.executeQuery(str);

                    table.setModel(DbUtils.resultSetToTableModel(rs));

                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        );

        setSize(960,590);
        setLocation(400,200);
        setVisible(true);

    }
}
