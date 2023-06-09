package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.PublicKey;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home_GUI extends JFrame {

	private JPanel panelMain;
//	test
	private Login_GUI loginGUI;

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
		
		JPanel panelLeft = new JPanel();
		panelLeft.setBackground(new Color(33, 124, 163));
		panelLeft.setBounds(0, 0, 260, 663);
		panelMain.add(panelLeft);
		panelLeft.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng xuất");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(85, 578, 90, 30);
		panelLeft.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\3005766_account_door_exit_logout_icon.png"));
		lblNewLabel_1.setBounds(40, 615, 24, 24);
		panelLeft.add(lblNewLabel_1);
		
		JLabel lbAccount = new JLabel("Tài khoản");
		lbAccount.setForeground(Color.WHITE);
		lbAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbAccount.setBounds(85, 90, 83, 30);
		panelLeft.add(lbAccount);
		
		JLabel iconAccount = new JLabel("");
		iconAccount.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/iconUpdateUser24px.png")));
		iconAccount.setBounds(50, 90, 24, 24);
		panelLeft.add(iconAccount);
		
		JLabel iconCompany = new JLabel("");
		iconCompany.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/icon_Company48px.png")));
		iconCompany.setBounds(10, 10, 48, 48);
		panelLeft.add(iconCompany);
		
		JLabel lbNameCompany = new JLabel("NGUYENQUAN COMPANY");
		lbNameCompany.setForeground(Color.WHITE);
		lbNameCompany.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbNameCompany.setBounds(62, 32, 208, 26);
		panelLeft.add(lbNameCompany);
		
		JLabel iconPartner = new JLabel("");
		iconPartner.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/iconGroup24px.png")));
		iconPartner.setBounds(50, 190, 24, 24);
		panelLeft.add(iconPartner);
		
		JLabel iconProduct = new JLabel("");
		iconProduct.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/iconProduct24px.png")));
		iconProduct.setBounds(50, 240, 24, 24);
		panelLeft.add(iconProduct);
		
		JLabel lbProduct = new JLabel("Sản phẩm - Dịch vụ");
		lbProduct.setForeground(Color.WHITE);
		lbProduct.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbProduct.setBounds(85, 240, 145, 30);
		panelLeft.add(lbProduct);
		
		JLabel iconWarehouse = new JLabel("");
		iconWarehouse.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/iconWarehouse24px.png")));
		iconWarehouse.setBounds(50, 290, 24, 24);
		panelLeft.add(iconWarehouse);
		
		JLabel lbWarehouse = new JLabel("Quản lý kho");
		lbWarehouse.setForeground(Color.WHITE);
		lbWarehouse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbWarehouse.setBounds(85, 290, 145, 30);
		panelLeft.add(lbWarehouse);
		
		JLabel iconStaff = new JLabel("");
		iconStaff.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/iconStaff24px.png")));
		iconStaff.setBounds(50, 390, 24, 24);
		panelLeft.add(iconStaff);
		
		JLabel lbStaff = new JLabel("Nhân viên");
		lbStaff.setForeground(Color.WHITE);
		lbStaff.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbStaff.setBounds(85, 390, 83, 30);
		panelLeft.add(lbStaff);
		
		JLabel iconReport = new JLabel("");
		iconReport.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/iconChart24px.png")));
		iconReport.setBounds(50, 340, 24, 24);
		panelLeft.add(iconReport);
		
		JLabel lbReport = new JLabel("Báo cáo");
		lbReport.setForeground(Color.WHITE);
		lbReport.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbReport.setBounds(85, 340, 83, 30);
		panelLeft.add(lbReport);
		
		JComboBox cbPartner = new JComboBox();
		cbPartner.setModel(new DefaultComboBoxModel(new String[] {"Đối tác", "Đại lý", "Khách hàng"}));
		cbPartner.setForeground(Color.BLACK);
		cbPartner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbPartner.setBackground(Color.WHITE);
		cbPartner.setBounds(85, 190, 120, 24);
		panelLeft.add(cbPartner);
		
		JComboBox cbSell = new JComboBox();
		cbSell.setModel(new DefaultComboBoxModel(new String[] {"Bán hàng", "Tạo hóa đơn", "Tạo Voucher"}));
		cbSell.setForeground(Color.BLACK);
		cbSell.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbSell.setBackground(Color.WHITE);
		cbSell.setBounds(85, 140, 120, 24);
		panelLeft.add(cbSell);
		
		JLabel iconSell = new JLabel("");
		iconSell.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/iconCart24px.png")));
		iconSell.setBounds(50, 140, 24, 24);
		panelLeft.add(iconSell);
		
		JLabel iconLogout = new JLabel("");
		iconLogout.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/iconLogout24px.png")));
		iconLogout.setBounds(50, 580, 24, 24);
		panelLeft.add(iconLogout);
		
		JPanel panelRight = new JPanel();
		panelRight.setBounds(261, 0, 925, 663);
		panelMain.add(panelRight);
		panelRight.setLayout(null);
		
		JLabel imgHome = new JLabel("");
		imgHome.setHorizontalAlignment(SwingConstants.CENTER);
		imgHome.setIcon(new ImageIcon(Home_GUI.class.getResource("/Images/store512px.png")));
		imgHome.setBounds(0, 5, 925, 658);
		panelRight.add(imgHome);
		
//		test
		lbAccount.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        if (loginGUI == null) {
		            loginGUI = new Login_GUI();
		        }
		        loginGUI.setVisible(true);
//		        dispose(); tắt jframe trước đó
		    }
		});
	}
}
