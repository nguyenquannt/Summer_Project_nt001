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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class AddCustomer_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer_GUI frame = new AddCustomer_GUI();
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
	public AddCustomer_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddCustomer_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Thêm khách hàng");
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
		iconCompany.setIcon(new ImageIcon(AddCustomer_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lbTitle = new JLabel("THÊM NHÂN VIÊN");
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
		
		JLabel lbIDCustomer = new JLabel("ID khách hàng  (*)");
		lbIDCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbIDCustomer.setBounds(70, 50, 134, 20);
		panelRight.add(lbIDCustomer);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(311, 48, 400, 30);
		panelRight.add(txtID);
		
		JLabel lbNameCustomer = new JLabel("Tên khách hàng  (*)");
		lbNameCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbNameCustomer.setBounds(70, 120, 150, 20);
		panelRight.add(lbNameCustomer);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(311, 118, 400, 30);
		panelRight.add(txtName);
		
		JLabel lbPhone = new JLabel("Số điện thoại (*)");
		lbPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbPhone.setBounds(70, 210, 150, 20);
		panelRight.add(lbPhone);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(311, 208, 400, 30);
		panelRight.add(txtPhone);
		
		JLabel lbEmail = new JLabel("Email (*)");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbEmail.setBounds(70, 280, 200, 20);
		panelRight.add(lbEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(311, 278, 400, 30);
		panelRight.add(txtEmail);
		
		JLabel lblLuCc = new JLabel("Lưu ý: Các ô thông tin chứa (*) là thông tin bắt buộc phải nhập !");
		lblLuCc.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuCc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLuCc.setBounds(70, 350, 746, 28);
		panelRight.add(lblLuCc);
	}

}
