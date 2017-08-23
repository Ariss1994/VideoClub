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
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;


public class FrmIdentificationEmploye extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNom;
	private JPasswordField textPassword;
	private boolean identification;
	

	

	

	/**
	 * Create the frame.
	 */
	public FrmIdentificationEmploye() {
		
		setBounds(100, 100, 450, 300);
		
		
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Super Club\r\n Universit\u00E9 de Montr\u00E9al");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Tahoma", Font.ITALIC, 22));
		label.setEnabled(false);
		label.setBounds(68, 0, 339, 46);
		contentPane.add(label);
		
		JLabel lblSaisissezVotreMot = new JLabel("Identification Employ\u00E9\r");
		lblSaisissezVotreMot.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaisissezVotreMot.setToolTipText("");
		lblSaisissezVotreMot.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblSaisissezVotreMot.setBounds(78, 57, 339, 70);
		contentPane.add(lblSaisissezVotreMot);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Image/cadenat.jpg"));
		lblNewLabel.setBounds(0, 0, 70, 70);
		contentPane.add(lblNewLabel);
		this.setLocationRelativeTo(null);
		textNom = new JTextField();
		textNom.setBounds(159, 138, 218, 20);
		contentPane.add(textNom);
		textNom.setColumns(10);
		
		JLabel lblNomEmploy = new JLabel("Nom employ\u00E9  :");
		lblNomEmploy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomEmploy.setBounds(61, 141, 92, 14);
		contentPane.add(lblNomEmploy);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe  :");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMotDePasse.setBounds(60, 172, 92, 14);
		contentPane.add(lblMotDePasse);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				identification=true;
				if(identification==true){
					frmArticle frame = new frmArticle();
					frame frame1 = new frame(); 
					frmLouer frame2 =new frmLouer();
					frmRecetteDuJour frame3 = new frmRecetteDuJour();
					frmAdh_Real_Devel frame4 = new frmAdh_Real_Devel();
					
					if((frame1.getEtat()=="Film")||(frame1.getEtat()=="Jeu")){
						try {
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}else if(frame1.getEtat()=="Louer"){
						try {
							frame2.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}						
					}else if((frame1.getEtat()=="Adherent")||(frame1.getEtat()=="Film")||(frame1.getEtat()=="Jeu")){
						try {
							frame4.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}	
						
					}else if(frame1.getEtat()=="Recette"){
						try {
							frame3.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
					hide();
						
						
						
				}else{
					JOptionPane.showMessageDialog(null, "Le nom ou mot de passe saisie est incorect. \n Essayer d'entrer vos informations à nouveau", "Information", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnValider.setBounds(291, 216, 89, 23);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
			
			hide();
			}
		});
		btnAnnuler.setBounds(171, 216, 89, 23);
		contentPane.add(btnAnnuler);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(159, 169, 218, 20);
		contentPane.add(textPassword);
	}
}
