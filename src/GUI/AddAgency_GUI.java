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

public class AddAgency_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDAgency;
	private JTextField txtNameAgency;
	private JTextField txtEmailAgency;
	private JTextField txtTypeAgency;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAgency_GUI frame = new AddAgency_GUI();
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
	public AddAgency_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddAgency_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Thêm đại lý");
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
		iconCompany.setIcon(new ImageIcon(AddAgency_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lblThmiL = new JLabel("THÊM ĐẠI LÝ");
		lblThmiL.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmiL.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblThmiL.setBounds(261, 0, 925, 100);
		contentPane.add(lblThmiL);
		
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
		
		JLabel lbIDAgency = new JLabel("ID đại lý  (*)");
		lbIDAgency.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbIDAgency.setBounds(70, 50, 100, 20);
		panelRight.add(lbIDAgency);
		
		txtIDAgency = new JTextField();
		txtIDAgency.setColumns(10);
		txtIDAgency.setBounds(311, 48, 400, 30);
		panelRight.add(txtIDAgency);
		
		JLabel lbNameAgency = new JLabel("Tên đại lý  (*)");
		lbNameAgency.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbNameAgency.setBounds(70, 120, 120, 20);
		panelRight.add(lbNameAgency);
		
		txtNameAgency = new JTextField();
		txtNameAgency.setColumns(10);
		txtNameAgency.setBounds(311, 118, 400, 30);
		panelRight.add(txtNameAgency);
		
		JLabel lbEmailAgency = new JLabel("Email  (*)");
		lbEmailAgency.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbEmailAgency.setBounds(70, 210, 100, 20);
		panelRight.add(lbEmailAgency);
		
		txtEmailAgency = new JTextField();
		txtEmailAgency.setColumns(10);
		txtEmailAgency.setBounds(311, 208, 400, 30);
		panelRight.add(txtEmailAgency);
		
		JLabel lbTypeAgency = new JLabel("Loại mặt hàng cung cấp: ");
		lbTypeAgency.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbTypeAgency.setBounds(70, 280, 200, 20);
		panelRight.add(lbTypeAgency);
		
		txtTypeAgency = new JTextField();
		txtTypeAgency.setColumns(10);
		txtTypeAgency.setBounds(311, 278, 400, 30);
		panelRight.add(txtTypeAgency);
	}
}
