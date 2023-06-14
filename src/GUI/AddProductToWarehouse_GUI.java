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
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class AddProductToWarehouse_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtNumber;
	private JTextField txtCostPrice;
	private JTextField txtSellingPrice;
	private JTextField txtInvntory;
	private JTextField txtAgency;
	private JTextField txtType;

	/**
	 * Launch the application.
	 * Thêm sản phẩm vào kho
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProductToWarehouse_GUI frame = new AddProductToWarehouse_GUI();
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
	public AddProductToWarehouse_GUI() {
		setTitle("Thêm sản phẩm vào kho");
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
		iconCompany.setIcon(new ImageIcon(AddProductToWarehouse_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lbTitle = new JLabel("THÊM SẢN PHẨM - DỊCH VỤ MỚI");
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
		lbID.setBounds(70, 30, 200, 20);
		panelRight.add(lbID);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(311, 28, 400, 30);
		panelRight.add(txtID);
		
		JLabel lbName = new JLabel("Tên sản phẩm - dịch vụ  (*)");
		lbName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbName.setBounds(70, 90, 215, 20);
		panelRight.add(lbName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(311, 88, 400, 30);
		panelRight.add(txtName);
		
		JLabel lbType = new JLabel("Nhóm sản phẩm  (*)");
		lbType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbType.setBounds(70, 150, 191, 20);
		panelRight.add(lbType);
		
		JLabel lbNumber = new JLabel("Số lượng  (*) ");
		lbNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbNumber.setBounds(70, 210, 215, 20);
		panelRight.add(lbNumber);
		
		txtNumber = new JTextField();
		txtNumber.setColumns(10);
		txtNumber.setBounds(311, 208, 400, 30);
		panelRight.add(txtNumber);
		
		JLabel lbCostPrice = new JLabel("Giá vốn  (*) ");
		lbCostPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbCostPrice.setBounds(70, 330, 215, 20);
		panelRight.add(lbCostPrice);
		
		JLabel lbSellingPrice = new JLabel("Giá bán  (*) ");
		lbSellingPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSellingPrice.setBounds(70, 390, 215, 20);
		panelRight.add(lbSellingPrice);
		
		txtCostPrice = new JTextField();
		txtCostPrice.setColumns(10);
		txtCostPrice.setBounds(311, 328, 400, 30);
		panelRight.add(txtCostPrice);
		
		txtSellingPrice = new JTextField();
		txtSellingPrice.setColumns(10);
		txtSellingPrice.setBounds(311, 388, 400, 30);
		panelRight.add(txtSellingPrice);
		
		JLabel lbInventory = new JLabel("Tồn kho  (*) ");
		lbInventory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbInventory.setBounds(70, 270, 215, 20);
		panelRight.add(lbInventory);
		
		txtInvntory = new JTextField();
		txtInvntory.setColumns(10);
		txtInvntory.setBounds(311, 268, 400, 30);
		panelRight.add(txtInvntory);
		
		JLabel lbAgency = new JLabel("Nhà cung cấp  (*) ");
		lbAgency.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbAgency.setBounds(70, 450, 215, 20);
		panelRight.add(lbAgency);
		
		txtAgency = new JTextField();
		txtAgency.setColumns(10);
		txtAgency.setBounds(311, 440, 400, 30);
		panelRight.add(txtAgency);
		
		txtType = new JTextField();
		txtType.setColumns(10);
		txtType.setBounds(311, 148, 400, 30);
		panelRight.add(txtType);
	}

}
