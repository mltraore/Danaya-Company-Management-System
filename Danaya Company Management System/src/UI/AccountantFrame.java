package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MO.General;
import MO.myUtils;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AccountantFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField ara;
	private JTable table_1;
	private float a=0 ;
	private int b ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantFrame frame = new AccountantFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AccountantFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 885, 521);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Show Staffs ", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 206, 860, 256);
		panel.add(table);
		
		JButton btnNewButton = new JButton("Show All");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				General gene = new General();
				try {
					ResultSet rs = gene.ShowAll();
					table.setModel(myUtils.buildTableModel(rs));
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
	
			}
		});
		btnNewButton.setBounds(10, 165, 89, 37);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show By Post");
		
		btnNewButton_1.setBounds(251, 165, 122, 37);
		panel.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GManager", "ManagerAs", "SManager", "HRManager", "InfoProcessor", "TradeAgent", "SteedAgent ", "DriverAgent", "CAccountAudit", "CInControl", "SecretaryAudit", "CAccountant", "Accountant", "SecretaryAgent ", "Guardian "}));
		comboBox.setBounds(109, 165, 135, 35);
		panel.add(comboBox);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		if(comboBox.getSelectedIndex()==0) {
				General gene = new General();
				try {
				    ResultSet rs = gene.ShowByPost("General_Managers");
					table.setModel(myUtils.buildTableModel(rs));
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
		}
		
		else if(comboBox.getSelectedIndex()==1) {
			General gene = new General();
			try {
				ResultSet rs = gene.ShowByPost("Manager_Assistants");
					table.setModel(myUtils.buildTableModel(rs));
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			
		}
		 else if(comboBox.getSelectedIndex()==2) {
				General gene = new General();
				try {
					ResultSet rs = gene.ShowByPost("Human_Resources_Managers");
						table.setModel(myUtils.buildTableModel(rs));
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
					
				
			}
		
		
           else if(comboBox.getSelectedIndex()==3) {
			General gene = new General();
			try {
				ResultSet rs = gene.ShowByPost("Human_Resources_Managers");
					table.setModel(myUtils.buildTableModel(rs));
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			
		}
           else if(comboBox.getSelectedIndex()==4) {
   			General gene = new General();
   			try {
   				ResultSet rs = gene.ShowByPost("Information_Processors");
   					table.setModel(myUtils.buildTableModel(rs));
   					
   				} catch (Exception e2) {
   					// TODO: handle exception
   				}
   				
   			
   		}
           else if(comboBox.getSelectedIndex()==4) {
   			General gene = new General();
   			try {
   				ResultSet rs = gene.ShowByPost(" Trade_Agents");
   					table.setModel(myUtils.buildTableModel(rs));
   					
   				} catch (Exception e2) {
   					// TODO: handle exception
   				}
   				
   			
   		}
		
           else if(comboBox.getSelectedIndex()==5) {
   			General gene = new General();
   			try {
   				ResultSet rs = gene.ShowByPost("Steed_Agents");
   					table.setModel(myUtils.buildTableModel(rs));
   					
   				} catch (Exception e2) {
   					// TODO: handle exception
   				}
   				
   			
   		}
           else if(comboBox.getSelectedIndex()==6) {
   			General gene = new General();
   			try {
   				ResultSet rs = gene.ShowByPost("Driver_Agents");
   					table.setModel(myUtils.buildTableModel(rs));
   					
   				} catch (Exception e2) {
   					// TODO: handle exception
   				}
   				
   			
   		}
           else if(comboBox.getSelectedIndex()==7) {
        	   General gene = new General();
   			try {
   				ResultSet rs = gene.ShowByPost("Chief_Account_Audits");
   					table.setModel(myUtils.buildTableModel(rs));
   					
   				} catch (Exception e2) {
   					// TODO: handle exception
   				}
   				
   			
   		}
           else if(comboBox.getSelectedIndex()==8) {
        	   General gene = new General();
   			try {
   				ResultSet rs = gene.ShowByPost(" Chief_In_Controls");
   					table.setModel(myUtils.buildTableModel(rs));
   					
   				} catch (Exception e2) {
   					// TODO: handle exception
   				}
   				
   			
   		}
			}
		});
		
		JButton btnId = new JButton("Show By Name");
		
		btnId.setBounds(758, 165, 112, 37);
		panel.add(btnId);
		
		ara = new JTextField();
		ara.setBounds(590, 165, 167, 37);
		panel.add(ara);
		ara.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setBounds(452, 165, 128, 37);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Salary Staffs", null, panel_1, null);
		panel_1.setLayout(null);
		btnId.addActionListener(new ActionListener() {
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
		
		table_1 = new JTable();
		table_1.setBounds(10, 143, 860, 239);
		panel_1.add(table_1);
		
		JButton btnNewButton_2 = new JButton("Normal Salary");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				General gene = new General();
				try {
					ResultSet rs = gene.SalaryNormal();
					table_1.setModel(myUtils.buildTableModel(rs));
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		btnNewButton_2.setBounds(232, 103, 119, 29);
		panel_1.add(btnNewButton_2);
		
		
		
		JButton btnNewButton_4 = new JButton("SUM");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				General gene = new General();
				try {
					ResultSet rs = gene.sum();
					while(rs.next())			    
					    a=a+ Float.parseFloat(rs.getString(1)); 
		System.out.println(a);
					
				} catch (Exception e2) {
					
				}
				
			}
		});
		btnNewButton_4.setBounds(10, 432, 89, 29);
		panel_1.add(btnNewButton_4);
		
		JLabel lb1 = new JLabel("New label");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setBounds(443, 435, 191, 23);
		panel_1.add(lb1);
		
		JLabel label = new JLabel(Float.toString(a));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(187, 437, 191, 19);
		panel_1.add(label);
		
		JLabel lblSumOfNormal = new JLabel("Sum of Normal Salary");
		lblSumOfNormal.setBounds(235, 393, 191, 19);
		panel_1.add(lblSumOfNormal);
		
		JLabel lblSumOfSalary = new JLabel("Sum of Salary with Raise");
		lblSumOfSalary.setBounds(482, 393, 191, 19);
		panel_1.add(lblSumOfSalary);
		
		JButton btnSalaryWithRaise = new JButton("Salary  Raise");
		btnSalaryWithRaise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				General gene = new General();
				try {
					ResultSet rs = gene.Raise();
					table_1.setModel(myUtils.buildTableModel(rs));
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
				
				
				
			}
		});
		btnSalaryWithRaise.setBounds(495, 103, 119, 29);
		panel_1.add(btnSalaryWithRaise);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}
}
