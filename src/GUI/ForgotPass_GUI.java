package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ForgotPass_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPass_GUI frame = new ForgotPass_GUI();
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
	public ForgotPass_GUI() {
		setTitle("Quên mật khẩu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BẠN QUÊN MẬT KHẨU ? ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(175, 100, 290, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\New_Project\\src\\Images\\forgotPass.png"));
		lblNewLabel_1.setBounds(37, 100, 128, 128);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Đừng lo lắng! hãy liên hệ với chúng");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(175, 146, 300, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("tôi theo địa chỉ sau:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(175, 178, 300, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Email: ntanhquan.sly@gmail.com");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(175, 210, 305, 26);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("SDT: 0365962232");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_1.setBounds(175, 246, 167, 22);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Trân trọng !");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2_1_2_1.setBounds(337, 311, 128, 30);
		contentPane.add(lblNewLabel_2_1_2_1);
	}

}
