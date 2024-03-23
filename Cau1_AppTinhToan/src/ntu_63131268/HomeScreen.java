package ntu_63131268;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class HomeScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	
	public HomeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APP TÍNH TOÁN ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(187, 20, 188, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chọn chức năng:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(187, 68, 205, 38);
		contentPane.add(lblNewLabel_1);
		
		JButton btnTinh = new JButton("PHÉP TÍNH CƠ BẢN");
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTinh.setBounds(182, 141, 193, 35);
		contentPane.add(btnTinh);
		
		JButton btnPT = new JButton("TÍNH PHƯƠNG TRÌNH");
		btnPT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPT.setBounds(182, 195, 193, 35);
		contentPane.add(btnPT);
		
		JButton btnBMI = new JButton("TÍNH BMI");
		btnBMI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBMI.setBounds(182, 252, 193, 35);
		contentPane.add(btnBMI);
		
		JButton btnDV = new JButton("ĐỔI ĐƠN VỊ");
		btnDV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDV.setBounds(182, 310, 193, 35);
		contentPane.add(btnDV);
	}

}
