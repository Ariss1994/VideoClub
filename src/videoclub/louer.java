package videoclub;

/**
 * 
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

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTable;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.awt.Label;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

import javax.swing.JTextArea;

import java.awt.Button;

import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDayChooser;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

public class louer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_25;
	private JTextField textField_4;
	private JTextField textField_21;
	private JTable table_3;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTable table_8;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_20;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTable table_10;
	private JTextField textField_42;
	private JTable table_11;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTable table_12;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public louer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 650);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 600, 650);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Film", null, panel, null);
		panel.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 600, 650);
		panel.add(tabbedPane_1);
		final JYearChooser yearChooser = new JYearChooser();
		final JMonthChooser monthChooser = new JMonthChooser();
		final JDayChooser dayChooser = new JDayChooser();
		final JTextArea txt = new JTextArea();

		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Emprunter une copie", null, panel_2, null);
		panel_2.setLayout(null);
		final TextArea textArea_3 = new TextArea();
		textArea_3.setEditable(false);

		textArea_3.setBounds(20, 218, 322, 247);
		textArea_3.setVisible(true);
		panel_2.add(textArea_3);
		Button button_1 = new Button("New button");
		button_1.setBounds(435, 326, 70, 22);
		panel_2.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * int x = yearChooser.getYear(); int y =
				 * monthChooser.getMonth(); int z = dayChooser.getDay();
				 * txt.append(Integer.toString(x) + "-" + Integer.toString(y +
				 * 1) + "-" + Integer.toString(z));
				 */
			}

		});

		Label label_7 = new Label("Date de Retour");
		label_7.setFont(new Font("Adobe Myungjo Std M", Font.PLAIN, 14));
		label_7.setAlignment(Label.CENTER);
		label_7.setBounds(452, 128, 107, 23);
		panel_2.add(label_7);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(105, 516, 420, 39);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnnuler.setBounds(60, 8, 100, 25);
		panel_3.add(btnAnnuler);

		JButton btnValider = new JButton("Emprunter");
		btnValider.setBounds(260, 8, 100, 25);
		panel_3.add(btnValider);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 23, 575, 494);
		panel_6.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(panel_6);
		final TextArea textArea = new TextArea();
		textArea.setEditable(false);
		final JButton button = new JButton("Recherche");
		final String END_LINE = System.getProperty("line.separator");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == button) {

					try {
						// textArea_3.append(" ");
						File myFile = new File("adedernier.txt");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						int i = 0;
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField_25.getText())) {
								textArea.append("LIGNE : " + i + "     "
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
								textField_25.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					;
				}
			}
		});

		button.setToolTipText("Effectuer une recherche sur le titre de film");

		textField_25 = new JTextField();
		textField_25.setColumns(10);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);

		Label label = new Label("numero");

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		Label label_2 = new Label("Titre FIlm");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		Label label_5 = new Label("Titre jeu");
		final JButton btnValider_1 = new JButton("Valider");
		final JTextArea textArea_2 = new JTextArea();

		btnValider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnValider_1) {

					// System.out.println("|"+o+"|");
					String numero = textField.getText();
					String TitreFilm = textField_1.getText();// prenom
					String TitreJeu = textField_2.getText();// nom
					String DatedeLocation = textArea_2.getText();
					String DatedeRetour = txt.getText();
					int x = yearChooser.getYear();
					int y = monthChooser.getMonth();
					int z = dayChooser.getDay();
					txt.removeAll();
					txt.append(Integer.toString(x) + "-"
							+ Integer.toString(y + 1) + "-"
							+ Integer.toString(z));

					String ligne = numero + "  " + TitreFilm + "  " + TitreJeu
							+ " " + DatedeLocation + " " + DatedeRetour;

					try {
						LectureEcriture.lect(ligne, "FilmJeuEmpruntes");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = dateFormat1.format(gc.getTime());

		Label label_6 = new Label("date de location");

		textArea_2.setEditable(false);
		textArea_2.append(dateString);

		final JButton btnAffichDeLa = new JButton("Affich de la liste des jeux");
		btnAffichDeLa.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAffichDeLa) {
					try {
						// String prop = textField.getText();
						// this.texte.append(prop + END_LINE);
						String ligne;
						BufferedReader br = new BufferedReader(new FileReader(
								"FilmJeuEmpruntes"));
						while ((ligne = br.readLine()) != null) {
							textArea_3.append(ligne + END_LINE);
						}

						;
						// Dessin.afficher();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});

		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6
				.setHorizontalGroup(gl_panel_6
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_panel_6
										.createSequentialGroup()
										.addComponent(lblNom,
												GroupLayout.PREFERRED_SIZE, 43,
												GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(textField_25,
												GroupLayout.PREFERRED_SIZE,
												126, GroupLayout.PREFERRED_SIZE)
										.addComponent(button)
										.addGap(6)
										.addComponent(textArea,
												GroupLayout.PREFERRED_SIZE,
												301, GroupLayout.PREFERRED_SIZE))
						.addGroup(
								gl_panel_6
										.createSequentialGroup()
										.addGap(10)
										.addGroup(
												gl_panel_6
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addComponent(
																				label_6,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				textArea_2,
																				GroupLayout.PREFERRED_SIZE,
																				107,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				191,
																				Short.MAX_VALUE)
																		.addComponent(
																				yearChooser,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				monthChooser,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGroup(
																				gl_panel_6
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_panel_6
																										.createSequentialGroup()
																										.addGap(49)
																										.addComponent(
																												textField,
																												GroupLayout.PREFERRED_SIZE,
																												116,
																												GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								label,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(14)
																		.addComponent(
																				label_2,
																				GroupLayout.PREFERRED_SIZE,
																				50,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				textField_1,
																				GroupLayout.PREFERRED_SIZE,
																				114,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(10)
																		.addComponent(
																				label_5,
																				GroupLayout.PREFERRED_SIZE,
																				64,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				textField_2,
																				GroupLayout.PREFERRED_SIZE,
																				126,
																				GroupLayout.PREFERRED_SIZE))))
						.addGroup(
								gl_panel_6
										.createSequentialGroup()
										.addComponent(btnAffichDeLa)
										.addPreferredGap(
												ComponentPlacement.RELATED,
												220, Short.MAX_VALUE)
										.addGroup(
												gl_panel_6
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																txt,
																GroupLayout.PREFERRED_SIZE,
																177,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																dayChooser,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap())
						.addGroup(
								gl_panel_6
										.createSequentialGroup()
										.addGap(216)
										.addComponent(btnValider_1,
												GroupLayout.PREFERRED_SIZE,
												100, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(249, Short.MAX_VALUE)));
		gl_panel_6
				.setVerticalGroup(gl_panel_6
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_6
										.createSequentialGroup()
										.addGroup(
												gl_panel_6
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(20)
																		.addComponent(
																				lblNom))
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(17)
																		.addComponent(
																				textField_25,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(16)
																		.addComponent(
																				button))
														.addComponent(
																textArea,
																GroupLayout.PREFERRED_SIZE,
																52,
																GroupLayout.PREFERRED_SIZE))
										.addGap(3)
										.addGroup(
												gl_panel_6
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(3)
																		.addGroup(
																				gl_panel_6
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								textField,
																								GroupLayout.PREFERRED_SIZE,
																								23,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								label,
																								GroupLayout.PREFERRED_SIZE,
																								23,
																								GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				label_2,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				textField_1,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				label_5,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																textField_2,
																GroupLayout.PREFERRED_SIZE,
																23,
																GroupLayout.PREFERRED_SIZE))
										.addGroup(
												gl_panel_6
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(19)
																		.addGroup(
																				gl_panel_6
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_panel_6
																										.createSequentialGroup()
																										.addGap(1)
																										.addComponent(
																												label_6,
																												GroupLayout.PREFERRED_SIZE,
																												23,
																												GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								textArea_2,
																								GroupLayout.PREFERRED_SIZE,
																								23,
																								GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addGap(40)
																		.addGroup(
																				gl_panel_6
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								yearChooser,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								monthChooser,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_panel_6
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_6
																		.createSequentialGroup()
																		.addComponent(
																				dayChooser,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(35)
																		.addComponent(
																				txt,
																				GroupLayout.PREFERRED_SIZE,
																				33,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				87,
																				Short.MAX_VALUE)
																		.addComponent(
																				btnValider_1,
																				GroupLayout.PREFERRED_SIZE,
																				25,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																btnAffichDeLa,
																GroupLayout.PREFERRED_SIZE,
																24,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		panel_6.setLayout(gl_panel_6);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		tabbedPane_1.addTab("Retour d'une copie", null, panel_10, null);

		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Choisir un Adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_19.setBounds(30, 11, 555, 129);
		panel_10.add(panel_19);
		final TextArea table_2_1 = new TextArea();
		table_2_1.setBounds(319, 10, 226, 109);
		panel_19.add(table_2_1);

		table_2_1.setEditable(false);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(45, 22, 153, 20);
		panel_19.add(textField_4);

		JLabel label_4 = new JLabel("Nom :");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(-40, 25, 79, 14);
		panel_19.add(label_4);

		JButton button_3 = new JButton("Recherche");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == button) {

					try {
						// textArea_3.append(" ");
						File myFile = new File("FilmJeuEmpruntes");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						int i = 0;
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField_4.getText())) {
								table_2_1.append("LIGNE : " + i + "     "
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
						LectureEcriture.Recherche("FilmJeuEmprunts",
								textField_4.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					;
				}
			}
		});
		button_3.setToolTipText("Effectuer une recherche sur le titre de film");
		button_3.setBounds(212, 21, 101, 23);
		panel_19.add(button_3);

		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBounds(70, 549, 435, 39);
		panel_10.add(panel_23);

		JButton button_10 = new JButton("Annuler");
		button_10.setBounds(90, 8, 80, 25);
		panel_23.add(button_10);

		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(280, 8, 80, 25);
		panel_23.add(btnRetour);

		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		tabbedPane_1.addTab("Modifier un Emprunt", null, panel_26, null);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(206, 41, 300, 20);
		panel_26.add(textField_21);

		JLabel label_20 = new JLabel("Titre :");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setBounds(121, 44, 79, 14);
		panel_26.add(label_20);

		JLabel label_21 = new JLabel("Cat\u00E9gorie :");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setBounds(121, 94, 78, 14);
		panel_26.add(label_21);

		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBorder(new TitledBorder(null, "Information Film",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_27.setBounds(105, 10, 430, 185);
		panel_26.add(panel_27);

		JButton button_13 = new JButton("Recherche");
		button_13
				.setToolTipText("Effectuer une recherche sur le titre de film");
		button_13.setBounds(290, 79, 101, 23);
		panel_27.add(button_13);

		table_3 = new JTable();
		table_3.setBounds(35, 112, 385, 65);
		panel_27.add(table_3);

		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBounds(101, 80, 135, 20);
		panel_27.add(comboBox);

		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBounds(105, 516, 435, 39);
		panel_26.add(panel_28);

		JButton button_14 = new JButton("Annuler");
		button_14.setBounds(90, 8, 80, 25);
		panel_28.add(button_14);

		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(280, 8, 80, 25);
		panel_28.add(btnModifier);

		JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_29.setBounds(105, 200, 430, 185);
		panel_26.add(panel_29);

		JButton button_16 = new JButton("Recherche");
		button_16
				.setToolTipText("Effectuer une recherche sur le titre de film");
		button_16.setBounds(305, 81, 101, 23);
		panel_29.add(button_16);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(106, 32, 126, 20);
		panel_29.add(textField_23);

		JLabel label_22 = new JLabel("Nom :");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setBounds(21, 35, 79, 14);
		panel_29.add(label_22);

		JLabel label_23 = new JLabel("Prenom :");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setBounds(21, 85, 78, 14);
		panel_29.add(label_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(106, 82, 126, 20);
		panel_29.add(textField_24);

		table_8 = new JTable();
		table_8.setBounds(21, 110, 385, 65);
		panel_29.add(table_8);

		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Date de Location",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_30.setBounds(73, 396, 483, 52);
		panel_26.add(panel_30);

		JLabel label_24 = new JLabel("Ann\u00E9e :");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setBounds(10, 24, 55, 15);
		panel_30.add(label_24);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(69, 21, 86, 20);
		panel_30.add(textField_27);

		JLabel label_25 = new JLabel("Mois :");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setBounds(155, 24, 55, 15);
		panel_30.add(label_25);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(215, 21, 86, 20);
		panel_30.add(textField_28);

		JLabel label_26 = new JLabel("Jour :");
		label_26.setHorizontalAlignment(SwingConstants.RIGHT);
		label_26.setBounds(310, 24, 55, 15);
		panel_30.add(label_26);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(370, 21, 86, 20);
		panel_30.add(textField_29);

		JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Date de Retour",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_31.setBounds(73, 459, 483, 52);
		panel_26.add(panel_31);

		JLabel label_27 = new JLabel("Ann\u00E9e :");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setBounds(10, 24, 55, 15);
		panel_31.add(label_27);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(69, 21, 86, 20);
		panel_31.add(textField_30);

		JLabel label_28 = new JLabel("Mois :");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setBounds(155, 24, 55, 15);
		panel_31.add(label_28);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(215, 21, 86, 20);
		panel_31.add(textField_31);

		JLabel label_29 = new JLabel("Jour :");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setBounds(310, 24, 55, 15);
		panel_31.add(label_29);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(370, 21, 86, 20);
		panel_31.add(textField_32);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Jeu", null, panel_1, null);
		panel_1.setLayout(null);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 600, 650);
		panel_1.add(tabbedPane_2);

		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		tabbedPane_2.addTab("Emprunter une copie", null, panel_15, null);

		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBounds(105, 516, 420, 39);
		panel_15.add(panel_17);

		JButton button_9 = new JButton("Annuler");
		button_9.setBounds(60, 8, 100, 25);
		panel_17.add(button_9);

		JButton button_11 = new JButton("Emprunter");
		button_11.setBounds(260, 8, 100, 25);
		panel_17.add(button_11);

		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_25.setBounds(0, 11, 430, 185);
		panel_15.add(panel_25);

		JButton button_12 = new JButton("Recherche");
		button_12
				.setToolTipText("Effectuer une recherche sur le titre de film");
		button_12.setBounds(242, 31, 101, 23);
		panel_25.add(button_12);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(106, 32, 126, 20);
		panel_25.add(textField_20);

		JLabel label_30 = new JLabel("Nom :");
		label_30.setHorizontalAlignment(SwingConstants.RIGHT);
		label_30.setBounds(21, 35, 79, 14);
		panel_25.add(label_30);

		Label label_1 = new Label("New label");
		label_1.setBounds(38, 59, 62, 23);
		panel_25.add(label_1);

		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(351, 35, 202, 45);
		panel_15.add(textArea_1);

		JPanel panel_34 = new JPanel();
		panel_34.setLayout(null);
		tabbedPane_2.addTab("Retour d'une copie", null, panel_34, null);

		JPanel panel_35 = new JPanel();
		panel_35.setLayout(null);
		panel_35.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Choisir un Adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_35.setBounds(30, 11, 520, 129);
		panel_34.add(panel_35);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(181, 63, 153, 20);
		panel_35.add(textField_40);

		JLabel label_38 = new JLabel("Prenom :");
		label_38.setHorizontalAlignment(SwingConstants.RIGHT);
		label_38.setBounds(96, 66, 79, 14);
		panel_35.add(label_38);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(181, 30, 153, 20);
		panel_35.add(textField_41);

		JLabel label_39 = new JLabel("Nom :");
		label_39.setHorizontalAlignment(SwingConstants.RIGHT);
		label_39.setBounds(96, 33, 79, 14);
		panel_35.add(label_39);

		JButton button_15 = new JButton("Recherche");
		button_15
				.setToolTipText("Effectuer une recherche sur le titre de film");
		button_15.setBounds(385, 82, 101, 23);
		panel_35.add(button_15);

		JPanel panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBounds(82, 417, 435, 39);
		panel_34.add(panel_36);

		JButton button_17 = new JButton("Annuler");
		button_17.setBounds(90, 8, 80, 25);
		panel_36.add(button_17);

		JButton button_18 = new JButton("Retour");
		button_18.setBounds(280, 8, 80, 25);
		panel_36.add(button_18);

		JPanel panel_37 = new JPanel();
		panel_37.setLayout(null);
		panel_37.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"),
				"Liste des Jeux emprunt\u00E9s par cet adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_37.setBounds(30, 161, 520, 245);
		panel_34.add(panel_37);

		table_10 = new JTable();
		table_10.setBounds(15, 20, 490, 205);
		panel_37.add(table_10);

		JPanel panel_38 = new JPanel();
		panel_38.setLayout(null);
		tabbedPane_2.addTab("Modifier un Emprunt", null, panel_38, null);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(206, 41, 300, 20);
		panel_38.add(textField_42);

		JLabel label_40 = new JLabel("Titre :");
		label_40.setHorizontalAlignment(SwingConstants.RIGHT);
		label_40.setBounds(121, 44, 79, 14);
		panel_38.add(label_40);

		JLabel label_41 = new JLabel("Cat\u00E9gorie :");
		label_41.setHorizontalAlignment(SwingConstants.RIGHT);
		label_41.setBounds(121, 94, 78, 14);
		panel_38.add(label_41);

		JPanel panel_39 = new JPanel();
		panel_39.setLayout(null);
		panel_39.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Jeu",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_39.setBounds(105, 10, 430, 185);
		panel_38.add(panel_39);

		JButton button_19 = new JButton("Recherche");
		button_19
				.setToolTipText("Effectuer une recherche sur le titre de film");
		button_19.setBounds(290, 79, 101, 23);
		panel_39.add(button_19);

		table_11 = new JTable();
		table_11.setBounds(35, 112, 385, 65);
		panel_39.add(table_11);

		JComboBox<?> comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(101, 80, 135, 20);
		panel_39.add(comboBox_3);

		JPanel panel_40 = new JPanel();
		panel_40.setLayout(null);
		panel_40.setBounds(105, 516, 435, 39);
		panel_38.add(panel_40);

		JButton button_20 = new JButton("Annuler");
		button_20.setBounds(90, 8, 80, 25);
		panel_40.add(button_20);

		JButton button_21 = new JButton("Modifier");
		button_21.setBounds(280, 8, 80, 25);
		panel_40.add(button_21);

		JPanel panel_41 = new JPanel();
		panel_41.setLayout(null);
		panel_41.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Information Adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_41.setBounds(105, 200, 430, 185);
		panel_38.add(panel_41);

		JButton button_24 = new JButton("Recherche");
		button_24
				.setToolTipText("Effectuer une recherche sur le titre de film");
		button_24.setBounds(305, 81, 101, 23);
		panel_41.add(button_24);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(106, 32, 126, 20);
		panel_41.add(textField_43);

		JLabel label_42 = new JLabel("Nom :");
		label_42.setHorizontalAlignment(SwingConstants.RIGHT);
		label_42.setBounds(21, 35, 79, 14);
		panel_41.add(label_42);

		JLabel label_43 = new JLabel("Prenom :");
		label_43.setHorizontalAlignment(SwingConstants.RIGHT);
		label_43.setBounds(21, 85, 78, 14);
		panel_41.add(label_43);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(106, 82, 126, 20);
		panel_41.add(textField_44);

		table_12 = new JTable();
		table_12.setBounds(21, 110, 385, 65);
		panel_41.add(table_12);

		JPanel panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Date de Location",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_42.setBounds(73, 396, 483, 52);
		panel_38.add(panel_42);

		JLabel label_44 = new JLabel("Ann\u00E9e :");
		label_44.setHorizontalAlignment(SwingConstants.RIGHT);
		label_44.setBounds(10, 24, 55, 15);
		panel_42.add(label_44);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(69, 21, 86, 20);
		panel_42.add(textField_45);

		JLabel label_45 = new JLabel("Mois :");
		label_45.setHorizontalAlignment(SwingConstants.RIGHT);
		label_45.setBounds(155, 24, 55, 15);
		panel_42.add(label_45);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(215, 21, 86, 20);
		panel_42.add(textField_46);

		JLabel label_46 = new JLabel("Jour :");
		label_46.setHorizontalAlignment(SwingConstants.RIGHT);
		label_46.setBounds(310, 24, 55, 15);
		panel_42.add(label_46);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(370, 21, 86, 20);
		panel_42.add(textField_47);

		JPanel panel_43 = new JPanel();
		panel_43.setLayout(null);
		panel_43.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Date de Retour",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_43.setBounds(73, 459, 483, 52);
		panel_38.add(panel_43);

		JLabel label_47 = new JLabel("Ann\u00E9e :");
		label_47.setHorizontalAlignment(SwingConstants.RIGHT);
		label_47.setBounds(10, 24, 55, 15);
		panel_43.add(label_47);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(69, 21, 86, 20);
		panel_43.add(textField_48);

		JLabel label_48 = new JLabel("Mois :");
		label_48.setHorizontalAlignment(SwingConstants.RIGHT);
		label_48.setBounds(155, 24, 55, 15);
		panel_43.add(label_48);

		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(215, 21, 86, 20);
		panel_43.add(textField_49);

		JLabel label_49 = new JLabel("Jour :");
		label_49.setHorizontalAlignment(SwingConstants.RIGHT);
		label_49.setBounds(310, 24, 55, 15);
		panel_43.add(label_49);

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(370, 21, 86, 20);
		panel_43.add(textField_50);

		// /

		//
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(603, 350, 87, 23);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnQuitter);

		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(603, 190, 87, 23);
		btnMenu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				hide();
			}
		});
		contentPane.add(btnMenu);

		JButton btnChercher = new JButton("Recherche");
		btnChercher.setBounds(603, 270, 87, 23);
		btnChercher.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					hide();
					frmArticle frame = new frmArticle();
					frame.setVisible(true);

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnChercher);

	}
}
