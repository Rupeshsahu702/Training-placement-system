
package trainingprogram;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

public class Test extends JFrame implements ActionListener {
    JComboBox correctans;
    JButton add,cancel,q1,q2,q3,q4,q5,q6,q7,q8,q9;
    JLabel tf1,tf2,tf3,tf4, tfquestion,serial,Final;
    Test(){
        setLayout(null);
        setBounds(300,100,1000,600);
        
        serial = new JLabel();
        serial.setBounds(160, 20, 20, 20);
        add(serial);
        
        JLabel question = new JLabel("Question");
        question.setFont(new Font("Tahoma",Font.BOLD,14));
        question.setBounds(20, 20, 100, 20);
        add(question);
         
         tfquestion = new JLabel();
        tfquestion.setBounds(20, 60, 700, 40);
        add(tfquestion);
        
        JLabel option1 = new JLabel("Option 1");
        option1.setBounds(20, 120, 100, 20);
        add(option1);
        
         tf1 = new JLabel();
        tf1.setBounds(140,120,200,20);
        add(tf1);
        
        JLabel option2 = new JLabel("Option 2");
        option2.setBounds(20, 160, 100, 20);
        add(option2);
        
         tf2 = new JLabel();
        tf2.setBounds(140,160,200,20);
        add(tf2);
        
        JLabel option3 = new JLabel("Option 3");
        option3.setBounds(20, 200, 100, 20);
        add(option3);
        
       tf3 = new JLabel();
        tf3.setBounds(140,200,200,20);
        add(tf3);
        
        JLabel option4 = new JLabel("Option 4");
        option4.setBounds(20, 240, 100, 20);
        add(option4);
        
        tf4 = new JLabel();
        tf4.setBounds(140,240,200,20);
        add(tf4);
        
        JLabel correcta = new JLabel("Correct option");
        correcta.setBounds(40,300,100,20);
        add(correcta);
              
        String ans[] ={"Option 1","Option 2","Option 3","Option 4"};
        
        correctans = new JComboBox(ans);
        correctans.setBounds(160,300,100,20);
        add(correctans);
        
        
        
        add = new JButton("Submit");
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.setBounds(60, 400, 150, 30);
        add.addActionListener(this);
        add(add);
       
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.black);
        cancel.setBounds(250, 400, 150, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        q1 = new JButton("1");
        q1.setBounds(60,350,50,20);
        q1.addActionListener(this);
        add(q1);
        
        q2 = new JButton("2");
        q2.setBounds(130,350,50,20);
        q2.addActionListener(this);
        add(q2);
        
        q3 = new JButton("3");
        q3.setBounds(200,350,50,20);
        q3.addActionListener(this);
        add(q3);
        
        q4 = new JButton("4");
        q4.setBounds(270,350,50,20);
        q4.addActionListener(this);
        add(q4);
        
        q5 = new JButton("5");
        q5.setBounds(340,350,50,20);
        q5.addActionListener(this);
        add(q5);
        
        q6 = new JButton("6");
        q6.setBounds(410,350,50,20);
        q6.addActionListener(this);
        add(q6);
        
        q7 = new JButton("7");
        q7.setBounds(480,350,50,20);
        q7.addActionListener(this);
        add(q7);
        
        q8 = new JButton("8");
        q8.setBounds(550,350,50,20);
        q8.addActionListener(this);
        add(q8);
        
        q9 = new JButton("9");
        q9.setBounds(620,350,50,20);
        q9.addActionListener(this);
        add(q9);
        
        Final = new JLabel();
        Final.setBounds(400,450,250,30);
        Final.setForeground(Color.GREEN);
        Final.setFont(new Font("Tahoma",Font.BOLD,20));
        add(Final);
        
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==q1){
            try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '1'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==q2){
              try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '2'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==q3){
              try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '3'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==q4){
              try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '4'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==q5){
              try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '5'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==q6){
              try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '6'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==q7){
              try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '7'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==q8){
              try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '8'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==q9){
              try{
                Conn conn = new Conn();
                String select = "select * from questions where serial = '9'";
                ResultSet rs = conn.s.executeQuery(select);
                while(rs.next()){
                
                    tfquestion.setText(rs.getString("question"));
                tf1.setText(rs.getString("option1"));
                tf2.setText(rs.getString("option2"));
                tf3.setText(rs.getString("option3"));
                tf4.setText(rs.getString("option4"));
                serial.setText(rs.getString("serial"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==add){
             String ans = (String)correctans.getSelectedItem();
             String sahi = serial.getText();
            try{
                Conn conn = new Conn();
               String query = "Select* from questions where serial = '"+ sahi +"' and answer = '"+ans +"'";
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    Final.setText("Correct ans");
                }
                else{
                    Final.setText("Wrong ans");
                     Final.setForeground(Color.red);
                     Final.setFont(new Font("Tahoma",Font.BOLD,20));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
      
    }
    
    public static void main(String[] args){
        new Test();
    }
    
}
