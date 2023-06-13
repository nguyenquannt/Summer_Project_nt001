package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Agency_GUI extends JFrame {

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
					Agency_GUI frame = new Agency_GUI();
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
	public Agency_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Agency_GUI.class.getResource("/Images/iconLogo24px.png")));
		setResizable(false);
		setTitle("Danh sách đại lý");
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
		iconCompany.setIcon(new ImageIcon(Agency_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lbTitle = new JLabel("DANH SÁCH ĐẠI LÝ");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTitle.setBounds(261, 0, 925, 100);
		contentPane.add(lbTitle);
		
		JButton btnInputFile = new JButton("Nhập file");
		btnInputFile.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconInputFile.png"));
		btnInputFile.setBackground(new Color(226, 153, 46));
		btnInputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInputFile.setBounds(920, 110, 120, 35);
		contentPane.add(btnInputFile);
		
		JButton btnOutputFile = new JButton("Xuất file");
		btnOutputFile.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconOutputFile24px.png"));
		btnOutputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOutputFile.setBackground(Color.LIGHT_GRAY);
		btnOutputFile.setBounds(1060, 110, 120, 35);
		contentPane.add(btnOutputFile);
		
		JLabel lbSearch = new JLabel("Tìm kiếm đại lý:");
		lbSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSearch.setBounds(295, 120, 125, 24);
		contentPane.add(lbSearch);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(430, 110, 321, 35);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Tìm kiếm");
		btnSearch.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconSearch24px.png"));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBackground(new Color(0, 255, 153));
		btnSearch.setBounds(780, 110, 120, 35);
		contentPane.add(btnSearch);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID đại lý", "Tên đại lý", "Email", "Loại mặt hàng cung cấp"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(295, 182, 870, 390);
		contentPane.add(table);
		
		JButton btnAddAgency = new JButton("Thêm đại lý");
		btnAddAgency.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddAgency.setBackground(new Color(153, 153, 255));
		btnAddAgency.setBounds(779, 605, 120, 35);
		contentPane.add(btnAddAgency);
		
		JButton btnEditAgency = new JButton("Sửa thông tin");
		btnEditAgency.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditAgency.setBackground(new Color(153, 153, 255));
		btnEditAgency.setBounds(920, 605, 120, 35);
		contentPane.add(btnEditAgency);
		
		JButton btnDelAgency = new JButton("Xóa đại lý");
		btnDelAgency.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelAgency.setBackground(new Color(153, 153, 255));
		btnDelAgency.setBounds(1060, 605, 120, 35);
		contentPane.add(btnDelAgency);
	}
}
