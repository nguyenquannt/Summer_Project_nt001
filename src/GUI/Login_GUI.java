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

public class Login_GUI extends JFrame {

	private JPanel container;
	private JTextField jtfUsername;
	private JPasswordField jtfPassword;

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
	public Login_GUI() {
		setResizable(false);
		setTitle("Đăng nhập");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconLogin24px.png"));
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
		iconCompany.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\icon_Company48px.png"));
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
		jtfUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtfUsername.setBounds(200, 246, 300, 30);
		panel_Right.add(jtfUsername);
		jtfUsername.setColumns(10);
		
		jtfPassword = new JPasswordField();
		jtfPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtfPassword.setBounds(200, 300, 300, 30);
		panel_Right.add(jtfPassword);
		
		JLabel iconUser = new JLabel("");
		iconUser.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconUsername24px.png"));
		iconUser.setBounds(160, 246, 24, 24);
		panel_Right.add(iconUser);
		
		JLabel iconPass = new JLabel("");
		iconPass.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconPass24px.png"));
		iconPass.setBounds(160, 300, 24, 24);
		panel_Right.add(iconPass);
		
		JButton btnRegister = new JButton("Đăng ký");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegister.setBackground(new Color(153, 153, 255));
		btnRegister.setBounds(200, 350, 110, 30);
		panel_Right.add(btnRegister);
		
		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBackground(new Color(153, 153, 255));
		btnLogin.setBounds(390, 350, 110, 30);
		panel_Right.add(btnLogin);
		
		JLabel lbForgotpassword = new JLabel("Bạn quên mật khẩu ?");
		lbForgotpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbForgotpassword.setBounds(364, 401, 136, 26);
		panel_Right.add(lbForgotpassword);
		
		JLabel lbTitleLogin = new JLabel("ĐĂNG NHẬP BẰNG TÀI KHOẢN CỦA BẠN");
		lbTitleLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbTitleLogin.setBounds(96, 156, 548, 42);
		panel_Right.add(lbTitleLogin);
	}
}
