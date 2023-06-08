package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Account_GUI extends JPanel {
	private JTextField txtNameCompany;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtPass;
	private JTextField txtConfirmPass;

	/**
	 * Create the panel.
	 */
	public Account_GUI() {
		setLayout(null);
		
		JLabel lbTitle = new JLabel("CẬP NHẬP THÔNG TIN TÀI KHOẢN");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTitle.setBounds(261, 0, 929, 100);
		add(lbTitle);
		
		JPanel panelRight = new JPanel();
		panelRight.setBounds(261, 101, 929, 589);
		add(panelRight);
		panelRight.setLayout(null);
		
		JButton btnUpdate = new JButton("Cập nhập");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBackground(new Color(226, 153, 48));
		btnUpdate.setBounds(650, 530, 100, 35);
		panelRight.add(btnUpdate);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBackground(new Color(204, 204, 204));
		btnExit.setBounds(780, 530, 100, 35);
		panelRight.add(btnExit);
		
		JLabel lbNameCom = new JLabel("Tên công ty  (*)");
		lbNameCom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbNameCom.setBounds(80, 30, 100, 14);
		panelRight.add(lbNameCom);
		
		txtNameCompany = new JTextField();
		txtNameCompany.setBounds(80, 60, 400, 30);
		panelRight.add(txtNameCompany);
		txtNameCompany.setColumns(10);
		
		JLabel lbPhone = new JLabel("Số điện thoại (*)");
		lbPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbPhone.setBounds(80, 120, 100, 14);
		panelRight.add(lbPhone);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(80, 150, 400, 30);
		panelRight.add(txtPhone);
		
		JLabel lbEmail = new JLabel("Email  (*)");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbEmail.setBounds(80, 210, 100, 14);
		panelRight.add(lbEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(80, 230, 400, 30);
		panelRight.add(txtEmail);
		
		JLabel lbAddress = new JLabel("Địa chỉl  (*)");
		lbAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbAddress.setBounds(80, 300, 100, 14);
		panelRight.add(lbAddress);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(80, 320, 400, 30);
		panelRight.add(txtAddress);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(519, 60, 400, 30);
		panelRight.add(txtPass);
		
		JLabel lbPass = new JLabel("Mật khẩu  (*)");
		lbPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbPass.setBounds(519, 30, 100, 14);
		panelRight.add(lbPass);
		
		JLabel lbConfirmPass = new JLabel("Nhập lại mật khẩu  (*)");
		lbConfirmPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbConfirmPass.setBounds(519, 120, 144, 14);
		panelRight.add(lbConfirmPass);
		
		txtConfirmPass = new JTextField();
		txtConfirmPass.setColumns(10);
		txtConfirmPass.setBounds(519, 150, 400, 30);
		panelRight.add(txtConfirmPass);
		
		JLabel lbNote1 = new JLabel("Lưu ý: Các ô thông tin chứa (*) là thông tin");
		lbNote1.setHorizontalAlignment(SwingConstants.LEFT);
		lbNote1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbNote1.setBounds(519, 210, 400, 28);
		panelRight.add(lbNote1);
		
		JLabel lbNote2 = new JLabel("bắt buộc phải nhập !");
		lbNote2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbNote2.setBounds(519, 239, 400, 35);
		panelRight.add(lbNote2);
		
		JPanel panelLeft = new JPanel();
		panelLeft.setBackground(new Color(33, 124, 163));
		panelLeft.setBounds(0, 0, 260, 700);
		add(panelLeft);
		panelLeft.setLayout(null);
		
		JLabel iconCompany = new JLabel("");
		iconCompany.setIcon(new ImageIcon(Account_GUI.class.getResource("/Images/icon_Company48px.png")));
		iconCompany.setBounds(100, 280, 48, 48);
		panelLeft.add(iconCompany);
		
		JLabel lbName1 = new JLabel("NGUYENQUAN");
		lbName1.setHorizontalAlignment(SwingConstants.CENTER);
		lbName1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbName1.setForeground(new Color(255, 255, 255));
		lbName1.setBounds(10, 335, 240, 40);
		panelLeft.add(lbName1);
		
		JLabel lbName2 = new JLabel("COMPANY");
		lbName2.setHorizontalAlignment(SwingConstants.CENTER);
		lbName2.setForeground(new Color(226, 153, 48));
		lbName2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbName2.setBounds(10, 375, 240, 40);
		panelLeft.add(lbName2);

	}
}
