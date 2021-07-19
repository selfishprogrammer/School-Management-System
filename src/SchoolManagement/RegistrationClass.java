package SchoolManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

class Reg extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5;
	JButton b1;
	JTextField t1,t2;
	JPasswordField p1;
	Container c;
	
	Reg(){
		setTitle("EMPLOYEE MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.GRAY);
		
		
		
		l1=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.RED);
		Font font=new Font("Arial",Font.ROMAN_BASELINE,40);	
		l1.setFont(font);
		c.add(l1);
		
		
		l2=new JLabel("REGISTRATION PAGE");
		l2.setBounds(250,70,900,50);
		l2.setForeground(Color.BLACK);
		
		l2.setFont(new Font("Arial",Font.ROMAN_BASELINE,40));
		c.add(l2);
		
		
		
		l4=new JLabel("EMAIL ID :");
		l4.setBounds(30,220,150,30);
		l4.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		c.add(l4);
		
		l4=new JLabel("PASSWORD :");
		l4.setBounds(30,380,180,30);
		l4.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		c.add(l4);
		
		l5=new JLabel("RE-PASS :");
		l5.setBounds(30,300,150,30);
		l5.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		c.add(l5);
		
		
		t1=new JTextField();
		t1.setBounds(200,220,600,30);
		
		t1.setFont(new Font("Arial",Font.ROMAN_BASELINE,15));
		c.add(t1);
		
		
		

		p1=new JPasswordField();
		p1.setBounds(200,300,600,30);
		
		p1.setFont(new Font("Arial",Font.ROMAN_BASELINE,15));
		c.add(p1);
		
		
		t2=new JTextField();
		t2.setBounds(200,380,600,30);
		
		t2.setFont(new Font("Arial",Font.ROMAN_BASELINE,15));
		c.add(t2);
		
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		t1.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));


		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		t2.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		p1.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		b1=new JButton("SIGN IN");
		
		b1.setBounds(750,450,120,30);
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.BLACK);
		
		c.add(b1);
		b1.addActionListener(this);
		setVisible(true);	
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			t1.getText();
			t2.getText();
			p1.getText();
			if(t2.getText().equals(p1.getText())) {
			DataBase db=new DataBase();
			String q="insert into login values('"+t1.getText()+"','"+p1.getText()+"')";
			String q1="insert into login values('"+t1.getText()+"','"+p1.getText()+"','"+t2.getText()+"')";
			db.s.executeUpdate(q);
			db.s.executeUpdate(q1);
			JOptionPane.showMessageDialog(null, "Your Accound Has Been Created");
			
			new Login().setVisible(true);
			setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null, "Password Didn't Matched");
			}
		}catch(Exception e1) {
			
		}
		
	}
}
public class RegistrationClass {

	public static void main(String[] args) {
		Reg reg=new Reg();

	}

}
