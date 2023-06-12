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
import java.awt.Toolkit;

public class Agency_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agency_GUI frame = new Agency_GUI();
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
	public Agency_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Agency_GUI.class.getResource("/Images/iconLogo24px.png")));
		setResizable(false);
		setTitle("Danh sách đại lý");
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
		iconCompany.setIcon(new ImageIcon(Agency_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lblDanhSchi = new JLabel("DANH SÁCH ĐẠI LÝ");
		lblDanhSchi.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchi.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblDanhSchi.setBounds(261, 0, 925, 100);
		contentPane.add(lblDanhSchi);
		
		JButton btnNewButton = new JButton("Nhập từ file");
		btnNewButton.setBackground(new Color(226, 153, 46));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(916, 110, 120, 30);
		contentPane.add(btnNewButton);
		
		JButton btnXutDanhSch = new JButton("Xuất ra file");
		btnXutDanhSch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnXutDanhSch.setBackground(Color.LIGHT_GRAY);
		btnXutDanhSch.setBounds(1056, 110, 120, 30);
		contentPane.add(btnXutDanhSch);
		
		JLabel lblNewLabel = new JLabel("Tìm kiếm đại lý:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(300, 170, 195, 24);
		contentPane.add(lblNewLabel);
	}

}
