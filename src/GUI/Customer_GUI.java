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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Customer_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_GUI frame = new Customer_GUI();
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
	public Customer_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Customer_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Danh sách khách hàng");
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
		iconCompany.setIcon(new ImageIcon(Customer_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lblDanhSchKhch = new JLabel("DANH SÁCH KHÁCH HÀNG");
		lblDanhSchKhch.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchKhch.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblDanhSchKhch.setBounds(261, 0, 925, 100);
		contentPane.add(lblDanhSchKhch);
		
		JLabel lblTmKimNhn = new JLabel("Tìm nhân viên:");
		lblTmKimNhn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTmKimNhn.setBounds(295, 120, 125, 24);
		contentPane.add(lblTmKimNhn);
		
		txtSearch = new JTextField();
		txtSearch.setColumns(10);
		txtSearch.setBounds(430, 110, 321, 35);
		contentPane.add(txtSearch);
		
		JButton btnSearch = new JButton("Tìm kiếm");
		btnSearch.setIcon(new ImageIcon(Customer_GUI.class.getResource("/Images/iconSearch24px.png")));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBackground(new Color(0, 255, 153));
		btnSearch.setBounds(780, 110, 120, 35);
		contentPane.add(btnSearch);
		
		JButton btnInputFile = new JButton("Nhập file");
		btnInputFile.setIcon(new ImageIcon(Customer_GUI.class.getResource("/Images/iconInputFile.png")));
		btnInputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInputFile.setBackground(new Color(226, 153, 46));
		btnInputFile.setBounds(920, 110, 120, 35);
		contentPane.add(btnInputFile);
		
		JButton btnOutputFile = new JButton("Xuất file");
		btnOutputFile.setIcon(new ImageIcon(Customer_GUI.class.getResource("/Images/iconOutputFile24px.png")));
		btnOutputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOutputFile.setBackground(Color.LIGHT_GRAY);
		btnOutputFile.setBounds(1060, 110, 120, 35);
		contentPane.add(btnOutputFile);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "T\u00EAn KH", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Email", "T\u1ED5ng \u0111\u00E3 mua"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(295, 182, 870, 390);
		contentPane.add(table);
		
		JButton btnAddCustomer = new JButton("Thêm KH");
		btnAddCustomer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddCustomer.setBackground(new Color(153, 153, 255));
		btnAddCustomer.setBounds(779, 605, 120, 35);
		contentPane.add(btnAddCustomer);
		
		JButton btnEditCustomer = new JButton("Sửa thông tin");
		btnEditCustomer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditCustomer.setBackground(new Color(153, 153, 255));
		btnEditCustomer.setBounds(920, 605, 120, 35);
		contentPane.add(btnEditCustomer);
		
		JButton btnDelCustomer = new JButton("Xóa KH");
		btnDelCustomer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelCustomer.setBackground(new Color(153, 153, 255));
		btnDelCustomer.setBounds(1060, 605, 120, 35);
		contentPane.add(btnDelCustomer);
	}
}
