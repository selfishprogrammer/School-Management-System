package SchoolManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class Front extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	
	JButton b1;
	Container c;
	
	Front(){
		
		setTitle("SCHOOL MANAGEMENT");
		setBounds(20,10,1500,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.WHITE);
		
		
		
		l1=new JLabel("SCHOOL MANAGEMENT SYSTEM");
		l1.setBounds(250,250,1100,50);
		l1.setForeground(Color.BLACK);
		Font font=new Font("Arial",Font.BOLD,60);	
		l1.setFont(font);
		l3=new JLabel("BY RAHUL JHA");
		l3.setBounds(550, 450, 900, 50);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("Arial",Font.BOLD,50));
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\School Management\\src\\icons\\back5.jpg");
		Image img=image.getImage().getScaledInstance(1500,800,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		
		l2=new JLabel(img1);
		l2.setBounds(0,0,1500,800);
		
		
		b1=new JButton("LOGIN");
		
		b1.setBounds(650,590,150,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		c.add(l1);
		c.add(l3);
		c.add(b1);
		c.add(l2);
		b1.addActionListener(this);
		
		setVisible(true);
		while(true){
			l1.setVisible(false);
			try {
				Thread.sleep(1000);
			}catch(Exception e1) {}
			l1.setVisible(true);
			try {
				Thread.sleep(1000);
			}catch(Exception e1) {}
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		new Login().setVisible(true);
		setVisible(false);
	}
}
public class FrontClass {

	public static void main(String[] args) {
		
Front front=new Front();
	}

}
