package videoclub;
/**
 *  @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.TextArea;

@SuppressWarnings("serial")
public class login extends JFrame {
	
	private JPanel container = new JPanel();
	public static int num;
	public static int pass1;
	public static boolean reponse1;
	public static String nom;
	public static String motpasse;
	private JFormattedTextField jtf = new JFormattedTextField();
	private JFormattedTextField jtf2 = new JFormattedTextField();
	private JLabel lblNomUtilisateur = new JLabel("nom utilisateur:");
	private JLabel label1 = new JLabel("mot de passe:");
	private JButton b = new JButton("LOG IN");

	public login() {
		this.setTitle("LOGIN");
		this.setSize(400, 566);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		final String END_LINE = System.getProperty("line.separator");

		JPanel top = new JPanel();
		top.setBackground(new Color(153, 102, 204));

		Font police = new Font("Arial", Font.BOLD, 14);
		jtf.setBounds(208, 206, 150, 30);
		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(150, 30));
		jtf.setForeground(Color.BLUE);
		jtf2.setBounds(208, 251, 150, 30);
		jtf2.setPreferredSize(new Dimension(150, 30));
		b.setFont(new Font("Segoe Script", Font.BOLD, 14));
		b.setBounds(231, 292, 115, 28);
		b.addActionListener(new BoutonListener());
		top.setLayout(null);
		lblNomUtilisateur.setForeground(new Color(255, 255, 51));
		lblNomUtilisateur.setBackground(Color.RED);
		lblNomUtilisateur.setFont(new Font("Chiller", Font.PLAIN, 38));
		lblNomUtilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomUtilisateur.setBounds(10, 200, 188, 28);
		top.add(lblNomUtilisateur);
		top.add(jtf);
		label1.setForeground(new Color(255, 255, 51));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Chiller", Font.PLAIN, 38));
		label1.setBounds(20, 247, 171, 30);
		top.add(label1);
		top.add(jtf2);

		top.add(b);
		this.setContentPane(top);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\bienvenue.jpg"));
		label_1.setBounds(53, 0, 284, 177);
		top.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\cadenat.jpg"));
		label_2.setBounds(10, 292, 84, 78);
		top.add(label_2);
		final TextArea textArea = new TextArea();
		textArea.setEditable(false);

		
				final JButton btnAide = new JButton("AIDE SUR LE LOG IN");
		btnAide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnAide) {
				try {
					File myFile = new File("Aidelogin");
					FileReader fileReader = new FileReader(myFile);
					LineNumberReader reader = new LineNumberReader(
							fileReader);

					// Read from the FileReader.
					String lineRead = "";
					while ((lineRead = reader.readLine()) != null) {
						if (lineRead.contains(jtf.getText())) {
							textArea.append(lineRead + END_LINE);
						}
						
					}

					// Determine the number of lines that were read.
					// System.out.println("Total lignes lus: " +
					// reader.getLineNumber());

					// Close the LineNumberReader and FileReader.
					fileReader.close();
					reader.close();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			}
			
			}
		});
		btnAide.setBounds(116, 342, 150, 28);
		top.add(btnAide);
		
		textArea.setBounds(0, 376, 384, 151);
		top.add(textArea);

		this.setVisible(true);
	}

	public static String getNom() {

		return nom;

	}

	public static String getpass() {
		return motpasse;

	}

	class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b){
			nom = jtf.getText();
			motpasse = jtf2.getText();

			num = Integer.parseInt(nom);

			pass1 = Integer.parseInt(motpasse);
			if (num>=1 && pass1>=3000 ){	
			
			try {
				TexteHtml frame = new TexteHtml();
				frame.setVisible(true);
				//new frmAdh_Real_Devel();
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			else if ((num==30 && pass1==2004)|| (num==20 && pass1==2104))
			{	
				
				try {
					administrateur frame = new administrateur();
					frame.setVisible(true);
					//new frmAdh_Real_Devel();
				
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			
			else {
				JFrame frame1 = new JFrame();
				String message = "Username et/ou Mot de pass erroné. Veuillez consulter l'aide au dessous.";
				JOptionPane.showMessageDialog(frame1, message);
			}
			jtf.setText("");
			jtf2.setText("");
			
			
		}
	}

}
	}

