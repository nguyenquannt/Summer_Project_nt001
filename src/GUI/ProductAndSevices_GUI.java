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

public class ProductAndSevices_GUI extends JFrame {

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
					ProductAndSevices_GUI frame = new ProductAndSevices_GUI();
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
	public ProductAndSevices_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductAndSevices_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Danh mục sản phẩm và dịch vụ");
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
		iconCompany.setIcon(new ImageIcon(ProductAndSevices_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lblDanhSchHng = new JLabel("DANH SÁCH HÀNG HÓA - DỊCH VỤ");
		lblDanhSchHng.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchHng.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblDanhSchHng.setBounds(0, 0, 925, 100);
		panelRight.add(lblDanhSchHng);
		
		JLabel lbSearch = new JLabel("Tim sản phẩm:");
		lbSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSearch.setBounds(30, 140, 125, 24);
		panelRight.add(lbSearch);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSearch.setColumns(10);
		txtSearch.setBounds(160, 130, 321, 35);
		panelRight.add(txtSearch);
		
		JButton btnSearch = new JButton("Tìm kiếm");
		btnSearch.setIcon(new ImageIcon(ProductAndSevices_GUI.class.getResource("/Images/iconSearch24px.png")));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBackground(new Color(0, 255, 153));
		btnSearch.setBounds(510, 130, 120, 35);
		panelRight.add(btnSearch);
		
		JButton btnInputFile = new JButton("Nhập file");
		btnInputFile.setIcon(new ImageIcon(ProductAndSevices_GUI.class.getResource("/Images/iconInputFile.png")));
		btnInputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInputFile.setBackground(new Color(226, 153, 46));
		btnInputFile.setBounds(650, 130, 120, 35);
		panelRight.add(btnInputFile);
		
		JButton btnOutputFile = new JButton("Xuất file");
		btnOutputFile.setIcon(new ImageIcon(ProductAndSevices_GUI.class.getResource("/Images/iconOutputFile24px.png")));
		btnOutputFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOutputFile.setBackground(Color.LIGHT_GRAY);
		btnOutputFile.setBounds(790, 130, 120, 35);
		panelRight.add(btnOutputFile);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "T\u00EAn s\u1EA3n ph\u1EA9m", "Nh\u00F3m s\u1EA3n ph\u1EA9m", "M\u00E3 v\u1EA1ch", "Gi\u00E1 v\u1ED1n", "Gi\u00E1 b\u00E1n"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(30, 203, 880, 390);
		panelRight.add(table);
		
		JButton btnDel = new JButton("Xóa SP");
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDel.setBackground(new Color(153, 153, 255));
		btnDel.setBounds(790, 618, 120, 35);
		panelRight.add(btnDel);
		
		JButton btnEdit = new JButton("Sửa thông tin");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEdit.setBackground(new Color(153, 153, 255));
		btnEdit.setBounds(650, 618, 120, 35);
		panelRight.add(btnEdit);
		
		JButton btnAdd = new JButton("Thêm SP");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBackground(new Color(153, 153, 255));
		btnAdd.setBounds(510, 618, 120, 35);
		panelRight.add(btnAdd);
	}

}
