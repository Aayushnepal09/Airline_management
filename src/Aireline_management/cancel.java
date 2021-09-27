package Aireline_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class cancel extends JFrame {

    private JTextField textField, textField_1, textField_2, textField_3, textField_4;

    public static void main(String[] args) {
        new cancel();
    }

    public cancel() {
        initialize();
    }

    private void initialize() {
        setTitle("CANCELLATION");
        getContentPane().setBackground(new Color(23,64,89,255));
        setBounds(100, 100, 801, 472);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Aireline_management/icon/ticket.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(410, 0, 1000, 500);
        add(NewLabel);

        JLabel Cancellation = new JLabel("CANCELLATION");
        Cancellation.setFont(new Font("arial", Font.PLAIN, 31));
        Cancellation.setForeground(Color.white);
        Cancellation.setBounds(185, 24, 259, 38);
        add(Cancellation);




        JLabel PassengerNo = new JLabel("PASSENGER NO");
        PassengerNo.setFont(new Font("arial", Font.PLAIN, 17));
        PassengerNo.setBounds(60, 100, 132, 26);
        PassengerNo.setForeground(Color.white);
        add(PassengerNo);

        JLabel CancellationNo = new JLabel("CANCELLATION NO");
        CancellationNo.setFont(new Font("arial", Font.PLAIN, 17));
        CancellationNo.setForeground(Color.white);
        CancellationNo.setBounds(60, 150, 150, 27);
        add(CancellationNo);

        JLabel CancellationDate = new JLabel("CANCELLATION DATE");
        CancellationDate.setFont(new Font("arial", Font.PLAIN, 17));
        CancellationDate.setForeground(Color.white);
        CancellationDate.setBounds(60, 200, 180, 27);
        add(CancellationDate);

        JLabel Ticketid = new JLabel("TICKET_ID");
        Ticketid.setFont(new Font("arial", Font.PLAIN, 17));
        Ticketid.setForeground(Color.white);
        Ticketid.setBounds(60, 250, 150, 27);
        add(Ticketid);

        JLabel Flightcode = new JLabel("FLIGHT_CODE");
        Flightcode.setFont(new Font("arial", Font.PLAIN, 17));
        Flightcode.setForeground(Color.white);
        Flightcode.setBounds(60, 300, 150, 27);
        add(Flightcode);

        JButton Cancel = new JButton("CANCEL");
        Cancel.setFont(new Font("arial", Font.PLAIN, 14));
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setBounds(250, 350, 150, 30);
        add(Cancel);

        textField = new JTextField();
        textField.setBounds(250, 100, 150, 27);
        add(textField);

        textField_1 = new JTextField();
        textField_1.setBounds(250, 150, 150, 27);
        add(textField_1);

        textField_2 = new JTextField();
        textField_2.setBounds(250, 200, 150, 27);
        add(textField_2);

        textField_3 = new JTextField();
        textField_3.setBounds(250, 250, 150, 27);
        add(textField_3);

        textField_4 = new JTextField();
        textField_4.setBounds(250, 300, 150, 27);
        add(textField_4);

        Cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String passenger_no = textField.getText();
                String cancellation_no = textField_1.getText();
                String cancellation_date = textField_2.getText();
                String ticket_id = textField_3.getText();
                String flight_code = textField_4.getText();


//                try{
//                    conn c = new conn();
//                    String str = "INSERT INTO cancellation values('"+passenger_no+"', '"+cancellation_no+"', '"+cancellation_date+"', '"+ticket_id+"', '"+flight_code+"')";
//
//                    c.s.executeUpdate(str);
//                    JOptionPane.showMessageDialog(null,"Ticket Canceled");
//                    setVisible(false);
//
//                }catch (Exception e) {
//                    e.printStackTrace();
//                }
            }
        });

        setSize(860, 500);
        setVisible(true);
        setLocation(400, 200);
    }
}
