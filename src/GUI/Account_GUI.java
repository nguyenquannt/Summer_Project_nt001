package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Account_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCom;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtPass;
	private JTextField txtConfirmPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Account_GUI frame = new Account_GUI();
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
	public Account_GUI() {
		setTitle("Cập nhập tài khoản");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLeft = new JPanel();
		panelLeft.setBackground(new Color(33, 124, 163));
		panelLeft.setBounds(0, 0, 260, 663);
		contentPane.add(panelLeft);
		panelLeft.setLayout(null);
		
		JLabel iconCompany = new JLabel("");
		iconCompany.setIcon(new ImageIcon(Account_GUI.class.getResource("/Images/icon_Company48px.png")));
		iconCompany.setBounds(100, 230, 48, 48);
		panelLeft.add(iconCompany);
		
		JLabel lbName1 = new JLabel("NGUYENQUAN");
		lbName1.setHorizontalAlignment(SwingConstants.CENTER);
		lbName1.setForeground(Color.WHITE);
		lbName1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbName1.setBounds(10, 277, 240, 40);
		panelLeft.add(lbName1);
		
		JLabel lbName2 = new JLabel("COMPANY");
		lbName2.setHorizontalAlignment(SwingConstants.CENTER);
		lbName2.setForeground(new Color(226, 153, 48));
		lbName2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbName2.setBounds(10, 314, 240, 40);
		panelLeft.add(lbName2);
		
		JLabel lbTitle = new JLabel("CẬP NHẬP THÔNG TIN TÀI KHOẢN");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTitle.setBounds(261, 0, 925, 100);
		contentPane.add(lbTitle);
		
		JPanel panelRight = new JPanel();
		panelRight.setLayout(null);
		panelRight.setBounds(261, 103, 925, 560);
		contentPane.add(panelRight);
		
		JButton btnUpdate = new JButton("Cập nhập");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBackground(new Color(226, 153, 48));
		btnUpdate.setBounds(650, 500, 100, 35);
		panelRight.add(btnUpdate);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBackground(new Color(204, 204, 204));
		btnExit.setBounds(780, 500, 100, 35);
		panelRight.add(btnExit);
		
		JLabel lbNameCom = new JLabel("Tên công ty  (*)");
		lbNameCom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbNameCom.setBounds(50, 30, 100, 14);
		panelRight.add(lbNameCom);
		
		txtCom = new JTextField();
		txtCom.setColumns(10);
		txtCom.setBounds(50, 60, 400, 30);
		panelRight.add(txtCom);
		
		JLabel lbPhone = new JLabel("Số điện thoại (*)");
		lbPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbPhone.setBounds(50, 120, 100, 14);
		panelRight.add(lbPhone);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(50, 150, 400, 30);
		panelRight.add(txtPhone);
		
		JLabel lbEmail = new JLabel("Email  (*)");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbEmail.setBounds(50, 210, 100, 14);
		panelRight.add(lbEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(50, 230, 400, 30);
		panelRight.add(txtEmail);
		
		JLabel lbAddress = new JLabel("Địa chỉl  (*)");
		lbAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbAddress.setBounds(50, 300, 100, 14);
		panelRight.add(lbAddress);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(50, 320, 400, 30);
		panelRight.add(txtAddress);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(490, 60, 400, 30);
		panelRight.add(txtPass);
		
		JLabel lbPass = new JLabel("Mật khẩu  (*)");
		lbPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbPass.setBounds(490, 30, 100, 14);
		panelRight.add(lbPass);
		
		JLabel lbConfirmPass = new JLabel("Nhập lại mật khẩu  (*)");
		lbConfirmPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbConfirmPass.setBounds(490, 120, 144, 14);
		panelRight.add(lbConfirmPass);
		
		txtConfirmPass = new JTextField();
		txtConfirmPass.setColumns(10);
		txtConfirmPass.setBounds(490, 150, 400, 30);
		panelRight.add(txtConfirmPass);
		
		JLabel lbNote1 = new JLabel("Lưu ý: Các ô thông tin chứa (*) là thông tin");
		lbNote1.setHorizontalAlignment(SwingConstants.LEFT);
		lbNote1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbNote1.setBounds(490, 210, 400, 28);
		panelRight.add(lbNote1);
		
		JLabel lbNote2 = new JLabel("bắt buộc phải nhập !");
		lbNote2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbNote2.setBounds(490, 239, 400, 35);
		panelRight.add(lbNote2);
	}
}
