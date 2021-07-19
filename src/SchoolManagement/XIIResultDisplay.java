package SchoolManagement;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


class XIIRdisp extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l16,l15,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31;
	JButton b1,b2;
	Container c;
	XIIRdisp(){
		setTitle("STUDENT MANAGEMENT");
		setBounds(100,100,400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		
		b1=new JButton("CHECK");
		b1.setBounds(0,200,400,30);
		c.add(b1);
		
		l1=new JLabel("STUDENT MANAGEMENT SYSTEM");
		l1.setBounds(5,0,400,50);
		l1.setForeground(Color.BLACK);
		Font font=new Font("Arial",Font.BOLD,22);	
		l1.setFont(font);
		c.add(l1);
		
		l11=new JLabel("----------------------------------------------------------------------------------");
		l11.setBounds(0,20,400,50);
		l11.setForeground(Color.BLACK);
		l11.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l11);
		
		l2=new JLabel();
		l2.setBounds(5,50,400,50);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Arial",Font.BOLD,22));	
		
		c.add(l2);
		
		
		
		l10=new JLabel("----------------------------------------------------------------------------------");
		l10.setBounds(0,70,400,50);
		l10.setForeground(Color.BLACK);
		l10.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l10);
		
		
		
		l3=new JLabel("NAME :");
		l3.setBounds(5,100,150,50);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l3);
		
		
		l4=new JLabel();
		l4.setBounds(60,100,200,50);
		l4.setForeground(Color.BLACK);
		l4.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l4);
		
		
		
		l5=new JLabel("ROLL NO :");
		l5.setBounds(200,100,100,50);
		l5.setForeground(Color.BLACK);
		l5.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l5);
		
		l6=new JLabel();
		l6.setBounds(280,100,150,50);
		l6.setForeground(Color.BLACK);
		l6.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l6);
		
		
		l7=new JLabel("CLASS :");
		l7.setBounds(5,130,150,50);
		l7.setForeground(Color.BLACK);
		l7.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l7);
		
		l8=new JLabel();
		l8.setBounds(60,130,150,50);
		l8.setForeground(Color.BLACK);
		l8.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l8);
		
		
		l30=new JLabel("STREAM :");
		l30.setBounds(200,130,100,50);
		l30.setForeground(Color.BLACK);
		l30.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l30);
		
		l31=new JLabel();
		l31.setBounds(280,130,150,50);
		l31.setForeground(Color.BLACK);
		l31.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l31);
		
		l9=new JLabel("----------------------------------------------------------------------------------");
		l9.setBounds(0,150,400,50);
		l9.setForeground(Color.BLACK);
		l9.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l9);
		
		l18=new JLabel("----------------------------------------------------------------------------------");
		l18.setBounds(0,180,400,50);
		l18.setForeground(Color.BLACK);
		l18.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l18);
		
		
		l19=new JLabel("SUBJECT");
		l19.setBounds(10,165,400,50);
		l19.setForeground(Color.BLACK);
		l19.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l19);
		
		l12=new JLabel("ENGLISH :");
		l12.setBounds(10,200,400,50);
		l12.setForeground(Color.BLACK);
		l12.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l12);
		
		l13=new JLabel("HINDI :");
		l13.setBounds(10,240,400,50);
		l13.setForeground(Color.BLACK);
		l13.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l13);
		
		l14=new JLabel("MATH :");
		l14.setBounds(10,280,400,50);
		l14.setForeground(Color.BLACK);
		l14.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l14);
		
		
		l15=new JLabel("SCIENCE :");
		l15.setBounds(10,320,400,50);
		l15.setForeground(Color.BLACK);
		l15.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l15);
		
		l17=new JLabel("GEOGRAPHY :");
		l17.setBounds(10,360,400,50);
		l17.setForeground(Color.BLACK);
		l17.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l17);
		
		l16=new JLabel("HISTORY :");
		l16.setBounds(10,400,400,50);
		l16.setForeground(Color.BLACK);
		l16.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l16);
		
		
		l20=new JLabel("MARKS");
		l20.setBounds(310,165,400,50);
		l20.setForeground(Color.BLACK);
		l20.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l20);
		
		
		l21=new JLabel();
		l21.setBounds(310,200,400,50);
		l21.setForeground(Color.BLACK);
		l21.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l21);
		
		
		l22=new JLabel();
		l22.setBounds(310,240,400,50);
		l22.setForeground(Color.BLACK);
		l22.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l22);
		
		
		
		l23=new JLabel();
		l23.setBounds(310,280,400,50);
		l23.setForeground(Color.BLACK);
		l23.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l23);
		
		
		
		l24=new JLabel();
		l24.setBounds(310,320,400,50);
		l24.setForeground(Color.BLACK);
		l24.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l24);
		
		
		
		l25=new JLabel();
		l25.setBounds(310,360,400,50);
		l25.setForeground(Color.BLACK);
		l25.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l25);
		
		
		
		l26=new JLabel();
		l26.setBounds(310,400,400,50);
		l26.setForeground(Color.BLACK);
		l26.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l26);
		
		l27=new JLabel("----------------------------------------------------------------------------------");
		l27.setBounds(0,410,400,50);
		l27.setForeground(Color.BLACK);
		l27.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l27);
		
		
		l28=new JLabel("TOTAL");
		l28.setBounds(10,425,400,50);
		l28.setForeground(Color.BLACK);
		l28.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l28);
		
		l29=new JLabel();
		l29.setBounds(310,425,400,50);
		l29.setForeground(Color.BLACK);
		l29.setFont(new Font("Arial",Font.BOLD,15));	
		
		c.add(l29);
		
		l2.setVisible(false);
		l3.setVisible(false);
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
		l14.setVisible(false);
		l15.setVisible(false);
		l16.setVisible(false);
		l17.setVisible(false);
		l18.setVisible(false);
		l19.setVisible(false);
		l20.setVisible(false);
		l21.setVisible(false);
		l22.setVisible(false);
		l23.setVisible(false);
		l24.setVisible(false);
		l25.setVisible(false);
		l26.setVisible(false);
		l27.setVisible(false);
		l28.setVisible(false);
		l29.setVisible(false);
		l30.setVisible(false);
		l31.setVisible(false);
		
		b1.addActionListener(this);
		
		
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			DataBase db=new DataBase();
			
			String q="select * from xiiresult";
			ResultSet rs=db.s.executeQuery(q);
			
			if(rs.next()) {
				l4.setText(rs.getString("name"));
				l6.setText(rs.getString("sid"));
				l8.setText(rs.getString("class"));
				l2.setText(rs.getString("school"));
				l21.setText(rs.getString("english"));
				l22.setText(rs.getString("hindi"));
				l23.setText(rs.getString("math"));
				l24.setText(rs.getString("physics"));
				l25.setText(rs.getString("chemistry"));
				l26.setText(rs.getString("biology"));
				l31.setText(rs.getString("stream"));
				
				
				b1.setVisible(false);
				l2.setVisible(true);
				l3.setVisible(true);
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
				l14.setVisible(true);
				l15.setVisible(true);
				l16.setVisible(true);
				l17.setVisible(true);
				l18.setVisible(true);
				l19.setVisible(true);
				l20.setVisible(true);
				l21.setVisible(true);
				l22.setVisible(true);
				l23.setVisible(true);
				l24.setVisible(true);
				l25.setVisible(true);
				l26.setVisible(true);
				l27.setVisible(true);
				l28.setVisible(true);
				l29.setVisible(true);
				
				l30.setVisible(true);
				l31.setVisible(true);
				
				
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}
}

public class XIIResultDisplay {

	public static void main(String[] args) {
		new XIIRdisp();
	}

}
