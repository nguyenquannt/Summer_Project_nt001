package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Register_GUI extends JFrame {

	private JPanel container;
	private JTextField jtfUsername;
	private JTextField jtfPassword;
	private JTextField jtfConfirmPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI frame = new Login_GUI();
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
	public Register_GUI() {
		setResizable(false);
		setTitle("Đăng ký tài khoản");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconLogo24px.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		container = new JPanel();
		container.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(container);
		container.setLayout(null);
		
		JPanel panel_Left = new JPanel();
		panel_Left.setBackground(new Color(33, 124, 163));
		panel_Left.setBounds(0, 0, 500, 663);
		container.add(panel_Left);
		panel_Left.setLayout(null);
		
		JLabel iconCompany = new JLabel("");
		iconCompany.setIcon(new ImageIcon(Register_GUI.class.getResource("/Images/icon_Company48px.png")));
		iconCompany.setBounds(16, 16, 48, 48);
		panel_Left.add(iconCompany);
		
		JLabel lbNameCompany = new JLabel("NguyenQuan Company");
		lbNameCompany.setForeground(new Color(255, 255, 255));
		lbNameCompany.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbNameCompany.setBounds(86, 38, 203, 26);
		panel_Left.add(lbNameCompany);
		
		JLabel lbHello = new JLabel("XIN CHÀO !");
		lbHello.setForeground(new Color(255, 255, 255));
		lbHello.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbHello.setBounds(144, 246, 182, 44);
		panel_Left.add(lbHello);
		
		JLabel lbSlogan = new JLabel("Giữ trọn niềm tin - Giữ trọn tình cảm - Giữ trọn khách hàng !");
		lbSlogan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbSlogan.setForeground(new Color(255, 255, 255));
		lbSlogan.setBounds(24, 300, 462, 30);
		panel_Left.add(lbSlogan);
		
		JPanel panel_Right = new JPanel();
		panel_Right.setLayout(null);
		panel_Right.setBackground(new Color(255, 255, 255));
		panel_Right.setBounds(499, 0, 700, 663);
		container.add(panel_Right);
		
		jtfUsername = new JTextField();
		jtfUsername.setText("Tài khoản");
		jtfUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtfUsername.setBounds(200, 246, 300, 30);
		panel_Right.add(jtfUsername);
		jtfUsername.setColumns(10);
		
		JLabel iconUser = new JLabel("");
		iconUser.setIcon(new ImageIcon(Register_GUI.class.getResource("/Images/iconUsername24px.png")));
		iconUser.setBounds(160, 246, 24, 24);
		panel_Right.add(iconUser);
		
		JLabel iconPass = new JLabel("");
		iconPass.setIcon(new ImageIcon(Register_GUI.class.getResource("/Images/iconPass24px.png")));
		iconPass.setBounds(160, 300, 24, 24);
		panel_Right.add(iconPass);
		
		JButton btnRegister = new JButton("Đăng ký");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegister.setBackground(new Color(153, 153, 255));
		btnRegister.setBounds(390, 420, 110, 30);
		panel_Right.add(btnRegister);
		
		JLabel lbTitleRegister = new JLabel("ĐĂNG KÝ TÀI KHOẢN");
		lbTitleRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitleRegister.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbTitleRegister.setBounds(200, 160, 300, 42);
		panel_Right.add(lbTitleRegister);
		
		JLabel iconConfirmPassword = new JLabel("");
		iconConfirmPassword.setIcon(new ImageIcon(Register_GUI.class.getResource("/Images/iconPass24px.png")));
		iconConfirmPassword.setBounds(160, 355, 24, 24);
		panel_Right.add(iconConfirmPassword);
		
		JLabel iconPass_2 = new JLabel("");
		iconPass_2.setBounds(160, 355, 24, 24);
		panel_Right.add(iconPass_2);
		
		jtfPassword = new JTextField();
		jtfPassword.setText("Mật khẩu");
		jtfPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtfPassword.setColumns(10);
		jtfPassword.setBounds(200, 300, 300, 30);
		panel_Right.add(jtfPassword);
		
		jtfConfirmPassword = new JTextField();
		jtfConfirmPassword.setText("Nhập lại mật khẩu");
		jtfConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtfConfirmPassword.setColumns(10);
		jtfConfirmPassword.setBounds(200, 355, 300, 30);
		panel_Right.add(jtfConfirmPassword);
	}
}
