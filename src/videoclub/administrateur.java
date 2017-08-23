package videoclub;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.*;

import java.awt.*;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;

/**
 * 
 * @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 * 
 */
public class administrateur extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_100;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField1;
	private JTextField textField_1;
	private JTextField textField_13;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_53;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_37;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_54;

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public administrateur() throws Exception {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 1000);

		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 638);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		final String END_LINE = System.getProperty("line.separator");
		final TextArea textArea_4 = new TextArea();
		final TextArea textArea_6 = new TextArea();

		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 596, 589);
		contentPane.add(tabbedPane);

		JPanel panel_24 = new JPanel();
		tabbedPane.addTab("Employ\u00E9", null, panel_24, null);

		JPanel panel_35 = new JPanel();
		panel_35.setBounds(294, 5, 1, 1);
		panel_35.setLayout(null);

		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.setBounds(0, 11, 600, 550);
		panel_35.add(tabbedPane_5);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(300, 5, 1, 1);
		panel_34.setLayout(null);

		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 11, 600, 550);
		panel_34.add(tabbedPane_3);
		panel_24.setLayout(null);
		panel_24.add(panel_35);
		panel_24.add(panel_34);

		JTabbedPane Employe1 = new JTabbedPane(JTabbedPane.TOP);
		Employe1.setBounds(0, 0, 595, 550);
		panel_24.add(Employe1);

		JPanel Ajouter1 = new JPanel();
		Ajouter1.setBackground(new Color(102, 102, 0));
		Employe1.addTab("Ajouter", null, Ajouter1, null);
		Ajouter1.setLayout(null);

		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(0, 255, 255));
		panel_40.setLayout(null);
		panel_40.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Employ\u00E9",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_40.setBounds(28, 46, 561, 440);
		Ajouter1.add(panel_40);
		
		JLabel lblNewLabel_7 = new JLabel("Informations Employ\u00E9:");
		lblNewLabel_7.setForeground(new Color(51, 204, 0));
		lblNewLabel_7.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		lblNewLabel_7.setBounds(-1, 0, 221, 39);
		panel_40.add(lblNewLabel_7);

		JLabel lblNewLabel_4 = new JLabel("Salaire:");
		lblNewLabel_4.setForeground(new Color(51, 204, 0));
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(184, 383, 49, 14);
		panel_40.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Date d'Embauche:");
		lblNewLabel_5.setForeground(new Color(51, 204, 0));
		lblNewLabel_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(328, 383, 111, 14);
		panel_40.add(lblNewLabel_5);

		textField_47 = new JTextField();
		textField_47.setBounds(449, 380, 111, 20);
		panel_40.add(textField_47);
		textField_47.setColumns(10);

		textField_29 = new JTextField();
		textField_29.setBounds(99, 380, 75, 20);
		panel_40.add(textField_29);
		textField_29.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Mot de Passe:");
		lblNewLabel_3.setForeground(new Color(51, 204, 0));
		lblNewLabel_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(-1, 383, 90, 14);
		panel_40.add(lblNewLabel_3);

		textField_37 = new JTextField();
		textField_37.setBounds(243, 380, 75, 20);
		panel_40.add(textField_37);
		textField_37.setColumns(10);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(79, 99, 145, 34);
		panel_40.add(textField_20);

		JLabel lblPrnom_1 = new JLabel("Pr\u00E9nom:");
		lblPrnom_1.setForeground(new Color(51, 204, 0));
		lblPrnom_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblPrnom_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrnom_1.setBounds(6, 107, 70, 14);
		panel_40.add(lblPrnom_1);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(79, 44, 145, 34);
		panel_40.add(textField_21);

		JLabel lblNom_1 = new JLabel("Nom:");
		lblNom_1.setForeground(new Color(51, 204, 0));
		lblNom_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNom_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom_1.setBounds(27, 51, 46, 14);
		panel_40.add(lblNom_1);

		JLabel lblSex = new JLabel("Sex:");
		lblSex.setForeground(new Color(51, 204, 0));
		lblSex.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblSex.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSex.setBounds(45, 160, 29, 14);
		panel_40.add(lblSex);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(79, 152, 145, 34);
		panel_40.add(textField_22);

		JLabel lblAge_1 = new JLabel("Age:");
		lblAge_1.setForeground(new Color(51, 204, 0));
		lblAge_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblAge_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge_1.setBounds(27, 210, 46, 14);
		panel_40.add(lblAge_1);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(79, 203, 145, 34);
		panel_40.add(textField_23);

		JLabel lblNationalit_1 = new JLabel("Nationalit\u00E9:");
		lblNationalit_1.setForeground(new Color(51, 204, 0));
		lblNationalit_1
				.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNationalit_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNationalit_1.setBounds(-1, 262, 76, 14);
		panel_40.add(lblNationalit_1);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(79, 254, 145, 34);
		panel_40.add(textField_24);

		JLabel lblAdresse_1 = new JLabel("Adresse:");
		lblAdresse_1.setForeground(new Color(51, 204, 0));
		lblAdresse_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblAdresse_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdresse_1.setBounds(16, 323, 59, 14);
		panel_40.add(lblAdresse_1);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(79, 307, 300, 50);
		panel_40.add(textField_28);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\employe.jpg"));
		label_7.setBounds(272, 37, 279, 251);
		panel_40.add(label_7);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\simple-background.jpg"));
		lblNewLabel_6.setBounds(-32, -16, 594, 480);
		panel_40.add(lblNewLabel_6);

		JLabel label_2 = new JLabel("BIENVENUE  ADMINISTRATEUR");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Lucida Calligraphy", Font.BOLD, 15));
		label_2.setBackground(new Color(255, 228, 196));
		label_2.setBounds(145, 11, 333, 25);
		Ajouter1.add(label_2);
		
				final JButton btnEnregistrer = new JButton("Enregistrer");
				btnEnregistrer.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
				btnEnregistrer.setBounds(241, 497, 109, 25);
				Ajouter1.add(btnEnregistrer);
				
				JLabel label_20 = new JLabel("");
				label_20.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\simple-background.jpg"));
				label_20.setBounds(0, 0, 593, 525);
				Ajouter1.add(label_20);
				btnEnregistrer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (e.getSource() == btnEnregistrer) {

							// System.out.println("|"+o+"|");
							String nom = textField_21.getText();
							String prenom = textField_20.getText();// prenom
							String sex = textField_22.getText();// nom
							int age = Integer.parseInt(textField_23.getText());

							int motpasse = Integer.parseInt(textField_29.getText());
							String nat = textField_24.getText();
							String adresse = textField_28.getText();
							double salaire = Double.parseDouble(textField_37.getText());
							String embauche = textField_47.getText();

							int derniernum;
							try {
								derniernum = LectureEcriture.Getderniernum("dernier");
							
								Employe.getDerniernum();

								Employe emp = new Employe(sex, nom, prenom, age, nat,
										adresse, motpasse, salaire, embauche);
								Employe.addEmployer(emp);

								String flux = "   " + Employe.getDerniernum()
										+"-"+ sex +"-"+ nom +"-" + prenom
										+"-" + age + "-" + nat +"-" + adresse
										+ "-"+ motpasse + "-" + salaire + "-"
										+ embauche;
								
								

								try {
									LectureEcriture.lect(flux, "emp");
									textField_21.setText("");
									textField_20.setText("");
									textField_22.setText("");
									textField_23.setText("");
									textField_29.setText("");
									textField_24.setText("");
									textField_28.setText("");
									textField_37.setText("");
									textField_47.setText("");
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								try {
									LectureEcriture.lect1(
											Integer.toString(Employe.getDerniernum()),
											"dernieremp0");
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

						}
					}

				});

		JPanel Afficher1 = new JPanel();
		Employe1.addTab("Afficher Employ\u00E9s", null, Afficher1, null);
		Afficher1.setLayout(null);

		Panel panel_42 = new Panel();
		panel_42.setBounds(0, 0, 590, 522);
		Afficher1.add(panel_42);
		final TextArea textArea_5 = new TextArea();
		textArea_5.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		textArea_5.setBackground(new Color(255, 102, 102));
		textArea_5.setForeground(new Color(255, 255, 255));
		textArea_5.setEditable(false);
		final JButton btnClickerPourAfficher = new JButton(
				"Clicker Pour Afficher tous les Employ\u00E9s.");
		btnClickerPourAfficher.setFont(new Font("Tekton Pro Ext", Font.PLAIN,
				16));
		btnClickerPourAfficher.setForeground(new Color(128, 128, 0));
		btnClickerPourAfficher.setBackground(new Color(255, 255, 255));
		btnClickerPourAfficher.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnClickerPourAfficher) {
					try {
						// String prop = textField.getText();
						// this.texte.append(prop + END_LINE);
						String ligne;
						@SuppressWarnings("resource")
						BufferedReader br = new BufferedReader(new FileReader(
								"emp"));
						while ((ligne = br.readLine()) != null) {
							textArea_5.append(ligne + END_LINE);
						}

						;
						// Dessin.afficher();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		});
		
		final JButton button_6 = new JButton("Effacer");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_6) {
					textArea_5.setText("");
				}
			}
		});

		GroupLayout gl_panel_42 = new GroupLayout(panel_42);
		gl_panel_42.setHorizontalGroup(
			gl_panel_42.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_42.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_42.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_42.createSequentialGroup()
							.addComponent(textArea_5, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_42.createSequentialGroup()
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnClickerPourAfficher)
							.addGap(108))))
		);
		gl_panel_42.setVerticalGroup(
			gl_panel_42.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_42.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_panel_42.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClickerPourAfficher)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea_5, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_42.setLayout(gl_panel_42);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		Employe1.addTab("Modifier", null, panel_7, null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(UIManager
						.getBorder("TitledBorder.border"), "Information Adh\u00E9rent",
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setBounds(28, 46, 562, 415);
		panel_7.add(panel_11);
		
		JLabel label_37 = new JLabel("");
		label_37.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\google-updating-1371646685.gif"));
		label_37.setBounds(266, 75, 295, 231);
		panel_11.add(label_37);
		
		JLabel label_33 = new JLabel("Informations Employ\u00E9:");
		label_33.setForeground(new Color(51, 204, 0));
		label_33.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		label_33.setBounds(-1, 0, 221, 39);
		panel_11.add(label_33);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(79, 99, 145, 34);
		panel_11.add(textField_57);
		
		JLabel label_9 = new JLabel("Pr\u00E9nom:");
		label_9.setForeground(new Color(51, 204, 0));
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label_9.setBounds(8, 107, 68, 14);
		panel_11.add(label_9);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(79, 44, 145, 34);
		panel_11.add(textField_58);
		
		JLabel label_10 = new JLabel("Nom:");
		label_10.setForeground(new Color(51, 204, 0));
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label_10.setBounds(27, 51, 46, 14);
		panel_11.add(label_10);
		
		JLabel label_11 = new JLabel("Age:");
		label_11.setForeground(new Color(51, 204, 0));
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label_11.setBounds(27, 210, 46, 14);
		panel_11.add(label_11);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(79, 254, 145, 34);
		panel_11.add(textField_59);
		
		JLabel label_12 = new JLabel("Nationalit\u00E9:");
		label_12.setForeground(new Color(51, 204, 0));
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label_12.setBounds(-1, 262, 77, 14);
		panel_11.add(label_12);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(79, 203, 145, 34);
		panel_11.add(textField_60);
		
		JLabel label_13 = new JLabel("Adresse:");
		label_13.setForeground(new Color(51, 204, 0));
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label_13.setBounds(17, 323, 59, 14);
		panel_11.add(label_13);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(79, 307, 300, 50);
		panel_11.add(textField_61);
		
		final JButton button_2 = new JButton("Rechercher");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String [] parts;
				if (arg0.getSource() == button_2) {

					try {

						File myFile = new File("emp");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
					    lineRead = reader.readLine();
						
						if (lineRead.contains(textField_33.getText())) {
							parts= lineRead.split("-");
					
							textField_62.setText(parts[1]);
							textField_57.setText(parts[3]);
							textField_59.setText(parts[5]);
							textField_61.setText(parts[6]);
							textField_50.setText(parts[7]);
							textField_60.setText(parts[4]);
							textField_51.setText(parts[8]);
							textField_52.setText(parts[9]);
							
						}
						
					

						// Determine the number of lines that were read.
						// System.out.println("Total lignes lus: " +
						// reader.getLineNumber());

						// Close the LineNumberReader and FileReader.
						fileReader.close();
						reader.close();
						LectureEcriture.Recherche("emp",
								textField_58.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
			
				}
				
				try {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(new FileInputStream(
									"emp")));

					StringBuffer sb = new StringBuffer();
					

					BufferedWriter out = new BufferedWriter(new FileWriter(
							"emp"));

					out.write(sb.toString());

					out.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		button_2.setToolTipText("Effectuer une recherche sur le titre de film");
		button_2.setFont(new Font("Centaur", Font.BOLD, 13));
		button_2.setBounds(266, 50, 113, 23);
		panel_11.add(button_2);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(79, 152, 145, 34);
		panel_11.add(textField_62);
		
		JLabel label_14 = new JLabel("Sex:");
		label_14.setForeground(new Color(51, 204, 0));
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label_14.setBounds(45, 160, 29, 14);
		panel_11.add(label_14);
		
		JLabel label = new JLabel("Mot de Passe:");
		label.setForeground(new Color(51, 204, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label.setBounds(-1, 383, 90, 14);
		panel_11.add(label);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(99, 380, 75, 20);
		panel_11.add(textField_50);
		
		JLabel label_1 = new JLabel("Salaire:");
		label_1.setForeground(new Color(51, 204, 0));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label_1.setBounds(184, 383, 49, 14);
		panel_11.add(label_1);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(243, 380, 75, 20);
		panel_11.add(textField_51);
		
		JLabel label_3 = new JLabel("Date d'Embauche:");
		label_3.setForeground(new Color(51, 204, 0));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		label_3.setBounds(328, 383, 111, 14);
		panel_11.add(label_3);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(449, 380, 111, 20);
		panel_11.add(textField_52);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\simple-background.jpg"));
		label_22.setBounds(-20, 0, 582, 415);
		panel_11.add(label_22);
		
		final JButton button_3 = new JButton("Enregistrer");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == button_3) {
					
					
					String sex = textField_62.getText();
					String prenom = textField_57.getText();// prenom
					String nom = textField_58.getText();// nom
					int age = Integer.parseInt(textField_60.getText());// age
					String nat = (textField_59.getText());// natio
					String adresse = (textField_61.getText());// adresse
					int motdepasse = Integer.parseInt(textField_50.getText());
					double salaire = Double.parseDouble(textField_51.getText());
					String date = textField_52.getText();

					int derniernum;
					
					try {
						derniernum = LectureEcriture.Getderniernum("dernier");
						Employe.setDerniernum(derniernum);

						Employe emp = new Employe(sex, nom, prenom, age, nat,
								adresse, motdepasse, salaire, date);
						Employe.addEmployer(emp);

						String flux = "   " + Employe.getDerniernum()
								+"-"+ sex +"-"+ nom +"-" + prenom
								+"-" + age + "-" + nat +"-" + adresse
								+ "-"+ motdepasse + "-" + salaire + "-"
								+ date;
						
						

						try {
							LectureEcriture.lect(flux, "emp");
							textField_58.setText("");
							textField_57.setText("");
							textField_60.setText("");
							textField_62.setText("");
							textField_61.setText("");
							textField_59.setText("");
							textField_50.setText("");
							textField_51.setText("");
							textField_52.setText("");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							LectureEcriture.lect1(
									Integer.toString(Employe.getDerniernum()),
									"dernieremp0");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		button_3.setFont(new Font("Centaur", Font.BOLD, 13));
		button_3.setBounds(241, 497, 109, 25);
		panel_7.add(button_3);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\simple-background.jpg"));
		label_21.setBounds(0, 0, 590, 522);
		panel_7.add(label_21);

		JPanel panel_39 = new JPanel();
		Employe1.addTab("Rechercher et/ou Supprimer", null, panel_39, null);
		panel_39.setLayout(null);

		JPanel panel_44 = new JPanel();
		panel_44.setBounds(30, 11, 542, 120);
		panel_39.add(panel_44);
		panel_44.setBackground(new Color(51, 255, 102));
		panel_44.setForeground(Color.RED);
		panel_44.setLayout(null);
		panel_44.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Employ\u00E9",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		final JButton btnRecherche_1 = new JButton("Rechercher");
		btnRecherche_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		btnRecherche_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnRecherche_1) {

					try {
						// textArea_3.append(" ");
						File myFile = new File("emp");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						int i = 0;
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField_48.getText())) {
								textArea_6.append("LIGNE : " + i + "     "
										+ lineRead + END_LINE);
							}

							i++;
						}

						// Determine the number of lines that were read.
						// System.out.println("Total lignes lus: " +
						// reader.getLineNumber());

						// Close the LineNumberReader and FileReader.
						fileReader.close();
						reader.close();
						LectureEcriture.Recherche("emp", textField_48.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					;
				}

			}
		});
		btnRecherche_1.setToolTipText("Effectuer une recherche sur un Employe");
		btnRecherche_1.setBounds(249, 42, 116, 23);
		panel_44.add(btnRecherche_1);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(109, 44, 130, 20);
		panel_44.add(textField_48);

		JLabel lblNum_1 = new JLabel("Coordonn\u00E9e:");
		lblNum_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNum_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNum_1.setBounds(9, 46, 90, 14);
		panel_44.add(lblNum_1);

		final TextField textField_49 = new TextField();
		textField_49.setBounds(109, 77, 130, 22);
		panel_44.add(textField_49);

		final JButton btnSupprimer_1 = new JButton("Supprimer");
		btnSupprimer_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		btnSupprimer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnSupprimer_1) {
					try {
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(
										new FileInputStream("emp")));

						StringBuffer sb = new StringBuffer();
						String line;

						int nbLinesRead = 0;
						while ((line = reader.readLine()) != null) {
							if (nbLinesRead != Integer.parseInt(textField_49
									.getText())) {

								sb.append(line + "  \n");
							}
							nbLinesRead++;
						}
						reader.close();

						BufferedWriter out = new BufferedWriter(new FileWriter(
								"emp"));

						out.write(sb.toString());

						out.close();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnSupprimer_1.setBounds(249, 76, 116, 23);
		panel_44.add(btnSupprimer_1);

		final JButton btnBesoinDaide = new JButton("Besoin d'Aide?");
		btnBesoinDaide.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		btnBesoinDaide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnBesoinDaide) {
					try {
						File myFile = new File("supprech.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField1.getText())) {
								textArea_6.append(lineRead + END_LINE);
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
		btnBesoinDaide.setBackground(Color.ORANGE);
		btnBesoinDaide.setBounds(416, 11, 116, 23);
		panel_44.add(btnBesoinDaide);

		JLabel lblNoLigne = new JLabel("No. Ligne:");
		lblNoLigne.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNoLigne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNoLigne.setBounds(19, 80, 80, 14);
		panel_44.add(lblNoLigne);
		textArea_6.setBounds(30, 137, 555, 375);
		panel_39.add(textArea_6);
		textArea_6.setFont(new Font("Footlight MT Light", Font.BOLD, 12));
		textArea_6.setBackground(new Color(255, 102, 102));

		textArea_6.setEditable(false);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\simple-background.jpg"));
		label_32.setBounds(0, 0, 585, 522);
		panel_39.add(label_32);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Adherent", null, panel, null);
		panel.setLayout(null);

		JTabbedPane Adherent1 = new JTabbedPane(JTabbedPane.TOP);
		Adherent1.setBounds(0, 0, 595, 550);
		panel.add(Adherent1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 51, 0));
		Adherent1.addTab("Ajouter", null, panel_2, null);
		panel_2.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 204, 153));
		panel_4.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Adh\u00E9rent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(28, 46, 541, 440);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblInformationsAdherent = new JLabel("Informations Adherent:");
		lblInformationsAdherent.setForeground(new Color(255, 255, 255));
		lblInformationsAdherent.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		lblInformationsAdherent.setBounds(-1, 0, 221, 39);
		panel_4.add(lblInformationsAdherent);
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(79, 99, 145, 34);
		panel_4.add(textField_25);

		JLabel lblPrnom = new JLabel("Pr\u00E9nom:");
		lblPrnom.setForeground(new Color(255, 255, 255));
		lblPrnom.setFont(new Font("Centaur", Font.BOLD, 13));
		lblPrnom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrnom.setBounds(7, 107, 69, 14);
		panel_4.add(lblPrnom);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(79, 44, 145, 34);
		panel_4.add(textField_26);

		JLabel lblNom = new JLabel("Nom:");
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setFont(new Font("Centaur", Font.BOLD, 13));
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom.setBounds(25, 51, 49, 14);
		panel_4.add(lblNom);
		JLabel lblPrnom1 = new JLabel("Sex:");
		lblPrnom1.setForeground(new Color(255, 255, 255));
		lblPrnom1.setFont(new Font("Centaur", Font.BOLD, 13));
		lblPrnom1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrnom1.setBounds(46, 160, 29, 14);
		panel_4.add(lblPrnom1);

		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(79, 152, 145, 34);
		panel_4.add(textField_100);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(new Color(255, 255, 255));
		lblAge.setFont(new Font("Centaur", Font.BOLD, 13));
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setBounds(46, 210, 28, 14);
		panel_4.add(lblAge);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(79, 203, 145, 34);
		panel_4.add(textField_27);

		JLabel lblNationalit = new JLabel("Nationalit\u00E9:");
		lblNationalit.setForeground(new Color(255, 255, 255));
		lblNationalit.setFont(new Font("Centaur", Font.BOLD, 13));
		lblNationalit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNationalit.setBounds(-7, 262, 83, 14);
		panel_4.add(lblNationalit);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(79, 254, 145, 34);
		panel_4.add(textField_30);

		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setForeground(new Color(255, 255, 255));
		lblAdresse.setFont(new Font("Centaur", Font.BOLD, 13));
		lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdresse.setBounds(22, 323, 54, 14);
		panel_4.add(lblAdresse);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(79, 307, 300, 50);
		panel_4.add(textField_31);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\customer-loyalty_retention.jpg"));
		label_8.setBounds(234, 11, 297, 292);
		panel_4.add(label_8);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_23.setBounds(-7, 0, 548, 440);
		panel_4.add(label_23);

		final JButton btnValider = new JButton("Enregistrer");
		btnValider.setFont(new Font("Centaur", Font.BOLD, 13));
		btnValider.setBounds(241, 497, 109, 25);
		panel_2.add(btnValider);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_24.setBounds(0, 0, 588, 522);
		panel_2.add(label_24);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnValider) {
					String format = "%1$-16s";
					String sex = String.format(format,
							new String[] { "test sur 16" });
					String prenom = String.format(format,
							new String[] { "test sur 16" });
					String nom = String.format(format,
							new String[] { "test sur 16" });
					String nat = String.format(format,
							new String[] { "test sur 16" });
					String adresse = String.format(format,
							new String[] { "test sur 16" });
					// System.out.println("|"+o+"|");
					sex = textField_100.getText();
					prenom = textField_25.getText();// prenom
					nom = textField_26.getText();// nom
					int age = Integer.parseInt(textField_27.getText());// age
					nat = (textField_30.getText());// natio
					adresse = (textField_31.getText());// adresse

					int derniernum;
					try {
						derniernum = LectureEcriture
								.Getderniernum("adedernier");
						Adeherent.setDerniernum(derniernum);
						Adeherent emp1 = new Adeherent(sex, nom, prenom, age,
								nat, adresse);

						Adeherent.addAdeherent(emp1);
						String flux = Adeherent.getDerniernum()
								+ "-" + sex + "-" + nom + "-" + prenom
								+ "-" + age + "-" + nat + "-" + adresse;

						try {
							LectureEcriture.lect(flux, "adedernier.txt");
							textField_100.setText("");
							textField_25.setText("");
							textField_26.setText("");
							textField_27.setText("");
							textField_30.setText("");
							textField_31.setText("");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							LectureEcriture.lect1(
									Integer.toString(Adeherent.getDerniernum()),
									"adedernier");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});

		Panel panel_19 = new Panel();
		Adherent1.addTab("Affichage", null, panel_19, null);

		final TextArea textArea_1 = new TextArea();
		textArea_1.setBackground(new Color(255, 102, 102));
		textArea_1.setEditable(false);

		final JButton btnNewButton = new JButton(
				"Clicker pour afficher tous les Adeherents");
		btnNewButton.setFont(new Font("Papyrus", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnNewButton) {
					try {
						// String prop = textField.getText();
						// this.texte.append(prop + END_LINE);
						String ligne;
						@SuppressWarnings("resource")
						BufferedReader br = new BufferedReader(new FileReader(
								"adedernier.txt"));
						while ((ligne = br.readLine()) != null) {
							textArea_1.append(ligne + END_LINE);
						}

						;
						// Dessin.afficher();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		final JButton button_4 = new JButton("Effacer");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_4) {
					textArea_1.setText("");
				}
			}
		});
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_19.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addComponent(btnNewButton))
						.addGroup(gl_panel_19.createSequentialGroup()
							.addGap(10)
							.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)))
					.addGap(10))
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_19.setLayout(gl_panel_19);
		// ---------------------------------------------------------------------------------------
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		Adherent1.addTab("Modifier", null, panel_5, null);

		final JButton button_1 = new JButton("Valider");
		button_1.setBounds(256, 486, 80, 25);
		panel_5.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager
						.getBorder("TitledBorder.border"), "Information Adh\u00E9rent",
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(28, 46, 541, 398);
		panel_5.add(panel_3);
		
		JLabel label_38 = new JLabel("");
		label_38.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\google-updating-1371646685.gif"));
		label_38.setBounds(265, 75, 295, 231);
		panel_3.add(label_38);
		
		JLabel label_36 = new JLabel("Informations Adherent:");
		label_36.setBackground(new Color(255, 255, 255));
		label_36.setForeground(new Color(255, 255, 255));
		label_36.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		label_36.setBounds(-1, 0, 221, 39);
		panel_3.add(label_36);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(79, 99, 145, 34);
		panel_3.add(textField_32);
		
		JLabel label_4 = new JLabel("Pr\u00E9nom:");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Centaur", Font.BOLD, 13));
		label_4.setBounds(8, 107, 68, 14);
		panel_3.add(label_4);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(79, 44, 145, 34);
		panel_3.add(textField_33);
		
		JLabel label_5 = new JLabel("Nom:");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Centaur", Font.BOLD, 13));
		label_5.setBounds(27, 51, 46, 14);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("Age:");
		label_6.setForeground(new Color(255, 255, 255));
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Centaur", Font.BOLD, 13));
		label_6.setBounds(27, 210, 46, 14);
		panel_3.add(label_6);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(79, 254, 145, 34);
		panel_3.add(textField_34);
		
		JLabel label_15 = new JLabel("Nationalit\u00E9:");
		label_15.setForeground(new Color(255, 255, 255));
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("Centaur", Font.BOLD, 13));
		label_15.setBounds(-1, 262, 77, 14);
		panel_3.add(label_15);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(79, 203, 145, 34);
		panel_3.add(textField_35);
		
		JLabel label_16 = new JLabel("Adresse:");
		label_16.setForeground(new Color(255, 255, 255));
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("Centaur", Font.BOLD, 13));
		label_16.setBounds(17, 323, 59, 14);
		panel_3.add(label_16);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(79, 307, 300, 50);
		panel_3.add(textField_36);
		
		final JButton button = new JButton("Rechercher");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String [] parts;
				if (arg0.getSource() == button) {

					try {

						File myFile = new File("adedernier.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
					    lineRead = reader.readLine();
						
						if (lineRead.contains(textField_33.getText())) {
							parts= lineRead.split("-");
							
							textField_33.setText(parts[2]);
							textField_54.setText(parts[1]);
							textField_32.setText(parts[3]);
							textField_34.setText(parts[5]);
							textField_36.setText(parts[6]);
						//	textField_20.setText(parts[1]);
							textField_35.setText(parts[4]);
							
						}
						
					

						// Determine the number of lines that were read.
						// System.out.println("Total lignes lus: " +
						// reader.getLineNumber());

						// Close the LineNumberReader and FileReader.
						fileReader.close();
						reader.close();
						LectureEcriture.Recherche("adedernier.txt",
								textField_32.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
			
				}
				
				try {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(new FileInputStream(
									"adedernier.txt")));

					StringBuffer sb = new StringBuffer();
					
					BufferedWriter out = new BufferedWriter(new FileWriter(
							"adedernier.txt"));

					out.write(sb.toString());

					out.close();

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button.setToolTipText("Effectuer une recherche sur le titre de film");
		button.setFont(new Font("Centaur", Font.BOLD, 13));
		button.setBounds(266, 50, 113, 23);
		panel_3.add(button);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(79, 152, 145, 34);
		panel_3.add(textField_54);
		
		JLabel label_17 = new JLabel("Sex:");
		label_17.setForeground(new Color(255, 255, 255));
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("Centaur", Font.BOLD, 13));
		label_17.setBounds(45, 160, 29, 14);
		panel_3.add(label_17);
		
		JLabel label_34 = new JLabel("");
		label_34.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_34.setBounds(-12, 0, 553, 398);
		panel_3.add(label_34);
		
		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_35.setBounds(0, 0, 590, 522);
		panel_5.add(label_35);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_1) {
					if (e.getSource() == btnEnregistrer) {
						
						
						String sex = textField_54.getText();
						String prenom = textField_32.getText();// prenom
						String nom = textField_33.getText();// nom
						int age = Integer.parseInt(textField_35.getText());// age
						String nat = (textField_34.getText());// natio
						String adresse = (textField_36.getText());// adresse

						int derniernum;
						try {
							derniernum = LectureEcriture
									.Getderniernum("adedernier");
							Adeherent.setDerniernum(derniernum);
							Adeherent emp1 = new Adeherent(sex, nom, prenom, age,
									nat, adresse);

							Adeherent.addAdeherent(emp1);
							//Adeherent.adeherent.add(emp1);
							String flux = Adeherent.getDerniernum()
									+ "-" + sex + "-" + nom + "-" + prenom
									+ "-" + age + "-" + nat + "-" + adresse;

							

							try {
								LectureEcriture.lect(flux, "adedernier.txt");
								textField_54.setText("");
								textField_32.setText("");
								textField_33.setText("");
								textField_34.setText("");
								textField_35.setText("");
								textField_36.setText("");
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							try {
								LectureEcriture.lect1(
										Integer.toString(Adeherent.getDerniernum()),
										"adedernier");
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}


				}
			}
		});

		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		Adherent1.addTab("Recherche et/ou Supprimer", null, panel_17, null);

		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(51, 255, 102));
		panel_18.setLayout(null);
		panel_18.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Adh\u00E9rent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_18.setBounds(30, 11, 542, 120);
		panel_17.add(panel_18);
		final TextArea textArea3 = new TextArea();
		textArea3.setBackground(new Color(255, 102, 102));
		textArea3.setEditable(false);
		textArea3.setBounds(30, 137, 555, 375);
		panel_17.add(textArea3);

		final JButton btnRecherche = new JButton("Rechercher");
		btnRecherche.setFont(new Font("Centaur", Font.BOLD, 13));
		btnRecherche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnRecherche) {

					try {
						textArea3.append(" ");
						File myFile = new File("adedernier.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						int i = 0;
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField1.getText())) {
								textArea3.append("LIGNE : " + i + "     "
										+ lineRead + END_LINE);
							}

							i++;
						}

						// Determine the number of lines that were read.
						// System.out.println("Total lignes lus: " +
						// reader.getLineNumber());

						// Close the LineNumberReader and FileReader.
						fileReader.close();
						reader.close();
						LectureEcriture.Recherche("adedernier.txt",
								textField1.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					;
				}
			}
		});
		btnRecherche.setToolTipText("Effectuer une recherche sur un adeherent");
		btnRecherche.setBounds(249, 43, 116, 23);
		panel_18.add(btnRecherche);

		textField1 = new JTextField();
		textField1.setColumns(10);
		textField1.setBounds(109, 44, 130, 20);
		panel_18.add(textField1);

		JLabel lblNum = new JLabel("Coordonn\u00E9e:");
		lblNum.setFont(new Font("Centaur", Font.BOLD, 13));
		lblNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNum.setBounds(9, 46, 90, 14);
		panel_18.add(lblNum);

		final TextField textField = new TextField();
		textField.setBounds(109, 77, 130, 22);
		panel_18.add(textField);

		final JButton btnNewButton_1 = new JButton("Supprimer");
		btnNewButton_1.setFont(new Font("Centaur", Font.BOLD, 13));
		btnNewButton_1.setBounds(249, 76, 116, 23);
		panel_18.add(btnNewButton_1);

		final JButton btnNewButton_2 = new JButton("Besoin d'Aide?");
		btnNewButton_2.setFont(new Font("Centaur", Font.BOLD, 13));
		btnNewButton_2.setBounds(416, 11, 116, 23);
		panel_18.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnNewButton_2) {
					try {
						File myFile = new File("supprech.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField1.getText())) {
								textArea3.append(lineRead + END_LINE);
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
					;
				}
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);

		JLabel lblNewLabel = new JLabel("No. Ligne:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(19, 80, 80, 14);
		panel_18.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Centaur", Font.BOLD, 13));
		
		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_25.setBounds(0, 0, 594, 522);
		panel_17.add(label_25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnNewButton_1) {
					try {
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(new FileInputStream(
										"adedernier.txt")));

						StringBuffer sb = new StringBuffer();
						String line;

						int nbLinesRead = 0;
						while ((line = reader.readLine()) != null) {
							if (nbLinesRead != Integer.parseInt(textField
									.getText())) {

								sb.append(line + "  \n");
							}
							nbLinesRead++;
						}
						reader.close();

						BufferedWriter out = new BufferedWriter(new FileWriter(
								"adedernier.txt"));

						out.write(sb.toString());

						out.close();

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		});

		// textArea.append(LectureEcriture.lect1());

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Film", null, panel_1, null);
		panel_1.setLayout(null);

		JTabbedPane FIlm1 = new JTabbedPane(JTabbedPane.TOP);
		FIlm1.setBounds(0, 0, 600, 550);
		panel_1.add(FIlm1);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(204, 102, 204));
		panel_9.setLayout(null);
		FIlm1.addTab("Ajout d'un Film", null, panel_9, null);
		final JComboBox comboBox = new JComboBox();

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(102, 204, 0));
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Film",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13.setBounds(28, 46, 541, 440);
		panel_9.add(panel_13);
		
		JLabel label_39 = new JLabel("Informations Film:");
		label_39.setForeground(Color.BLACK);
		label_39.setFont(new Font("Nueva Std", Font.BOLD, 15));
		label_39.setBounds(0, 0, 221, 39);
		panel_13.add(label_39);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 99, 145, 34);
		panel_13.add(textField_1);

		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate.setBounds(39, 107, 36, 14);
		panel_13.add(lblDate);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(79, 44, 145, 34);
		panel_13.add(textField_13);

		JLabel lblTitre = new JLabel("Titre:");
		lblTitre.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblTitre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitre.setBounds(40, 51, 36, 14);
		panel_13.add(lblTitre);

		JLabel lblDatelocation = new JLabel("Date de Location:");
		lblDatelocation.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblDatelocation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatelocation.setBounds(254, 51, 115, 14);
		panel_13.add(lblDatelocation);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(371, 44, 145, 34);
		panel_13.add(textField_38);

		JLabel lblDateretour = new JLabel("Date de Retour:");
		lblDateretour.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblDateretour.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateretour.setBounds(272, 107, 96, 14);
		panel_13.add(lblDateretour);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(371, 99, 145, 34);
		panel_13.add(textField_39);

		JLabel lblEnstock = new JLabel("Stock:");
		lblEnstock.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblEnstock.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnstock.setBounds(38, 160, 36, 14);
		panel_13.add(lblEnstock);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(79, 152, 145, 34);
		panel_13.add(textField_40);

		textField_7 = new JTextField();
		textField_7.setBounds(79, 203, 145, 34);
		panel_13.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Realisateur:");
		lblNewLabel_1.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(0, 210, 77, 14);
		panel_13.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Categorie:");
		lblNewLabel_2.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(14, 262, 64, 14);
		panel_13.add(lblNewLabel_2);

		JList list = new JList();
		list.setBounds(242, 310, 1, 1);
		panel_13.add(list);

		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Action",
				"Adult", "Adventure", "Animation", "Black Cast", "Comedy",
				"Crime", "Drama", "Family", "Fantasy", "Film_Noir", "Horror",
				"Martial Arts", "Musical", "Mystery", "Religions", "Romance",
				"Sci-Fi", "Serial", "Short", "Silent", "Thriller" }));
		comboBox.setBounds(79, 254, 145, 34);
		panel_13.add(comboBox);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\download.jpg"));
		label_18.setBounds(339, 186, 201, 243);
		panel_13.add(label_18);
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\backgrounds-computer-images-nice-service-118812.jpg"));
		label_26.setBounds(-23, 0, 564, 440);
		panel_13.add(label_26);
		
				final JButton btnEnregistrer_1 = new JButton("Enregistrer");
				btnEnregistrer_1.setFont(new Font("Nueva Std", Font.BOLD, 13));
				btnEnregistrer_1.setBounds(241, 497, 109, 25);
				panel_9.add(btnEnregistrer_1);
				
				JLabel label_27 = new JLabel("");
				label_27.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\backgrounds-computer-images-nice-service-118812.jpg"));
				label_27.setBounds(0, 0, 595, 522);
				panel_9.add(label_27);
				btnEnregistrer_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (e.getSource() == btnEnregistrer_1) {

							// System.out.println("|"+o+"|");
							String titre = textField_1.getText();
							String date = textField_13.getText();// prenom
							String location = textField_38.getText();// nom
							String retour = textField_39.getText();// age
							String cat = (String) comboBox.getSelectedItem();
							boolean enstock = Boolean.parseBoolean(textField_40
									.getText());// natio
							String realisateur = (textField_7.getText());// adresse

							int derniernum;
							try {
								derniernum = LectureEcriture
										.Getderniernum("dernierfilm");
								Film.setDerniernum(derniernum);

								Film film = new Film(titre, date, location, retour,
										enstock, realisateur, (String) comboBox
												.getSelectedItem());

								Film.addFilm(film);
								String flux = "    " + Film.getDerniernum() + "     "
										+ titre + "    " + date + "   " + location
										+ "   " + retour + "   " + enstock + "   "
										+ cat;

								try {
									LectureEcriture.lect(flux, "film.txt");
									textField_7.setText("");
									textField_13.setText("");
									textField_1.setText("");
									textField_40.setText("");
									textField_39.setText("");
									textField_38.setText("");
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								try {
									LectureEcriture.lect1(
											Integer.toString(Film.getDerniernum()),
											"dernierfilm");
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

						}
					}
				});

		Panel panel_8 = new Panel();
		FIlm1.addTab("Affichage des Films", null, panel_8, null);

		final JButton btnNewButton_3 = new JButton(
				"Clicker pour afficher tous les Films");
		btnNewButton_3.setFont(new Font("Nueva Std", Font.PLAIN, 16));
		final TextArea textArea = new TextArea();
		textArea.setBackground(new Color(255, 102, 102));
		textArea.setEditable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnNewButton_3) {
					try {
						// String prop = textField.getText();
						// this.texte.append(prop + END_LINE);
						String ligne;
						@SuppressWarnings("resource")
						BufferedReader br = new BufferedReader(new FileReader(
								"film.txt"));
						while ((ligne = br.readLine()) != null) {
							textArea.append(ligne + END_LINE);
						}

						;
						// Dessin.afficher();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		
		final JButton button_7 = new JButton("Effacer");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_7){
					textArea.setText("");
				}
			}
		});

		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(72)
							.addComponent(btnNewButton_3))
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_3)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_8.setLayout(gl_panel_8);

		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		FIlm1.addTab("Rechercher et/ou Supprimer un Film", null, panel_25, null);
		final TextArea textArea_3 = new TextArea();
		textArea_3.setBackground(new Color(255, 102, 102));
		textArea_3.setBounds(30, 137, 555, 375);
		panel_25.add(textArea_3);
		textArea_3.setEditable(false);

		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(0, 255, 102));
		panel_26.setLayout(null);
		panel_26.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Film",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_26.setBounds(30, 11, 542, 120);
		panel_25.add(panel_26);

		final JButton button_26 = new JButton("Recherche");
		button_26.setFont(new Font("Nueva Std", Font.PLAIN, 13));

		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == button_26) {

					try {
						// textArea_3.append(" ");
						File myFile = new File("film.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						int i = 0;
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField_53.getText())) {
								textArea_3.append("LIGNE : " + i + "     "
										+ lineRead + END_LINE);
							}

							i++;
						}

						// Determine the number of lines that were read.
						// System.out.println("Total lignes lus: " +
						// reader.getLineNumber());

						// Close the LineNumberReader and FileReader.
						fileReader.close();
						reader.close();
						LectureEcriture.Recherche("film.txt",
								textField1.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					;
				}

			}
		});
		button_26
				.setToolTipText("Effectuer une recherche sur le titre de film");
		button_26.setBounds(249, 42, 116, 23);
		panel_26.add(button_26);

		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(109, 44, 130, 20);
		panel_26.add(textField_53);

		JLabel lblIndiquer = new JLabel("Coordonn\u00E9e:");
		lblIndiquer.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblIndiquer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIndiquer.setBounds(9, 46, 90, 14);
		panel_26.add(lblIndiquer);

		JLabel lblNoDeLigne = new JLabel("No. Ligne:");
		lblNoDeLigne.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		lblNoDeLigne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNoDeLigne.setBounds(19, 80, 80, 14);
		panel_26.add(lblNoDeLigne);

		textField_8 = new JTextField();
		textField_8.setBounds(109, 77, 130, 22);
		panel_26.add(textField_8);
		textField_8.setColumns(10);

		final JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnSupprimer) {
					try {
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(new FileInputStream(
										"film.txt")));

						StringBuffer sb = new StringBuffer();
						String line;

						int nbLinesRead = 0;
						while ((line = reader.readLine()) != null) {
							if (nbLinesRead != Integer.parseInt(textField_8
									.getText())) {

								sb.append(line + "  \n");
							}
							nbLinesRead++;
						}
						reader.close();

						BufferedWriter out = new BufferedWriter(new FileWriter(
								"film.txt"));

						out.write(sb.toString());

						out.close();

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		});
		btnSupprimer.setBounds(249, 76, 116, 23);
		panel_26.add(btnSupprimer);

		final JButton btnAide = new JButton("Besoin d'Aide?");
		btnAide.setFont(new Font("Nueva Std", Font.PLAIN, 13));
		btnAide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnAide) {
					try {
						File myFile = new File("supprech.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField1.getText())) {
								textArea_3.append(lineRead + END_LINE);
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
					;
				}

			}
		});
		btnAide.setBounds(416, 11, 116, 23);
		panel_26.add(btnAide);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\backgrounds-computer-images-nice-service-118812.jpg"));
		label_28.setBounds(0, 0, 595, 522);
		panel_25.add(label_28);

		JPanel panel_32 = new JPanel();
		tabbedPane.addTab("Jeu", null, panel_32, null);
		panel_32.setLayout(null);

		JTabbedPane Jeu1 = new JTabbedPane(JTabbedPane.TOP);
		Jeu1.setBounds(0, 0, 600, 550);
		panel_32.add(Jeu1);

		JPanel Ajouter = new JPanel();
		Ajouter.setBackground(new Color(153, 255, 255));
		Ajouter.setLayout(null);
		Jeu1.addTab("Ajout d'un Jeu", null, Ajouter, null);

		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(255, 51, 255));
		panel_28.setLayout(null);
		panel_28.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Jeu",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_28.setBounds(28, 46, 541, 429);
		Ajouter.add(panel_28);
		
		JLabel lblInformationsJeu = new JLabel("Informations Jeu:");
		lblInformationsJeu.setForeground(Color.BLACK);
		lblInformationsJeu.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblInformationsJeu.setBounds(-1, 0, 221, 39);
		panel_28.add(lblInformationsJeu);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(371, 44, 145, 34);
		panel_28.add(textField_2);

		JLabel lblDate_1 = new JLabel("Date de sortie:");
		lblDate_1.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblDate_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate_1.setBounds(246, 51, 116, 14);
		panel_28.add(lblDate_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(79, 44, 145, 34);
		panel_28.add(textField_3);

		JLabel lblTitre_1 = new JLabel("Titre:");
		lblTitre_1.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblTitre_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitre_1.setBounds(25, 51, 46, 14);
		panel_28.add(lblTitre_1);

		JLabel lblDateDeLocation = new JLabel("Date de location:");
		lblDateDeLocation.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblDateDeLocation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateDeLocation.setBounds(246, 107, 115, 14);
		panel_28.add(lblDateDeLocation);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(371, 99, 145, 34);
		panel_28.add(textField_4);

		JLabel lblDateDeRetour = new JLabel("Date de retour:");
		lblDateDeRetour.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblDateDeRetour.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateDeRetour.setBounds(259, 160, 104, 14);
		panel_28.add(lblDateDeRetour);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(371, 152, 145, 34);
		panel_28.add(textField_5);

		JLabel lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblStock.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStock.setBounds(5, 107, 66, 14);
		panel_28.add(lblStock);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(79, 99, 145, 34);
		panel_28.add(textField_6);

		JLabel lblEditeur = new JLabel("Editeur:");
		lblEditeur.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblEditeur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEditeur.setBounds(5, 160, 67, 20);
		panel_28.add(lblEditeur);

		JLabel lblCategorie = new JLabel("Categorie:");
		lblCategorie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategorie.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblCategorie.setBounds(-12, 262, 83, 14);
		panel_28.add(lblCategorie);

		JLabel lblDevelopeur = new JLabel("Developeur:");
		lblDevelopeur.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblDevelopeur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDevelopeur.setBounds(-12, 210, 88, 20);
		panel_28.add(lblDevelopeur);

		textField_9 = new JTextField();
		textField_9.setBounds(79, 152, 145, 34);
		panel_28.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(79, 203, 145, 34);
		panel_28.add(textField_10);
		textField_10.setColumns(10);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Action",
				"Adult", "Adventure", "Animation", "Black Cast", "Comedy",
				"Crime", "Drama", "Family", "Fantasy", "Film_Noir", "Horror",
				"Martial Arts", "Musical", "Mystery", "Religions", "Romance",
				"Sci-Fi", "Serial", "Short", "Silent", "Thriller" }));
		comboBox_1.setBounds(79, 254, 145, 34);
		panel_28.add(comboBox_1);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\images.jpg"));
		label_19.setBounds(234, 223, 297, 195);
		panel_28.add(label_19);
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\wallpaper-surprising-nice-background-wallpaper-hd-wallpapers.jpg"));
		label_29.setBounds(-29, 0, 586, 429);
		panel_28.add(label_29);

		final JButton btnValider_1 = new JButton("Enregistrer");
		btnValider_1.setFont(new Font("Papyrus", Font.BOLD, 11));
		btnValider_1.setBounds(241, 497, 109, 25);
		Ajouter.add(btnValider_1);
		
		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\wallpaper-surprising-nice-background-wallpaper-hd-wallpapers.jpg"));
		label_30.setBounds(0, 0, 595, 522);
		Ajouter.add(label_30);
		btnValider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnValider_1) {

					// System.out.println("|"+o+"|");
					String titre = textField_3.getText();
					String date = textField_2.getText();// prenom
					String location = textField_4.getText();// nom
					String retour = textField_4.getText();// age
					String cat = (String) comboBox_1.getSelectedItem();
					boolean enstock = Boolean.parseBoolean(textField_5
							.getText());// natio
					String editeur = (textField_9.getText());// adresse
					String developeur = (textField_10.getText());

					int derniernum;
					try {
						derniernum = LectureEcriture
								.Getderniernum("dernierJeu");
						Jeu.getDerniernumero();

						Jeu jeu = new Jeu(titre, date, location, retour,
								enstock, editeur, developeur, cat);
						Jeu.addJeu(jeu);

						String flux = "    " + Jeu.getDerniernumero() + "     "
								+ titre + "    " + date + "   " + location
								+ "   " + retour + "   " + enstock + "   "
								+ cat + "   " + editeur + "   " + developeur;

						try {
							LectureEcriture.lect(flux, "Jeu");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_9.setText("");
							textField_10.setText("");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							LectureEcriture.lect1(
									Integer.toString(Film.getDerniernum()),
									"dernierfilm");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});

		JPanel Afficher_Jeu = new JPanel();
		Jeu1.addTab("Affichage des Jeux", null, Afficher_Jeu, null);
		final TextArea textArea_2 = new TextArea();
		textArea_2.setBackground(new Color(255, 102, 102));
		textArea_2.setEditable(false);

		final JButton btnClickerPourAfficher_1 = new JButton(
				"Clicker pour afficher la liste des Jeux");
		btnClickerPourAfficher_1.setBackground(new Color(0, 255, 255));
		btnClickerPourAfficher_1.setFont(new Font("Papyrus", Font.BOLD, 13));
		btnClickerPourAfficher_1.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnClickerPourAfficher_1) {
					try {
						// String prop = textField.getText();
						// this.texte.append(prop + END_LINE);
						String ligne;
						BufferedReader br = new BufferedReader(new FileReader(
								"Jeu"));
						while ((ligne = br.readLine()) != null) {
							textArea_2.append(ligne + END_LINE);
						}

						;
						// Dessin.afficher();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		});
		
		final JButton button_8 = new JButton("Effacer");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_8){
					textArea_2.setText("");
				}
			}
		});
		GroupLayout gl_Afficher_Jeu = new GroupLayout(Afficher_Jeu);
		gl_Afficher_Jeu.setHorizontalGroup(
			gl_Afficher_Jeu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Afficher_Jeu.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Afficher_Jeu.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Afficher_Jeu.createSequentialGroup()
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(58)
							.addComponent(btnClickerPourAfficher_1, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_Afficher_Jeu.setVerticalGroup(
			gl_Afficher_Jeu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Afficher_Jeu.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Afficher_Jeu.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClickerPourAfficher_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea_2, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
					.addContainerGap())
		);
		Afficher_Jeu.setLayout(gl_Afficher_Jeu);

		JPanel Rechercher_Sup = new JPanel();
		Rechercher_Sup.setLayout(null);
		Jeu1.addTab("Rechercher et/ou Supprimer un Jeu", null, Rechercher_Sup, null);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(0, 0, 595, 522);
		Rechercher_Sup.add(panel_12);

		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(0, 255, 102));
		panel_22.setLayout(null);
		panel_22.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Jeu",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_22.setBounds(30, 11, 542, 120);
		panel_12.add(panel_22);

		final JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.setFont(new Font("Papyrus", Font.BOLD, 11));

		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnRechercher) {

					try {
						// textArea_3.append(" ");
						File myFile = new File("Jeu");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						int i = 0;
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField_11.getText())) {
								textArea_4.append("LIGNE : " + i + "     "
										+ lineRead + END_LINE);
							}

							i++;
						}

						// Determine the number of lines that were read.
						// System.out.println("Total lignes lus: " +
						// reader.getLineNumber());

						// Close the LineNumberReader and FileReader.
						fileReader.close();
						reader.close();
						LectureEcriture.Recherche("Jeu", textField_11.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					;
				}

			}
		});
		btnRechercher
				.setToolTipText("Effectuer une recherche sur le titre de film");
		btnRechercher.setBounds(249, 42, 116, 23);
		panel_22.add(btnRechercher);

		textField_11 = new JTextField();
		textField_11.setFont(new Font("Papyrus", Font.BOLD, 11));
		textField_11.setColumns(10);
		textField_11.setBounds(109, 44, 130, 20);
		panel_22.add(textField_11);

		JLabel lblCoordonne = new JLabel("Coordonn\u00E9e:");
		lblCoordonne.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblCoordonne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCoordonne.setBounds(9, 46, 90, 14);
		panel_22.add(lblCoordonne);

		JLabel lblNoLigne_1 = new JLabel("No. Ligne:");
		lblNoLigne_1.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblNoLigne_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNoLigne_1.setBounds(19, 80, 80, 14);
		panel_22.add(lblNoLigne_1);

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Papyrus", Font.BOLD, 11));
		textField_12.setColumns(10);
		textField_12.setBounds(109, 77, 130, 22);
		panel_22.add(textField_12);

		final JButton button_5 = new JButton("Supprimer");
		button_5.setFont(new Font("Papyrus", Font.BOLD, 11));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == button_5) {
					try {
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(
										new FileInputStream("Jeu")));

						StringBuffer sb = new StringBuffer();
						String line;

						int nbLinesRead = 0;
						while ((line = reader.readLine()) != null) {
							if (nbLinesRead != Integer.parseInt(textField_12
									.getText())) {

								sb.append(line + "  \n");
							}
							nbLinesRead++;
						}
						reader.close();

						BufferedWriter out = new BufferedWriter(new FileWriter(
								"Jeu"));

						out.write(sb.toString());

						out.close();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		button_5.setBounds(249, 76, 116, 23);
		panel_22.add(button_5);

		final JButton btnBesoinDaide_1 = new JButton("Besoin d'Aide?");
		btnBesoinDaide_1.setFont(new Font("Papyrus", Font.BOLD, 11));
		btnBesoinDaide_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnBesoinDaide_1) {
					try {
						File myFile = new File("supprech.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField1.getText())) {
								textArea_4.append(lineRead + END_LINE);
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
		btnBesoinDaide_1.setBounds(402, 11, 130, 23);
		panel_22.add(btnBesoinDaide_1);
		textArea_4.setBackground(new Color(255, 102, 102));
		textArea_4.setBounds(30, 137, 555, 375);
		panel_12.add(textArea_4);

		textArea_4.setEditable(false);
		
		JLabel label_31 = new JLabel("");
		label_31.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\wallpaper-surprising-nice-background-wallpaper-hd-wallpapers.jpg"));
		label_31.setBounds(0, 0, 595, 522);
		panel_12.add(label_31);

		// /

		//
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(603, 350, 76, 23);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnQuitter);

		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(603, 190, 76, 23);
		btnMenu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				hide();
			}
		});
		contentPane.add(btnMenu);

		JButton btnLouer = new JButton("Louer");
		btnLouer.setBounds(603, 270, 76, 23);
		btnLouer.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					hide();
					frmLouer frame = new frmLouer();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnLouer);

	}
}
