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
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

public class AddStaff_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtCI;
	private JTextField txtPhone;
	private JTextField txtAddress2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStaff_GUI frame = new AddStaff_GUI();
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
	public AddStaff_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddStaff_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Thêm nhân viên mới");
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
		iconCompany.setIcon(new ImageIcon(AddStaff_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lbTitle = new JLabel("THÊM NHÂN VIÊN MỚI");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTitle.setBounds(261, 0, 925, 100);
		contentPane.add(lbTitle);
		
		JPanel panelRight = new JPanel();
		panelRight.setLayout(null);
		panelRight.setBounds(260, 103, 925, 560);
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
		
		JLabel lbID = new JLabel("Mã nhân viên  :");
		lbID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbID.setBounds(20, 50, 120, 20);
		panelRight.add(lbID);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(150, 48, 300, 30);
		panelRight.add(txtID);
		
		JLabel lblHTn = new JLabel("Họ tên :");
		lblHTn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHTn.setBounds(500, 50, 79, 20);
		panelRight.add(lblHTn);
		
		JLabel lbCI = new JLabel("CCCD :");
		lbCI.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbCI.setBounds(20, 120, 100, 20);
		panelRight.add(lbCI);
		
		JLabel lbDOB = new JLabel("Ngày sinh :");
		lbDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDOB.setBounds(20, 190, 100, 20);
		panelRight.add(lbDOB);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(583, 48, 320, 30);
		panelRight.add(txtName);
		
		txtCI = new JTextField();
		txtCI.setColumns(10);
		txtCI.setBounds(150, 110, 300, 30);
		panelRight.add(txtCI);
		
		JLabel lbPhone = new JLabel("SDT :");
		lbPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbPhone.setBounds(500, 120, 79, 20);
		panelRight.add(lbPhone);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(583, 110, 320, 30);
		panelRight.add(txtPhone);
		
		JComboBox cbDOB = new JComboBox();
		cbDOB.setBounds(150, 192, 300, 30);
		panelRight.add(cbDOB);
		
		JLabel lbSex = new JLabel("Giới tính :");
		lbSex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSex.setBounds(500, 196, 79, 20);
		panelRight.add(lbSex);
		
		JRadioButton rbMale = new JRadioButton("Nam\r\n");
		rbMale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbMale.setSelected(true);
		rbMale.setBounds(690, 190, 69, 30);
		panelRight.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("Nữ");
		rbFemale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbFemale.setBounds(800, 190, 69, 30);
		panelRight.add(rbFemale);
		
		JLabel lbAddress = new JLabel("Địa chỉ :");
		lbAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbAddress.setBounds(20, 280, 100, 20);
		panelRight.add(lbAddress);
		
		JComboBox cbProvince = new JComboBox();
		cbProvince.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbProvince.setModel(new DefaultComboBoxModel(new String[] {"Tỉnh / Thành phố"}));
		cbProvince.setBounds(150, 275, 140, 30);
		panelRight.add(cbProvince);
		
		JComboBox cbDistrict = new JComboBox();
		cbDistrict.setModel(new DefaultComboBoxModel(new String[] {"Quận / Huyện"}));
		cbDistrict.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbDistrict.setBounds(300, 275, 140, 30);
		panelRight.add(cbDistrict);
		
		JComboBox cbCommune = new JComboBox();
		cbCommune.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbCommune.setModel(new DefaultComboBoxModel(new String[] {"Phường / Xã"}));
		cbCommune.setBounds(450, 275, 140, 30);
		panelRight.add(cbCommune);
		
		JLabel lbAddress2 = new JLabel("Địa chỉ cụ thể :");
		lbAddress2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbAddress2.setBounds(600, 280, 120, 20);
		panelRight.add(lbAddress2);
		
		txtAddress2 = new JTextField();
		txtAddress2.setColumns(10);
		txtAddress2.setBounds(720, 275, 183, 30);
		panelRight.add(txtAddress2);
		
		JLabel lblChcV = new JLabel("Chức vụ : ");
		lblChcV.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChcV.setBounds(20, 350, 100, 20);
		panelRight.add(lblChcV);
		
		JComboBox cbPosition = new JComboBox();
		cbPosition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbPosition.setModel(new DefaultComboBoxModel(new String[] {"Nhân viên", "Quản lý"}));
		cbPosition.setEditable(true);
		cbPosition.setBounds(150, 347, 300, 30);
		panelRight.add(cbPosition);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
