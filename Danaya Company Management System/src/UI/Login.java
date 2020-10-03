package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import MO.Accountant;
import MO.ChiefAccount;
import MO.ChiefAccountAudit;
import MO.ComissaryInControl;
import MO.GeneralManager;
import MO.HumanResourcesManager;
import MO.InformationProcessor;
import MO.ManagerAssistant;
import MO.SalesManager;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame{

	//private JFrame frame;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 1080, 630);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1064, 591);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(364, 213, 146, 32);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(364, 282, 146, 32);
		panel.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(437, 221, 275, 20);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(437, 290, 275, 20);
		panel.add(password);
		
		JComboBox combo = new JComboBox();
		combo.setModel(new DefaultComboBoxModel(new String[] {"Information Processor", "General Manager", "Manager Assistant", "Sales Manager", "Human Resources Manager", "Chief Accountant Audit", "Comissary In Control", "Chief Accountant ", "Accountant"}));
		combo.setBounds(437, 358, 142, 20);
		panel.add(combo);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String email = username.getText();
				String pass  = password.getText();
				
				
				if(combo.getSelectedIndex()==0) {
					InformationProcessor  info  = new InformationProcessor();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							dispose();
							InformationProcessorFrame iframe = new InformationProcessorFrame();
						    iframe.setVisible(true);	
							
							/*LO fr = new LO();
							fr.setVisible(true);*/
							
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
	
				}
				else if(combo.getSelectedIndex()==1) {
					GeneralManager  info  = new GeneralManager();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							
							
							
							
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}	
				}else if(combo.getSelectedIndex()==2) {
					ManagerAssistant  info  = new ManagerAssistant();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
					
				}else if(combo.getSelectedIndex()==3) {
					SalesManager  info  = new SalesManager();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else if(combo.getSelectedIndex()==4) {
					HumanResourcesManager  info  = new HumanResourcesManager();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else if(combo.getSelectedIndex()==5) {
					ChiefAccountAudit  info  = new ChiefAccountAudit();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else if(combo.getSelectedIndex()==6) {
					ComissaryInControl  info  = new ComissaryInControl();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else if(combo.getSelectedIndex()==7) {
					ChiefAccount  info  = new ChiefAccount();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else if(combo.getSelectedIndex()==8) {
					Accountant  info  = new Accountant();
					info.setEmail(email);
					info.setPassword(pass);
					try {
						if(info.Login(info)) {
							
							dispose();
							AccountantFrame iframe = new AccountantFrame();
						    iframe.setVisible(true);	
							
							
						}else {						
							JOptionPane.showMessageDialog(null,"Check your info and try again!");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}		
			}
		});
		login.setBounds(589, 357, 123, 23);
		panel.add(login);
	}
}
