package ntu_63131268;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhChinh extends JFrame {

	private double soA, soB, ketQua;
	private char phepToan;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMH;

	
	public ManHinhChinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 538);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMH = new JTextField();
		txtMH.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtMH.setBounds(80, 73, 431, 47);
		contentPane.add(txtMH);
		txtMH.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn1.setBounds(80, 157, 85, 41);
		contentPane.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn4.setBounds(80, 225, 85, 41);
		contentPane.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn7.setBounds(80, 296, 85, 41);
		contentPane.add(btn7);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn2.setBounds(197, 157, 85, 41);
		contentPane.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn5.setBounds(197, 225, 85, 41);
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn8.setBounds(197, 296, 85, 41);
		contentPane.add(btn8);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn3.setBounds(317, 157, 85, 41);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn6.setBounds(317, 225, 85, 41);
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn9.setBounds(317, 296, 85, 41);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtMH.setText(txtMH.getText()+cmd);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn0.setBounds(80, 360, 85, 41);
		contentPane.add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Xóa nội dung của txtMH
		        txtMH.setText("");
		        // Đặt lại giá trị của soA và soB về 0 và phepToan về giá trị mặc định
		        soA = 0;
		        soB = 0;
		        phepToan = '\u0000';
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnClear.setBounds(197, 360, 85, 41);
		contentPane.add(btnClear);
		
		JButton btnTinh = new JButton("=");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soB = Double.parseDouble(txtMH.getText());
		        switch (phepToan) {
		            case '+': ketQua = soA + soB; break;
		            case '-': ketQua = soA - soB; break;
		            case '*': ketQua = soA * soB; break;
		            case '/': ketQua = soB != 0 ? soA / soB : 0; // Kiểm tra chia cho 0
		        }
		        txtMH.setText(String.valueOf(ketQua));
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTinh.setBounds(317, 360, 85, 41);
		contentPane.add(btnTinh);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soA = Double.parseDouble(txtMH.getText());
		        phepToan = '+';
		        txtMH.setText("");
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCong.setBounds(426, 157, 85, 41);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soA = Double.parseDouble(txtMH.getText());
		        phepToan = '-';
		        txtMH.setText("");
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTru.setBounds(426, 225, 85, 41);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soA = Double.parseDouble(txtMH.getText());
		        phepToan = '*';
		        txtMH.setText("");
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNhan.setBounds(426, 296, 85, 41);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soA = Double.parseDouble(txtMH.getText());
		        phepToan = '*';
		        txtMH.setText("");
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnChia.setBounds(426, 360, 85, 41);
		contentPane.add(btnChia);
		
		JLabel lblNewLabel = new JLabel("MÁY TÍNH THÔNG MINH");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(197, 21, 197, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnPT = new JButton("PT Bậc 2");
		btnPT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TinhPhuongTrinh tinhPhuongTrinh = new TinhPhuongTrinh();
		        tinhPhuongTrinh.setVisible(true);
		        ManHinhChinh.this.setVisible(false); 
			}
		});
		btnPT.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPT.setBounds(80, 422, 202, 31);
		contentPane.add(btnPT);
		
		JButton btnBMI = new JButton("BMI");
		btnBMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TinhBMI tinhBMI = new TinhBMI();
				tinhBMI.setVisible(true);
		        ManHinhChinh.this.setVisible(false); 
			}
		});
		btnBMI.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBMI.setBounds(317, 422, 202, 31);
		contentPane.add(btnBMI);
	}
}
