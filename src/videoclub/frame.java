package videoclub;
/**
 *  @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 */
//import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.SwingConstants;


public class frame extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String etat;
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public frame() {
		setTitle("SuperClub Universit\u00E9 de Montreal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 550, 450);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(204, 261, 121, 23);
		contentPane.add(btnQuitter);
		
		JLabel lblSuperEcranUniversite = new JLabel("Super Club\r\n Universit\u00E9 de Montr\u00E9al");
		lblSuperEcranUniversite.setEnabled(false);
		lblSuperEcranUniversite.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuperEcranUniversite.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblSuperEcranUniversite.setForeground(Color.YELLOW);
		lblSuperEcranUniversite.setBounds(85, 11, 339, 46);
		contentPane.add(lblSuperEcranUniversite);
		
		JButton btnSeConnecter = new JButton("Se Connecter");
		btnSeConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					login frame = new login();
					//frmIdentifAdmin frame = new frmIdentifAdmin();
					etat=" ";
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSeConnecter.setBounds(204, 184, 121, 23);
		contentPane.add(btnSeConnecter);
	}
	
	String getEtat() {
		return etat;
	}
	
	}

