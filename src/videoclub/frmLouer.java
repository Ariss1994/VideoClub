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
import java.awt.Graphics;
import java.awt.PrintJob;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTable;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.awt.Label;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.text.SimpleDateFormat;

import javax.swing.JTextArea;

import java.awt.Button;

import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDayChooser;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.io.FileInputStream;
import java.awt.Font;

public class frmLouer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_25;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the frame.
	 */
	public frmLouer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 650);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		final JTextArea textArea_4 = new JTextArea();
		final JTextArea textArea_2 = new JTextArea();

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
		final String END_LINE = System.getProperty("line.separator");
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		final String dateString = dateFormat1.format(gc.getTime());

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 255, 255));
		tabbedPane_1.addTab("Emprunter une copie", null, panel_2, null);
		panel_2.setLayout(null);
		final TextArea textArea_3 = new TextArea();
		textArea_3.setEditable(false);

		textArea_3.setBounds(17, 170, 272, 153);
		textArea_3.setVisible(true);

		final TextArea txt = new TextArea();
		final JDayChooser dayChooser = new JDayChooser();
		final JYearChooser yearChooser = new JYearChooser();
		final JMonthChooser monthChooser = new JMonthChooser();
		final Button button_1 = new Button("Ajoute la date de retour.");
		button_1.setBounds(223, 508, 131, 22);
		panel_2.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_1) {

					int x = yearChooser.getYear();
					int y = monthChooser.getMonth();
					int z = dayChooser.getDay();

					txt.append(Integer.toString(x) + "-"
							+ Integer.toString(y + 1) + "-"
							+ Integer.toString(z));
					// txt.setText("");

				}
			}
		});
		txt.setBounds(223, 451, 131, 51);
		panel_2.add(txt);
		txt.setEditable(false);
		final TextArea textArea = new TextArea();
		textArea.setBounds(17, 60, 272, 71);
		panel_2.add(textArea);
		textArea.setEditable(false);
		panel_2.add(textArea_3);

		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(255, 255, 255));
		panel_6.setBackground(new Color(204, 51, 153));
		panel_6.setBounds(5, 11, 303, 322);
		panel_6.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Infos sur l'Adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,
						255, 255)));
		panel_2.add(panel_6);
		final JButton button = new JButton("Recherche");
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
		lblNom.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblNom.setForeground(new Color(255, 255, 0));
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);

		final JButton btnAffichDeLa = new JButton(
				"Jeux et films emprunt\u00E9s");
		btnAffichDeLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( e.getSource() ==  btnAffichDeLa) {

					try {
						textArea_3.setText(" ");
						File myFile = new File("FilmJeuEmpruntes");
						FileReader fileReader = new FileReader(myFile);
						LineNumberReader reader = new LineNumberReader(
								fileReader);

						// Read from the FileReader.
						String lineRead = "";
						int i = 0;
						while ((lineRead = reader.readLine()) != null) {
							if (lineRead.contains(textField_6.getText())) {
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
						LectureEcriture.Recherche("FilmJeuEmpruntes",
								textField_6.getText());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					;
				}
			}
		});
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setForeground(new Color(255, 255, 0));
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);

		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnAffichDeLa)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNom))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(button))))
					.addGap(88)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAffichDeLa, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(163, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);

		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 255, 255));
		panel_3.setBackground(new Color(204, 51, 153));
		panel_3.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Info pour l'Emprunte",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,
						255, 255)));
		panel_3.setBounds(313, 11, 272, 125);
		panel_2.add(panel_3);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Numero de l'Adeherent:");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblTitreDuFilm = new JLabel("Titre du Film:");
		lblTitreDuFilm.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblTitreDuFilm.setForeground(new Color(255, 255, 0));
		lblTitreDuFilm.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblTitreDuJeu = new JLabel("Titre du Jeu:");
		lblTitreDuJeu.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblTitreDuJeu.setForeground(new Color(255, 255, 0));
		lblTitreDuJeu.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap(55, Short.MAX_VALUE)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblTitreDuFilm, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTitreDuJeu, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
						.addComponent(textField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitreDuFilm, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitreDuJeu, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(9))
		);
		panel_3.setLayout(gl_panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(0, 255, 255));
		panel_4.setBackground(new Color(204, 51, 153));
		panel_4.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Date du Retour",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,
						255, 255)));
		panel_4.setBounds(10, 344, 575, 248);
		panel_2.add(panel_4);
		final JButton btnValider_1 = new JButton("Enregistrer");

		btnValider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnValider_1) {
					double prixtotal;
					// System.out.println("|"+o+"|");
					String numero = textField.getText();
					String TitreFilm = textField_1.getText();// prenom
					String TitreJeu = textField_2.getText();// nom
					String DatedeLocation = textArea_2.getText();
					String DatedeRetour = txt.getText();
					if (Integer.parseInt(textField_5.getText()) >= 5) {
						prixtotal = Double.parseDouble(textField_5.getText()) * 4 * 1.15 * 0.95;

					} else {
						prixtotal = Double.parseDouble(textField_5.getText()) * 4 * 1.15;
					}
					String x = Double.toString(prixtotal);
					textArea_4.append(x + "$");

					String ligne = numero + "  " + TitreFilm + "  " + TitreJeu
							+ "  " + DatedeLocation + "  " + DatedeRetour
							+ "  " + x;

					try {
						LectureEcriture.lect(ligne, "FilmJeuEmpruntes");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						txt.setText("");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\CAD.jpg"));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(dayChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(yearChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(monthChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap(453, Short.MAX_VALUE)
							.addComponent(btnValider_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(monthChooser, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(yearChooser, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dayChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addComponent(btnValider_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);

		panel_4.setLayout(gl_panel_4);

		JPanel panel_7 = new JPanel();
		panel_7.setForeground(new Color(0, 255, 255));
		panel_7.setBackground(new Color(204, 51, 153));
		panel_7.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Prix",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,
						255, 255)));
		panel_7.setBounds(313, 147, 272, 95);
		panel_2.add(panel_7);

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		JLabel lblNombres = new JLabel("Nombres d'articles lou\u00E9s:");
		lblNombres.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblNombres.setForeground(new Color(255, 255, 0));
		lblNombres.setBackground(new Color(165, 42, 42));
		lblNombres.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblNewLabel = new JLabel("Prix Total:");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);

		textArea_4.setEditable(false);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addContainerGap(64, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNombres, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addGap(40))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombres, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_7.setLayout(gl_panel_7);

		JPanel panel_9 = new JPanel();
		panel_9.setForeground(new Color(0, 255, 255));
		panel_9.setBackground(new Color(204, 51, 153));
		panel_9.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Date",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,
						255, 255)));
		panel_9.setBounds(313, 253, 272, 60);
		panel_2.add(panel_9);

		textArea_2.setEditable(false);
		textArea_2.append(dateString);

		JLabel lblDateDeLocation = new JLabel("Date de Location:");
		lblDateDeLocation.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblDateDeLocation.setForeground(new Color(255, 255, 0));
		lblDateDeLocation.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDateDeLocation, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDateDeLocation, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_9.setLayout(gl_panel_9);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 255, 255));
		panel_10.setLayout(null);
		tabbedPane_1.addTab("Retour d'une copie", null, panel_10, null);

		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(204, 0, 153));
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Choisir un Adherent",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,
						255, 255)));
		panel_19.setBounds(30, 11, 555, 97);
		panel_10.add(panel_19);
		final TextArea table_2_1 = new TextArea();
		table_2_1.setBounds(319, 10, 226, 64);
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

		final JButton button_3 = new JButton("Recherche");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == button_3) {

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
								table_2_1.append("LIGNE : " + i + "  "
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
						// table_2_1.setText("");
						LectureEcriture.Recherche("FilmJeuEmpruntes",
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

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(204, 0, 153));
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Supprimer l'Article \u00E0 rendre", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_5.setBounds(30, 119, 354, 55);
		panel_10.add(panel_5);

		final JButton Rendre = new JButton("Rendre");
		Rendre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == Rendre) {
					try {
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(new FileInputStream(
										"FilmJeuEmpruntes")));

						StringBuffer sb = new StringBuffer();
						String line;

						int nbLinesRead = 0;
						while ((line = reader.readLine()) != null) {
							if (nbLinesRead != Integer.parseInt(textField_3
									.getText())) {

								sb.append(line + "  \n");
							}
							nbLinesRead++;
						}
						reader.close();

						BufferedWriter out = new BufferedWriter(new FileWriter(
								"FilmJeuEmpruntes"));

						out.write(sb.toString());

						out.close();

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		});
		Rendre.setBounds(251, 22, 93, 23);
		panel_5.add(Rendre);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 23, 153, 20);
		panel_5.add(textField_3);

		JLabel lblNoLigne = new JLabel("No. Ligne:");
		lblNoLigne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNoLigne.setBounds(-1, 26, 79, 14);
		panel_5.add(lblNoLigne);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(204, 0, 153));
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Choisir un Adherent", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_8.setBounds(30, 185, 555, 230);
		panel_10.add(panel_8);

		JLabel lblDate = new JLabel("Date1");
		lblDate.setBounds(10, 23, 45, 22);
		panel_8.add(lblDate);

		JLabel lblDate_1 = new JLabel("Date2");
		lblDate_1.setBounds(202, 21, 100, 26);
		panel_8.add(lblDate_1);

		final JDayChooser dayChooser_1 = new JDayChooser();
		dayChooser_1.setBounds(10, 82, 182, 133);
		panel_8.add(dayChooser_1);

		final JYearChooser yearChooser_1 = new JYearChooser();
		yearChooser_1.setBounds(10, 56, 47, 20);
		panel_8.add(yearChooser_1);

		final JMonthChooser monthChooser_1 = new JMonthChooser();
		monthChooser_1.setBounds(63, 56, 107, 20);
		panel_8.add(monthChooser_1);

		final JDayChooser dayChooser_2 = new JDayChooser();
		dayChooser_2.setBounds(202, 82, 182, 133);
		panel_8.add(dayChooser_2);

		final JYearChooser yearChooser_2 = new JYearChooser();
		yearChooser_2.setBounds(202, 56, 47, 20);
		panel_8.add(yearChooser_2);

		final JMonthChooser monthChooser_2 = new JMonthChooser();
		monthChooser_2.setBounds(255, 56, 107, 20);
		panel_8.add(monthChooser_2);

		JLabel lblPenalit = new JLabel("Penalit\u00E9");
		lblPenalit.setHorizontalAlignment(SwingConstants.CENTER);
		lblPenalit.setBounds(421, 24, 65, 20);
		panel_8.add(lblPenalit);

		final JTextArea textArea_5 = new JTextArea();
		textArea_5.setEditable(false);
		textArea_5.setBounds(418, 56, 82, 26);
		panel_8.add(textArea_5);

		final JButton btnCalculDuPenalit = new JButton(
				"Calcul du penalit\u00E9");
		btnCalculDuPenalit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btnCalculDuPenalit) {

					int x1 = yearChooser_1.getYear();
					int y1 = monthChooser_1.getMonth();
					int z1 = dayChooser_1.getDay();
					int x2 = yearChooser_2.getYear();
					int y2 = monthChooser_2.getMonth();
					int z2 = dayChooser_2.getDay();
					Calendar c1 = new GregorianCalendar();
					Calendar c2 = new GregorianCalendar();
					c1.set(x2, y2, z2, 0, 0, 0);
					c2.set(x1, y1, z1, 0, 0, 0);
					// Double.toString(Dates.penalite(c1, c2));
					// textArea_5.append(Double.toString(Dates.penalite(c1,
					// c2)));

				}
			}
		});
		btnCalculDuPenalit.setBounds(394, 93, 137, 34);
		panel_8.add(btnCalculDuPenalit);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Samsung\\Workspace1\\videoclub7\\videoclub7\\Image\\tax-penalty.jpg"));
		label_1.setBounds(150, 416, 250, 171);
		panel_10.add(label_1);

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

		JButton btnMenu = new JButton("Log out");
		btnMenu.setBounds(603, 190, 87, 23);
		btnMenu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				hide();
			}
		});
		contentPane.add(btnMenu);

		JButton btnChercher = new JButton("Menu");
		btnChercher.setBounds(603, 270, 87, 23);
		btnChercher.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					hide();
					TexteHtml frame = new TexteHtml();
					frame.setVisible(true);

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnChercher);

	}
}
