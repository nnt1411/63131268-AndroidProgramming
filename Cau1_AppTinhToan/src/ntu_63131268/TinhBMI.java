package ntu_63131268;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TinhBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCC;
	private JTextField txtCN;
	private JTextField txtKQ;

	
	public TinhBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 496);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÍNH BMI:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(214, 10, 123, 45);
		contentPane.add(lblNewLabel);
		
		txtCC = new JTextField();
		txtCC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCC.setBounds(241, 81, 123, 19);
		contentPane.add(txtCC);
		txtCC.setColumns(10);
		
		txtCN = new JTextField();
		txtCN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCN.setColumns(10);
		txtCN.setBounds(241, 135, 123, 19);
		contentPane.add(txtCN);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập chiều cao(cm):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(77, 81, 147, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhập cân nặng(kg):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(77, 135, 137, 18);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnTinh = new JButton("TÍNH");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            double chieuCao = Double.parseDouble(txtCC.getText()) / 100; // Chuyển chiều cao sang mét
		            double canNang = Double.parseDouble(txtCN.getText());
		            double bmi = canNang / (chieuCao * chieuCao);

		            String nhanXet = "";
		            if (bmi > 25) {
		                nhanXet = "Thừa cân";
		            } else if (bmi < 18) {
		                nhanXet = "Thiếu cân";
		            } else {
		                nhanXet = "Bình thường";
		            }

		            txtKQ.setText(String.format("%.2f - %s", bmi, nhanXet));
		        } catch (NumberFormatException ex) {
		            txtKQ.setText("Lỗi nhập liệu");
		        }
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTinh.setBounds(195, 187, 104, 37);
		contentPane.add(btnTinh);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtKQ.setEditable(false);
		txtKQ.setBounds(180, 259, 199, 37);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BMI:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(132, 259, 38, 37);
		contentPane.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("TRỞ LẠI");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManHinhChinh manHinhChinh = new ManHinhChinh();
				manHinhChinh.setVisible(true);
		        TinhBMI.this.setVisible(false); 
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(378, 24, 104, 21);
		contentPane.add(btnBack);
	}
}
