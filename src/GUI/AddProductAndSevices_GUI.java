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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class AddProductAndSevices_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtBarcode;
	private JTextField txtCostPrice;
	private JTextField txtSellingPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProductAndSevices_GUI frame = new AddProductAndSevices_GUI();
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
	public AddProductAndSevices_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddProductAndSevices_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Thêm sản phẩm - dịch vụ");
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
		iconCompany.setIcon(new ImageIcon(AddProductAndSevices_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lbTitle = new JLabel("THÊM SẢN PHẨM - DỊCH VỤ");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTitle.setBounds(261, 0, 925, 100);
		contentPane.add(lbTitle);
		
		JPanel panelRight = new JPanel();
		panelRight.setLayout(null);
		panelRight.setBounds(261, 103, 925, 560);
		contentPane.add(panelRight);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBackground(new Color(226, 153, 48));
		btnAdd.setBounds(650, 500, 100, 35);
		panelRight.add(btnAdd);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBackground(new Color(204, 204, 204));
		btnExit.setBounds(780, 500, 100, 35);
		panelRight.add(btnExit);
		
		JLabel lbID = new JLabel("ID sản phẩm - dịch vụ  (*)");
		lbID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbID.setBounds(70, 50, 200, 20);
		panelRight.add(lbID);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(311, 48, 400, 30);
		panelRight.add(txtID);
		
		JLabel lbName = new JLabel("Tên sản phẩm - dịch vụ  (*)");
		lbName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbName.setBounds(70, 120, 215, 20);
		panelRight.add(lbName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(311, 118, 400, 30);
		panelRight.add(txtName);
		
		JLabel lbType = new JLabel("Nhóm sản phẩm  (*)");
		lbType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbType.setBounds(70, 190, 191, 20);
		panelRight.add(lbType);
		
		JLabel lbBarcode = new JLabel("Mã vạch (*) ");
		lbBarcode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbBarcode.setBounds(70, 260, 215, 20);
		panelRight.add(lbBarcode);
		
		txtBarcode = new JTextField();
		txtBarcode.setColumns(10);
		txtBarcode.setBounds(311, 250, 400, 30);
		panelRight.add(txtBarcode);
		
		JLabel lblLuCc = new JLabel("Lưu ý: Các ô thông tin chứa (*) là thông tin bắt buộc phải nhập !");
		lblLuCc.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuCc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLuCc.setBounds(70, 462, 746, 28);
		panelRight.add(lblLuCc);
		
		JComboBox cbType = new JComboBox();
		cbType.setBounds(311, 180, 170, 30);
		panelRight.add(cbType);
		
		JLabel lbCostPrice = new JLabel("Giá vốn (*) ");
		lbCostPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbCostPrice.setBounds(70, 340, 215, 20);
		panelRight.add(lbCostPrice);
		
		JLabel lbSellingPrice = new JLabel("Giá bán (*) ");
		lbSellingPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSellingPrice.setBounds(70, 410, 215, 20);
		panelRight.add(lbSellingPrice);
		
		txtCostPrice = new JTextField();
		txtCostPrice.setColumns(10);
		txtCostPrice.setBounds(311, 330, 400, 30);
		panelRight.add(txtCostPrice);
		
		txtSellingPrice = new JTextField();
		txtSellingPrice.setColumns(10);
		txtSellingPrice.setBounds(311, 400, 400, 30);
		panelRight.add(txtSellingPrice);
	}
}
