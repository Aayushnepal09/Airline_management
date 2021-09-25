package Aireline_management;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


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

        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(AirlineSystem);

        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
        AirlineSystem.add(FlightDetails);

        JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
        AirlineSystem.add(ReservationDetails);

        JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
        AirlineSystem.add(PassengerDetails);

        JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
        AirlineSystem.add(SectorDetails_1);

        JMenuItem Cancellation = new JMenuItem("CANCELLATION");
        AirlineSystem.add(Cancellation);

        JMenu Ticket = new JMenu("TICKET");
        Ticket.setForeground(Color.RED);
        menuBar.add(Ticket);

        JMenu List = new JMenu("LIST");
        List.setForeground(Color.BLUE);
        menuBar.add(List);

        JMenu Misc = new JMenu("MISC");
        Misc.setForeground(Color.RED);
        menuBar.add(Misc);

//        FlightDetails.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                new Flight_Info();
//            }
//        });
//
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
//        PassengerDetails.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Journey_Details();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
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
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent action){
                new cancel();
            }
       });

        setSize(1950,1090);
        setVisible(true);
    }
}
