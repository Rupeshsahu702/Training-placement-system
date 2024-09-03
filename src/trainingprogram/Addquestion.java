
package trainingprogram;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

public class Addquestion extends JFrame implements ActionListener {
    JComboBox correctans;
    JButton add,cancel;
    JTextField tf1,tf2,tf3,tf4, tfquestion,tfquestionno;
    Addquestion(){
        setLayout(null);
        setBounds(300,100,1000,600);
        
        JLabel question = new JLabel("Question");
        question.setFont(new Font("Tahoma",Font.BOLD,14));
        question.setBounds(20, 20, 100, 20);
        add(question);
         
         tfquestion = new JTextField();
        tfquestion.setBounds(20, 60, 700, 40);
        add(tfquestion);
        
        JLabel option1 = new JLabel("Option 1");
        option1.setBounds(20, 120, 100, 20);
        add(option1);
        
         tf1 = new JTextField();
        tf1.setBounds(140,120,200,20);
        add(tf1);
        
        JLabel option2 = new JLabel("Option 2");
        option2.setBounds(20, 160, 100, 20);
        add(option2);
        
         tf2 = new JTextField();
        tf2.setBounds(140,160,200,20);
        add(tf2);
        
        JLabel option3 = new JLabel("Option 3");
        option3.setBounds(20, 200, 100, 20);
        add(option3);
        
       tf3 = new JTextField();
        tf3.setBounds(140,200,200,20);
        add(tf3);
        
        JLabel option4 = new JLabel("Option 4");
        option4.setBounds(20, 240, 100, 20);
        add(option4);
        
        tf4 = new JTextField();
        tf4.setBounds(140,240,200,20);
        add(tf4);
        
        JLabel correcta = new JLabel("Correct option");
        correcta.setBounds(40,300,100,20);
        add(correcta);
              
        String ans[] ={"Option 1","Option 2","Option 3","Option 4"};
        
        correctans = new JComboBox(ans);
        correctans.setBounds(160,300,100,20);
        add(correctans);
        
        JLabel questionno = new JLabel("Question no");
        questionno.setBounds(300,300,100,20);
        add(questionno);
        
        tfquestionno = new JTextField();
        tfquestionno.setBounds(430, 300, 100, 20);
        add(tfquestionno);
        
        add = new JButton("Add Question");
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
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String que = tfquestion.getText();
            String op1 = tf1.getText();
            String op2 =tf2.getText();
            String op3 =tf3.getText();
            String op4 = tf4.getText();
            String correct = (String) correctans.getSelectedItem();
            String queno= tfquestionno.getText();
            try{
                Conn c = new Conn();
                String query = "insert into questions values ('"+queno+"','"+que+"','"+op1+"','"+op2+"','"+op3+"','"+op4+"','"+correct+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Question added succesfully");
                setVisible(false);
                new Addquestion();
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==cancel){
            setVisible(false);
            
        }
    }
    
    public static void main(String[] args){
        new Addquestion();
    }
    
}
