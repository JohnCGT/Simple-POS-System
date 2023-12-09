import java.awt.BorderLayout;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.TextField;
import java.awt.Button;
import java.text.DecimalFormat;
public class simple_POS extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable Table;
	private JButton first_item;
	private JButton second_item;
	private JButton third_item;
	private JButton forth_item;
	private JButton fifth_item;
	private JButton sixth_item;
	private JButton seventh_item;
	private JButton eighth_item;
	private JButton ninth_item;
	private JLabel quantity_label1;
	private JLabel quantity_label2;
	private JLabel quantity_label3;
	private JLabel quantity_label4;
	private JLabel quantity_label5;
	private JLabel quantity_label6;
	private JLabel quantity_label7;
	private JLabel quantity_label8;
	private JLabel quantity_label9;
	private JLabel totalValue;
	private TextField cashValue; 
	private JLabel balanceValue;
	private JTextArea textArea;
	
	public void addTable(int ID, String Name, int Qty, double Price) {
		DefaultTableModel dt = (DefaultTableModel) Table.getModel();
		DecimalFormat df = new DecimalFormat("00.00");
		double totPrice = Price * Double.valueOf(Qty);
		String TotalPrice = df.format(totPrice);
		
		
		for (int row = 0; row < Table.getRowCount(); row++) {
			if (Name == Table.getValueAt(row,1)) {
				dt.removeRow(Table.convertRowIndexToModel(row));
			}
		}
		
		Vector v = new Vector();
		
		v.add(ID);
		v.add(Name);
		v.add(Qty);
		v.add(TotalPrice);
		
		dt.addRow(v);
		
	}
	// Calculate total values
	public void cal() {
		int numOfRow = Table.getRowCount();
		double tot = 0.0;
		for (int i = 0; i < numOfRow; i++) {
			double value = Double.valueOf(Table.getValueAt(i, 3).toString());
			tot += value;
		}
		DecimalFormat df = new DecimalFormat("00.00");
		totalValue.setText(df.format(tot));
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simple_POS frame = new simple_POS();
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
	public simple_POS() {
		setTitle("Simple POS System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1375, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 627, 682);
		contentPane.add(panel);
		panel.setLayout(null);
		
		first_item = new JButton("");
		first_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label1.getText());
				++i;
				quantity_label1.setText(String.valueOf(i));
				addTable(1, "ZRW Combo", i, 169.00);
				cal();
			}
		});
		first_item.setBackground(new Color(0, 0, 0));
		first_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/1.jpg")));
		first_item.setBounds(10, 11, 196, 161);
		panel.add(first_item);
		
		second_item = new JButton("");
		second_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label2.getText());
				++i;
				quantity_label2.setText(String.valueOf(i));
				addTable(2, "1 Pc Combo  ", i, 189.00);
				cal();
			}
		});
		second_item.setBackground(new Color(0, 0, 0));
		second_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/2.jpg")));
		second_item.setBounds(215, 11, 196, 161);
		panel.add(second_item);
		
		third_item = new JButton("");
		third_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label3.getText());
				++i;
				quantity_label3.setText(String.valueOf(i));
				addTable(3, "2 Pc Combo ", i, 275.00);
				cal();
			}
		});
		third_item.setBackground(new Color(0, 0, 0));
		third_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/3.jpg")));
		third_item.setBounds(421, 11, 196, 161);
		panel.add(third_item);
		
		forth_item = new JButton("");
		forth_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label4.getText());
				++i;
				quantity_label4.setText(String.valueOf(i));
				addTable(4, "Dinner Plate", i, 178.00);
				cal();
			}
		});
		forth_item.setBackground(new Color(0, 0, 0));
		forth_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/4.jpg")));
		forth_item.setBounds(10, 242, 196, 161);
		panel.add(forth_item);
		
		fifth_item = new JButton("");
		fifth_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label5.getText());
				++i;
				quantity_label5.setText(String.valueOf(i));
				addTable(5, "Mini Bucket", i, 220.00);
				cal();
			}
		});
		fifth_item.setBackground(new Color(0, 0, 0));
		fifth_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/5.jpg")));
		fifth_item.setBounds(215, 242, 196, 161);
		panel.add(fifth_item);
		
		sixth_item = new JButton("");
		sixth_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label6.getText());
				++i;
				quantity_label6.setText(String.valueOf(i));
				addTable(6, "Col. Burger", i, 220.00);
				cal();
			}
		});
		sixth_item.setBackground(new Color(0, 0, 0));
		sixth_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/6.jpg")));
		sixth_item.setBounds(421, 242, 196, 161);
		panel.add(sixth_item);
		
		seventh_item = new JButton("");
		seventh_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label7.getText());
				++i;
				quantity_label7.setText(String.valueOf(i));
				addTable(7, "Zinger Burger", i, 155.00);
				cal();
			}
		});
		seventh_item.setBackground(new Color(0, 0, 0));
		seventh_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/7.jpg")));
		seventh_item.setBounds(10, 465, 196, 161);
		panel.add(seventh_item);
		
		eighth_item = new JButton("");
		eighth_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label8.getText());
				++i;
				quantity_label8.setText(String.valueOf(i));
				addTable(8, "LZ Combo", i, 71.00);
				cal();
			}
		});
		eighth_item.setBackground(new Color(0, 0, 0));
		eighth_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/8.jpg")));
		eighth_item.setBounds(215, 465, 196, 161);
		panel.add(eighth_item);
		
		ninth_item = new JButton("");
		ninth_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(quantity_label9.getText());
				++i;
				quantity_label9.setText(String.valueOf(i));
				addTable(9, "ZR Wrap", i, 290.00);
				cal();
			}
		});
		ninth_item.setBackground(new Color(0, 0, 0));
		ninth_item.setIcon(new ImageIcon(simple_POS.class.getResource("/pic/9.jpg")));
		ninth_item.setBounds(421, 465, 196, 161);
		panel.add(ninth_item);
		
		quantity_label1 = new JLabel("0");
		quantity_label1.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label1.setForeground(new Color(0, 0, 0));
		quantity_label1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label1.setBounds(10, 183, 196, 34);
		panel.add(quantity_label1);
		
		quantity_label2 = new JLabel("0");
		quantity_label2.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label2.setForeground(Color.BLACK);
		quantity_label2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label2.setBounds(215, 183, 196, 34);
		panel.add(quantity_label2);
		
		quantity_label3 = new JLabel("0");
		quantity_label3.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label3.setForeground(Color.BLACK);
		quantity_label3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label3.setBounds(421, 183, 196, 34);
		panel.add(quantity_label3);
		
		quantity_label4 = new JLabel("0");
		quantity_label4.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label4.setForeground(Color.BLACK);
		quantity_label4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label4.setBounds(421, 414, 196, 34);
		panel.add(quantity_label4);
		
		quantity_label5 = new JLabel("0");
		quantity_label5.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label5.setForeground(Color.BLACK);
		quantity_label5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label5.setBounds(215, 414, 196, 34);
		panel.add(quantity_label5);
		
		quantity_label6 = new JLabel("0");
		quantity_label6.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label6.setForeground(Color.BLACK);
		quantity_label6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label6.setBounds(10, 414, 196, 34);
		panel.add(quantity_label6);
		
		quantity_label7 = new JLabel("0");
		quantity_label7.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label7.setForeground(Color.BLACK);
		quantity_label7.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label7.setBounds(10, 637, 196, 34);
		panel.add(quantity_label7);
		
		quantity_label8 = new JLabel("0");
		quantity_label8.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label8.setForeground(Color.BLACK);
		quantity_label8.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label8.setBounds(215, 637, 196, 34);
		panel.add(quantity_label8);
		
		quantity_label9 = new JLabel("0");
		quantity_label9.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_label9.setForeground(Color.BLACK);
		quantity_label9.setFont(new Font("Tahoma", Font.PLAIN, 23));
		quantity_label9.setBounds(421, 637, 196, 34);
		panel.add(quantity_label9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(637, 11, 722, 477);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 372, 427);
		panel_1.add(scrollPane);
		
		Table = new JTable();
		scrollPane.setViewportView(Table);
		Table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Item", "Qty", "Price"
			}
		));
		
		textArea = new JTextArea();
		textArea.setBounds(382, 2, 340, 475);
		panel_1.add(textArea);
		
		// Delete items
		Button deleteButton = new Button("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dt = (DefaultTableModel) Table.getModel();
				String r = dt.getValueAt(Table.getSelectedRow(),0).toString();
				
				// Remove product
				int rw = Table.getSelectedRow();
				dt.removeRow(rw);
				cal();
				
				// Remove quantity label
				switch(r) {
				case "1":
					quantity_label1.setText("0");
					break;
				case "2":
					quantity_label2.setText("0");
					break;
				case "3":
					quantity_label3.setText("0");
					break;
				case "4":
					quantity_label4.setText("0");
					break;
				case "5":
					quantity_label5.setText("0");
					break;
				case "6":
					quantity_label6.setText("0");
					break;
				case "7":
					quantity_label7.setText("0");
					break;
				case "8":
					quantity_label8.setText("0");
					break;
				case "9":
					quantity_label9.setText("0");
					break;
				default:
					System.out.println("Over");
					break;
				}
			}
		});
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		deleteButton.setBounds(287, 433, 85, 44);
		panel_1.add(deleteButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(637, 499, 722, 164);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(0, 11, 140, 33);
		panel_2.add(lblNewLabel);
		
		JLabel lblCash = new JLabel("Cash :");
		lblCash.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCash.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblCash.setBounds(0, 66, 140, 33);
		panel_2.add(lblCash);
		
		JLabel lblBalance = new JLabel("Balance :");
		lblBalance.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblBalance.setBounds(0, 120, 140, 33);
		panel_2.add(lblBalance);
		
		totalValue = new JLabel("00");
		totalValue.setHorizontalAlignment(SwingConstants.LEFT);
		totalValue.setFont(new Font("Tahoma", Font.BOLD, 27));
		totalValue.setBounds(158, 11, 140, 33);
		panel_2.add(totalValue);
		
		balanceValue = new JLabel("00");
		balanceValue.setHorizontalAlignment(SwingConstants.LEFT);
		balanceValue.setFont(new Font("Tahoma", Font.BOLD, 27));
		balanceValue.setBounds(158, 120, 140, 33);
		panel_2.add(balanceValue);
		
		cashValue = new TextField();
		cashValue.setFont(new Font("Tahoma", Font.BOLD, 27));
		cashValue.setBounds(158, 66, 140, 33);
		panel_2.add(cashValue);
		
		Button payButton = new Button("Pay");
		payButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tot = Double.valueOf(totalValue.getText());
				double paid = Double.valueOf(cashValue.getText());
				double balance = paid - tot;
				
				DecimalFormat df = new DecimalFormat("00.00");
				balanceValue.setText(String.valueOf(df.format(balance)));
						
			}
		});
		payButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		payButton.setBounds(382, 0, 148, 164);
		panel_2.add(payButton);
		
		Button printButton = new Button("Print");
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.setText("                                    Fried Chicken ni Gloc 9 \n");
					textArea.setText(textArea.getText() + "                                     Intergalactic Highway \n");
					textArea.setText(textArea.getText() + "                                         Biringan, Campus \n");
					textArea.setText(textArea.getText() + "                                      +143046264894897 \n");
					textArea.setText(textArea.getText() + "-------------------------------------------------------------------------------------\n");
					textArea.setText(textArea.getText() + " Item \t\tQty \tPrice" + "\n");
					textArea.setText(textArea.getText() + "-------------------------------------------------------------------------------------\n");
					DefaultTableModel df = (DefaultTableModel) Table.getModel();
					
					// Table product details
					
					for (int i = 0; i < Table.getRowCount(); i++) {
						String Name = df.getValueAt(i, 1).toString();
						String Qty = df.getValueAt(i, 2).toString();
						String Price = df.getValueAt(i, 3).toString();
						
						textArea.setText(textArea.getText() + " " + Name + "\t\t" + Qty + "\t" + Price + "\n");
					} 
					
					textArea.setText(textArea.getText() + "-------------------------------------------------------------------------------------\n");
					textArea.setText(textArea.getText() + "Sub total\t: " + totalValue.getText() + "\n");
					textArea.setText(textArea.getText() + "Cash\t: " + cashValue.getText() + "\n");
					textArea.setText(textArea.getText() + "Balance\t: " + balanceValue.getText() + "\n");
					textArea.setText(textArea.getText() + "-------------------------------------------------------------------------------------\n");
					textArea.setText(textArea.getText() + "                         Submitted by: UCOS 2-2 GROUP 1" + "\n");
					textArea.setText(textArea.getText() + "                         Submitted to: Prof. Buen Carlo Pan" + "\n");
					textArea.setText(textArea.getText() + "-------------------------------------------------------------------------------------\n");
					textArea.setText(textArea.getText() + "                          Software by Youtube Dapp Code");
				
				textArea.print();
				}
				catch (Exception f){
					System.out.println(f);
				}
			}
		});
		printButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		printButton.setBounds(574, 0, 148, 164);
		panel_2.add(printButton);
		
		// Size of table
		Table.getColumnModel().getColumn(0).setPreferredWidth(30);
		Table.getColumnModel().getColumn(1).setPreferredWidth(200);
	}
}
