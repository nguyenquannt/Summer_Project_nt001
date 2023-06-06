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

public class Home_GUI extends JFrame {

	private JPanel panelMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_GUI frame = new Home_GUI();
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
	public Home_GUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconHome24px.png"));
		setTitle("Trang chủ\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		panelMain = new JPanel();
		panelMain.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelMain);
		panelMain.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(33, 124, 163));
		panelMenu.setBounds(0, 0, 240, 663);
		panelMain.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng xuất");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(80, 610, 90, 30);
		panelMenu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\3005766_account_door_exit_logout_icon.png"));
		lblNewLabel_1.setBounds(40, 615, 24, 24);
		panelMenu.add(lblNewLabel_1);
		
		JLabel lblCpNhpTi = new JLabel("Tài khoản");
		lblCpNhpTi.setForeground(Color.WHITE);
		lblCpNhpTi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCpNhpTi.setBounds(85, 90, 83, 30);
		panelMenu.add(lblCpNhpTi);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconUpdateUser24px.png"));
		lblNewLabel_2.setBounds(50, 90, 24, 24);
		panelMenu.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconCart24px.png"));
		lblNewLabel_2_1.setBounds(50, 140, 24, 24);
		panelMenu.add(lblNewLabel_2_1);
		
		JLabel lblBnHng = new JLabel("Bán hàng");
		lblBnHng.setForeground(Color.WHITE);
		lblBnHng.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBnHng.setBounds(85, 140, 83, 30);
		panelMenu.add(lblBnHng);
		
		JLabel iconCompany = new JLabel("");
		iconCompany.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\icon_Company48px.png"));
		iconCompany.setBounds(10, 10, 48, 48);
		panelMenu.add(iconCompany);
		
		JLabel lbNameCompany = new JLabel("NguyenQuan Company");
		lbNameCompany.setForeground(Color.WHITE);
		lbNameCompany.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbNameCompany.setBounds(62, 32, 180, 26);
		panelMenu.add(lbNameCompany);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconLogout24px.png"));
		lblNewLabel_2_1_1.setBounds(50, 190, 24, 24);
		panelMenu.add(lblNewLabel_2_1_1);
		
		JLabel lblBnHng_1 = new JLabel("Bán hàng");
		lblBnHng_1.setForeground(Color.WHITE);
		lblBnHng_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBnHng_1.setBounds(85, 190, 83, 30);
		panelMenu.add(lblBnHng_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconCart24px.png"));
		lblNewLabel_2_1_1_1.setBounds(50, 240, 24, 24);
		panelMenu.add(lblNewLabel_2_1_1_1);
		
		JLabel lblBnHng_1_1 = new JLabel("Bán hàng");
		lblBnHng_1_1.setForeground(Color.WHITE);
		lblBnHng_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBnHng_1_1.setBounds(85, 240, 83, 30);
		panelMenu.add(lblBnHng_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconCart24px.png"));
		lblNewLabel_2_1_1_1_1.setBounds(50, 290, 24, 24);
		panelMenu.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblBnHng_1_1_1 = new JLabel("Bán hàng");
		lblBnHng_1_1_1.setForeground(Color.WHITE);
		lblBnHng_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBnHng_1_1_1.setBounds(85, 290, 83, 30);
		panelMenu.add(lblBnHng_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1_1_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconCart24px.png"));
		lblNewLabel_2_1_1_1_1_1.setBounds(50, 390, 24, 24);
		panelMenu.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblBnHng_1_1_1_1 = new JLabel("Bán hàng");
		lblBnHng_1_1_1_1.setForeground(Color.WHITE);
		lblBnHng_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBnHng_1_1_1_1.setBounds(85, 390, 83, 30);
		panelMenu.add(lblBnHng_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("");
		lblNewLabel_2_1_1_1_2.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconCart24px.png"));
		lblNewLabel_2_1_1_1_2.setBounds(50, 340, 24, 24);
		panelMenu.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblBnHng_1_1_2 = new JLabel("Bán hàng");
		lblBnHng_1_1_2.setForeground(Color.WHITE);
		lblBnHng_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBnHng_1_1_2.setBounds(85, 340, 83, 30);
		panelMenu.add(lblBnHng_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\store512px.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(241, 0, 945, 663);
		panelMain.add(lblNewLabel_3);
	}
}
