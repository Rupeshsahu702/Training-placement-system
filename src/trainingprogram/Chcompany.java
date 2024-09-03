package trainingprogram;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.event.*;

public class Chcompany extends JFrame implements ActionListener {
        JTable table;
    JButton back;
  Chcompany(){
        
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
       JLabel company = new JLabel("COMPANY");
       company.setForeground(Color.BLUE);
       company.setFont(new Font("Tahoma",Font.BOLD,35));
       company.setBounds(350,10,250,50);
       add(company);
       
       JLabel name = new JLabel("Name");
       name.setBounds(20,70,70,20);
       add(name);
       
        JLabel url = new JLabel("URL");
       url.setBounds(220,70,70,20);
       add(url);
       
        JLabel tenth = new JLabel("Tenth");
       tenth.setBounds(390,70,70,20);
       add(tenth);
       
        JLabel twelve = new JLabel("Twelvth");
       twelve.setBounds(540,70,70,20);
       add(twelve);
       
        JLabel graduate = new JLabel("Graduation");
       graduate.setBounds(700,70,70,20);
       add(graduate);
       
        JLabel backlog = new JLabel("backlog");
       backlog.setBounds(850,70,70,20);
       add(backlog);
       
       table = new JTable();
       table.setBounds(0,90,1000,400);
       add(table);
       
       try{
           Conn conn = new Conn();
           String query ="select * from company";
           ResultSet rs = conn.s.executeQuery(query);
           table.setModel(DbUtils.resultSetToTableModel(rs));
           
           
       }catch(Exception e){
           e.printStackTrace();
       }
      
       back = new JButton("Back");
       back.setBounds(230,500,70,20);
       back.setForeground(Color.WHITE);
       back.setBackground(Color.black);
       back.addActionListener(this);
       add(back);
       
       setBounds(300,120,1000,600);
       setVisible(true);
       
      
  } 
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==back){
          setVisible(false);
          
      }
  }
  public static void main(String[] args){
      new Chcompany();
  }
}
