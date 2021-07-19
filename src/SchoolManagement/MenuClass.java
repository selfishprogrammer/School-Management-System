package SchoolManagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class Menu extends JFrame implements ActionListener{
private JMenuBar m1;
	
	private JMenu m2,m3,m4,m5,m6,m7,m8,m21;
	private JMenuItem m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m22,m23;
	
	JLabel l1,l2;
	
	JButton b1;
	Container c;
	
	Menu(){
		
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
		
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\School Management\\src\\icons\\back3.jpg");
		Image img=image.getImage().getScaledInstance(1500,800,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		
		l2=new JLabel(img1);
		l2.setBounds(0,0,1500,800);
		
		
		m1=new JMenuBar();
		m1.setBackground(Color.WHITE);
		m2= new JMenu("ENTRY");
		m3= new JMenu("RECORDS");
		m21=new JMenu("EDIT RECORD");
		m4= new JMenu("ADD ATTENDENCE");
		m5= new JMenu("ATTENDENCE RECORD");
		m6=new JMenu("ADD RESULT");
		m7=new JMenu("VIEW RESULT");
		m8=new JMenu("FEE STRUCTURE");
		
		
		
		
		
		m9=new JMenuItem("STUDENTS");
		m10=new JMenuItem("FACULTY");
		m15=new JMenuItem("STUDENTS");
		m16=new JMenuItem("FACULTY");
		m17=new JMenuItem("STUDENTS");
		m18=new JMenuItem("FACULTY");
		m11=new JMenuItem("STUDENTS");
		m22=new JMenuItem("FACULTY");
		m12=new JMenuItem("SECONDARY STUDENT");
		m23=new JMenuItem("HIGHER SECONDARY");
		m13=new JMenuItem("SECONDARY STUDENTS");
		
		m14=new JMenuItem("HIGHER SECONDARY");
		m19=new JMenuItem("STUDENTS");
		m20=new JMenuItem("FACULTY");
		
		
		
		m2.add(m9);
		m2.add(m10);
		m3.add(m15);
		m3.add(m16);
		m4.add(m17);
		m4.add(m18);
		m5.add(m11);
		m5.add(m22);
		m6.add(m13);
		m6.add(m14);
		m7.add(m12);
		m7.add(m23);
		m21.add(m19);
		m21.add(m20);
		
		

		
		
		m1.add(m2);
		m1.add(m3);

		m1.add(m21);
		m1.add(m4);
		m1.add(m5);
		m1.add(m6);
		m1.add(m7);
		m1.add(m8);
		
		
		setJMenuBar(m1);
		
		m9.addActionListener(this);
		m10.addActionListener(this);
		m11.addActionListener(this);
		m12.addActionListener(this);
		m13.addActionListener(this);
		m14.addActionListener(this);
		m15.addActionListener(this);
		m16.addActionListener(this);
		m17.addActionListener(this);
		m18.addActionListener(this);
		
		m19.addActionListener(this);
		m20.addActionListener(this);

		
	
		m22.addActionListener(this);
		m23.addActionListener(this);
		
		
		
		
		
		
		
		
		
		
		
		c.add(l1);
	c.add(l2);
		
		
		
		
	
		
		setVisible(true);
//		while(true){
//			l1.setVisible(false);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e1) {}
//			l1.setVisible(true);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e1) {}
//			
//		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==m9) {
			new Choose().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==m10) {
			new Faculty().setVisible(true);
			setVisible(false);
		}
		
		else if(e.getSource()==m19) {
			new Choose1().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==m20) {
			new facultyRe().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==m15) {
			new Choose3().setVisible(true);
			setVisible(false);
		}
		
		else if(e.getSource()==m16) {
			new record3().setVisible(true);
			setVisible(false);
		}
		
		else if(e.getSource()==m17) {
			new Choose4().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==m18) {
			new Attendence2().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==m11) {
			new Choose5().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==m22) {
			new record6().setVisible(true);
			setVisible(false);
		}
		
		else if(e.getSource()==m13) {
			new ResultX().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==m14) {
			new ResultXII().setVisible(true);
			setVisible(false);
		}

		
		else if(e.getSource()==m12) {
			new result().setVisible(true);
			setVisible(false);
		}
		else if(e.getSource()==m23) {
			new result2().setVisible(true);
			setVisible(false);
		}


		
		
	}
}
public class MenuClass {

	public static void main(String[] args) {
		Menu menu=new Menu();

	}

}
