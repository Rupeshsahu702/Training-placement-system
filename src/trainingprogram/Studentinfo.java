

package trainingprogram;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.event.*;
public class Studentinfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;
    Studentinfo(){
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       
       JLabel roomno = new JLabel("Name");
       roomno.setBounds(10,10,100,20);
       add(roomno);
       
       JLabel available = new JLabel("Age");
       available.setBounds(150,10,100,20);
       add(available);
       
       JLabel status = new JLabel("Gender");
       status.setBounds(300,10,100,20);
       add(status);
       
       JLabel price = new JLabel("section");
       price.setBounds(450,10,100,20);
       add(price);
       

       
       JLabel phone = new JLabel("phone");
       phone.setBounds(600,10,100,20);
       add(phone);
       
       JLabel email= new JLabel("email");
       email.setBounds(750,10,100,20);
       add(email);
       
       JLabel adhar = new JLabel("student id");
       adhar.setBounds(870,10,100,20);
       add(adhar);
       back = new JButton("Back");
       back.setForeground(Color.white);
       back.setBackground(Color.black);
       back.setBounds(420,500,100,30);
       back.addActionListener(this);
       add(back);
       
       table = new JTable();
       table.setBounds(0,40,1000,400);
       add(table);
       
       try{
           Conn conn = new Conn();
           String query ="select * from student";
           ResultSet rs = conn.s.executeQuery(query);
           table.setModel(DbUtils.resultSetToTableModel(rs));
           
           
       }catch(Exception e){
           e.printStackTrace();
       }
       setBounds(300,200,1000,600);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new Dashboard();
        }
    }
    public static void main(String[] args){
     new Studentinfo();
}
}
