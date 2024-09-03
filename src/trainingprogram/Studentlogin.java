package trainingprogram;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Studentlogin extends JFrame implements ActionListener {
    JButton login,cancel;
    JTextField password,username;
    Studentlogin(){
        getContentPane().setBackground(Color.WHITE);
        setBounds(500,200,600,300);
        setLayout(null);
        JLabel user = new JLabel("User name");
        user.setBounds(40,20,100,20);
        add(user);
        
        username = new JTextField();
        username.setBounds(160, 20,150, 20);
        add(username);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(40,60,100,20);
        add(pass);
         
        password = new JTextField();
        password.setBounds(160, 60,150, 20);
        add(password);
        
        login = new JButton("Login");
        login.setBounds(60,100,70,20);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(170,100,100,20);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,30,200,200);
        add(image);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
          if(e.getSource()==login){
            String user = username.getText();
            String pass = password.getText();
            
            try{
                Conn c = new Conn();
                String query = "select * from studentlogin where user = '"+user+"' and  password = '"+pass+"'";
                ResultSet rs = c.s.executeQuery(query);
                
               if (rs.next()){
                   setVisible(false);
                  new Studentdashboard();
                   
               }else{
                   JOptionPane.showMessageDialog(null,"invalid username");
                   setVisible(false);
               }
            }catch (Exception ae){
                ae.printStackTrace();
            }
        }
        else if(e.getSource()==cancel){
        setVisible(false);
        }
    }
    public static void main(String[] args){
        new Studentlogin();
    }
}
