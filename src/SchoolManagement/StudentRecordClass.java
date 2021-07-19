package SchoolManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.Border;

import net.proteanit.sql.DbUtils;

class student extends JFrame implements ActionListener{
	JTable table;
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3;
	
	JTextField t1;
	Container c;
	
	student(){
		
		setTitle("SCHOOL MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		
		
		
		
		
		
		
		
		l1=new JLabel("SCHOOL MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.BLACK);
		Font font=new Font("Arial",Font.BOLD,40);	
		l1.setFont(font);
		c.add(l1);
		
		
		l2=new JLabel("STUDENT ID:");
		l2.setBounds(50,60,900,50);
		l2.setForeground(Color.BLACK);
		
		l2.setFont(new Font("Arial",Font.BOLD,30));
		c.add(l2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		t1=new JTextField();
		t1.setBounds(280,60,300,50);
		t1.setFont(new Font("Arial",Font.BOLD,20));
		
		b1=new JButton("CHECK");
		b1.setBounds(600,60,200,50);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		c.add(b1);
		
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		c.add(t1);
		

		
		table=new JTable();
		table.setBounds(0,140,900,390);
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 table.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		c.add(table);
		
		table.setEnabled(false);
		
		JScrollPane jp=new JScrollPane(table);
		jp.setBounds(0,140,900,390);
		c.add(jp);
		
		b2=new JButton("DELETE");
		b2.setBounds(0,530,300,32);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		c.add(b2);
		
		
		b4=new JButton("UPDATE");
		b4.setBounds(300,530,300,32);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		c.add(b4);
		
		b3=new JButton("CANCEL");
		b3.setBounds(600,530,300,32);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		c.add(b3);
		
		
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\OneDrive\\Desktop\\icons\\back4.jpg");
		Image img=image.getImage().getScaledInstance(1000,700,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		l3=new JLabel(img1);
		l3.setBounds(0,0,900,600);
	
		
		
		c.add(l3);
		b1.addActionListener(this);
		
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		b2.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
		setVisible(true);
		

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			DataBase db=new DataBase();
			if(e.getSource()==b1) {
			String q="select sname,email,dob,fname,gender,address,sid,class,adhar,phone from student1 where sid='"+t1.getText()+"'";
			ResultSet rs=db.s.executeQuery(q);
			
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				
				t1.setText("");
				b2.setVisible(true);
				b3.setVisible(true);
				b4.setVisible(true);
			}
			
			
			else if(e.getSource()==b2) {
				
				String q1="delete from student1 where sid='"+t1.getText()+"' ";
				db.s.executeUpdate(q1);
				
				JOptionPane.showMessageDialog(null, "Student Having a Id "+t1.getText()+" has been Deleted.");
				
				t1.setText("");
	
			}
			
			
			else if(e.getSource()==b3) {
				
				new Choose1().setVisible(true);
				setVisible(false);
				
			}
			else if(e.getSource()==b4){
				new Update1().setVisible(true);
				setVisible(false);
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
		
	}
	
}
public class StudentRecordClass {

	public static void main(String[] args) {
		student st=new student();

	}

}
