package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Warehouse_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearchID;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warehouse_GUI frame = new Warehouse_GUI();
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
	public Warehouse_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Warehouse_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Quản lý kho");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLeft = new JPanel();
		panelLeft.setLayout(null);
		panelLeft.setBackground(new Color(33, 124, 163));
		panelLeft.setBounds(0, 0, 260, 663);
		contentPane.add(panelLeft);
		
		JLabel iconCompany = new JLabel("");
		iconCompany.setIcon(new ImageIcon(Warehouse_GUI.class.getResource("/Images/icon_Company48px.png")));
		iconCompany.setBounds(100, 250, 48, 48);
		panelLeft.add(iconCompany);
		
		JLabel lbName1 = new JLabel("NGUYENQUAN");
		lbName1.setHorizontalAlignment(SwingConstants.CENTER);
		lbName1.setForeground(Color.WHITE);
		lbName1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbName1.setBounds(10, 300, 240, 40);
		panelLeft.add(lbName1);
		
		JLabel lbName2 = new JLabel("COMPANY");
		lbName2.setHorizontalAlignment(SwingConstants.CENTER);
		lbName2.setForeground(new Color(226, 153, 48));
		lbName2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbName2.setBounds(10, 340, 240, 40);
		panelLeft.add(lbName2);
		
		JPanel panelRight = new JPanel();
		panelRight.setBounds(261, 0, 925, 663);
		contentPane.add(panelRight);
		panelRight.setLayout(null);
		
		JLabel lbTitle = new JLabel("QUẢN LÝ KHO");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTitle.setBounds(0, 0, 925, 100);
		panelRight.add(lbTitle);
		
		JComboBox cbSearchAgency = new JComboBox();
		cbSearchAgency.setBounds(180, 110, 170, 26);
		panelRight.add(cbSearchAgency);
		
		JLabel lbSearchAgency = new JLabel("Loc theo đại lý:");
		lbSearchAgency.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSearchAgency.setBounds(60, 110, 110, 20);
		panelRight.add(lbSearchAgency);
		
		JLabel lbSearchID = new JLabel("Lọc theo ID:");
		lbSearchID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSearchID.setBounds(60, 180, 93, 20);
		panelRight.add(lbSearchID);
		
		txtSearchID = new JTextField();
		txtSearchID.setBounds(180, 174, 550, 26);
		panelRight.add(txtSearchID);
		txtSearchID.setColumns(10);
		
		JButton btnOutputFile = new JButton("Xuất file");
		btnOutputFile.setIcon(new ImageIcon(Warehouse_GUI.class.getResource("/Images/iconOutputFile24px.png")));
		btnOutputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOutputFile.setBackground(Color.LIGHT_GRAY);
		btnOutputFile.setBounds(795, 110, 120, 35);
		panelRight.add(btnOutputFile);
		
		JButton btnSearchID = new JButton("Tìm kiếm");
		btnSearchID.setIcon(new ImageIcon(Warehouse_GUI.class.getResource("/Images/iconSearch24px.png")));
		btnSearchID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearchID.setBackground(Color.LIGHT_GRAY);
		btnSearchID.setBounds(795, 165, 120, 35);
		panelRight.add(btnSearchID);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "T\u00EAn s\u1EA3n ph\u1EA9m", "S\u1ED1 l\u01B0\u1EE3ng", "T\u1ED3n kho", "Nh\u00E0 cung c\u1EA5p"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(21, 225, 882, 370);
		panelRight.add(table);
		
		JButton btnDel = new JButton("Xóa SP");
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDel.setBackground(new Color(153, 153, 255));
		btnDel.setBounds(795, 618, 120, 35);
		panelRight.add(btnDel);
		
		JButton btnEdit = new JButton("Sửa thông tin");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEdit.setBackground(new Color(153, 153, 255));
		btnEdit.setBounds(640, 618, 120, 35);
		panelRight.add(btnEdit);
		
		JButton btnAdd = new JButton("Thêm SP");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBackground(new Color(153, 153, 255));
		btnAdd.setBounds(485, 618, 120, 35);
		panelRight.add(btnAdd);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
