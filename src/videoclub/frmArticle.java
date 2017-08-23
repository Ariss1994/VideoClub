package videoclub;



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
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTable;


public class frmArticle extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField txtTitre;
	private JTextField txtCategorie;
	private JTextField txtAnnee;
	private JTextField txtMois;
	private JTextField txtJour;
	private JTextField txtLangue;
	private JTextField txtPrix;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTable table_2;
	private JTable table_3;
	private JTextField textField_39;
	private JTable table_4;
	private JTextField textField_41;
	private JTable table_6;
	private JTextField textNbrcopie;
	private JTextField textField_25;
	private JTable table_5;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTable table_7;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_21;
	private JTextField textField_1;
	private JTextField textField_24;
	private JTextField textField_30;
	private JTextField textField_31;

	
	/**
	 * Create the frame.
	 */
	public frmArticle() {
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
		tabbedPane.addTab("Film", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 600, 550);
		panel.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Ajouter", null, panel_2, null);
		panel_2.setLayout(null);
		
		txtTitre = new JTextField();
		txtTitre.setBounds(206, 41, 300, 20);
		panel_2.add(txtTitre);
		txtTitre.setColumns(10);
		
		txtCategorie = new JTextField();
		txtCategorie.setBounds(210, 91, 126, 20);
		panel_2.add(txtCategorie);
		txtCategorie.setColumns(10);
		
		JLabel lblTitre = new JLabel("Titre :");
		lblTitre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitre.setBounds(121, 44, 79, 14);
		panel_2.add(lblTitre);
		
		JLabel lblCatgorie = new JLabel("Cat\u00E9gorie :");
		lblCatgorie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCatgorie.setBounds(121, 94, 78, 14);
		panel_2.add(lblCatgorie);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Information Film", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(106, 11, 430, 125);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		
		
		txtAnnee = new JTextField();
		txtAnnee.setColumns(10);
		txtAnnee.setBounds(206, 165, 63, 20);
		panel_2.add(txtAnnee);
		
		txtMois = new JTextField();
		txtMois.setColumns(10);
		txtMois.setBounds(333, 165, 63, 20);
		panel_2.add(txtMois);
		
		JLabel lblMois = new JLabel("Mois :");
		lblMois.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMois.setBounds(244, 168, 78, 14);
		panel_2.add(lblMois);
		
		JLabel lblAnne = new JLabel("Ann\u00E9e :");
		lblAnne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAnne.setBounds(116, 168, 69, 14);
		panel_2.add(lblAnne);
		
		txtJour = new JTextField();
		txtJour.setColumns(10);
		txtJour.setBounds(462, 165, 63, 20);
		panel_2.add(txtJour);
		
		JLabel lblJour = new JLabel("Jour :");
		lblJour.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJour.setBounds(406, 168, 46, 14);
		panel_2.add(lblJour);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Date de sortie", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(106, 147, 430, 52);
		panel_2.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(106, 215, 430, 79);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		txtLangue = new JTextField();
		txtLangue.setBounds(84, 11, 86, 20);
		panel_6.add(txtLangue);
		txtLangue.setColumns(10);
		
		JLabel lblLangue = new JLabel("Langue :");
		lblLangue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLangue.setBounds(10, 14, 64, 14);
		panel_6.add(lblLangue);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Sous titre :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(180, 11, 227, 57);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		
		JRadioButton rdbtnFrancais = new JRadioButton("Francais");
		rdbtnFrancais.setBounds(77, 9, 109, 23);
		panel_7.add(rdbtnFrancais);
		
		JRadioButton rdbtnAnglais = new JRadioButton("Anglais");
		rdbtnAnglais.setBounds(77, 30, 109, 23);
		panel_7.add(rdbtnAnglais);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(103, 305, 433, 119);
		panel_2.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblRalisateur = new JLabel("R\u00E9alisateur :");
		lblRalisateur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRalisateur.setBounds(10, 11, 112, 14);
		panel_8.add(lblRalisateur);
		
		JComboBox<?> comboRealisateur = new JComboBox<Object>();
		comboRealisateur.setBounds(132, 11, 105, 20);
		panel_8.add(comboRealisateur);
		
		JLabel lblActeur = new JLabel("Acteur :");
		lblActeur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblActeur.setBounds(76, 53, 46, 14);
		panel_8.add(lblActeur);
		
		JLabel lblPrix = new JLabel("Prix :");
		lblPrix.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrix.setBounds(76, 87, 46, 14);
		panel_8.add(lblPrix);
		
		txtPrix = new JTextField();
		txtPrix.setBounds(132, 84, 105, 20);
		panel_8.add(txtPrix);
		txtPrix.setColumns(10);
		
		JButton button = new JButton("...");
		button.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					frmAdh_Real_Devel frame = new frmAdh_Real_Devel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		button.setBounds(247, 10, 23, 23);
		button.setToolTipText("Ajouter un nouveau realisateur");
		panel_8.add(button);
		
		JButton button_1 = new JButton("Ajouter \u00E0 la liste");
		button_1.setBounds(247, 49, 112, 25);
		panel_8.add(button_1);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(132, 50, 105, 20);
		panel_8.add(textField_31);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(100, 435, 435, 39);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnnuler.setBounds(90, 8, 80, 25);
		panel_3.add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
				btnValider.setBounds(280, 8, 80, 25);
		panel_3.add(btnValider);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
			}
		});
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		tabbedPane_1.addTab("Modifier", null, panel_21, null);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(206, 41, 300, 20);
		panel_21.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(210, 91, 126, 20);
		panel_21.add(textField_8);
		
		JLabel label_9 = new JLabel("Titre :");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(121, 44, 79, 14);
		panel_21.add(label_9);
		
		JLabel label_10 = new JLabel("Cat\u00E9gorie :");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setBounds(121, 94, 78, 14);
		panel_21.add(label_10);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new TitledBorder(null, "Information Film", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_22.setBounds(106, 11, 430, 125);
		panel_21.add(panel_22);
		panel_22.setLayout(null);
		
		JButton btnRecherche = new JButton("Recherche");
		btnRecherche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecherche.setBounds(304, 78, 89, 23);
		btnRecherche.setToolTipText("Effectuer une recherche sur le titre de film");
		
		panel_22.add(btnRecherche);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(206, 165, 63, 20);
		panel_21.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(333, 165, 63, 20);
		panel_21.add(textField_10);
		
		JLabel label_11 = new JLabel("Mois :");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setBounds(244, 168, 78, 14);
		panel_21.add(label_11);
		
		JLabel label_12 = new JLabel("Ann\u00E9e :");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setBounds(116, 168, 69, 14);
		panel_21.add(label_12);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(462, 165, 63, 20);
		panel_21.add(textField_11);
		
		JLabel label_13 = new JLabel("Jour :");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(406, 168, 46, 14);
		panel_21.add(label_13);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new TitledBorder(null, "Date de sortie", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_23.setBounds(106, 147, 430, 52);
		panel_21.add(panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_24.setBounds(106, 215, 430, 79);
		panel_21.add(panel_24);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(84, 11, 86, 20);
		panel_24.add(textField_12);
		
		JLabel label_14 = new JLabel("Langue :");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setBounds(10, 14, 64, 14);
		panel_24.add(label_14);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBorder(new TitledBorder(null, "Sous titre :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_25.setBounds(180, 11, 227, 57);
		panel_24.add(panel_25);
		
		JRadioButton radioButton_2 = new JRadioButton("Francais");
		radioButton_2.setBounds(77, 9, 109, 23);
		panel_25.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Anglais");
		radioButton_3.setBounds(77, 30, 109, 23);
		panel_25.add(radioButton_3);
		
		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_26.setBounds(103, 305, 433, 119);
		panel_21.add(panel_26);
		
		JLabel label_15 = new JLabel("R\u00E9alisateur :");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setBounds(10, 11, 112, 14);
		panel_26.add(label_15);
		
		JComboBox<?> comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(132, 11, 105, 20);
		panel_26.add(comboBox_2);
		
		JLabel label_16 = new JLabel("Acteur :");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setBounds(76, 53, 46, 14);
		panel_26.add(label_16);
		
		JLabel label_17 = new JLabel("Prix :");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setBounds(76, 87, 46, 14);
		panel_26.add(label_17);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(132, 84, 105, 20);
		panel_26.add(textField_13);
		
		JButton button_4 = new JButton("...");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmAdh_Real_Devel frame = new frmAdh_Real_Devel();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button_4.setToolTipText("Ajouter un nouveau realisateur");
		button_4.setBounds(247, 10, 23, 23);
		panel_26.add(button_4);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(132, 50, 105, 20);
		panel_26.add(textField_30);
		
		JButton btnAjouterLa = new JButton("Ajouter \u00E0 la liste");
		btnAjouterLa.setBounds(247, 49, 112, 25);
		panel_26.add(btnAjouterLa);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBounds(100, 435, 435, 39);
		panel_21.add(panel_27);
		
		JButton button_6 = new JButton("Annuler");
		button_6.setBounds(90, 8, 80, 25);
		panel_27.add(button_6);
		
		JButton button_7 = new JButton("Valider");
		button_7.setBounds(280, 8, 80, 25);
		panel_27.add(button_7);
		
		JPanel panel_15 = new JPanel();
		tabbedPane_1.addTab("Supprimer", null, panel_15, null);
		panel_15.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(206, 41, 300, 20);
		textField.setColumns(10);
		panel_15.add(textField);
		
		JLabel label = new JLabel("Titre :");
		label.setBounds(121, 44, 79, 14);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_15.add(label);
		
		JLabel lblChoisirUneCatgorie = new JLabel("Choisir une cat\u00E9gorie :");
		lblChoisirUneCatgorie.setBounds(55, 94, 144, 14);
		lblChoisirUneCatgorie.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_15.add(lblChoisirUneCatgorie);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(30, 11, 506, 120);
		panel_16.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Film", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.add(panel_16);
		panel_16.setLayout(null);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBounds(180, 80, 102, 20);
		panel_16.add(comboBox);
		
		JButton btnRecherche_1 = new JButton("Recherche");
		btnRecherche_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecherche_1.setBounds(389, 79, 89, 23);
		panel_16.add(btnRecherche_1);
		btnRecherche_1.setToolTipText("Effectuer une recherche sur le titre de film");
		
		JPanel panel_28 = new JPanel();
		panel_28.setBounds(82, 417, 435, 39);
		panel_28.setLayout(null);
		panel_15.add(panel_28);
		
		JButton button_8 = new JButton("Annuler");
		button_8.setBounds(90, 8, 80, 25);
		panel_28.add(button_8);
		
		JButton button_9 = new JButton("Valider");
		button_9.setBounds(280, 8, 80, 25);
		panel_28.add(button_9);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des films", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(30, 150, 520, 240);
		panel_15.add(panel_9);
		panel_9.setLayout(null);
		
		table = new JTable();
		table.setBounds(15, 20, 490, 205);
		panel_9.add(table);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		tabbedPane_1.addTab("Recherche", null, panel_17, null);
		
		JLabel label_1 = new JLabel("Titre :");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(121, 44, 79, 14);
		panel_17.add(label_1);
		
		JLabel lblChoisirUnRealisateur = new JLabel("Choisir un realisateur :");
		lblChoisirUnRealisateur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChoisirUnRealisateur.setBounds(55, 94, 144, 14);
		panel_17.add(lblChoisirUnRealisateur);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Film", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_18.setBounds(30, 11, 506, 120);
		panel_17.add(panel_18);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(180, 80, 145, 20);
		panel_18.add(comboBox_1);
		
		JButton button_2 = new JButton("Recherche");
		button_2.setToolTipText("Effectuer une recherche sur le titre de film");
		button_2.setBounds(389, 79, 89, 23);
		panel_18.add(button_2);
		
		JComboBox<?> comboBox_5 = new JComboBox<Object>();
		comboBox_5.setBounds(180, 54, 145, 20);
		panel_18.add(comboBox_5);
		
		JLabel label_26 = new JLabel("Choisir une cat\u00E9gorie :");
		label_26.setHorizontalAlignment(SwingConstants.RIGHT);
		label_26.setBounds(25, 57, 144, 14);
		panel_18.add(label_26);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 28, 300, 20);
		panel_18.add(textField_1);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des films", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_20.setBounds(30, 150, 520, 240);
		panel_17.add(panel_20);
		
		table_1 = new JTable();
		table_1.setBounds(15, 20, 490, 205);
		panel_20.add(table_1);
		
		JPanel panel_65 = new JPanel();
		panel_65.setLayout(null);
		tabbedPane_1.addTab("Ajouter une copie", null, panel_65, null);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(206, 41, 300, 20);
		panel_65.add(textField_41);
		
		JLabel label_56 = new JLabel("Titre :");
		label_56.setHorizontalAlignment(SwingConstants.RIGHT);
		label_56.setBounds(121, 44, 79, 14);
		panel_65.add(label_56);
		
		JLabel label_57 = new JLabel("Choisir une cat\u00E9gorie :");
		label_57.setHorizontalAlignment(SwingConstants.RIGHT);
		label_57.setBounds(55, 94, 144, 14);
		panel_65.add(label_57);
		
		JPanel panel_66 = new JPanel();
		panel_66.setLayout(null);
		panel_66.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Film", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_66.setBounds(30, 11, 506, 120);
		panel_65.add(panel_66);
		
		JComboBox<?> comboBox_16 = new JComboBox<Object>();
		comboBox_16.setBounds(180, 80, 102, 20);
		panel_66.add(comboBox_16);
		
		JButton button_36 = new JButton("Recherche");
		button_36.setToolTipText("Effectuer une recherche sur le titre de film");
		button_36.setBounds(389, 79, 89, 23);
		panel_66.add(button_36);
		
		JPanel panel_67 = new JPanel();
		panel_67.setLayout(null);
		panel_67.setBounds(82, 417, 435, 39);
		panel_65.add(panel_67);
		
		JButton button_37 = new JButton("Annuler");
		button_37.setBounds(90, 8, 80, 25);
		panel_67.add(button_37);
		
		JButton button_38 = new JButton("Valider");
		button_38.setBounds(280, 8, 80, 25);
		panel_67.add(button_38);
		
		JPanel panel_68 = new JPanel();
		panel_68.setLayout(null);
		panel_68.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des films", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_68.setBounds(30, 150, 520, 240);
		panel_65.add(panel_68);
		
		table_6 = new JTable();
		table_6.setBounds(15, 20, 490, 140);
		panel_68.add(table_6);
		
		JLabel lblNombreDeCopie = new JLabel("Nombre de copie :");
		lblNombreDeCopie.setBounds(271, 199, 125, 14);
		panel_68.add(lblNombreDeCopie);
		
		textNbrcopie = new JTextField();
		textNbrcopie.setEnabled(false);
		textNbrcopie.setBounds(406, 196, 86, 20);
		panel_68.add(textNbrcopie);
		textNbrcopie.setColumns(10);
		
		JPanel panel_58 = new JPanel();
		panel_58.setLayout(null);
		tabbedPane_1.addTab("Supprimer une copie", null, panel_58, null);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(206, 41, 300, 20);
		panel_58.add(textField_39);
		
		JLabel label_52 = new JLabel("Titre :");
		label_52.setHorizontalAlignment(SwingConstants.RIGHT);
		label_52.setBounds(121, 44, 79, 14);
		panel_58.add(label_52);
		
		JLabel label_53 = new JLabel("Choisir une cat\u00E9gorie :");
		label_53.setHorizontalAlignment(SwingConstants.RIGHT);
		label_53.setBounds(55, 94, 144, 14);
		panel_58.add(label_53);
		
		JPanel panel_59 = new JPanel();
		panel_59.setLayout(null);
		panel_59.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Film", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_59.setBounds(30, 11, 506, 186);
		panel_58.add(panel_59);
		
		JComboBox<?> comboBox_14 = new JComboBox<Object>();
		comboBox_14.setBounds(180, 80, 102, 20);
		panel_59.add(comboBox_14);
		
		JButton button_31 = new JButton("Recherche");
		button_31.setToolTipText("Effectuer une recherche sur le titre de film");
		button_31.setBounds(386, 91, 89, 23);
		panel_59.add(button_31);
		
		JLabel lblNumeroDeCopie = new JLabel("Numero de copie :");
		lblNumeroDeCopie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroDeCopie.setBounds(25, 114, 144, 14);
		panel_59.add(lblNumeroDeCopie);
		
		JComboBox<?> comboBox_10 = new JComboBox<Object>();
		comboBox_10.setBounds(180, 111, 102, 20);
		panel_59.add(comboBox_10);
		
		JPanel panel_60 = new JPanel();
		panel_60.setLayout(null);
		panel_60.setBounds(82, 417, 435, 39);
		panel_58.add(panel_60);
		
		JButton button_32 = new JButton("Annuler");
		button_32.setBounds(90, 8, 80, 25);
		panel_60.add(button_32);
		
		JButton button_33 = new JButton("Valider");
		button_33.setBounds(280, 8, 80, 25);
		panel_60.add(button_33);
		
		JPanel panel_61 = new JPanel();
		panel_61.setLayout(null);
		panel_61.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des films", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_61.setBounds(30, 208, 520, 182);
		panel_58.add(panel_61);
		
		table_4 = new JTable();
		table_4.setBounds(20, 21, 490, 137);
		panel_61.add(table_4);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Jeu", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 600, 550);
		panel_1.add(tabbedPane_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		tabbedPane_2.addTab("Ajouter", null, panel_10, null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(206, 41, 300, 20);
		panel_10.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(210, 91, 126, 20);
		panel_10.add(textField_3);
		
		JLabel label_3 = new JLabel("Titre :");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(121, 44, 79, 14);
		panel_10.add(label_3);
		
		JLabel label_4 = new JLabel("Cat\u00E9gorie :");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(121, 94, 78, 14);
		panel_10.add(label_4);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Jeu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_19.setBounds(106, 11, 430, 125);
		panel_10.add(panel_19);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(206, 165, 63, 20);
		panel_10.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(333, 165, 63, 20);
		panel_10.add(textField_5);
		
		JLabel label_5 = new JLabel("Mois :");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(244, 168, 78, 14);
		panel_10.add(label_5);
		
		JLabel label_6 = new JLabel("Ann\u00E9e :");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(116, 168, 69, 14);
		panel_10.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(462, 165, 63, 20);
		panel_10.add(textField_6);
		
		JLabel label_7 = new JLabel("Jour :");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(406, 168, 46, 14);
		panel_10.add(label_7);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new TitledBorder(null, "Date de sortie", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_29.setBounds(106, 147, 430, 52);
		panel_10.add(panel_29);
		
		JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBounds(100, 435, 435, 39);
		panel_10.add(panel_33);
		
		JButton button_11 = new JButton("Annuler");
		button_11.setBounds(90, 8, 80, 25);
		panel_33.add(button_11);
		
		JButton button_12 = new JButton("Valider");
		button_12.setBounds(280, 8, 80, 25);
		panel_33.add(button_12);
		
		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_30.setBounds(100, 210, 433, 218);
		panel_10.add(panel_30);
		
		JLabel label_8 = new JLabel("Editeur :");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(22, 87, 112, 14);
		panel_30.add(label_8);
		
		JLabel label_18 = new JLabel("Developpeur :");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setBounds(59, 129, 75, 14);
		panel_30.add(label_18);
		
		JComboBox<?> comboBox_4 = new JComboBox<Object>();
		comboBox_4.setBounds(144, 126, 105, 20);
		panel_30.add(comboBox_4);
		
		JLabel label_19 = new JLabel("Prix :");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setBounds(88, 163, 46, 14);
		panel_30.add(label_19);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(144, 160, 105, 20);
		panel_30.add(textField_14);
		
		JButton button_3 = new JButton("...");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmAdh_Real_Devel frame = new frmAdh_Real_Devel();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button_3.setToolTipText("Ajouter un nouveau acteur");
		button_3.setBounds(259, 125, 23, 23);
		panel_30.add(button_3);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(144, 84, 105, 20);
		panel_30.add(textField_15);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(144, 37, 105, 20);
		panel_30.add(textField_21);
		
		JLabel label_20 = new JLabel("Langue :");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setBounds(72, 40, 64, 14);
		panel_30.add(label_20);
		
		JPanel panel_34 = new JPanel();
		panel_34.setLayout(null);
		tabbedPane_2.addTab("Modifier", null, panel_34, null);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(206, 41, 300, 20);
		panel_34.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(210, 91, 126, 20);
		panel_34.add(textField_17);
		
		JLabel label_21 = new JLabel("Titre :");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setBounds(121, 44, 79, 14);
		panel_34.add(label_21);
		
		JLabel label_22 = new JLabel("Cat\u00E9gorie :");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setBounds(121, 94, 78, 14);
		panel_34.add(label_22);
		
		JPanel panel_35 = new JPanel();
		panel_35.setLayout(null);
		panel_35.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Jeu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_35.setBounds(106, 11, 430, 125);
		panel_34.add(panel_35);
		
		JButton button_13 = new JButton("Recherche");
		button_13.setToolTipText("Effectuer une recherche sur le titre de film");
		button_13.setBounds(304, 78, 89, 23);
		panel_35.add(button_13);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(206, 165, 63, 20);
		panel_34.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(333, 165, 63, 20);
		panel_34.add(textField_19);
		
		JLabel label_23 = new JLabel("Mois :");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setBounds(244, 168, 78, 14);
		panel_34.add(label_23);
		
		JLabel label_24 = new JLabel("Ann\u00E9e :");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setBounds(116, 168, 69, 14);
		panel_34.add(label_24);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(462, 165, 63, 20);
		panel_34.add(textField_20);
		
		JLabel label_25 = new JLabel("Jour :");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setBounds(406, 168, 46, 14);
		panel_34.add(label_25);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBorder(new TitledBorder(null, "Date de sortie", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_36.setBounds(106, 147, 430, 52);
		panel_34.add(panel_36);
		
		JPanel panel_39 = new JPanel();
		panel_39.setLayout(null);
		panel_39.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_39.setBounds(103, 206, 433, 218);
		panel_34.add(panel_39);
		
		JLabel lblEditeur = new JLabel("Editeur :");
		lblEditeur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEditeur.setBounds(22, 87, 112, 14);
		panel_39.add(lblEditeur);
		
		JLabel lblDeveloppeur = new JLabel("Developpeur :");
		lblDeveloppeur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeveloppeur.setBounds(59, 129, 75, 14);
		panel_39.add(lblDeveloppeur);
		
		JComboBox<?> comboBox_7 = new JComboBox<Object>();
		comboBox_7.setBounds(144, 126, 105, 20);
		panel_39.add(comboBox_7);
		
		JLabel label_29 = new JLabel("Prix :");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setBounds(88, 163, 46, 14);
		panel_39.add(label_29);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(144, 160, 105, 20);
		panel_39.add(textField_22);
		
		JButton button_15 = new JButton("...");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmAdh_Real_Devel frame = new frmAdh_Real_Devel();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button_15.setToolTipText("Ajouter un nouveau acteur");
		button_15.setBounds(259, 125, 23, 23);
		panel_39.add(button_15);
		
		textField_28 = new JTextField();
		textField_28.setBounds(144, 84, 105, 20);
		panel_39.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(144, 37, 105, 20);
		panel_39.add(textField_29);
		
		JLabel label_27 = new JLabel("Langue :");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setBounds(72, 40, 64, 14);
		panel_39.add(label_27);
		
		JPanel panel_40 = new JPanel();
		panel_40.setLayout(null);
		panel_40.setBounds(100, 435, 435, 39);
		panel_34.add(panel_40);
		
		JButton button_16 = new JButton("Annuler");
		button_16.setBounds(90, 8, 80, 25);
		panel_40.add(button_16);
		
		JButton button_17 = new JButton("Valider");
		button_17.setBounds(280, 8, 80, 25);
		panel_40.add(button_17);
		
		JPanel panel_41 = new JPanel();
		panel_41.setLayout(null);
		tabbedPane_2.addTab("Supprimer", null, panel_41, null);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(206, 41, 300, 20);
		panel_41.add(textField_23);
		
		JLabel label_30 = new JLabel("Titre :");
		label_30.setHorizontalAlignment(SwingConstants.RIGHT);
		label_30.setBounds(121, 44, 79, 14);
		panel_41.add(label_30);
		
		JLabel label_31 = new JLabel("Choisir une cat\u00E9gorie :");
		label_31.setHorizontalAlignment(SwingConstants.RIGHT);
		label_31.setBounds(55, 94, 144, 14);
		panel_41.add(label_31);
		
		JPanel panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Jeu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_42.setBounds(30, 11, 506, 120);
		panel_41.add(panel_42);
		
		JComboBox<?> comboBox_8 = new JComboBox<Object>();
		comboBox_8.setBounds(180, 80, 102, 20);
		panel_42.add(comboBox_8);
		
		JButton button_18 = new JButton("Recherche");
		button_18.setToolTipText("Effectuer une recherche sur le titre de film");
		button_18.setBounds(389, 79, 89, 23);
		panel_42.add(button_18);
		
		JPanel panel_43 = new JPanel();
		panel_43.setLayout(null);
		panel_43.setBounds(82, 417, 435, 39);
		panel_41.add(panel_43);
		
		JButton button_19 = new JButton("Annuler");
		button_19.setBounds(90, 8, 80, 25);
		panel_43.add(button_19);
		
		JButton button_20 = new JButton("Valider");
		button_20.setBounds(280, 8, 80, 25);
		panel_43.add(button_20);
		
		JPanel panel_44 = new JPanel();
		panel_44.setLayout(null);
		panel_44.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des Jeux", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_44.setBounds(30, 150, 520, 240);
		panel_41.add(panel_44);
		
		table_2 = new JTable();
		table_2.setBounds(15, 20, 490, 205);
		panel_44.add(table_2);
		
		JPanel panel_45 = new JPanel();
		panel_45.setLayout(null);
		tabbedPane_2.addTab("Recherche", null, panel_45, null);
		
		JPanel panel_47 = new JPanel();
		panel_47.setLayout(null);
		panel_47.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des Jeux", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_47.setBounds(30, 150, 520, 240);
		panel_45.add(panel_47);
		
		table_3 = new JTable();
		table_3.setBounds(15, 20, 490, 205);
		panel_47.add(table_3);
		
		JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Jeu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_31.setBounds(44, 11, 506, 120);
		panel_45.add(panel_31);
		
		JComboBox<?> comboBox_6 = new JComboBox<Object>();
		comboBox_6.setBounds(180, 80, 145, 20);
		panel_31.add(comboBox_6);
		
		JButton button_10 = new JButton("Recherche");
		button_10.setToolTipText("Effectuer une recherche sur le titre de film");
		button_10.setBounds(389, 79, 89, 23);
		panel_31.add(button_10);
		
		JComboBox<?> comboBox_9 = new JComboBox<Object>();
		comboBox_9.setBounds(180, 54, 145, 20);
		panel_31.add(comboBox_9);
		
		JLabel label_2 = new JLabel("Choisir une cat\u00E9gorie :");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(25, 57, 144, 14);
		panel_31.add(label_2);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(180, 28, 300, 20);
		panel_31.add(textField_24);
		
		JLabel label_28 = new JLabel("Titre :");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setBounds(91, 31, 79, 14);
		panel_31.add(label_28);
		
		JLabel lblChoisirUnEditeur = new JLabel("Choisir un Editeur :");
		lblChoisirUnEditeur.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChoisirUnEditeur.setBounds(25, 83, 144, 14);
		panel_31.add(lblChoisirUnEditeur);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		tabbedPane_2.addTab("Ajouter une copie", null, panel_11, null);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(206, 41, 300, 20);
		panel_11.add(textField_25);
		
		JLabel label_34 = new JLabel("Titre :");
		label_34.setHorizontalAlignment(SwingConstants.RIGHT);
		label_34.setBounds(121, 44, 79, 14);
		panel_11.add(label_34);
		
		JLabel label_35 = new JLabel("Choisir une cat\u00E9gorie :");
		label_35.setHorizontalAlignment(SwingConstants.RIGHT);
		label_35.setBounds(55, 94, 144, 14);
		panel_11.add(label_35);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Jeu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_12.setBounds(30, 11, 506, 120);
		panel_11.add(panel_12);
		
		JComboBox<?> comboBox_11 = new JComboBox<Object>();
		comboBox_11.setBounds(180, 80, 102, 20);
		panel_12.add(comboBox_11);
		
		JButton button_22 = new JButton("Recherche");
		button_22.setToolTipText("Effectuer une recherche sur le titre de film");
		button_22.setBounds(389, 79, 89, 23);
		panel_12.add(button_22);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(82, 417, 435, 39);
		panel_11.add(panel_13);
		
		JButton button_23 = new JButton("Annuler");
		button_23.setBounds(90, 8, 80, 25);
		panel_13.add(button_23);
		
		JButton button_24 = new JButton("Valider");
		button_24.setBounds(280, 8, 80, 25);
		panel_13.add(button_24);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des Jeux", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_14.setBounds(30, 150, 520, 240);
		panel_11.add(panel_14);
		
		table_5 = new JTable();
		table_5.setBounds(15, 20, 490, 140);
		panel_14.add(table_5);
		
		JLabel label_36 = new JLabel("Nombre de copie :");
		label_36.setBounds(271, 199, 125, 14);
		panel_14.add(label_36);
		
		textField_26 = new JTextField();
		textField_26.setEnabled(false);
		textField_26.setColumns(10);
		textField_26.setBounds(406, 196, 86, 20);
		panel_14.add(textField_26);
		
		JPanel panel_48 = new JPanel();
		panel_48.setLayout(null);
		tabbedPane_2.addTab("Supprimer une copie", null, panel_48, null);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(206, 41, 300, 20);
		panel_48.add(textField_27);
		
		JLabel label_37 = new JLabel("Titre :");
		label_37.setHorizontalAlignment(SwingConstants.RIGHT);
		label_37.setBounds(121, 44, 79, 14);
		panel_48.add(label_37);
		
		JLabel label_38 = new JLabel("Choisir une cat\u00E9gorie :");
		label_38.setHorizontalAlignment(SwingConstants.RIGHT);
		label_38.setBounds(55, 94, 144, 14);
		panel_48.add(label_38);
		
		JPanel panel_49 = new JPanel();
		panel_49.setLayout(null);
		panel_49.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Jeu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_49.setBounds(30, 11, 506, 186);
		panel_48.add(panel_49);
		
		JComboBox<?> comboBox_12 = new JComboBox<Object>();
		comboBox_12.setBounds(180, 80, 102, 20);
		panel_49.add(comboBox_12);
		
		JButton button_25 = new JButton("Recherche");
		button_25.setToolTipText("Effectuer une recherche sur le titre de film");
		button_25.setBounds(386, 91, 89, 23);
		panel_49.add(button_25);
		
		JLabel label_39 = new JLabel("Numero de copie :");
		label_39.setHorizontalAlignment(SwingConstants.RIGHT);
		label_39.setBounds(25, 114, 144, 14);
		panel_49.add(label_39);
		
		JComboBox<?> comboBox_13 = new JComboBox<Object>();
		comboBox_13.setBounds(180, 111, 102, 20);
		panel_49.add(comboBox_13);
		
		JPanel panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBounds(82, 417, 435, 39);
		panel_48.add(panel_50);
		
		JButton button_26 = new JButton("Annuler");
		button_26.setBounds(90, 8, 80, 25);
		panel_50.add(button_26);
		
		JButton button_27 = new JButton("Valider");
		button_27.setBounds(280, 8, 80, 25);
		panel_50.add(button_27);
		
		JPanel panel_51 = new JPanel();
		panel_51.setLayout(null);
		panel_51.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Liste des Jeux", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_51.setBounds(30, 208, 520, 182);
		panel_48.add(panel_51);
		
		table_7 = new JTable();
		table_7.setBounds(20, 21, 490, 137);
		panel_51.add(table_7);
		
		
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
