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
import java.awt.Toolkit;

public class ForgotPass_GUI extends JFrame {

	private JPanel PanelMain;

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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\iconForgotPass24px.png"));
		setTitle("Quên mật khẩu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		PanelMain = new JPanel();
		PanelMain.setBackground(new Color(255, 255, 255));
		PanelMain.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelMain);
		PanelMain.setLayout(null);
		
		JLabel lbTitle = new JLabel("BẠN QUÊN MẬT KHẨU ? ");
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setBounds(175, 100, 290, 36);
		PanelMain.add(lbTitle);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\NguyenQuan_Code\\Code_Nam_3\\Summer_Project_nt001\\src\\Images\\forgotPass.png"));
		lblNewLabel_1.setBounds(37, 100, 128, 128);
		PanelMain.add(lblNewLabel_1);
		
		JLabel lbtxt1 = new JLabel("Đừng lo lắng! hãy liên hệ với chúng");
		lbtxt1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbtxt1.setBounds(175, 146, 300, 22);
		PanelMain.add(lbtxt1);
		
		JLabel lbtxt2 = new JLabel("tôi theo địa chỉ sau:");
		lbtxt2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbtxt2.setBounds(175, 178, 300, 22);
		PanelMain.add(lbtxt2);
		
		JLabel lbtxtEmail = new JLabel("Email: ntanhquan.sly@gmail.com");
		lbtxtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbtxtEmail.setBounds(175, 210, 305, 26);
		PanelMain.add(lbtxtEmail);
		
		JLabel lbtxtPhone = new JLabel("SDT: 0365962232");
		lbtxtPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbtxtPhone.setBounds(175, 246, 167, 22);
		PanelMain.add(lbtxtPhone);
		
		JLabel lbtxtThanks = new JLabel("Trân trọng !");
		lbtxtThanks.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbtxtThanks.setBounds(337, 311, 128, 30);
		PanelMain.add(lbtxtThanks);
	}

}
