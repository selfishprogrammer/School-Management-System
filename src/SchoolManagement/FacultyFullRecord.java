package SchoolManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.Border;

import net.proteanit.sql.DbUtils;
class record3 extends JFrame implements ActionListener{
	JLabel l1;
	JTable table;
	JButton b1,b2;
	Container c;
	
	
	record3(){
		setTitle("SCHOOL MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		
		
		
		
		
		
		
		
		
		l1=new JLabel("SCHOOL MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.BLACK);
		Font font=new Font("Arial",Font.BOLD,40);	
		l1.setFont(font);
		c.add(l1);
		
		
		b1=new JButton("CLICK HERE");
		
		b1.setBounds(360,70,150,50);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		c.add(b1);
		
b2=new JButton("OK");
		
		b2.setBounds(0,512,890,50);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		c.add(b2);
		
		table=new JTable();
		table.setBounds(0,130,885,380);
		c.add(table);
		
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 table.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		 table.enable(false);

		 
		 
		JScrollPane sc=new JScrollPane(table);
		sc.setBounds(0,130,885,380);
		c.add(sc);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b2.setVisible(false);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
try {
	if(e.getSource()==b1) {
		DataBase db=new DataBase();
		
		String q="select * from faculty";
		ResultSet rs=db.s.executeQuery(q);
		table.setModel(DbUtils.resultSetToTableModel(rs));
		b2.setVisible(true);
		}
		else if (e.getSource()==b2) {
			new Menu().setVisible(true);
			setVisible(false);
		}
}catch(Exception e1) {
	
	e1.printStackTrace();
	
}
		
		
	}
}
public class FacultyFullRecord {

	public static void main(String[] args) {
		record3 rc=new record3();

	}

}
