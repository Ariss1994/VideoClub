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
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTable;


public class frmAdh_Real_Devel  extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;
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
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_13;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTable table_4;
	private JTable table_5;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTable table_2;
	private JTable table_3;

	
	/**
	 * Create the frame.
	 */
	public frmAdh_Real_Devel () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 638);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 600, 589);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Adh\u00E9rent", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 600, 550);
		panel.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Ajouter", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Adh\u00E9rent", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(28, 46, 541, 323);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(182, 77, 145, 34);
		panel_4.add(textField_25);	
		
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom1 :");
		lblPrnom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrnom.setBounds(94, 87, 78, 14);
		panel_4.add(lblPrnom);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(182, 32, 145, 34);
		panel_4.add(textField_26);
		
		JLabel lblNom = new JLabel("Nom1 :");
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom.setBounds(93, 42, 79, 14);
		panel_4.add(lblNom);
		JLabel lblPrnom1 = new JLabel("Sex1 :");
		lblPrnom1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrnom1.setBounds(94, 132, 78, 14);
		panel_4.add(lblPrnom1);
		
		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(182,122, 145, 34);
		panel_4.add(textField_100);
		
		JLabel lblAge = new JLabel("Age1 :");
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setBounds(95, 180, 79, 14);
		panel_4.add(lblAge);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(182, 170, 145, 34);
		panel_4.add(textField_27);
		
		JLabel lblNationalit = new JLabel("Nationalit\u00E9 1 :");
		lblNationalit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNationalit.setBounds(95, 227, 78, 14);
		panel_4.add(lblNationalit);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(182, 217, 145, 34);
		panel_4.add(textField_30);
		
		JLabel lblAdresse = new JLabel("Adresse1 :");
		lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdresse.setBounds(94, 280, 79, 14);
		panel_4.add(lblAdresse);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(182, 262, 300, 50);
		panel_4.add(textField_31);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(82, 380, 435, 39);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnnuler.setBounds(90, 8, 80, 25);
		panel_3.add(btnAnnuler);
		
		final JButton btnValider = new JButton("Valider");
		btnValider.setBounds(300, 8, 80, 25);
		panel_3.add(btnValider);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnValider)
				{
					String sex =textField_24.getText();
					String prenom =textField_25.getText();//prenom
					String nom =textField_26.getText();//nom
				   int  age=Integer.parseInt(textField_27.getText());//age
				   String nat =(textField_30.getText());//natio
				   String adresse =(textField_31.getText());//adresse
					
					int derniernum;
					try {
						derniernum = LectureEcriture.Getderniernum("dernier");
						Adeherent.setDerniernum(derniernum);
						Adeherent emp1 = new Adeherent(sex,nom,prenom,age,nat,adresse);

						Adeherent.addAdeherent(emp1);
						String flux = "    " + Adeherent.getDerniernum()
								+ "	" + sex + "		" + nom
								+ "                 " + prenom
								+ "                 " + age + "	" + nat
								+ "                 " + adresse;

						try {
							LectureEcriture.lect(flux,"/videoclub5/adedernier.txt");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							LectureEcriture.lect1(Integer.toString(Adeherent.getDerniernum()),"dernier");
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
		//---------------------------------------------------------------------------------------
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane_1.addTab("Modifier", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Adh\u00E9rent", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(28, 46, 541, 323);
		panel_5.add(panel_6);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(182, 82, 145, 34);
		panel_6.add(textField_32);
		
		JLabel label_32 = new JLabel("Pr\u00E9nom :");
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setBounds(94, 85, 78, 14);
		panel_6.add(label_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(182, 32, 145, 34);
		panel_6.add(textField_33);
		
		JLabel label_33 = new JLabel("Nom :");
		label_33.setHorizontalAlignment(SwingConstants.RIGHT);
		label_33.setBounds(94, 35, 79, 14);
		panel_6.add(label_33);
		
		JLabel label_34 = new JLabel("Age :");
		label_34.setHorizontalAlignment(SwingConstants.RIGHT);
		label_34.setBounds(94, 135, 79, 14);
		panel_6.add(label_34);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(182, 132, 145, 34);
		panel_6.add(textField_34);
		
		JLabel label_35 = new JLabel("Nationalit\u00E9 :");
		label_35.setHorizontalAlignment(SwingConstants.RIGHT);
		label_35.setBounds(94, 185, 78, 14);
		panel_6.add(label_35);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(182, 182, 145, 34);
		panel_6.add(textField_35);
		
		JLabel label_36 = new JLabel("Adresse :");
		label_36.setHorizontalAlignment(SwingConstants.RIGHT);
		label_36.setBounds(94, 242, 79, 14);
		panel_6.add(label_36);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(182, 232, 300, 50);
		panel_6.add(textField_36);
		
		JButton button_14 = new JButton("Recherche");
		button_14.setToolTipText("Effectuer une recherche sur le titre de film");
		button_14.setBounds(442, 81, 89, 23);
		panel_6.add(button_14);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(82, 380, 435, 39);
		panel_5.add(panel_7);
		
		final JButton button = new JButton("Annuler");
		button.setBounds(90, 8, 80, 25);
		panel_7.add(button);
		
		final JButton button_1 = new JButton("Valider");
		button_1.setBounds(280, 8, 80, 25);
		panel_7.add(button_1);
		 button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_1)
				{
					textField_32.getText();//prenom
					System.out.println(textField_25.getText());
					
				}
			}
		});
		
		//--------------------------------------------------
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		tabbedPane_1.addTab("Supprimer", null, panel_8, null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Adh\u00E9rent", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setBounds(28, 46, 541, 323);
		panel_8.add(panel_11);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(182, 82, 145, 34);
		panel_11.add(textField_7);
		
		JLabel label_9 = new JLabel("Pr\u00E9nom :");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(94, 85, 78, 14);
		panel_11.add(label_9);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(182, 32, 145, 34);
		panel_11.add(textField_8);
		
		JLabel label_10 = new JLabel("Nom :");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setBounds(94, 35, 79, 14);
		panel_11.add(label_10);
		
		JLabel label_11 = new JLabel("Age :");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setBounds(94, 135, 79, 14);
		panel_11.add(label_11);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(182, 132, 145, 34);
		panel_11.add(textField_9);
		
		JLabel label_12 = new JLabel("Nationalit\u00E9 :");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setBounds(94, 185, 78, 14);
		panel_11.add(label_12);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(182, 182, 145, 34);
		panel_11.add(textField_10);
		
		JLabel label_13 = new JLabel("Adresse :");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(94, 242, 79, 14);
		panel_11.add(label_13);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(181, 227, 274, 50);
		panel_11.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(386, 32, 145, 34);
		panel_11.add(textField_12);
		
		JLabel label_14 = new JLabel("Num :");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setBounds(298, 35, 79, 14);
		panel_11.add(label_14);
		
		JButton button_4 = new JButton("Recherche");
		button_4.setToolTipText("Effectuer une recherche sur le titre de film");
		button_4.setBounds(442, 81, 89, 23);
		panel_11.add(button_4);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(82, 380, 435, 39);
		panel_8.add(panel_12);
		
		JButton button_5 = new JButton("Annuler");
		button_5.setBounds(90, 8, 80, 25);
		panel_12.add(button_5);
		
		JButton button_6 = new JButton("Valider");
		button_6.setBounds(280, 8, 80, 25);
		panel_12.add(button_6);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		tabbedPane_1.addTab("Recherche", null, panel_17, null);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Adh\u00E9rent", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_18.setBounds(30, 11, 506, 120);
		panel_17.add(panel_18);
		
		JButton button_2 = new JButton("Recherche");
		button_2.setToolTipText("Effectuer une recherche sur le titre de film");
		button_2.setBounds(387, 22, 89, 23);
		panel_18.add(button_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(177, 23, 130, 20);
		panel_18.add(textField);
		
		JLabel label = new JLabel("Num :");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(89, 26, 79, 14);
		panel_18.add(label);
		
		table = new JTable();
		table.setBounds(21, 52, 475, 44);
		panel_18.add(table);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des films", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_20.setBounds(32, 166, 520, 240);
		panel_17.add(panel_20);
		
		table_1 = new JTable();
		table_1.setBounds(15, 20, 490, 205);
		panel_20.add(table_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("R\u00E9alisateur", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 600, 550);
		panel_1.add(tabbedPane_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		tabbedPane_2.addTab("Ajouter", null, panel_9, null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information R\u00E9alisateur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13.setBounds(28, 46, 541, 323);
		panel_9.add(panel_13);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(182, 82, 130, 20);
		panel_13.add(textField_1);
		
		JLabel label_1 = new JLabel("Pr\u00E9nom :");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(94, 85, 78, 14);
		panel_13.add(label_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(182, 32, 130, 20);
		panel_13.add(textField_13);
		
		JLabel label_15 = new JLabel("Nom :");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setBounds(94, 35, 79, 14);
		panel_13.add(label_15);
		
		JLabel label_16 = new JLabel("Age :");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setBounds(94, 135, 79, 14);
		panel_13.add(label_16);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(182, 132, 130, 20);
		panel_13.add(textField_38);
		
		JLabel label_17 = new JLabel("Nationalit\u00E9 :");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setBounds(94, 185, 78, 14);
		panel_13.add(label_17);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(182, 182, 130, 20);
		panel_13.add(textField_39);
		
		JLabel label_26 = new JLabel("Adresse :");
		label_26.setHorizontalAlignment(SwingConstants.RIGHT);
		label_26.setBounds(94, 242, 79, 14);
		panel_13.add(label_26);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(182, 232, 130, 43);
		panel_13.add(textField_40);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(82, 380, 435, 39);
		panel_9.add(panel_14);
		
		JButton button_7 = new JButton("Annuler");
		button_7.setBounds(90, 8, 80, 25);
		panel_14.add(button_7);
		
		JButton button_8 = new JButton("Valider");
		button_8.setBounds(280, 8, 80, 25);
		panel_14.add(button_8);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		tabbedPane_2.addTab("Modifier", null, panel_15, null);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information R\u00E9alisateur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_16.setBounds(28, 46, 541, 323);
		panel_15.add(panel_16);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(182, 82, 130, 20);
		panel_16.add(textField_41);
		
		JLabel label_37 = new JLabel("Pr\u00E9nom :");
		label_37.setHorizontalAlignment(SwingConstants.RIGHT);
		label_37.setBounds(94, 85, 78, 14);
		panel_16.add(label_37);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(182, 32, 130, 20);
		panel_16.add(textField_42);
		
		JLabel label_38 = new JLabel("Nom :");
		label_38.setHorizontalAlignment(SwingConstants.RIGHT);
		label_38.setBounds(94, 35, 79, 14);
		panel_16.add(label_38);
		
		JLabel label_39 = new JLabel("Age :");
		label_39.setHorizontalAlignment(SwingConstants.RIGHT);
		label_39.setBounds(94, 135, 79, 14);
		panel_16.add(label_39);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(182, 132, 130, 20);
		panel_16.add(textField_43);
		
		JLabel label_40 = new JLabel("Nationalit\u00E9 :");
		label_40.setHorizontalAlignment(SwingConstants.RIGHT);
		label_40.setBounds(94, 185, 78, 14);
		panel_16.add(label_40);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(182, 182, 130, 20);
		panel_16.add(textField_44);
		
		JLabel label_41 = new JLabel("Adresse :");
		label_41.setHorizontalAlignment(SwingConstants.RIGHT);
		label_41.setBounds(94, 242, 79, 14);
		panel_16.add(label_41);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(182, 232, 130, 43);
		panel_16.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(401, 32, 130, 20);
		panel_16.add(textField_46);
		
		JLabel label_42 = new JLabel("Num :");
		label_42.setHorizontalAlignment(SwingConstants.RIGHT);
		label_42.setBounds(313, 35, 79, 14);
		panel_16.add(label_42);
		
		JButton button_9 = new JButton("Recherche");
		button_9.setToolTipText("Effectuer une recherche sur le titre de film");
		button_9.setBounds(442, 81, 89, 23);
		panel_16.add(button_9);
		
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBounds(82, 380, 435, 39);
		panel_15.add(panel_21);
		
		JButton button_21 = new JButton("Annuler");
		button_21.setBounds(90, 8, 80, 25);
		panel_21.add(button_21);
		
		JButton button_22 = new JButton("Valider");
		button_22.setBounds(280, 8, 80, 25);
		panel_21.add(button_22);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		tabbedPane_2.addTab("Supprimer", null, panel_22, null);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information R\u00E9alisateur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_23.setBounds(28, 46, 541, 323);
		panel_22.add(panel_23);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(182, 82, 130, 20);
		panel_23.add(textField_47);
		
		JLabel label_43 = new JLabel("Pr\u00E9nom :");
		label_43.setHorizontalAlignment(SwingConstants.RIGHT);
		label_43.setBounds(94, 85, 78, 14);
		panel_23.add(label_43);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(182, 32, 130, 20);
		panel_23.add(textField_48);
		
		JLabel label_44 = new JLabel("Nom :");
		label_44.setHorizontalAlignment(SwingConstants.RIGHT);
		label_44.setBounds(94, 35, 79, 14);
		panel_23.add(label_44);
		
		JLabel label_45 = new JLabel("Age :");
		label_45.setHorizontalAlignment(SwingConstants.RIGHT);
		label_45.setBounds(94, 135, 79, 14);
		panel_23.add(label_45);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(182, 132, 130, 20);
		panel_23.add(textField_49);
		
		JLabel label_46 = new JLabel("Nationalit\u00E9 :");
		label_46.setHorizontalAlignment(SwingConstants.RIGHT);
		label_46.setBounds(94, 185, 78, 14);
		panel_23.add(label_46);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(182, 182, 130, 20);
		panel_23.add(textField_50);
		
		JLabel label_47 = new JLabel("Adresse :");
		label_47.setHorizontalAlignment(SwingConstants.RIGHT);
		label_47.setBounds(94, 242, 79, 14);
		panel_23.add(label_47);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(182, 232, 130, 43);
		panel_23.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(401, 32, 130, 20);
		panel_23.add(textField_52);
		
		JLabel label_48 = new JLabel("Num :");
		label_48.setHorizontalAlignment(SwingConstants.RIGHT);
		label_48.setBounds(313, 35, 79, 14);
		panel_23.add(label_48);
		
		JButton button_23 = new JButton("Recherche");
		button_23.setToolTipText("Effectuer une recherche sur le titre de film");
		button_23.setBounds(442, 81, 89, 23);
		panel_23.add(button_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBounds(82, 380, 435, 39);
		panel_22.add(panel_24);
		
		JButton button_24 = new JButton("Annuler");
		button_24.setBounds(90, 8, 80, 25);
		panel_24.add(button_24);
		
		JButton button_25 = new JButton("Valider");
		button_25.setBounds(280, 8, 80, 25);
		panel_24.add(button_25);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		tabbedPane_2.addTab("Recherche", null, panel_25, null);
		
		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information R\u00E9alisateur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_26.setBounds(30, 11, 506, 120);
		panel_25.add(panel_26);
		
		JButton button_26 = new JButton("Recherche");
		button_26.setToolTipText("Effectuer une recherche sur le titre de film");
		button_26.setBounds(387, 22, 89, 23);
		panel_26.add(button_26);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(177, 23, 130, 20);
		panel_26.add(textField_53);
		
		JLabel label_49 = new JLabel("Num :");
		label_49.setHorizontalAlignment(SwingConstants.RIGHT);
		label_49.setBounds(89, 26, 79, 14);
		panel_26.add(label_49);
		
		table_4 = new JTable();
		table_4.setBounds(21, 52, 475, 44);
		panel_26.add(table_4);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des films", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_27.setBounds(32, 166, 520, 240);
		panel_25.add(panel_27);
		
		table_5 = new JTable();
		table_5.setBounds(15, 20, 490, 205);
		panel_27.add(table_5);
		
		JPanel panel_32 = new JPanel();
		tabbedPane.addTab("D\u00E9veloppeur", null, panel_32, null);
		panel_32.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 600, 550);
		panel_32.add(tabbedPane_4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		tabbedPane_4.addTab("Ajouter", null, panel_10, null);
		
		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information D\u00E9veloppeur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_28.setBounds(28, 46, 541, 323);
		panel_10.add(panel_28);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(182, 82, 130, 20);
		panel_28.add(textField_2);
		
		JLabel label_2 = new JLabel("Pr\u00E9nom :");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(94, 85, 78, 14);
		panel_28.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(182, 32, 130, 20);
		panel_28.add(textField_3);
		
		JLabel label_3 = new JLabel("Nom :");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(94, 35, 79, 14);
		panel_28.add(label_3);
		
		JLabel label_4 = new JLabel("Age :");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(94, 135, 79, 14);
		panel_28.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 132, 130, 20);
		panel_28.add(textField_4);
		
		JLabel label_5 = new JLabel("Nationalit\u00E9 :");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(94, 185, 78, 14);
		panel_28.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(182, 182, 130, 20);
		panel_28.add(textField_5);
		
		JLabel label_6 = new JLabel("Adresse :");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(94, 242, 79, 14);
		panel_28.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(182, 232, 130, 43);
		panel_28.add(textField_6);
		
		JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBounds(82, 380, 435, 39);
		panel_10.add(panel_29);
		
		JButton button_3 = new JButton("Annuler");
		button_3.setBounds(90, 8, 80, 25);
		panel_29.add(button_3);
		
		JButton button_10 = new JButton("Valider");
		button_10.setBounds(280, 8, 80, 25);
		panel_29.add(button_10);
		
		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		tabbedPane_4.addTab("Modifier", null, panel_30, null);
		
		JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information D\u00E9veloppeur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_31.setBounds(28, 46, 541, 323);
		panel_30.add(panel_31);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(182, 82, 130, 20);
		panel_31.add(textField_14);
		
		JLabel label_7 = new JLabel("Pr\u00E9nom :");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(94, 85, 78, 14);
		panel_31.add(label_7);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(182, 32, 130, 20);
		panel_31.add(textField_15);
		
		JLabel label_8 = new JLabel("Nom :");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(94, 35, 79, 14);
		panel_31.add(label_8);
		
		JLabel label_18 = new JLabel("Age :");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setBounds(94, 135, 79, 14);
		panel_31.add(label_18);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(182, 132, 130, 20);
		panel_31.add(textField_16);
		
		JLabel label_19 = new JLabel("Nationalit\u00E9 :");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setBounds(94, 185, 78, 14);
		panel_31.add(label_19);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(182, 182, 130, 20);
		panel_31.add(textField_17);
		
		JLabel label_20 = new JLabel("Adresse :");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setBounds(94, 242, 79, 14);
		panel_31.add(label_20);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(182, 232, 130, 43);
		panel_31.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(401, 32, 130, 20);
		panel_31.add(textField_19);
		
		JLabel label_21 = new JLabel("Num :");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setBounds(313, 35, 79, 14);
		panel_31.add(label_21);
		
		JButton button_11 = new JButton("Recherche");
		button_11.setToolTipText("Effectuer une recherche sur le titre de film");
		button_11.setBounds(442, 81, 89, 23);
		panel_31.add(button_11);
		
		JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBounds(82, 380, 435, 39);
		panel_30.add(panel_33);
		
		JButton button_12 = new JButton("Annuler");
		button_12.setBounds(90, 8, 80, 25);
		panel_33.add(button_12);
		
		JButton button_13 = new JButton("Valider");
		button_13.setBounds(280, 8, 80, 25);
		panel_33.add(button_13);
		
		JPanel panel_34 = new JPanel();
		panel_34.setLayout(null);
		tabbedPane_4.addTab("Supprimer", null, panel_34, null);
		
		JPanel panel_35 = new JPanel();
		panel_35.setLayout(null);
		panel_35.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information D\u00E9veloppeur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_35.setBounds(28, 46, 541, 323);
		panel_34.add(panel_35);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(182, 82, 130, 20);
		panel_35.add(textField_20);
		
		JLabel label_22 = new JLabel("Pr\u00E9nom :");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setBounds(94, 85, 78, 14);
		panel_35.add(label_22);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(182, 32, 130, 20);
		panel_35.add(textField_21);
		
		JLabel label_23 = new JLabel("Nom :");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setBounds(94, 35, 79, 14);
		panel_35.add(label_23);
		
		JLabel label_24 = new JLabel("Age :");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setBounds(94, 135, 79, 14);
		panel_35.add(label_24);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(182, 132, 130, 20);
		panel_35.add(textField_22);
		
		JLabel label_25 = new JLabel("Nationalit\u00E9 :");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setBounds(94, 185, 78, 14);
		panel_35.add(label_25);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(182, 182, 130, 20);
		panel_35.add(textField_23);
		
		JLabel label_27 = new JLabel("Adresse :");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setBounds(94, 242, 79, 14);
		panel_35.add(label_27);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(182, 232, 130, 43);
		panel_35.add(textField_24);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(401, 32, 130, 20);
		panel_35.add(textField_28);
		
		JLabel label_28 = new JLabel("Num :");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setBounds(313, 35, 79, 14);
		panel_35.add(label_28);
		
		JButton button_15 = new JButton("Recherche");
		button_15.setToolTipText("Effectuer une recherche sur le titre de film");
		button_15.setBounds(442, 81, 89, 23);
		panel_35.add(button_15);
		
		JPanel panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBounds(82, 380, 435, 39);
		panel_34.add(panel_36);
		
		JButton button_16 = new JButton("Annuler");
		button_16.setBounds(90, 8, 80, 25);
		panel_36.add(button_16);
		
		JButton button_17 = new JButton("Valider");
		button_17.setBounds(280, 8, 80, 25);
		panel_36.add(button_17);
		
		JPanel panel_37 = new JPanel();
		panel_37.setLayout(null);
		tabbedPane_4.addTab("Recherche", null, panel_37, null);
		
		JPanel panel_38 = new JPanel();
		panel_38.setLayout(null);
		panel_38.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information D\u00E9veloppeur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_38.setBounds(30, 11, 506, 120);
		panel_37.add(panel_38);
		
		JButton button_18 = new JButton("Recherche");
		button_18.setToolTipText("Effectuer une recherche sur le titre de film");
		button_18.setBounds(387, 22, 89, 23);
		panel_38.add(button_18);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(177, 23, 130, 20);
		panel_38.add(textField_29);
		
		JLabel label_29 = new JLabel("Num :");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setBounds(89, 26, 79, 14);
		panel_38.add(label_29);
		
		table_2 = new JTable();
		table_2.setBounds(21, 52, 475, 44);
		panel_38.add(table_2);
		
		JPanel panel_39 = new JPanel();
		panel_39.setLayout(null);
		panel_39.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des jeux", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_39.setBounds(32, 166, 520, 240);
		panel_37.add(panel_39);
		
		table_3 = new JTable();
		table_3.setBounds(15, 20, 490, 205);
		panel_39.add(table_3);
		
		
		 ///
		

		//
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(603, 350, 76, 23);
		contentPane.add(btnQuitter);
		
		JButton btnMenu = new JButton("Menu");
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
}
