package Aireline_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Mainmenues extends JFrame {

    public static void main(String[] args) {
        new Mainmenues().setVisible(true);
    }

    public Mainmenues() {
        super("Potato Airline Reservation and Management System");
        initialize();
    }


    private void initialize() {

        setForeground(Color.CYAN);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Aireline_management/icon/background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1550, 1000);
        add(NewLabel);

        JLabel AirlineManagementSystem = new JLabel("Thank you for choosing Potato Airline");
        AirlineManagementSystem.setForeground(Color.RED);
        AirlineManagementSystem.setFont(new Font("arial", Font.PLAIN, 36));
        AirlineManagementSystem.setBounds(500, 60, 1000, 55);
        NewLabel.add(AirlineManagementSystem);


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu AirlineSystem = new JMenu("Management");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(AirlineSystem);

        JMenuItem FlightDetails = new JMenuItem("Flight Info");
        AirlineSystem.add(FlightDetails);

        JMenuItem ReservationDetails = new JMenuItem("Add Customer Details");
        AirlineSystem.add(ReservationDetails);

        JMenuItem PassengerDetails = new JMenuItem("Flight info");
        AirlineSystem.add(PassengerDetails);

        JMenuItem SectorDetails_1 = new JMenuItem("Payment Details");
        AirlineSystem.add(SectorDetails_1);

        JMenuItem Cancel = new JMenuItem("Cancel Flight");
        AirlineSystem.add(Cancel);



        JMenu about = new JMenu("About");
        about.setForeground(Color.RED);
        menuBar.add(about);


        FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent action){
                new flightInfo();
            }
        });

        about.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent action){
                new about();
            }
        });
//        ReservationDetails.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Add_Customer();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new journey();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//
//        SectorDetails_1.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Payment_Details();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
        Cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent action){
                new cancel();
            }
       });

        setSize(1950,1090);
        setVisible(true);
    }
}
