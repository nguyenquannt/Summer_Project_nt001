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
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateVoucher_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumberOf;
	private JTextField txtNote;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateVoucher_GUI frame = new CreateVoucher_GUI();
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
	public CreateVoucher_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateVoucher_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Tạo mã Voucher");
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
		iconCompany.setIcon(new ImageIcon(CreateVoucher_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JLabel lblToMGim = new JLabel("TẠO MÃ GIẢM GIÁ");
		lblToMGim.setHorizontalAlignment(SwingConstants.CENTER);
		lblToMGim.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblToMGim.setBounds(261, 0, 925, 100);
		contentPane.add(lblToMGim);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(261, 101, 925, 562);
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lbDateStar = new JLabel("Ngày bắt đầu:");
		lbDateStar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDateStar.setBounds(70, 40, 110, 26);
		panelMain.add(lbDateStar);
		
		JLabel lbDateEnd = new JLabel("Ngày kết thúc:");
		lbDateEnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDateEnd.setBounds(70, 90, 110, 26);
		panelMain.add(lbDateEnd);
		
		JComboBox cbDayStar = new JComboBox();
		cbDayStar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbDayStar.setModel(new DefaultComboBoxModel(new String[] {"Ngày"}));
		cbDayStar.setBounds(210, 40, 90, 26);
		panelMain.add(cbDayStar);
		
		JComboBox cbMonthStar = new JComboBox();
		cbMonthStar.setModel(new DefaultComboBoxModel(new String[] {"Tháng"}));
		cbMonthStar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbMonthStar.setBounds(360, 40, 90, 26);
		panelMain.add(cbMonthStar);
		
		JComboBox cbYearStar = new JComboBox();
		cbYearStar.setModel(new DefaultComboBoxModel(new String[] {"Năm"}));
		cbYearStar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbYearStar.setBounds(510, 40, 90, 26);
		panelMain.add(cbYearStar);
		
		JComboBox cbDayEnd = new JComboBox();
		cbDayEnd.setModel(new DefaultComboBoxModel(new String[] {"Ngày"}));
		cbDayEnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbDayEnd.setBounds(210, 90, 90, 26);
		panelMain.add(cbDayEnd);
		
		JComboBox cbMonthEnd = new JComboBox();
		cbMonthEnd.setModel(new DefaultComboBoxModel(new String[] {"Tháng"}));
		cbMonthEnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbMonthEnd.setBounds(360, 90, 90, 26);
		panelMain.add(cbMonthEnd);
		
		JComboBox cbYearEnd = new JComboBox();
		cbYearEnd.setModel(new DefaultComboBoxModel(new String[] {"Năm"}));
		cbYearEnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbYearEnd.setBounds(510, 90, 90, 26);
		panelMain.add(cbYearEnd);
		
		JLabel lbNumberOf = new JLabel("Số lượng mã: ");
		lbNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbNumberOf.setBounds(70, 140, 110, 26);
		panelMain.add(lbNumberOf);
		
		txtNumberOf = new JTextField();
		txtNumberOf.setBounds(210, 140, 90, 26);
		panelMain.add(txtNumberOf);
		txtNumberOf.setColumns(10);
		
		JButton btnListVoucher = new JButton("Danh sách các mã đã tạo");
		btnListVoucher.setHorizontalAlignment(SwingConstants.LEFT);
		btnListVoucher.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnListVoucher.setBackground(new Color(153, 153, 255));
		btnListVoucher.setBounds(370, 470, 215, 45);
		panelMain.add(btnListVoucher);
		
		JButton btnCreateVoucher = new JButton("Tạo mã");
		btnCreateVoucher.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCreateVoucher.setBackground(new Color(153, 153, 255));
		btnCreateVoucher.setBounds(650, 470, 215, 45);
		panelMain.add(btnCreateVoucher);
		
		JLabel lbNote = new JLabel("Ghi chú:");
		lbNote.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbNote.setBounds(70, 190, 110, 26);
		panelMain.add(lbNote);
		
		txtNote = new JTextField();
		txtNote.setBounds(210, 196, 390, 110);
		panelMain.add(txtNote);
		txtNote.setColumns(10);
	}
}
