package videoclub;

/**
 *  @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 */
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

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.*;

import java.awt.*;

import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TexteHtml extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_100;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
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

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public TexteHtml() throws Exception {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 1000);

		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 638);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		final TextArea textArea_4 = new TextArea();
		textArea_4.setBackground(new Color(255, 102, 102));
		final TextArea textArea_3 = new TextArea();
		textArea_3.setBackground(new Color(255, 102, 102));

		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 607, 589);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Adherent", null, panel, null);
		panel.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane_1.setBounds(0, 0, 606, 550);
		panel.add(tabbedPane_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 0, 0));
		tabbedPane_1.addTab("Ajouter", null, panel_2, null);
		panel_2.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"),
				"Coordonn\u00E9es de l'Adeherent", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_4.setBounds(28, 46, 541, 440);
		panel_2.add(panel_4);
		panel_4.setLayout(null);

		JLabel label_11 = new JLabel("Informations Adherent:");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		label_11.setBounds(-1, 0, 221, 39);
		panel_4.add(label_11);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(270, 66, 261, 210);
		lblNewLabel_3
				.setIcon(new ImageIcon(
						"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\unknown_person.png"));

		panel_4.add(lblNewLabel_3);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(79, 99, 145, 34);
		panel_4.add(textField_25);

		JLabel lblPrnom = new JLabel("Pr\u00E9nom:");
		lblPrnom.setForeground(new Color(255, 255, 255));
		lblPrnom.setFont(new Font("Centaur", Font.BOLD, 13));
		lblPrnom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrnom.setBounds(8, 107, 68, 14);
		panel_4.add(lblPrnom);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(79, 44, 145, 34);
		panel_4.add(textField_26);

		JLabel lblNom = new JLabel("Nom:");
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setFont(new Font("Centaur", Font.BOLD, 13));
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom.setBounds(27, 51, 46, 14);
		panel_4.add(lblNom);
		JLabel lblPrnom1 = new JLabel("Sex:");
		lblPrnom1.setForeground(new Color(255, 255, 255));
		lblPrnom1.setFont(new Font("Centaur", Font.BOLD, 13));
		lblPrnom1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrnom1.setBounds(45, 160, 29, 14);
		panel_4.add(lblPrnom1);

		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(79, 152, 145, 34);
		panel_4.add(textField_100);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(new Color(255, 255, 255));
		lblAge.setFont(new Font("Centaur", Font.BOLD, 13));
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setBounds(27, 210, 46, 14);
		panel_4.add(lblAge);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(79, 203, 145, 34);
		panel_4.add(textField_27);

		JLabel lblNationalit = new JLabel("Nationalit\u00E9:");
		lblNationalit.setForeground(new Color(255, 255, 255));
		lblNationalit.setFont(new Font("Centaur", Font.BOLD, 13));
		lblNationalit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNationalit.setBounds(0, 262, 77, 14);
		panel_4.add(lblNationalit);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(79, 254, 145, 34);
		panel_4.add(textField_30);

		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setForeground(new Color(255, 255, 255));
		lblAdresse.setFont(new Font("Centaur", Font.BOLD, 13));
		lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdresse.setBounds(18, 323, 59, 14);
		panel_4.add(lblAdresse);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(79, 307, 300, 50);
		panel_4.add(textField_31);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4
				.setIcon(new ImageIcon(
						"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		lblNewLabel_4.setBounds(-28, -3, 582, 443);
		panel_4.add(lblNewLabel_4);

		JLabel lblAjoutDunAdeherent = new JLabel("BIENVENUE EMPLOYE");
		lblAjoutDunAdeherent.setForeground(Color.RED);
		lblAjoutDunAdeherent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjoutDunAdeherent
				.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblAjoutDunAdeherent.setBounds(165, 7, 242, 28);
		panel_2.add(lblAjoutDunAdeherent);

		final JButton btnNewButton_5 = new JButton("Enregistrer");
		btnNewButton_5.setFont(new Font("Centaur", Font.BOLD, 13));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnNewButton_5) {
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
						// Adeherent.adeherent.add(emp1);
						String flux = Adeherent.getDerniernum() + "-" + sex
								+ "-" + nom + "-" + prenom + "-" + age + "-"
								+ nat + "-" + adresse;

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
		btnNewButton_5.setBounds(241, 497, 109, 25);
		panel_2.add(btnNewButton_5);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_4.setBounds(0, 0, 591, 522);
		panel_2.add(label_4);
		final String END_LINE = System.getProperty("line.separator");

		Panel panel_19 = new Panel();
		tabbedPane_1.addTab("Affichage", null, panel_19, null);

		final TextArea textArea_1 = new TextArea();
		textArea_1.setBackground(new Color(255, 102, 102));
		textArea_1.setEditable(false);

		final JButton btnNewButton = new JButton(
				"Clicker Pour Afficher la liste des Adeherents");
		btnNewButton.setFont(new Font("Centaur", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
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

		final JButton btnEffacer = new JButton("Effacer");
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnEffacer) {
					textArea_1.setText("");
				}
			}
		});
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19
				.setHorizontalGroup(gl_panel_19
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_19
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_19
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																gl_panel_19
																		.createSequentialGroup()
																		.addComponent(
																				textArea_1,
																				GroupLayout.DEFAULT_SIZE,
																				581,
																				Short.MAX_VALUE)
																		.addContainerGap())
														.addGroup(
																gl_panel_19
																		.createSequentialGroup()
																		.addComponent(
																				btnEffacer,
																				GroupLayout.PREFERRED_SIZE,
																				75,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				70,
																				Short.MAX_VALUE)
																		.addComponent(
																				btnNewButton)
																		.addGap(127)))));
		gl_panel_19
				.setVerticalGroup(gl_panel_19
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_19
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_19
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																btnNewButton)
														.addComponent(
																btnEffacer,
																GroupLayout.PREFERRED_SIZE,
																26,
																GroupLayout.PREFERRED_SIZE))
										.addGap(10)
										.addComponent(textArea_1,
												GroupLayout.DEFAULT_SIZE, 464,
												Short.MAX_VALUE)
										.addContainerGap()));
		panel_19.setLayout(gl_panel_19);
		// ---------------------------------------------------------------------------------------
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane_1.addTab("Modifier", null, panel_5, null);

		final JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setBounds(241, 497, 109, 25);
		panel_5.add(btnEnregistrer);
		btnEnregistrer.setFont(new Font("Centaur", Font.BOLD, 13));

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Adh\u00E9rent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(28, 46, 541, 415);
		panel_5.add(panel_6);

		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\google-updating-1371646685.gif"));
		label_12.setBounds(266, 75, 295, 231);
		panel_6.add(label_12);

		JLabel label_10 = new JLabel("Informations Adherent:");
		label_10.setForeground(new Color(255, 255, 255));
		label_10.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		label_10.setBounds(-1, 0, 221, 39);
		panel_6.add(label_10);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(79, 99, 145, 34);
		panel_6.add(textField_32);

		JLabel lblPrnom_1 = new JLabel("Pr\u00E9nom:");
		lblPrnom_1.setForeground(new Color(255, 255, 255));
		lblPrnom_1.setFont(new Font("Centaur", Font.BOLD, 13));
		lblPrnom_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrnom_1.setBounds(8, 107, 68, 14);
		panel_6.add(lblPrnom_1);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(79, 44, 145, 34);
		panel_6.add(textField_33);

		JLabel lblNom_1 = new JLabel("Nom:");
		lblNom_1.setForeground(new Color(255, 255, 255));
		lblNom_1.setFont(new Font("Centaur", Font.BOLD, 13));
		lblNom_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom_1.setBounds(27, 51, 46, 14);
		panel_6.add(lblNom_1);

		JLabel lblAge_1 = new JLabel("Age:");
		lblAge_1.setForeground(new Color(255, 255, 255));
		lblAge_1.setFont(new Font("Centaur", Font.BOLD, 13));
		lblAge_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge_1.setBounds(27, 210, 46, 14);
		panel_6.add(lblAge_1);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(79, 200, 145, 34);
		panel_6.add(textField_34);

		JLabel lblNationalit_1 = new JLabel("Nationalit\u00E9:");
		lblNationalit_1.setForeground(new Color(255, 255, 255));
		lblNationalit_1.setFont(new Font("Centaur", Font.BOLD, 13));
		lblNationalit_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNationalit_1.setBounds(-1, 262, 77, 14);
		panel_6.add(lblNationalit_1);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(79, 252, 145, 34);
		panel_6.add(textField_35);

		JLabel lblAdresse_1 = new JLabel("Adresse:");
		lblAdresse_1.setForeground(new Color(255, 255, 255));
		lblAdresse_1.setFont(new Font("Centaur", Font.BOLD, 13));
		lblAdresse_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdresse_1.setBounds(17, 323, 59, 14);
		panel_6.add(lblAdresse_1);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(79, 307, 300, 50);
		panel_6.add(textField_36);

		final JButton btnRechercher_2 = new JButton("Rechercher");
		btnRechercher_2.setFont(new Font("Centaur", Font.BOLD, 13));
		btnRechercher_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] parts;
				if (arg0.getSource() == btnRechercher_2) {

					try {

						File myFile = new File("adedernier.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						lineRead = reader.readLine();

						if (lineRead.contains(textField_33.getText())) {
							parts = lineRead.split("-");

							// textField_33.setText(parts[2]);
							textField_20.setText(parts[1]);
							textField_32.setText(parts[3]);
							textField_35.setText(parts[5]);
							textField_36.setText(parts[6]);
							textField_20.setText(parts[1]);
							textField_34.setText(parts[4]);

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

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		});
		btnRechercher_2
				.setToolTipText("Effectuer une recherche sur le titre de film");
		btnRechercher_2.setBounds(266, 50, 113, 23);
		panel_6.add(btnRechercher_2);

		textField_20 = new JTextField();
		textField_20.setBounds(79, 152, 145, 34);
		panel_6.add(textField_20);
		textField_20.setColumns(10);

		JLabel lblSex = new JLabel("Sex:");
		lblSex.setForeground(new Color(255, 255, 255));
		lblSex.setFont(new Font("Centaur", Font.BOLD, 13));
		lblSex.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSex.setBounds(45, 160, 29, 14);
		panel_6.add(lblSex);

		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_5.setBounds(-28, 0, 569, 430);
		panel_6.add(label_5);

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_6.setBounds(0, 0, 591, 522);
		panel_5.add(label_6);
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnEnregistrer) {

					String sex = textField_20.getText();
					String prenom = textField_32.getText();// prenom
					String nom = textField_33.getText();// nom
					int age = Integer.parseInt(textField_34.getText());// age
					String nat = (textField_35.getText());// natio
					String adresse = (textField_36.getText());// adresse

					int derniernum;
					try {
						derniernum = LectureEcriture
								.Getderniernum("adedernier");
						Adeherent.setDerniernum(derniernum);
						Adeherent emp1 = new Adeherent(sex, nom, prenom, age,
								nat, adresse);

						//Adeherent.addAdeherent(emp1);
						// Adeherent.adeherent.add(emp1);
						String flux = Adeherent.getDerniernum() + "-" + sex
								+ "-" + nom + "-" + prenom + "-" + age + "-"
								+ nat + "-" + adresse;

						try {
							LectureEcriture.lect(flux, "adedernier.txt");
							textField_20.setText("");
							textField_32.setText("");
							textField_33.setText("");
							textField_34.setText("");
							textField_35.setText("");
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
		});

		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		tabbedPane_1.addTab("Rechercher et/ou Supprimer", null, panel_17, null);

		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(51, 255, 51));
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
		textField.setBounds(109, 77, 130, 20);
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
		lblNewLabel.setFont(new Font("Centaur", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(19, 80, 80, 14);
		panel_18.add(lblNewLabel);

		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\sceam-pink-purple-black.gif"));
		label_7.setBounds(0, 0, 591, 522);
		panel_17.add(label_7);
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

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 600, 550);
		panel_1.add(tabbedPane_2);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(51, 153, 0));
		panel_9.setLayout(null);
		tabbedPane_2.addTab("Ajout d'un Film", null, panel_9, null);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setForeground(Color.BLUE);
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"),
				"Caract\u00E9ristiques d'un Film", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_13.setBounds(28, 46, 541, 429);
		panel_9.add(panel_13);

		JLabel lblImage = new JLabel("");
		lblImage.setBounds(234, 144, 282, 274);
		panel_13.add(lblImage);
		lblImage.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\video.jpg"));

		JLabel lblInformationsFilm = new JLabel("Informations Film:");
		lblInformationsFilm.setForeground(new Color(0, 0, 0));
		lblInformationsFilm.setFont(new Font("Nueva Std", Font.BOLD, 15));
		lblInformationsFilm.setBounds(0, -6, 221, 39);
		panel_13.add(lblInformationsFilm);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 99, 145, 34);
		panel_13.add(textField_1);

		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate.setBounds(39, 107, 36, 14);
		panel_13.add(lblDate);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(79, 44, 145, 34);
		panel_13.add(textField_13);

		JLabel lblTitre = new JLabel("Titre:");
		lblTitre.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblTitre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitre.setBounds(39, 51, 37, 14);
		panel_13.add(lblTitre);

		JLabel lblDatelocation = new JLabel("Date de location:");
		lblDatelocation.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblDatelocation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatelocation.setBounds(256, 107, 112, 14);
		panel_13.add(lblDatelocation);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(371, 99, 145, 34);
		panel_13.add(textField_38);

		JLabel lblDateretour = new JLabel("Date de retour:");
		lblDateretour.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblDateretour.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateretour.setBounds(269, 51, 97, 14);
		panel_13.add(lblDateretour);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(371, 44, 145, 34);
		panel_13.add(textField_39);

		JLabel lblEnstock = new JLabel("Stock:");
		lblEnstock.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblEnstock.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnstock.setBounds(25, 160, 49, 14);
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
		lblNewLabel_1.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(0, 210, 77, 14);
		panel_13.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Categorie:");
		lblNewLabel_2.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(-2, 262, 78, 14);
		panel_13.add(lblNewLabel_2);

		JList list = new JList();
		list.setBounds(242, 310, 1, 1);
		panel_13.add(list);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Action",
				"Adult", "Adventure", "Animation", "Black Cast", "Comedy",
				"Crime", "Drama", "Family", "Fantasy", "Film_Noir", "Horror",
				"Martial Arts", "Musical", "Mystery", "Religions", "Romance",
				"Sci-Fi", "Serial", "Short", "Silent", "Thriller" }));
		comboBox.setBounds(79, 254, 145, 34);
		panel_13.add(comboBox);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(272, 160, 247, 227);
		panel_13.add(label_2);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5
				.setIcon(new ImageIcon(
						"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\backgrounds-computer-images-nice-service-118812.jpg"));
		lblNewLabel_5.setBounds(-29, 0, 570, 429);
		panel_13.add(lblNewLabel_5);

		final JButton btnEnregister = new JButton("Enregistrer");
		btnEnregister.setFont(new Font("Nueva Std", Font.BOLD, 13));
		btnEnregister.setBounds(241, 497, 109, 25);
		panel_9.add(btnEnregister);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\backgrounds-computer-images-nice-service-118812.jpg"));
		label.setBounds(0, 0, 595, 522);
		panel_9.add(label);
		btnEnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnEnregister) {

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
		tabbedPane_2.addTab("Affichage des Films", null, panel_8, null);

		final JButton btnNewButton_3 = new JButton(
				"Clicker pour afficher la liste des Films");
		btnNewButton_3.setFont(new Font("Nueva Std", Font.BOLD, 16));
		final TextArea textArea = new TextArea();
		textArea.setBackground(new Color(255, 102, 102));
		textArea.setEditable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnNewButton_3) {
					try {
						// String prop = textField.getText();
						// this.texte.append(prop + END_LINE);
						String ligne;
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

		final JButton button = new JButton("Effacer");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					textArea.setText("");
				}
			}
		});

		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8
				.setHorizontalGroup(gl_panel_8
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_8
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_8
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																gl_panel_8
																		.createSequentialGroup()
																		.addComponent(
																				textArea,
																				GroupLayout.DEFAULT_SIZE,
																				575,
																				Short.MAX_VALUE)
																		.addContainerGap())
														.addGroup(
																gl_panel_8
																		.createSequentialGroup()
																		.addComponent(
																				button,
																				GroupLayout.PREFERRED_SIZE,
																				75,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				71,
																				Short.MAX_VALUE)
																		.addComponent(
																				btnNewButton_3)
																		.addGap(144)))));
		gl_panel_8
				.setVerticalGroup(gl_panel_8
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_8
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_8
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																btnNewButton_3)
														.addComponent(
																button,
																GroupLayout.PREFERRED_SIZE,
																26,
																GroupLayout.PREFERRED_SIZE))
										.addGap(10)
										.addComponent(textArea,
												GroupLayout.DEFAULT_SIZE, 466,
												Short.MAX_VALUE)
										.addContainerGap()));
		panel_8.setLayout(gl_panel_8);

		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		tabbedPane_2.addTab("Recherche et/ou Supprimer un Film", null,
				panel_25, null);

		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(51, 255, 102));
		panel_26.setLayout(null);
		panel_26.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Film",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_26.setBounds(30, 11, 542, 120);
		panel_25.add(panel_26);

		final JButton btnRechercher_1 = new JButton("Rechercher");
		btnRechercher_1.setFont(new Font("Nueva Std", Font.BOLD, 13));

		btnRechercher_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnRechercher_1) {

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
		btnRechercher_1
				.setToolTipText("Effectuer une recherche sur le titre de film");
		btnRechercher_1.setBounds(249, 43, 116, 23);
		panel_26.add(btnRechercher_1);

		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(109, 44, 130, 20);
		panel_26.add(textField_53);

		JLabel lblIndiquer = new JLabel("Coordonn\u00E9e:");
		lblIndiquer.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblIndiquer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIndiquer.setBounds(9, 46, 90, 14);
		panel_26.add(lblIndiquer);

		JLabel lblNoDeLigne = new JLabel("No. Ligne:");
		lblNoDeLigne.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblNoDeLigne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNoDeLigne.setBounds(19, 80, 80, 14);
		panel_26.add(lblNoDeLigne);

		textField_8 = new JTextField();
		textField_8.setBounds(109, 77, 130, 20);
		panel_26.add(textField_8);
		textField_8.setColumns(10);

		final JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Nueva Std", Font.BOLD, 13));
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
		btnAide.setFont(new Font("Nueva Std", Font.BOLD, 13));
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
		textArea_3.setBounds(30, 137, 555, 375);
		panel_25.add(textArea_3);
		textArea_3.setEditable(false);

		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\backgrounds-computer-images-nice-service-118812.jpg"));
		label_8.setBounds(0, 0, 595, 522);
		panel_25.add(label_8);

		JPanel panel_32 = new JPanel();
		tabbedPane.addTab("Jeu", null, panel_32, null);
		panel_32.setLayout(null);

		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 600, 550);
		panel_32.add(tabbedPane_4);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(153, 255, 255));
		panel_10.setLayout(null);
		tabbedPane_4.addTab("Ajout d'un Jeu", null, panel_10, null);

		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(255, 255, 255));
		panel_28.setLayout(null);
		panel_28.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Jeu",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_28.setBounds(28, 46, 541, 429);
		panel_10.add(panel_28);

		JLabel imgJeu = new JLabel("");
		imgJeu.setBounds(234, 197, 297, 209);
		imgJeu.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\Jeu.jpg"));
		panel_28.add(imgJeu);

		JLabel lblInformationsJeu = new JLabel("Informations Jeu");
		lblInformationsJeu.setForeground(Color.BLACK);
		lblInformationsJeu.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblInformationsJeu.setBounds(0, -6, 221, 39);
		panel_28.add(lblInformationsJeu);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(371, 44, 145, 34);
		panel_28.add(textField_2);

		JLabel lblDate_1 = new JLabel("Date de sortie:");
		lblDate_1.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblDate_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate_1.setBounds(259, 51, 103, 14);
		panel_28.add(lblDate_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(79, 44, 145, 34);
		panel_28.add(textField_3);

		JLabel lblTitre_1 = new JLabel("Titre:");
		lblTitre_1.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblTitre_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitre_1.setBounds(22, 51, 49, 14);
		panel_28.add(lblTitre_1);

		JLabel lblDateDeLocation = new JLabel("Date de location:");
		lblDateDeLocation.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblDateDeLocation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateDeLocation.setBounds(259, 107, 102, 14);
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
		lblStock.setBounds(22, 107, 49, 14);
		panel_28.add(lblStock);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(79, 99, 145, 34);
		panel_28.add(textField_6);

		JLabel lblEditeur = new JLabel("Editeur:");
		lblEditeur.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblEditeur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEditeur.setBounds(13, 160, 59, 14);
		panel_28.add(lblEditeur);

		JLabel lblCategorie = new JLabel("Categorie:");
		lblCategorie.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblCategorie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategorie.setBounds(10, 262, 66, 14);
		panel_28.add(lblCategorie);

		JLabel lblDevelopeur = new JLabel("Developeur:");
		lblDevelopeur.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblDevelopeur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDevelopeur.setBounds(-12, 210, 88, 14);
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

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\wallpaper-surprising-nice-background-wallpaper-hd-wallpapers.jpg"));
		label_1.setBounds(-28, 0, 569, 429);
		panel_28.add(label_1);

		final JButton btnValider_1 = new JButton("Enregistrer");
		btnValider_1.setFont(new Font("Papyrus", Font.PLAIN, 11));
		btnValider_1.setBounds(252, 497, 103, 25);
		panel_10.add(btnValider_1);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\wallpaper-surprising-nice-background-wallpaper-hd-wallpapers.jpg"));
		label_3.setBounds(0, 0, 595, 522);
		panel_10.add(label_3);
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
						// Jeu.setDerniernumero(derniernum);
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

		JPanel panel_11 = new JPanel();
		tabbedPane_4.addTab("Affichage d'un Jeu", null, panel_11, null);
		final TextArea textArea_2 = new TextArea();
		textArea_2.setBackground(new Color(255, 102, 102));
		textArea_2.setEditable(false);

		final JButton btnNewButton_4 = new JButton(
				"Clicker pour afficher la liste des Jeux");
		btnNewButton_4.setFont(new Font("Papyrus", Font.BOLD, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnNewButton_4) {
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

		final JButton button_1 = new JButton("Effacer");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_1) {
					textArea_2.setText("");
				}
			}
		});

		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11
				.setHorizontalGroup(gl_panel_11
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_11
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_11
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																textArea_2,
																GroupLayout.DEFAULT_SIZE,
																575,
																Short.MAX_VALUE)
														.addGroup(
																gl_panel_11
																		.createSequentialGroup()
																		.addComponent(
																				button_1,
																				GroupLayout.PREFERRED_SIZE,
																				75,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(66)
																		.addComponent(
																				btnNewButton_4)))
										.addContainerGap()));
		gl_panel_11
				.setVerticalGroup(gl_panel_11
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_11
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_11
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																btnNewButton_4,
																GroupLayout.PREFERRED_SIZE,
																27,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																button_1,
																GroupLayout.PREFERRED_SIZE,
																26,
																GroupLayout.PREFERRED_SIZE))
										.addGap(10)
										.addComponent(textArea_2,
												GroupLayout.DEFAULT_SIZE, 464,
												Short.MAX_VALUE)
										.addContainerGap()));
		panel_11.setLayout(gl_panel_11);

		JPanel panel_37 = new JPanel();
		panel_37.setLayout(null);
		tabbedPane_4.addTab("Rechercher et/ou Supprimer un Jeu", null,
				panel_37, null);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(0, 0, 585, 522);
		panel_37.add(panel_12);

		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(51, 255, 102));
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
		btnRechercher.setBounds(249, 43, 116, 23);
		panel_22.add(btnRechercher);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(109, 44, 130, 20);
		panel_22.add(textField_11);

		JLabel lblCoordonne = new JLabel("Coordonn\u00E9e:");
		lblCoordonne.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblCoordonne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCoordonne.setBounds(9, 46, 90, 14);
		panel_22.add(lblCoordonne);

		JLabel lblNoLigne = new JLabel("No. Ligne:");
		lblNoLigne.setFont(new Font("Papyrus", Font.BOLD, 11));
		lblNoLigne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNoLigne.setBounds(19, 80, 80, 14);
		panel_22.add(lblNoLigne);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(109, 77, 130, 20);
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

		final JButton btnBesoinDaide = new JButton("Besoin d'Aide?");
		btnBesoinDaide.setFont(new Font("Papyrus", Font.BOLD, 11));
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
		btnBesoinDaide.setBounds(395, 11, 137, 23);
		panel_22.add(btnBesoinDaide);
		textArea_4.setBounds(30, 137, 555, 375);
		panel_12.add(textArea_4);

		textArea_4.setEditable(false);

		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(
				"C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\wallpaper-surprising-nice-background-wallpaper-hd-wallpapers.jpg"));
		label_9.setBounds(0, 0, 585, 522);
		panel_12.add(label_9);

		// /

		//
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(603, 350, 76, 23);
		contentPane.add(btnQuitter);

		JButton btnMenu = new JButton("Log out");
		btnMenu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				hide();
			}
		});
		btnMenu.setBounds(603, 190, 76, 23);
		contentPane.add(btnMenu);

		JButton btnLouer = new JButton("Louer");
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
		btnLouer.setBounds(603, 270, 76, 23);
		contentPane.add(btnLouer);

	}

	@SuppressWarnings("unused")
	private String lireFichier(String adresse) {
		// TODO Auto-generated method stub

		String phrases = "";
		String ligne;
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(adresse));
			while ((ligne = br.readLine()) != null) {
				phrases += ligne;
			}
		} catch (Exception e) {
			System.out.print("Erreur de lecture" + e);
		}

		return phrases;
	}
}
