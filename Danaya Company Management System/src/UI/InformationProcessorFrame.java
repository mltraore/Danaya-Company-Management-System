package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

import MO.AbstractFactory;
import MO.Audit;
import MO.DriverAgent;
import MO.FactoryProvider;
import MO.Finances;
import MO.General;
import MO.GeneralManager;
import MO.InformationProcessor;
import MO.ManagerFactory;
import MO.Managers;
import MO.SteedAgent;
import MO.TradeAgent;
import MO.myUtils;

import java.awt.event.ActionListener;
import java.sql.Driver;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Scrollbar;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JScrollPane;

public class InformationProcessorFrame extends JFrame {

	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField ridentity;
	private JTextField rname;
	private JTextField rsurname;
	private JTextField rcell;
	private JTextField remail;
	private JTextField rpassword;
	private JTextField rsalary;
	private JTable table;
	private JTextField ara;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformationProcessorFrame window = new InformationProcessorFrame();
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
	public InformationProcessorFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		setBackground(new Color(240, 240, 240));
		setBounds(100, 100, 900, 561);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		tabbedPane.setBounds(0, 0, 884, 522);
		getContentPane().add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Registration", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnRegirtration = new JButton("Register");
		
		btnRegirtration.setSelectedIcon(new ImageIcon("C:\\Users\\predator\\Desktop\\icon\\re.png"));
		btnRegirtration.setToolTipText("");
		btnRegirtration.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegirtration.setIcon(new ImageIcon("C:\\Users\\predator\\Desktop\\icon\\re.png"));
		btnRegirtration.setBounds(725, 0, 154, 130);
		panel_1.add(btnRegirtration);
		
		JButton btnDelete = new JButton("Delete");
		
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setToolTipText("");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\predator\\Desktop\\icon\\de.png"));
		btnDelete.setBounds(725, 127, 154, 130);
		panel_1.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		
		
		
		
		
		
		
		
		
		
		
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUpdate.setToolTipText("");
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\predator\\Desktop\\icon\\up022.png"));
		btnUpdate.setBounds(725, 252, 154, 130);
		panel_1.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InformationProcessorFrame m = new InformationProcessorFrame();
				m.setVisible(true);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setIcon(new ImageIcon("C:\\Users\\predator\\Desktop\\icon\\set0.png"));
		btnReset.setBounds(725, 379, 154, 116);
		panel_1.add(btnReset);
		
		JLabel a = new JLabel("Identity");
		a.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a.setBounds(10, 92, 98, 27);
		panel_1.add(a);
		
		ridentity = new JTextField();
		ridentity.setBounds(118, 92, 262, 27);
		panel_1.add(ridentity);
		ridentity.setColumns(10);
		
		JLabel b = new JLabel("Name");
		b.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b.setBounds(10, 154, 98, 27);
		panel_1.add(b);
		
		rname = new JTextField();
		rname.setColumns(10);
		rname.setBounds(118, 156, 262, 27);
		panel_1.add(rname);
		
		JLabel c = new JLabel("Surname");
		c.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.setBounds(10, 213, 98, 27);
		panel_1.add(c);
		
		JLabel d = new JLabel("Cell");
		d.setFont(new Font("Tahoma", Font.PLAIN, 14));
		d.setBounds(10, 269, 98, 27);
		panel_1.add(d);
		
		JLabel e = new JLabel("Email");
		e.setFont(new Font("Tahoma", Font.PLAIN, 14));
		e.setBounds(10, 319, 98, 27);
		panel_1.add(e);
		
		JLabel f = new JLabel("Password");
		f.setFont(new Font("Tahoma", Font.PLAIN, 14));
		f.setBounds(10, 375, 98, 27);
		panel_1.add(f);
		
		JLabel g = new JLabel("Salary");
		g.setFont(new Font("Tahoma", Font.PLAIN, 14));
		g.setBounds(10, 430, 98, 27);
		panel_1.add(g);
		
		rsurname = new JTextField();
		rsurname.setColumns(10);
		rsurname.setBounds(118, 213, 262, 27);
		panel_1.add(rsurname);
		
		rcell = new JTextField();
		rcell.setColumns(10);
		rcell.setBounds(118, 271, 262, 27);
		panel_1.add(rcell);
		
		remail = new JTextField();
		remail.setColumns(10);
		remail.setBounds(118, 321, 262, 27);
		panel_1.add(remail);
		
		rpassword = new JTextField();
		rpassword.setColumns(10);
		rpassword.setBounds(118, 375, 262, 27);
		panel_1.add(rpassword);
		
		rsalary = new JTextField();
		rsalary.setColumns(10);
		rsalary.setBounds(118, 432, 262, 27);
		panel_1.add(rsalary);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(422, 92, 85, 27);
		panel_1.add(lblGender);
		
		JRadioButton rmale = new JRadioButton("Male");
		
		rmale.setBounds(513, 92, 98, 27);
		panel_1.add(rmale);
		
		JRadioButton rfemale = new JRadioButton("Female");
		rfemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rfemale.isSelected())
					 rmale.setSelected(false);
			}
		});
		rfemale.setBounds(620, 92, 85, 27);
		panel_1.add(rfemale);
		
		rmale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rmale.isSelected()) 
					rfemale.setSelected(false);
			}
		});
		
		
		JComboBox rdepartment = new JComboBox();
		rdepartment.setModel(new DefaultComboBoxModel(new String[] {"Direction", "InfoOffice", "TradeOf", "SteedOf", "DriverOf", "AuditOf", "Finance", "Security"}));
		rdepartment.setBounds(513, 156, 192, 27);
		panel_1.add(rdepartment);
		
		JComboBox rpost = new JComboBox();
		rpost.setModel(new DefaultComboBoxModel(new String[] {"GManager", "ManagerAs", "SManager", "HRManager", "InfoProcessor", "TradeAgent", "SteedAgent ", "DriverAgent", "CAccountAudit", "CInControl", "SecretaryAudit", "CAccountant", "Accountant", "SecretaryAgent ", "Guardian "}));
		rpost.setBounds(513, 321, 192, 27);
		panel_1.add(rpost);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Profiles", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		table.setBounds(10, 187, 859, 296);
		panel.add(table);
		
		JLabel lblProfiles = new JLabel("Show Staff' Profiles");
		lblProfiles.setFont(new Font("Tahoma", Font.ITALIC, 28));
		lblProfiles.setBounds(315, 40, 260, 34);
		panel.add(lblProfiles);
		
		JButton btnShowAll = new JButton("Show All");
		btnShowAll.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnShowAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				General gene = new General();
				try {
					ResultSet rs = gene.ShowProfiles();
					table.setModel(myUtils.buildTableModel(rs));
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
			}
		});
		btnShowAll.setBounds(780, 153, 89, 34);
		panel.add(btnShowAll);
		
		JButton btnNewButton = new JButton("Show By Id");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnNewButton.setBounds(278, 156, 125, 31);
		panel.add(btnNewButton);
		
		JLabel lblEnterIdentity = new JLabel("Enter Identity");
		lblEnterIdentity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEnterIdentity.setBounds(10, 156, 89, 28);
		panel.add(lblEnterIdentity);
		
		ara = new JTextField();
		ara.setBounds(93, 156, 188, 31);
		panel.add(ara);
		ara.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		scrollPane.setBounds(10, 187, 859, 296);
		panel.add(scrollPane);
		//scrollPane.setViewportView(table);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				General gene = new General();
				try {
					ResultSet rs = gene.ShowProfile(Integer.parseInt(ara.getText()));
					table.setModel(myUtils.buildTableModel(rs));
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnRegirtration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int    ide      = Integer.parseInt(ridentity.getText());
				String nam      = rname.getText();
				String sur      = rsurname.getText();
				String cel      = rcell.getText();
				String ema      = remail.getText();
				String pas      = rpassword.getText();
				Float  sal      = Float.parseFloat(rsalary.getText());
				String dep      = rdepartment.getSelectedItem().toString();
				String gen      = "";
				if(rmale.isSelected())            gen      =   "Male";
				else if(rfemale.isSelected())     gen      =   "Female";
					
				if(rpost.getSelectedIndex()==0) {
						ManagerFactory managerFactory = new ManagerFactory();
						Managers    manager = managerFactory.getManager("GeneralManager");
						
						manager.setTc(ide);
						manager.setName(nam);
						manager.setSurname(sur);
						manager.setCell(cel);
						manager.setEmail(ema);
						manager.setPassword(pas);
						manager.setSalary(sal);
						manager.setDepartement(dep);
						manager.setPost(rpost.getSelectedItem().toString());
					    manager.setGender(gen);
						try {
							manager.Record(manager);
						} catch (Exception e2) {
							e2.printStackTrace();
						}
				}
				else if(rpost.getSelectedIndex()==1) {
					ManagerFactory managerFactory = new ManagerFactory();
					Managers              manager = managerFactory.getManager("ManagerAssistant");
					
					manager.setTc(ide);
					manager.setName(nam);
					manager.setSurname(sur);
					manager.setCell(cel);
					manager.setEmail(ema);
					manager.setPassword(pas);
					manager.setSalary(sal);
					manager.setDepartement(dep);
					manager.setPost(rpost.getSelectedItem().toString());
				    manager.setGender(gen);
				    
					try {
						manager.Record(manager);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}
				
				else if(rpost.getSelectedIndex()==2) {
					ManagerFactory managerFactory = new ManagerFactory();
					Managers              manager = managerFactory.getManager("SalesManager");
					
					manager.setTc(ide);
					manager.setName(nam);
					manager.setSurname(sur);
					manager.setCell(cel);
					manager.setEmail(ema);
					manager.setPassword(pas);
					manager.setSalary(sal);
					manager.setDepartement(dep);
					manager.setPost(rpost.getSelectedItem().toString());
				    manager.setGender(gen);
				    
					try {
						manager.Record(manager);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}
            
				else if(rpost.getSelectedIndex()==3) {
					ManagerFactory managerFactory = new ManagerFactory();
					Managers              manager = managerFactory.getManager("HumanResourcesManager");
					
					manager.setTc(ide);
					manager.setName(nam);
					manager.setSurname(sur);
					manager.setCell(cel);
					manager.setEmail(ema);
					manager.setPassword(pas);
					manager.setSalary(sal);
					manager.setDepartement(dep);
					manager.setPost(rpost.getSelectedItem().toString());
				    manager.setGender(gen);
				    
					try {
						manager.Record(manager);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}
				else if(rpost.getSelectedIndex()==4) {
				
					InformationProcessor agent = new InformationProcessor();
										
					agent.setTc(ide);
					agent.setName(nam);
					agent.setSurname(sur);
					agent.setCell(cel);
					agent.setEmail(ema);
					agent.setPassword(pas);
					agent.setSalary(sal);
					agent.setDepartement(dep);
					agent.setPost(rpost.getSelectedItem().toString());
					agent.setGender(gen);
				    
					try {
						agent.Record(agent);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}
				else if(rpost.getSelectedIndex()==5) {
					
					TradeAgent agent = new TradeAgent();
										
					agent.setTc(ide);
					agent.setName(nam);
					agent.setSurname(sur);
					agent.setCell(cel);
					agent.setEmail(ema);
					agent.setPassword(pas);
					agent.setSalary(sal);
					agent.setDepartement(dep);
					agent.setPost(rpost.getSelectedItem().toString());
					agent.setGender(gen);
				    
					try {
						agent.Record(agent);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}
				
				else if(rpost.getSelectedIndex()==6) {
					
					SteedAgent agent = new SteedAgent();
										
					agent.setTc(ide);
					agent.setName(nam);
					agent.setSurname(sur);
					agent.setCell(cel);
					agent.setEmail(ema);
					agent.setPassword(pas);
					agent.setSalary(sal);
					agent.setDepartement(dep);
					agent.setPost(rpost.getSelectedItem().toString());
					agent.setGender(gen);
				    
					try {
						agent.Record(agent);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}	
				else if(rpost.getSelectedIndex()==7) {
					
					DriverAgent agent = new DriverAgent();
										
					agent.setTc(ide);
					agent.setName(nam);
					agent.setSurname(sur);
					agent.setCell(cel);
					agent.setEmail(ema);
					agent.setPassword(pas);
					agent.setSalary(sal);
					agent.setDepartement(dep);
					agent.setPost(rpost.getSelectedItem().toString());
					agent.setGender(gen);
				    
					try {
						agent.Record(agent);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}
				
else if(rpost.getSelectedIndex()==8) {
					
				AbstractFactory factory = FactoryProvider.getFactory("AuditFactory");
				Audit  agent            = (Audit) factory.create("ChiefAccountAudit");
											
					agent.setTc(ide);
					agent.setName(nam);
					agent.setSurname(sur);
					agent.setCell(cel);
					agent.setEmail(ema);
					agent.setPassword(pas);
					agent.setSalary(sal);
					agent.setDepartement(dep);
					agent.setPost(rpost.getSelectedItem().toString());
					agent.setGender(gen);
				    
					try {
						agent.Record(agent);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}	
					
else if(rpost.getSelectedIndex()==9) {
	
	AbstractFactory factory = FactoryProvider.getFactory("AuditFactory");
	Audit  agent            = (Audit) factory.create("ComissaryInControl");
								
		agent.setTc(ide);
		agent.setName(nam);
		agent.setSurname(sur);
		agent.setCell(cel);
		agent.setEmail(ema);
		agent.setPassword(pas);
		agent.setSalary(sal);
		agent.setDepartement(dep);
		agent.setPost(rpost.getSelectedItem().toString());
		agent.setGender(gen);
	    
		try {
			agent.Record(agent);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
}	
				
else if(rpost.getSelectedIndex()==11) {
	
	AbstractFactory factory = FactoryProvider.getFactory("FinanceFactory");
	Finances agent            = (Finances) factory.create("chiefAccount");
								
		agent.setTc(ide);
		agent.setName(nam);
		agent.setSurname(sur);
		agent.setCell(cel);
		agent.setEmail(ema);
		agent.setPassword(pas);
		agent.setSalary(sal);
		agent.setDepartement(dep);
		agent.setPost(rpost.getSelectedItem().toString());
		agent.setGender(gen);
	    
		try {
			agent.Record(agent);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
}	
else if(rpost.getSelectedIndex()==12) {
	
	AbstractFactory factory = FactoryProvider.getFactory("FinanceFactory");
	Finances agent            = (Finances) factory.create("Accountant");
								
		agent.setTc(ide);
		agent.setName(nam);
		agent.setSurname(sur);
		agent.setCell(cel);
		agent.setEmail(ema);
		agent.setPassword(pas);
		agent.setSalary(sal);
		agent.setDepartement(dep);
		agent.setPost(rpost.getSelectedItem().toString());
		agent.setGender(gen);
	    
		try {
			agent.Record(agent);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
}			

				
			}
		});
		
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				int    ide      = Integer.parseInt(ridentity.getText());
				String nam      = rname.getText();
				String sur      = rsurname.getText();
				String cel      = rcell.getText();
				String ema      = remail.getText();
				String pas      = rpassword.getText();
				Float  sal      = Float.parseFloat(rsalary.getText());
				String dep      = rdepartment.getSelectedItem().toString();
				String gen      = "";
				if(rmale.isSelected())            gen      =   "Male";
				else if(rfemale.isSelected())     gen      =   "Female";
				
				
				
				if(rpost.getSelectedIndex()==0) {
					ManagerFactory managerFactory = new ManagerFactory();
					Managers    manager = managerFactory.getManager("GeneralManager");
					
					manager.setTc(ide);
					manager.setName(nam);
					manager.setSurname(sur);
					manager.setCell(cel);
					manager.setEmail(ema);
					manager.setPassword(pas);
					manager.setSalary(sal);
					manager.setDepartement(dep);
					manager.setPost(rpost.getSelectedItem().toString());
				    manager.setGender(gen);
					try {
						manager.Update(manager);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}
			else if(rpost.getSelectedIndex()==1) {
				ManagerFactory managerFactory = new ManagerFactory();
				Managers              manager = managerFactory.getManager("ManagerAssistant");
				
				manager.setTc(ide);
				manager.setName(nam);
				manager.setSurname(sur);
				manager.setCell(cel);
				manager.setEmail(ema);
				manager.setPassword(pas);
				manager.setSalary(sal);
				manager.setDepartement(dep);
				manager.setPost(rpost.getSelectedItem().toString());
			    manager.setGender(gen);
			    
				try {
					manager.Update(manager);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
		}
			
			else if(rpost.getSelectedIndex()==2) {
				ManagerFactory managerFactory = new ManagerFactory();
				Managers              manager = managerFactory.getManager("SalesManager");
				
				manager.setTc(ide);
				manager.setName(nam);
				manager.setSurname(sur);
				manager.setCell(cel);
				manager.setEmail(ema);
				manager.setPassword(pas);
				manager.setSalary(sal);
				manager.setDepartement(dep);
				manager.setPost(rpost.getSelectedItem().toString());
			    manager.setGender(gen);
			    
				try {
					manager.Update(manager);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
		}
				
				

			}
		});	
		
		
		
		
		
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int    ide      = Integer.parseInt(ridentity.getText());
				
				
				
				if(rpost.getSelectedIndex()==0) {
					ManagerFactory managerFactory = new ManagerFactory();
					Managers    manager = managerFactory.getManager("GeneralManager");
					
					int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
					if(sil==0) {
						try {	
							manager.Delete(ide);
							JOptionPane.showMessageDialog(null,"Successfully deleted!");
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					}else {
						    JOptionPane.showMessageDialog(null,"Operation canceled!");
					}
					
			}
			else if(rpost.getSelectedIndex()==1) {
				ManagerFactory managerFactory = new ManagerFactory();
				Managers              manager = managerFactory.getManager("ManagerAssistant");
				
				int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
				if(sil==0) {
					try {	
						manager.Delete(ide);
						JOptionPane.showMessageDialog(null,"Successfully deleted!");
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}else {
					    JOptionPane.showMessageDialog(null,"Operation canceled!");
				}
		
				
		}
			
			else if(rpost.getSelectedIndex()==2) {
				ManagerFactory managerFactory = new ManagerFactory();
				Managers              manager = managerFactory.getManager("SalesManager");
				
			
				int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
				if(sil==0) {
					try {	
						manager.Delete(ide);
						JOptionPane.showMessageDialog(null,"Successfully deleted!");
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}else {
					    JOptionPane.showMessageDialog(null,"Operation canceled!");
				}
		}
        
			else if(rpost.getSelectedIndex()==3) {
				ManagerFactory managerFactory = new ManagerFactory();
				Managers              manager = managerFactory.getManager("HumanResourcesManager");
				
			
				int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
				if(sil==0) {
					try {	
						manager.Delete(ide);
						JOptionPane.showMessageDialog(null,"Successfully deleted!");
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}else {
					    JOptionPane.showMessageDialog(null,"Operation canceled!");
				}
				
		}
			else if(rpost.getSelectedIndex()==4) {
			
				InformationProcessor agent = new InformationProcessor();
									
				int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
				if(sil==0) {
					try {	
						agent.Delete(ide);
						JOptionPane.showMessageDialog(null,"Successfully deleted!");
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}else {
					    JOptionPane.showMessageDialog(null,"Operation canceled!");
				}
			    
				
		}
			else if(rpost.getSelectedIndex()==5) {
				
				TradeAgent agent = new TradeAgent();
									
			
				int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
				if(sil==0) {
					try {	
						agent.Delete(ide);
						JOptionPane.showMessageDialog(null,"Successfully deleted!");
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}else {
					    JOptionPane.showMessageDialog(null,"Operation canceled!");
				}
		}
			
			else if(rpost.getSelectedIndex()==6) {
				
				SteedAgent agent = new SteedAgent();
									
	
				int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
				if(sil==0) {
					try {	
						agent.Delete(ide);
						JOptionPane.showMessageDialog(null,"Successfully deleted!");
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}else {
					    JOptionPane.showMessageDialog(null,"Operation canceled!");
				}
		}	
			else if(rpost.getSelectedIndex()==7) {
				
				DriverAgent agent = new DriverAgent();
									

				int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
				if(sil==0) {
					try {	
						agent.Delete(ide);
						JOptionPane.showMessageDialog(null,"Successfully deleted!");
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}else {
					    JOptionPane.showMessageDialog(null,"Operation canceled!");
				}
		}
			
else if(rpost.getSelectedIndex()==8) {
				
			AbstractFactory factory = FactoryProvider.getFactory("AuditFactory");
			Audit  agent            = (Audit) factory.create("ChiefAccountAudit");
										
			int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
			if(sil==0) {
				try {	
					agent.Delete(ide);
					JOptionPane.showMessageDialog(null,"Successfully deleted!");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}else {
				    JOptionPane.showMessageDialog(null,"Operation canceled!");
			}
		}	
				
else if(rpost.getSelectedIndex()==9) {

AbstractFactory factory = FactoryProvider.getFactory("AuditFactory");
Audit  agent            = (Audit) factory.create("ComissaryInControl");

int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
if(sil==0) {
	try {	
		agent.Delete(ide);
		JOptionPane.showMessageDialog(null,"Successfully deleted!");
	} catch (Exception e2) {
		e2.printStackTrace();
	}
}else {
	    JOptionPane.showMessageDialog(null,"Operation canceled!");
}
}	
			
else if(rpost.getSelectedIndex()==11) {

AbstractFactory factory = FactoryProvider.getFactory("FinanceFactory");
Finances agent            = (Finances) factory.create("chiefAccount");

    
int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
if(sil==0) {
	try {	
		agent.Delete(ide);
		JOptionPane.showMessageDialog(null,"Successfully deleted!");
	} catch (Exception e2) {
		e2.printStackTrace();
	}
}else {
	    JOptionPane.showMessageDialog(null,"Operation canceled!");
}
}	
else if(rpost.getSelectedIndex()==12) {

AbstractFactory factory = FactoryProvider.getFactory("FinanceFactory");
Finances agent            = (Finances) factory.create("Accountant");
							

int sil = JOptionPane.showConfirmDialog(null,"Are sure to delete this accoumpt?");
if(sil==0) {
	try {	
		agent.Delete(ide);
		JOptionPane.showMessageDialog(null,"Successfully deleted!");
	} catch (Exception e2) {
		e2.printStackTrace();
	}
}else {
	    JOptionPane.showMessageDialog(null,"Operation canceled!");
}
}			

			
		}
	});
				
				

		
		
		
		
		
		
		
		
		
		
	}
}
