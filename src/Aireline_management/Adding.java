
package Aireline_management;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adding extends JFrame{


    JTextField password, prn, nation, naame, phone, addre, flightcode;

    public Adding(){

        getContentPane().setBackground(new Color(252,162,0,255));
        setTitle("ADD CUSTOMER DETAILS");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/top-view-airplane-copy-space.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(470, 100, 500, 500);
        add(NewLabel);

        JLabel Passportno = new JLabel("PASSPORT NO");
        Passportno.setFont(new Font("arial", Font.PLAIN, 17));
        Passportno.setBounds(60, 80, 150, 27);
        add(Passportno);

        password = new JTextField();
        password.setBounds(200, 80, 150, 27);
        add(password);
        JButton Next = new JButton("SAVE");
        Next.setBounds(200, 420, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        add(Next);

        JLabel Pnrno = new JLabel("PNR NO");
        Pnrno.setFont(new Font("arial", Font.PLAIN, 17));
        Pnrno.setBounds(60, 120, 150, 27);
        add(Pnrno);

        prn = new JTextField();
        prn.setBounds(200, 120, 150, 27);
        add(prn);
        JLabel Address = new JLabel("ADDRESS");
        Address.setFont(new Font("arial", Font.PLAIN, 17));
        Address.setBounds(60, 170, 150, 27);
        add(Address);

        nation = new JTextField();
        nation.setBounds(200, 170, 150, 27);
        add(nation);

        JLabel Nationality = new JLabel("NATIONALITY");
        Nationality.setFont(new Font("arial", Font.PLAIN, 17));
        Nationality.setBounds(60, 220, 150, 27);
        add(Nationality);

        naame = new JTextField();
        naame.setBounds(200, 220, 150, 27);
        add(naame);

        JLabel Name = new JLabel("NAME");
        Name.setFont(new Font("arial", Font.PLAIN, 17));
        Name.setBounds(60, 270, 150, 27);
        add(Name);

        phone = new JTextField();
        phone.setBounds(200, 270, 150, 27);
        add(phone);

        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("arial", Font.PLAIN, 17));
        Gender.setBounds(60, 320, 150, 27);
        add(Gender);

        JRadioButton Male = new JRadioButton("MALE");
        Male.setBackground(Color.WHITE);
        Male.setBounds(200, 320, 70, 27);
        add(Male);

        JRadioButton Female = new JRadioButton("FEMALE");
        Female.setBackground(Color.WHITE);
        Female.setBounds(280, 320, 90, 27);
        add(Female);

        JLabel Phno = new JLabel("PH NO");
        Phno.setFont(new Font("arial", Font.PLAIN, 17));
        Phno.setBounds(60, 370, 150, 27);
        add(Phno);

        addre = new JTextField();
        addre.setBounds(200, 370, 150, 27);
        add(addre);

        setVisible(true);

        JLabel AddPassengers = new JLabel("ADD CUSTOMER DETAILS");
        AddPassengers.setForeground(Color.BLACK);
        AddPassengers.setFont(new Font("arial", Font.PLAIN, 31));
        AddPassengers.setBounds(420, 24, 442, 35);
        add(AddPassengers);


        JLabel Flightcode = new JLabel("FLIGHT CODE");
        Flightcode.setFont(new Font("arial", Font.PLAIN, 17));
        Flightcode.setBounds(60, 30, 150, 27);
        add(Flightcode);

        flightcode = new JTextField();
        flightcode.setBounds(200, 30, 150, 27);
        add(flightcode);





        Next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String passport_No = password.getText();
                String pnr_no = prn.getText();
                String address =  addre.getText();
                String nationality = nation.getText();
                String name = naame.getText();
                String fl_code = flightcode.getText();

                String gender = null;
                String ph_no = phone.getText();

                if(Male.isSelected()){
                    gender = "male";

                }else if(Female.isSelected()){
                    gender = "female";
                }

                try {
                    connect c = new connect();
                    String str = "INSERT INTO customer values( '"+pnr_no+"', '"+address+"', '"+nationality+"','"+name+"', '"+gender+"', '"+ph_no+"','"+passport_No+"', '"+fl_code+"')";

                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Customer Added");
                    setVisible(false);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        setSize(900,600);
        setVisible(true);
        setLocation(400,200);

    }

    public static void main(String[] args){
        new Adding();
    }
}