package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateInvoice_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtAmonut;
	private JTextField txtDiscount;
	private JTextField txtSurcharge;
	private JTextField txtTotalMoney;
	private JTextField txtMoneyReceived;
	private JTextField txtMoneyLeftOver;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateInvoice_GUI frame = new CreateInvoice_GUI();
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
	public CreateInvoice_GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateInvoice_GUI.class.getResource("/Images/iconLogo24px.png")));
		setTitle("Tạo hóa đơn");
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
		iconCompany.setIcon(new ImageIcon(CreateInvoice_GUI.class.getResource("/Images/icon_Company48px.png")));
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
		
		JPanel panelRight = new JPanel();
		panelRight.setBounds(261, 0, 925, 663);
		contentPane.add(panelRight);
		panelRight.setLayout(null);
		
		JLabel lbTitle = new JLabel("TẠO HÓA ĐƠN BÁN HÀNG");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTitle.setBounds(0, 0, 925, 100);
		panelRight.add(lbTitle);
		
		JPanel panelPay = new JPanel();
		panelPay.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Nguy\u1EC5n Qu\u00E2n Company", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		panelPay.setBounds(613, 148, 312, 505);
		panelRight.add(panelPay);
		panelPay.setLayout(null);
		
		JLabel lbAmount = new JLabel("Tổng tiền hàng: ");
		lbAmount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbAmount.setBounds(10, 20, 118, 20);
		panelPay.add(lbAmount);
		
		JLabel lbDiscount = new JLabel("Giảm giá: ");
		lbDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDiscount.setBounds(10, 70, 118, 20);
		panelPay.add(lbDiscount);
		
		JLabel lbSurcharge = new JLabel("Phụ thu: ");
		lbSurcharge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSurcharge.setBounds(10, 120, 118, 20);
		panelPay.add(lbSurcharge);
		
		JLabel lbTotalMoney = new JLabel("Thành tiền:");
		lbTotalMoney.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbTotalMoney.setBounds(10, 170, 118, 20);
		panelPay.add(lbTotalMoney);
		
		JLabel lbMoneyReceived = new JLabel("Số tiền nhận: ");
		lbMoneyReceived.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbMoneyReceived.setBounds(10, 250, 118, 20);
		panelPay.add(lbMoneyReceived);
		
		JLabel lbMoneyLeftOver = new JLabel("Số tiền thừa:");
		lbMoneyLeftOver.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbMoneyLeftOver.setBounds(10, 300, 118, 20);
		panelPay.add(lbMoneyLeftOver);
		
		txtAmonut = new JTextField();
		txtAmonut.setEnabled(false);
		txtAmonut.setBounds(150, 21, 155, 24);
		panelPay.add(txtAmonut);
		txtAmonut.setColumns(10);
		
		txtDiscount = new JTextField();
		txtDiscount.setColumns(10);
		txtDiscount.setBounds(150, 66, 155, 24);
		panelPay.add(txtDiscount);
		
		txtSurcharge = new JTextField();
		txtSurcharge.setColumns(10);
		txtSurcharge.setBounds(150, 116, 155, 24);
		panelPay.add(txtSurcharge);
		
		txtTotalMoney = new JTextField();
		txtTotalMoney.setEnabled(false);
		txtTotalMoney.setColumns(10);
		txtTotalMoney.setBounds(150, 166, 155, 24);
		panelPay.add(txtTotalMoney);
		
		txtMoneyReceived = new JTextField();
		txtMoneyReceived.setColumns(10);
		txtMoneyReceived.setBounds(150, 246, 155, 24);
		panelPay.add(txtMoneyReceived);
		
		txtMoneyLeftOver = new JTextField();
		txtMoneyLeftOver.setEnabled(false);
		txtMoneyLeftOver.setColumns(10);
		txtMoneyLeftOver.setBounds(150, 296, 155, 24);
		panelPay.add(txtMoneyLeftOver);
		
		JCheckBox checkPrintInvoice = new JCheckBox("Xuất hóa đơn");
		checkPrintInvoice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkPrintInvoice.setBounds(175, 360, 130, 21);
		panelPay.add(checkPrintInvoice);
		
		JButton btnpay = new JButton("Thanh toán");
		btnpay.setBackground(new Color(153, 153, 255));
		btnpay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnpay.setBounds(10, 430, 292, 50);
		panelPay.add(btnpay);
		
		JLabel lbTitleProduct = new JLabel("DANH SÁCH HÀNG HÓA");
		lbTitleProduct.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbTitleProduct.setBounds(170, 110, 274, 30);
		panelRight.add(lbTitleProduct);
		
		JButton btnAddProduct = new JButton("Thêm hàng hóa");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddProduct.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddProduct.setBackground(new Color(153, 153, 255));
		btnAddProduct.setBounds(10, 577, 292, 50);
		panelRight.add(btnAddProduct);
		
		JButton btnDone = new JButton("Hoàn thành");
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDone.setBackground(new Color(153, 153, 255));
		btnDone.setBounds(311, 577, 292, 50);
		panelRight.add(btnDone);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "T\u00EAn s\u1EA3n ph\u1EA9m", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(10, 148, 593, 419);
		panelRight.add(table);
	}
}
// Surroud With để mwor jtable
