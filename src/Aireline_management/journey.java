
package Aireline_management;

import javax.swing.*;
import java.awt.*;
//import net.protean.sql.DbUtils;

public class journey extends JFrame{  //Forth

    JTable table;
    JLabel Ticket_info, id, Ticket_NO,Fcode,Jnydate,Jnytime,Source,Destination,label,label1;
    JButton Search;

    public static void main(String[] args){
        new journey();
    }

    public journey(){

        setTitle("Ticket Info");
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        Source = new JLabel("From");
        Source.setFont(new Font("arial", Font.PLAIN, 19));
        Source.setBounds(60, 100, 150, 27);
        add(Source);

        Destination = new JLabel("To");
        Destination.setFont(new Font("arial", Font.PLAIN, 19));
        Destination.setBounds(350, 100, 150, 27);
        add(Destination);



        Search = new JButton("Search");
        Search.setBounds(680, 100, 100, 30);
        add(Search);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        Ticket_info = new JLabel("Ticket info");
        Ticket_info.setForeground(Color.BLUE);
        Ticket_info.setFont(new Font("arial", Font.PLAIN, 31));
        Ticket_info.setBounds(290, 27, 359, 31);
        add(Ticket_info);

        id = new JLabel("SN");
        id.setFont(new Font("arial", Font.PLAIN, 13));
        id.setBounds(79, 270, 83, 20);
        add(id);

        Ticket_NO = new JLabel("TICKET No");
        Ticket_NO.setFont(new Font("arial", Font.PLAIN, 13));
        Ticket_NO.setBounds(172, 270, 71, 20);
        add(Ticket_NO);

        Fcode = new JLabel("Boarding time");
        Fcode.setFont(new Font("arial", Font.PLAIN, 13));
        Fcode.setBounds(297, 270, 103, 20);
        add(Fcode);

        Jnydate = new JLabel("DATE");
        Jnydate.setFont(new Font("arial", Font.PLAIN, 13));
        Jnydate.setBounds(390, 270, 94, 20);
        add(Jnydate);

        Jnytime = new JLabel("Arrival TIME");
        Jnytime.setFont(new Font("arial", Font.PLAIN, 13));
        Jnytime.setBounds(494, 270, 83, 20);
        add(Jnytime);

        Source = new JLabel("From");
        Source.setFont(new Font("arial", Font.PLAIN, 13));
        Source.setBounds(613, 270, 94, 20);
        add(Source);

        Destination = new JLabel("To");
        Destination.setFont(new Font("arial", Font.PLAIN, 13));
        Destination.setBounds(717, 270, 94, 20);
        add(Destination);

        String[] items1 =  {"Kathmandu", "Biratnagar", "Dhangadhi", "Pokhara","Janakpur","Jomsom"};
        JComboBox<String> comboBox = new JComboBox<>(items1);
        comboBox.setBounds(150, 100, 150, 27);
        add(comboBox);


        String[] items2 =  {"Kathmandu", "Biratnagar", "Dhangadhi", "Pokhara","Janakpur","Jomsom"};
        JComboBox<String> comboBox_1 = new JComboBox<>(items2);
        comboBox_1.setBounds(500, 100, 150, 27);
        add(comboBox_1);

        table = new JTable();
        table.setBounds(38, 310, 770, 130);
        add(table);



 //       Show.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try{
//                    String src  = (String) comboBox.getSelectedItem();
//                    String dst  = (String) comboBox_1.getSelectedItem();
//
//                    conn c = new conn();
//
//                    String str = "select pnr_no,ticket_id,f_code,jny_date,jny_time,src,dst from reservation where src = '"+src+"' and dst = '"+dst+"'";
//                    ResultSet rs=c.s.executeQuery(str);
//
//                    if(rs.next()){
//                        table.setModel(DbUtils.resultSetToTableModel(rs));
//                    }else{
//                        JOptionPane.showMessageDialog(null,"No Flights between Source and Destination");
//
//                    }
//
//
//                }catch(Exception e){}
//            }
//        });

        setSize(860,600);
        setLocation(400,200);
        setVisible(true);

    }
}