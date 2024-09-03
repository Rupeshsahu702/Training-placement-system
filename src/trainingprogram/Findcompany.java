package trainingprogram;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Findcompany extends JFrame implements ActionListener{
    JTextField tften,tftwelve,tfgraduate,tfbacklog;
    JButton search,back;
    JTable table;
    Findcompany(){
        
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel find = new JLabel("FIND COMPANY");
        find.setBounds(350,10,300,50);
        find.setForeground(Color.blue);
        find.setFont(new Font("Tahoma",Font.BOLD,35));
        add(find);
        
        JLabel ten = new JLabel("Tenth percentage");
        ten.setBounds(50,70,150,20);
        add(ten);
        
        tften = new JTextField();
        tften.setBounds(220,70,70,20);
        add(tften);
        
        JLabel twelve = new JLabel("Twelvth percentage");
        twelve.setBounds(50,110,150,20);
        add(twelve);
        
        tftwelve = new JTextField();
        tftwelve.setBounds(220,110,70,20);
        add(tftwelve);
        
        JLabel graduate = new JLabel("Graduation percentage");
        graduate.setBounds(350,70,150,20);
        add(graduate);
        
        tfgraduate = new JTextField();
        tfgraduate.setBounds(500,70,70,20);
        add(tfgraduate);
        
         JLabel backlog = new JLabel("Total Backlog");
        backlog.setBounds(350,110,150,20);
        add(backlog);
        
        tfbacklog = new JTextField();
        tfbacklog.setBounds(500,110,70,20);
        add(tfbacklog);
        
        search = new JButton("Search");
        search.setBounds(450,160,100,20);
        search.setForeground(Color.white);
        search.setBackground(Color.BLACK);
        search.addActionListener(this);
        add(search);
        
         table = new JTable();
       table.setBounds(0,250,1000,400);
       add(table);
       
       try{
           Conn conn = new Conn();
           String query ="select * from company";
           ResultSet rs = conn.s.executeQuery(query);
           table.setModel(DbUtils.resultSetToTableModel(rs));
           
           
       }catch(Exception e){
           e.printStackTrace();
       }
      
        JLabel name = new JLabel("Name");
       name.setBounds(20,220,70,20);
       add(name);
       
        JLabel url = new JLabel("URL");
       url.setBounds(220,220,70,20);
       add(url);
       
        JLabel tenth = new JLabel("Tenth");
       tenth.setBounds(390,220,70,20);
       add(tenth);
       
        JLabel twelveth = new JLabel("Twelvth");
       twelveth.setBounds(540,220,70,20);
       add(twelveth);
       
        JLabel graduation = new JLabel("Graduation");
       graduation.setBounds(700,220,70,20);
       add(graduation);
       
        JLabel tbacklog = new JLabel("backlog");
       tbacklog.setBounds(850,220,70,20);
       add(tbacklog);
       
       
        back = new JButton("Back");
        back.setBounds(450,600,100,20);
        back.setForeground(Color.white);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        setBounds(250,150,1050,650);
        setVisible(true);
        

        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String a = tften.getText();
                String b = tftwelve.getText();
                String c = tfgraduate.getText();
                String d = tfbacklog.getText();
                
                String query = "select * from company where tenth >='"+a+"' and twelve >='"+b+"' and graduation >='"+c+"' and backlog >='"+d+"'";
                String query1 = "select * from company where twelve='"+b+"' and graduation='"+c+"' and backlog ='"+d+"'";
                String query2 ="select * from company where tenth ='"+a+"'  and graduation='"+c+"' and backlog ='"+d+"'";
                Conn conn = new Conn();
                ResultSet rs;
                rs = conn.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void  main(String[] args){
        new Findcompany();
    }
}
