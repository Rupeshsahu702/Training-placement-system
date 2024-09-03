
package trainingprogram;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Addcompany extends JFrame implements ActionListener {
    JTextField tfname,tfurl,tftenth,tftwelve,tfgraduation,tfbacklog;
    JButton add;
    Addcompany(){
          setLayout(null);
          
          JLabel heading = new JLabel("ADD COMPANY" );
          heading.setBounds(300,10,300,50);
          heading.setFont(new Font("Tahoma",Font.BOLD,35));
          heading.setForeground(Color.BLUE);
          add(heading);
          
          JLabel name = new JLabel("Company name");
         name.setBounds(30, 70, 150,30);
       name.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(200, 70, 200, 30);
        add(tfname);
        
          JLabel lurl = new JLabel("Company URL");
         lurl.setBounds(30, 120, 150,30);
       lurl.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lurl);
        
        tfurl = new JTextField();
        tfurl.setBounds(200, 120, 250, 30);
        add(tfurl);  
        
        JLabel tenth = new JLabel("10th Percentage");
        tenth.setBounds(30, 170, 150,30);
        tenth.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(tenth);
        
        tftenth = new JTextField();
        tftenth.setBounds(200, 170, 100, 30);
        add(tftenth);
        
         JLabel twelveth = new JLabel("12th Percentage");
        twelveth.setBounds(30, 220, 150,30);
        twelveth.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(twelveth);
        
        tftwelve = new JTextField();
        tftwelve.setBounds(200, 220, 100, 30);
        add(tftwelve);
          
         JLabel graduation = new JLabel("Graduation percentage");
        graduation.setBounds(30, 270, 200,30);
        graduation.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(graduation);
        
        tfgraduation = new JTextField();
        tfgraduation.setBounds(250, 270, 100, 30);
        add(tfgraduation);
        
         JLabel lbacklog = new JLabel("Total backlog");
        lbacklog.setBounds(30, 320, 150,30);
        lbacklog.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lbacklog);
        
        tfbacklog = new JTextField();
        tfbacklog.setBounds(200, 320, 100, 30);
        add(tfbacklog);
        
        add = new JButton("Add Company");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.black);
        add.setBounds(60,400,150,30);
        add.addActionListener(this);
        add(add);
        
        
        
       getContentPane().setBackground(Color.WHITE);
        setBounds(350,200,850,540);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
        String name = tfname.getText();
        String url = tfurl.getText();
        String ten = tftenth.getText();
        String twelve = tftwelve.getText();
        String grauduate =tfgraduation.getText();
        String backlog = tfbacklog.getText();
        try{
            Conn c = new Conn();
            String query ="insert into company values('"+name+"','"+url+"','"+ten+"','"+twelve+"','"+grauduate+"','"+backlog+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Company added successfully");
            setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
    public static void main(String[] args){
        new Addcompany();
    }
  
}
