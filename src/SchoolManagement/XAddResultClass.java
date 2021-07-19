package SchoolManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


class ResultX extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JButton b1,b2,b3,b4;
	
	Container c;
ResultX(){	
	setTitle("STUDENT MANAGEMENT");
	setBounds(100,100,900,600);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	c=getContentPane();
	c.setLayout(null);
	
	c.setBackground(Color.WHITE);
	
	
	l14=new JLabel("STUDENT ID :");
	l14.setBounds(100,200,300,50);
	l14.setFont(new Font("Arial",Font.BOLD,40));
	c.add(l14);
	t11=new JTextField();
	t11.setBounds(370,200,200,50);
	t11.setFont(new Font("Arial",Font.BOLD,15));
	c.add(t11);
	
	b3=new JButton("CLICK");
	b3.setBounds(600,200,200,50);
	b3.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(b3);
	
	
	
	l1=new JLabel("STUDENT MANAGEMENT SYSTEM");
	l1.setBounds(100,10,900,50);
	l1.setForeground(Color.BLACK);
	Font font=new Font("Arial",Font.BOLD,40);	
	l1.setFont(font);
	c.add(l1);
	
	
	l2=new JLabel("RESULT OF STUDENTS");
	l2.setBounds(210,70,900,50);
	l2.setForeground(Color.BLACK);
	
	l2.setFont(new Font("Arial",Font.BOLD,40));
	c.add(l2);
	
	l4=new JLabel("NAME :");
	l5=new JLabel("ROLL NO :");
	l6=new JLabel("CLASS :");
	l7=new JLabel("SCHOOL NAME :");
	l8=new JLabel("ENGLISH :");
	l9=new JLabel("HINDI :");
	l10=new JLabel("MATH :");
	l11=new JLabel("SCIENCE :");
	l12=new JLabel("GEOGRAPHY :");
	l13=new JLabel("HISTORY :");
	
	
	
	
	
	l4.setBounds(10,130,150,30);
	l4.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l4);
	
	l5.setBounds(280,130,150,30);
	l5.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l5);
	
	
	l6.setBounds(600,130,150,30);
	l6.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l6);
	
	l7.setBounds(10,230,250,30);
	l7.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l7);
	
	l8.setBounds(10,280,150,30);
	l8.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l8);
	
	
	l9.setBounds(10,330,150,30);
	l9.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l9);

	
	l10.setBounds(10,380,150,30);
	l10.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l10);
	
	l11.setBounds(10,430,150,30);
	l11.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l11);
	
	
	l12.setBounds(10,480,150,30);
	l12.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l12);
	
	
	l13.setBounds(10,530,150,30);
	l13.setFont(new Font("Arial",Font.BOLD,20));
	c.add(l13);
	
	
	
	
	
	
	
	t1=new JTextField();
	t1.setBounds(80,130,200,30);
	t1.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t1);
	
	
	t2=new JTextField();
	t2.setBounds(390,130,200,30);
	t2.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t2);
	
	
	t3=new JTextField();
	t3.setBounds(680,130,200,30);
	t3.setFont(new Font("Arial",Font.BOLD,15));
	c.add(t3);
	
	t4=new JTextField();
	t4.setBounds(170,230,710,30);
	t4.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t4);
	
	
	t5=new JTextField();
	t5.setBounds(170,280,200,30);
	t5.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t5);
	
	
	t6=new JTextField();
	t6.setBounds(170,330,200,30);
	t6.setFont(new Font("Arial",Font.BOLD,15));
	c.add(t6);
	
	t7=new JTextField();
	t7.setBounds(170,380,200,30);
	t7.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t7);
	
	
	t8=new JTextField();
	t8.setBounds(170,430,200,30);
	t8.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t8);
	
	
	t9=new JTextField();
	t9.setBounds(170,480,200,30);
	t9.setFont(new Font("Arial",Font.BOLD,15));
	c.add(t9);
	
	t10=new JTextField();
	t10.setBounds(170,530,200,30);
	t10.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t10);
	
	

	
	
	
	b1=new JButton("SUBMIT");
	b1.setBounds(380,530,200,30);
	b1.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(b1);
	
	
	b2=new JButton("PRINT");
	b2.setBounds(685,530,200,30);
	b2.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(b2);
	
	l4.setVisible(false);
	l5.setVisible(false);
	l6.setVisible(false);
	l7.setVisible(false);
	l8.setVisible(false);
	l9.setVisible(false);
	l10.setVisible(false);
	l11.setVisible(false);
	l12.setVisible(false);
	l13.setVisible(false);
	
	
	t1.setVisible(false);
	t2.setVisible(false);
	t3.setVisible(false);
	t4.setVisible(false);
	t5.setVisible(false);
	t6.setVisible(false);
	t7.setVisible(false);
	t8.setVisible(false);
	t9.setVisible(false);
	t10.setVisible(false);
	
	
	b1.setVisible(false);
	b2.setVisible(false);
	
	b3.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	setVisible (true);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
//	int a=Integer.parseInt(t5.getText()+t6.getText()+t7.getText()+t8.getText()+t9.getText()+t10.getText()) ;
	
	
	try {
		DataBase db=new DataBase();
		if(e.getSource()==b3) {
			
			String q="select sname,sid,class from student1 where sid='"+t11.getText()+"'";
			ResultSet rs=db.s.executeQuery(q);
			
			
			if(rs.next()) {
				t1.setText(rs.getString("sname"));
				t2.setText(rs.getString("sid"));
				t3.setText(rs.getString("class"));
				
				
				t1.setEditable(false);
				t2.setEditable(false);
				t3.setEditable(false);
				
				
				l4.setVisible(true);
				l5.setVisible(true);
				l6.setVisible(true);
				l7.setVisible(true);
				l8.setVisible(true);
				l9.setVisible(true);
				l10.setVisible(true);
				l11.setVisible(true);
				l12.setVisible(true);
				l13.setVisible(true);
				
				
				t1.setVisible(true);
				t2.setVisible(true);
				t3.setVisible(true);
				t4.setVisible(true);
				t5.setVisible(true);
				t6.setVisible(true);
				t7.setVisible(true);
				t8.setVisible(true);
				t9.setVisible(true);
				t10.setVisible(true);
				
				
				b1.setVisible(true);
				b2.setVisible(true);
				
l14.setVisible(false);
				
				
				t11.setVisible(false);
				b3.setVisible(false);
				
			}
			
			
			else {
				JOptionPane.showMessageDialog(null, "Something went Wrong");
			}
			
		}
		
		else if(e.getSource()==b1) {
			
			String q1="insert into xresult values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"','"+t10.getText()+"')";
			db.s.executeUpdate(q1);
			
			JOptionPane.showMessageDialog(null, "Result has Been Inserted");
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");	
			
			t10.setText("");
		}
		
		else if(e.getSource()==b2) {
			
			new Rdisp().setVisible(true);
			setVisible(false);
			
		}
		
		
	}catch(Exception e1) {
		e1.printStackTrace();
	}
	
}
	
}



public class XAddResultClass {

	public static void main(String[] args) {
		ResultX rs=new ResultX();

	}

}
