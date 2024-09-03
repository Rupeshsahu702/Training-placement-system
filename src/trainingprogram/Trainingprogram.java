
package trainingprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Trainingprogram  extends JFrame implements ActionListener{
    JButton next,student;
 Trainingprogram(){
    setLayout(null);
    setBounds(100,100,1366,565);
      
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons//fourth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);
        image.setBounds(550,20,1000,550);
        add(image);
        
    JLabel text = new JLabel("TRAINING PROGRAM SYSTEM");
    text.setBounds(50, 150, 1200,90 );
    text.setForeground(Color.BLUE);
    text.setFont(new Font("serif",Font.BOLD,50));
    add(text);
    
       next = new JButton("Teacher login");
        next.setBounds(100,270,250,50);
         next.setBackground(Color.WHITE);
         next.setFont(new Font("serif",Font.BOLD,24));
         next.addActionListener(this);
        add(next);
        
       student = new JButton("Student login");
         student.setBounds(100,350,250,50);
         student.setBackground(Color.WHITE);
         student.setFont(new Font("serif",Font.BOLD,24));
         student.addActionListener(this);
        add(student);
    setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
             setVisible(false);
        new Login();
        }else if(ae.getSource()==student){
            setVisible(false);
            new Studentlogin();
        }
    }
    public static void main(String[] args) {
     new Trainingprogram();   
    }
    
}
