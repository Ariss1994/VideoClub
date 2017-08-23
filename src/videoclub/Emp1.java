package videoclub;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
  @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 *
 */
public class Emp1 extends JFrame  {
/**
	 * 
	 */
	private static final long serialVersionUID = 3892552072270944861L;

private JPanel container = new JPanel();

public static boolean reponse1 ;
//Employe emp1 = new Employe(sex, Nom, preNom, age,
//nat, adre, passe, salaire, date);

public static  String sex;
public static  String nom;
public static  String prenom;
public static  int age;
public static  String nat;
public static  String adresse;
public static  int pass;
public static double salaire;
public static  String date;
private JFormattedTextField jtf0 = new JFormattedTextField();
private JFormattedTextField jtf1 = new JFormattedTextField();
private JFormattedTextField jtf2 = new JFormattedTextField();
private JFormattedTextField jtf3 = new JFormattedTextField();
private JFormattedTextField jtf4 = new JFormattedTextField();
private JFormattedTextField jtf5 = new JFormattedTextField();
private JFormattedTextField jtf6 = new JFormattedTextField();
private JFormattedTextField jtf7 = new JFormattedTextField();
private JFormattedTextField jtf8 = new JFormattedTextField();

private JLabel label0  = new JLabel("SEX        \n");
private JLabel label1  = new JLabel("NOM        \n");
private JLabel label2  = new JLabel("PRENOM     ");
private JLabel label3  = new JLabel("AGE        ");
private JLabel label4  = new JLabel("NATIONALITE");
private JLabel label5  = new JLabel("ADRESSE    ");
private JLabel label6  = new JLabel("MOTDEPASSE ");
private JLabel label7  = new JLabel("SALAIRE    ");
private JLabel label8 = new JLabel("DATE        ");
private JButton b = new JButton ("OK");

public Emp1(){
  this.setTitle("Ajout adeherent");
  this.setSize(200, 600);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLocationRelativeTo(null);
  container.setBackground(Color.white);
  container.setLayout(new BorderLayout());
  
  JPanel top = new JPanel();
  Font police = new Font("Arial", Font.BOLD, 14);
  jtf0.setFont(police);
  jtf0.setPreferredSize(new Dimension(150, 30));
  jtf0.setForeground(Color.BLUE);
  jtf1.setPreferredSize(new Dimension(150, 30));
  jtf2.setPreferredSize(new Dimension(150, 30));
  jtf3.setPreferredSize(new Dimension(150, 30));
  jtf4.setPreferredSize(new Dimension(150, 30));
  jtf5.setPreferredSize(new Dimension(150, 30));
  jtf6.setPreferredSize(new Dimension(150, 30));
  jtf7.setPreferredSize(new Dimension(150, 30));
  jtf8.setPreferredSize(new Dimension(150, 30));
  b.addActionListener(new BoutonListener());
  top.add(label0);
  top.add(jtf0);
  top.add(label1);
  top.add(jtf1);
  top.add(label2);
  top.add(jtf2);
  top.add(label3);
  top.add(jtf3);
  top.add(label4);
  top.add(jtf4);
  top.add(label5);
  top.add(jtf5);
  top.add(label6);
  top.add(jtf6);
  top.add(label7);
  top.add(jtf7);
  top.add(label8);
  top.add(jtf8);
 
  
  top.add(b);
  this.setContentPane(top);

  this.setVisible(true);  
  
}  
public static String getSex() {
	
	return sex;
	
}
public static int getage() {
	
	return age;
	
}
public static  String getNationalite() {
	return nat;
	
}

class BoutonListener implements ActionListener{
  public void actionPerformed(ActionEvent e) {
	  nom=jtf0.getText();
	 sex=jtf1.getText();
	 prenom=jtf2.getText();
	 age=Integer.parseInt(jtf3.getText());
	 nat=jtf4.getText();
	 adresse=jtf5.getText();
	 pass=Integer.parseInt(jtf6.getText());
	salaire=Double.parseDouble(jtf7.getText());
	date=jtf1.getText();
  System.out.println(age);
  
	
	try {
		int derniernum = LectureEcriture.Getderniernum("dernier.txt");

		Employe.setDerniernum(derniernum);
	  Employe emp1 = new Employe(Emp1.sex, Emp1.nom,Emp1.prenom,Emp1.age,
				Emp1.nat, Emp1.adresse, Emp1.pass, Emp1.salaire, Emp1.date);

		Employe.addEmployer(emp1);
		String flux = "    " + Adeherent.getDerniernum()
				+ "	" + sex + "		" + nom
				+ "                 " + prenom
				+ "                 " + age + "	" + nat
				+ "                 " + adresse;

		LectureEcriture.lect(flux,"employe.txt");
		LectureEcriture.lect1(Integer.toString(Adeherent.getDerniernum()),"dernier.txt");
		
	} catch (Exception e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
     try {
		//MainTester.Main();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 
     
  }
  
}

}

