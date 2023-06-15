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

public class Staff_GUI extends JFrame {

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
					Staff_GUI frame = new Staff_GUI();
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
	public Staff_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Staff_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Quản lý nhân viên");
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
		iconCompany.setIcon(new ImageIcon(Staff_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lbTitle = new JLabel("DANH SÁCH NHÂN VIÊN");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTitle.setBounds(0, 0, 925, 100);
		panelRight.add(lbTitle);
		
		JLabel lbCustomer = new JLabel("Tìm khách hàng:");
		lbCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbCustomer.setBounds(20, 113, 120, 24);
		panelRight.add(lbCustomer);
		
		txtSearch = new JTextField();
		txtSearch.setColumns(10);
		txtSearch.setBounds(150, 110, 321, 35);
		panelRight.add(txtSearch);
		
		JButton btnSearch = new JButton("Tìm kiếm");
		btnSearch.setIcon(new ImageIcon(Staff_GUI.class.getResource("/Images/iconSearch24px.png")));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBackground(new Color(0, 255, 153));
		btnSearch.setBounds(505, 110, 120, 35);
		panelRight.add(btnSearch);
		
		JButton btnInputFile = new JButton("Nhập file");
		btnInputFile.setIcon(new ImageIcon(Staff_GUI.class.getResource("/Images/iconInputFile.png")));
		btnInputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInputFile.setBackground(new Color(226, 153, 46));
		btnInputFile.setBounds(650, 110, 120, 35);
		panelRight.add(btnInputFile);
		
		JButton btnOutputFile = new JButton("Xuất file");
		btnOutputFile.setIcon(new ImageIcon(Staff_GUI.class.getResource("/Images/iconOutputFile24px.png")));
		btnOutputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOutputFile.setBackground(Color.LIGHT_GRAY);
		btnOutputFile.setBounds(795, 110, 120, 35);
		panelRight.add(btnOutputFile);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 nh\u00E2n vi\u00EAn", "H\u1ECD t\u00EAn", "CCCD", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "\u0110\u1ECBa ch\u1EC9"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(20, 190, 870, 390);
		panelRight.add(table);
		
		JButton btnAdd = new JButton("Thêm nhân viên");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBackground(new Color(153, 153, 255));
		btnAdd.setBounds(505, 610, 120, 35);
		panelRight.add(btnAdd);
		
		JButton btnEdit = new JButton("Sửa thông tin");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEdit.setBackground(new Color(153, 153, 255));
		btnEdit.setBounds(650, 610, 120, 35);
		panelRight.add(btnEdit);
		
		JButton btnDel = new JButton("Xóa nhân viên");
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDel.setBackground(new Color(153, 153, 255));
		btnDel.setBounds(795, 610, 120, 35);
		panelRight.add(btnDel);
	}
}
