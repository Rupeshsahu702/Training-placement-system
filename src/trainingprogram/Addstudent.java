
package trainingprogram;




import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javax.swing.JFrame;

public class Addstudent extends JFrame implements ActionListener {
    JTextField tfname,tfemail,tfphone,tfsalary,tfage,tfadhaar;
    JRadioButton rbmale,rbfemale;
    JButton submit;
    JComboBox cbjob;
    
    Addstudent(){
        setLayout(null);
        
        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(60, 30, 70,30);
        lblname.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 30, 200, 30);
        add(tfname);
        
        JLabel lblage = new JLabel("AGE");
        lblage.setBounds(60, 80, 70,30);
        lblage.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lblage);
        
        tfage = new JTextField();
        tfage.setBounds(200, 80, 200, 30);
        add(tfage);
        
        JLabel lblgender = new JLabel("GENDER");
        lblgender.setBounds(60, 130, 70,30);
        lblgender.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lblgender);
        
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(200, 130, 70, 30);
        rbmale.setFont(new Font("Tahoma",Font.PLAIN,15));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(290, 130, 100, 30);
        rbfemale.setFont(new Font("Tahoma",Font.PLAIN,15));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        ButtonGroup gender = new ButtonGroup();
        gender.add(rbmale);
        gender.add(rbfemale);
                
        JLabel lbljob = new JLabel("Section");
        lbljob.setBounds(60, 180, 70,30);
        lbljob.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lbljob);
        
        String str[]={"AI ML","Data science","cyber security","IOT","TCS","BDA","CSE core"};
        cbjob = new JComboBox(str);
        cbjob.setBounds(200, 180, 150, 30);
        cbjob.setFont(new Font("Tohoma",Font.PLAIN,14));
        cbjob.setBackground(Color.white);
        add(cbjob);
        
        
        
        JLabel lblphone = new JLabel("NUMBER");
        lblphone.setBounds(60, 280, 70,30);
        lblphone.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200, 280, 150, 30);
        add(tfphone);
        
        
        JLabel lblemail = new JLabel("E-MAIL");
        lblemail.setBounds(60, 330, 70,30);
        lblemail.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lblemail);
   
        tfemail = new JTextField();
        tfemail.setBounds(200, 330, 250, 30);
        add(tfemail);
        
        JLabel lbladhaar = new JLabel("Student id");
        lbladhaar.setBounds(60, 380, 100,30);
        lbladhaar.setFont(new Font("Tohoma",Font.PLAIN,17));
        add(lbladhaar);
   
        tfadhaar = new JTextField();
        tfadhaar.setBounds(200, 380, 250, 30);
        add(tfadhaar);
        
        submit = new JButton("SUBMIT");
        submit.setBounds(250,430,100,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
     
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350,200,850,540);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        String name = tfname.getText();
        String age = tfage.getText();
        String email = tfemail.getText();
        String phone = tfphone.getText();
        String adhaar = tfadhaar.getText();
        String gender = null;
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name should not be empty");
            return;
        }
        
        if(rbmale.isSelected()){
            gender="male";
        }else if(rbfemale.isSelected()){
            gender="female";
        }
        String job = (String) cbjob.getSelectedItem();
     
        try{
            Conn conn = new Conn();
            String query ="insert into student values ('"+name+"','"+ age +"','"+gender+"','"+job+"','"+phone+"','"+email+"','"+adhaar+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Student added successfully");
            setVisible(false);
        }catch(Exception e){
            System.out.println(e);    
        }
    }
    public static void main(String[] args){
        new Addstudent();
    }
}
