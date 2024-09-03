/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainingprogram;






import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard  extends JFrame implements ActionListener{
   
    Dashboard(){
        setBounds(300,150,1000,600);
        setLayout(null);

        ImageIcon i1 = new ImageIcon( ClassLoader.getSystemResource("icons//third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);
        image.setBounds(0,10,1000,550);
        add(image);
        
        
        JLabel text = new JLabel("THE TRAINING GROUPS WELCOMES YOU");
        text.setBounds(40,80,1000,50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma",Font.PLAIN,46));
        image.add(text);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1000,30);
        image.add(mb);
        
        JMenu hotel = new JMenu("TRAINING MANAGEMNET");
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("STUDENT INFO");
        reception.addActionListener(this);
        hotel.add(reception);
        
        JMenuItem chcompany = new JMenuItem("CHECK COMPANY");
        chcompany.addActionListener(this);
        hotel.add(chcompany);
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.blue);
        mb.add(admin);
        
        JMenuItem employee = new JMenuItem("ADD STUDENT");
        employee.addActionListener(this);
        admin.add(employee);
        
        JMenuItem DRIVER = new JMenuItem("ADD QUESTION");
        DRIVER.addActionListener(this);
        admin.add(DRIVER);
        
        JMenuItem company = new JMenuItem("ADD COMPANY");
        company.addActionListener(this);
        admin.add(company);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("ADD STUDENT")){
        new Addstudent();
    }else if(ae.getActionCommand().equals("ADD QUESTION")){
        new Addquestion();
    }else if(ae.getActionCommand().equals("STUDENT INFO")){
        new Studentinfo();
    }else if(ae.getActionCommand().equals("ADD COMPANY")){
        new Addcompany();
    }  else if(ae.getActionCommand().equals("CHECK COMPANY")){
        new Chcompany();
    }
    }
    public static void main(String[] args){
        new Dashboard();
        
    }
    
}
