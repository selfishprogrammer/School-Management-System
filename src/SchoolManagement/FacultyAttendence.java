package SchoolManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.ResultSet;

import javax.swing.*;




class Attendence2 extends JFrame implements ActionListener{

	
	Choice c1,c2,c3;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5;
	Container c;
	
	
	Attendence2(){
		
		setTitle("STUDENT MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);

		
		l1=new JLabel("STUDENT MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.RED);
		Font font=new Font("Arial",Font.BOLD,40);	
		l1.setFont(font);
		c.add(l1);
		
		l2=new JLabel("ADD ATTENDENCE");
		l2.setBounds(250,70,900,50);
		l2.setForeground(Color.RED);
		
		l2.setFont(new Font("Arial",Font.BOLD,40));
		c.add(l2);
		
		l3=new JLabel("ID NO OF FACULTY 	:");
		l3.setBounds(60,135,400,50);
		l3.setFont(new Font("Arial",Font.BOLD,30));
	
		c.add(l3);
		
		
		l4=new JLabel("FIRST HALF ATTENDENCE 	:");
		l4.setBounds(60,235,450,50);
		l4.setFont(new Font("Arial",Font.BOLD,30));
	
		c.add(l4);
		
		l3=new JLabel("SECOND HALF ATTENDENCE  	:");
		l3.setBounds(60,335,480,50);
		l3.setFont(new Font("Arial",Font.BOLD,30));
	
		c.add(l3);
		
		
		c1=new Choice();
		c1.setBounds(550,150,200,50);
		c2=new Choice();
		c2.setBounds(550,250,200,50);
		c3=new Choice();
		c3.setBounds(550,350,200,50);
		
		c1.setFont(new Font("Arial",Font.BOLD,15));
		c2.setFont(new Font("Arial",Font.BOLD,15));
		c3.setFont(new Font("Arial",Font.BOLD,15));
		c1.setBackground(Color.BLACK);
		c1.setForeground(Color.WHITE);
		c2.setBackground(Color.BLACK);
		c2.setForeground(Color.WHITE);
		c3.setBackground(Color.BLACK);
		c3.setForeground(Color.WHITE);
		c2.add("PRESENT");
		c2.add("ABSENT");
		c2.add("LEAVE");
	
		
		c3.add("PRESENT");
		c3.add("ABSENT");
		c3.add("LEAVE");
		
		
		b1=new JButton("SUBMIT");
		b1.setBounds(0,385,445,180);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		c.add(b1);
		
		b2=new JButton("CANCEL");
		b2.setBounds(445,385,445,180);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		c.add(b2);
		
		try {
			DataBase db=new DataBase();
			String S="select * from faculty";
			ResultSet rs=db.s.executeQuery(S);
			
			while(rs.next()) {
				c1.add(rs.getString("fid"));
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setVisible(true);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String d=new Date().toString();
		
		
		try {
			if(e.getSource()==b1) {
			
			DataBase db=new DataBase();
			String q="insert into facultyattendence  values('"+c1.getSelectedItem()+"','"+d+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"')";
			db.s.executeUpdate(q);
			JOptionPane.showMessageDialog(null, "Inserted");
			}
			
			
			else if(e.getSource()==b2) {
				
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
	
	
	
	
}
public class FacultyAttendence {

	public static void main(String[] args) {
Attendence2 at=new Attendence2();
	}

}
