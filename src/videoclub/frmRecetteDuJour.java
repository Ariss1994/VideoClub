package videoclub;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 *
 */
@SuppressWarnings("serial")
public class frmRecetteDuJour extends JFrame {

	private JPanel contentPane;
	private JTextField textAnnee;
	private JTextField textMois;
	private JTextField textJour;
	private JTextField textCout;



	/**
	 * Create the frame.
	 */
	public frmRecetteDuJour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecetteDuJour = new JLabel("Recette du jour");
		lblRecetteDuJour.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecetteDuJour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRecetteDuJour.setForeground(new Color(255, 204, 0));
		lblRecetteDuJour.setBounds(129, 34, 191, 25);
		contentPane.add(lblRecetteDuJour);
		
		String format = "dd/MM/yy";
		String formatAnnee="yyyy";
		String formatMois="MM";
		String formatJour="dd";
		
		new java.text.SimpleDateFormat( format );
		java.text.SimpleDateFormat formaterAnnee = new java.text.SimpleDateFormat( formatAnnee );
		java.text.SimpleDateFormat formaterMois = new java.text.SimpleDateFormat( formatMois );
		java.text.SimpleDateFormat formaterJour = new java.text.SimpleDateFormat( formatJour );
		
		new java.util.Date();
		java.util.Date dateAnnee = new java.util.Date();
		java.util.Date dateMois = new java.util.Date();
		java.util.Date dateJour = new java.util.Date();
		
		JLabel label = new JLabel("Ann\u00E9e :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setForeground(new Color(255, 204, 51));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(10, 112, 69, 14);
		contentPane.add(label);
		
		
		textAnnee = new JTextField(formaterAnnee.format( dateAnnee ));
		textAnnee.setFont(new Font("Tahoma", Font.BOLD, 13));
		textAnnee.setHorizontalAlignment(SwingConstants.CENTER);
		textAnnee.setEnabled(false);
		textAnnee.setColumns(10);
		textAnnee.setBounds(100, 109, 63, 20);
		contentPane.add(textAnnee);
		
		JLabel label_1 = new JLabel("Mois :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setForeground(new Color(255, 204, 51));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(138, 112, 78, 14);
		contentPane.add(label_1);
		
		textMois = new JTextField(formaterMois.format( dateMois ));
		textMois.setFont(new Font("Tahoma", Font.BOLD, 13));
		textMois.setHorizontalAlignment(SwingConstants.CENTER);
		textMois.setEnabled(false);
		textMois.setColumns(10);
		textMois.setBounds(227, 109, 63, 20);
		contentPane.add(textMois);
		
		JLabel label_2 = new JLabel("Jour :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setForeground(new Color(255, 204, 51));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(300, 112, 46, 14);
		contentPane.add(label_2);
		
		textJour = new JTextField(formaterJour.format( dateJour ));
		textJour.setFont(new Font("Tahoma", Font.BOLD, 13));
		textJour.setHorizontalAlignment(SwingConstants.CENTER);
		textJour.setEnabled(false);
		
		textJour.setColumns(10);
		textJour.setBounds(356, 109, 63, 20);
		contentPane.add(textJour);
		
		textCout = new JTextField();
		textCout.setHorizontalAlignment(SwingConstants.CENTER);
		textCout.setForeground(new Color(255, 0, 0));
		textCout.setFont(new Font("Tahoma", Font.BOLD, 14));
		textCout.setEnabled(false);
		textCout.setColumns(10);
		textCout.setBounds(227, 168, 192, 20);
		contentPane.add(textCout);
		
		JButton button = new JButton("Annuler");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				hide();
				
			}
		});
		button.setBounds(100, 245, 89, 23);
		contentPane.add(button);
		
		JButton btnCalculer = new JButton("Calculer");
		btnCalculer.setBounds(297, 245, 89, 23);
		contentPane.add(btnCalculer);
		
		
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		
		
	}
}
