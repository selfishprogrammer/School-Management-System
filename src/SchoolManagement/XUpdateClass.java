package SchoolManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

class Update1 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JButton b1,b2,b3;
	Container c;
	

	Update1(){
		
		setTitle("STUDENT MANAGEMENT");
		setBounds(100,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		
		l15=new JLabel ("RE:ENTER ID:");
l15.setBounds(250,110,900,50);
		
		l15.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l15);
		t11=new JTextField();
		t11.setBounds(420,120,150,30);
		t11.setFont(new Font("Arial",Font.BOLD,15));
		
		c.add(t11);
		
		
		b3=new JButton("CHECK");
		b3.setBounds(580,120,100,30);
		c.add(b3);
		
		
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		l1=new JLabel("STUDENT MANAGEMENT SYSTEM");
		l1.setBounds(100,10,900,50);
		l1.setForeground(Color.BLACK);
		Font font=new Font("Arial",Font.BOLD,40);	
		l1.setFont(font);
		c.add(l1);
		
		
		l2=new JLabel("ADD NEW STUDENT");
		l2.setBounds(250,70,900,50);
		l2.setForeground(Color.BLACK);
		
		l2.setFont(new Font("Arial",Font.BOLD,40));
		c.add(l2);
		
		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\OneDrive\\Desktop\\icons\\back2.jpg");
		Image img=image.getImage().getScaledInstance(1200,700,  Image.SCALE_DEFAULT);
		ImageIcon img1=new ImageIcon(img); 
		l3=new JLabel(img1);
		l3.setBounds(0,0,900,600);
			l4=new JLabel("NAME :");
		l5=new JLabel("EMAIL ID :");
		l6=new JLabel("S/O :");
		l7=new JLabel("DATE OF BIRTH :");
		l8=new JLabel("GENDER :");
		l9=new JLabel("ADDRESS :");
		l10=new JLabel("STUDENT ID :");
		l11=new JLabel("CLASS 1 TO 10 :");
		l12=new JLabel("AADHAR CARD :");
		l13=new JLabel("PHONE:");
		
		
		
		
		l4.setBounds(20,150,130,30);
		
		l4.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l4);
		Random random=new Random();
		long card3=(random.nextLong() % 9000000L)+ 1000L;
		long card4=Math.abs(card3);	
		
l5.setBounds(20,190,130,30);
		
		l5.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l5);
		
		
l6.setBounds(20,230,130,30);
		
		l6.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l6);
		
		
l7.setBounds(20,270,180,30);
		
		l7.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l7);
		
		
l8.setBounds(20,310,130,30);
		
		l8.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l8);
		
		
l9.setBounds(490,150,130,30);
		
		l9.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l9);
		
		
l10.setBounds(490,190,180,30);
		
		l10.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l10);
		
		
l11.setBounds(490,230,210,30);
		
		l11.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l11);
		
		
l12.setBounds(490,270,180,30);
		
		l12.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l12);
		
		
l13.setBounds(490,310,130,30);
		
		l13.setFont(new Font("Arial",Font.BOLD,20));
		c.add(l13);
		

		
		
		
	t1=new JTextField();
	t1.setBounds(190,150,200,30);
	t1.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t1);
	
	
	t2=new JTextField();
	t2.setBounds(190,190,200,30);
	t2.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t2);
	
	
	t3=new JTextField();
	t3.setBounds(190,230,200,30);
	t3.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t3);
	
	
	t4=new JTextField();
	t4.setBounds(190,270,200,30);
	t4.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t4);
	
	
	t5=new JTextField();
	t5.setBounds(190,310,200,30);
	t5.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t5);
	
	
	
	t6=new JTextField();
	t6.setBounds(680,150,200,30);
	t6.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t6);
	
	t7=new JTextField();
	t7.setBounds(680,190,200,30);
	t7.setText("4529"+card4);
	t7.setFont(new Font("Arial",Font.BOLD,15));
	c.add(t7);
	
	t8=new JTextField();
	t8.setBounds(680,230,200,30);
	t8.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t8);
	
	
	
	t9=new JTextField();
	t9.setBounds(680,270,200,30);
	t9.setFont(new Font("Arial",Font.BOLD,15));
	
	c.add(t9);
	
	
	t10=new JTextField();
	t10.setBounds(680,310,200,30);
	t10.setFont(new Font("Arial",Font.BOLD,15));
	
	
	
	c.add(t10);
	
	b1=new JButton("UPDATE");
	b1.setBounds(280,380,100,30);
	c.add(b1);
	
	
	b2=new JButton("CANCEL");
	b2.setBounds(480,380,100,30);
	c.add(b2);
	
	
	b1.setBackground(Color.BLACK);
	b1.setForeground(Color.WHITE);
	b2.setBackground(Color.BLACK);
	b2.setForeground(Color.WHITE);
	
	l14=new JLabel(":FILL WHOLE INFORMATION IN BLOCK LETTER:");

	l14.setBounds(130,460,520,30);
	l14.setFont(new Font("Arial",Font.BOLD,15));

	
	c.add(l14);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);

	
	c.add(l3);

	
		setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			DataBase db=new DataBase();
			if(e.getSource()==b3) {
				String q="select * from student1 where sid='"+t11.getText()+"'";
				ResultSet rs=db.s.executeQuery(q);
				
				if(rs.next()) {
					t1.setText(rs.getString("sname"));
					t2.setText(rs.getString("email"));
					t3.setText(rs.getString("fname"));
					t4.setText(rs.getString("dob"));
					t5.setText(rs.getString("gender"));
					t6.setText(rs.getString("address"));
					t7.setText(rs.getString("sid"));
					t8.setText(rs.getString("class"));
					t9.setText(rs.getString("adhar"));
					t10.setText(rs.getString("phone"));
					
					t7.setEditable(false);
					
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Check Your Id");
				}
			}
			else if(e.getSource()==b1) {
				
				String q1="update student1 set sname='"+t1.getText()+"',email='"+t2.getText()+"',fname='"+t3.getText()+"',dob='"+t4.getText()+"',gender='"+t5.getText()+"',address='"+t6.getText()+"',sid='"+t7.getText()+"',class='"+t8.getText()+"',adhar='"+t9.getText()+"',phone='"+t10.getText()+"'where sid='"+t11.getText()+"'";
				db.s.executeUpdate(q1);
				JOptionPane.showMessageDialog(null, "Your Record Updated");
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
				new student().setVisible(true);
				setVisible(false);
			}
			
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
public class XUpdateClass {

	public static void main(String[] args) {
		Update1 up=new Update1();

	}

}
