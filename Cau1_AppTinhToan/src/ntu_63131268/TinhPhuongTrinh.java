package ntu_63131268;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TinhPhuongTrinh extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JLabel lblNewLabel_4;
    private JButton btnTinh;
    private JTextField txtKetQua;
    private JLabel lblNewLabel_5;

    public TinhPhuongTrinh() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 527, 493);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Tính PT Bậc 2");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel.setBounds(192, 24, 121, 27);
        contentPane.add(lblNewLabel);

        txtA = new JTextField();
        txtA.setFont(new Font("Tahoma", Font.PLAIN, 17));
        txtA.setBounds(91, 71, 43, 34);
        contentPane.add(txtA);
        txtA.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("x^2 +");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(144, 71, 66, 34);
        contentPane.add(lblNewLabel_1);

        txtB = new JTextField();
        txtB.setFont(new Font("Tahoma", Font.PLAIN, 17));
        txtB.setColumns(10);
        txtB.setBounds(220, 71, 43, 34);
        contentPane.add(txtB);

        JLabel lblNewLabel_2 = new JLabel("x +");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(273, 71, 48, 34);
        contentPane.add(lblNewLabel_2);

        txtC = new JTextField();
        txtC.setFont(new Font("Tahoma", Font.PLAIN, 17));
        txtC.setColumns(10);
        txtC.setBounds(316, 71, 43, 34);
        contentPane.add(txtC);

        JLabel lblNewLabel_3 = new JLabel("= 0");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_3.setBounds(369, 71, 48, 34);
        contentPane.add(lblNewLabel_3);

        btnTinh = new JButton("Tính");
        btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnTinh.setBounds(204, 143, 85, 21);
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Tính pt bậc 2
                HamTinhPT();
            }
        });
        contentPane.add(btnTinh);

        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        txtKetQua.setBounds(103, 200, 273, 34);
        contentPane.add(txtKetQua);
        txtKetQua.setColumns(10);

        lblNewLabel_5 = new JLabel("Kết quả:");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_5.setBounds(30, 199, 71, 34);
        contentPane.add(lblNewLabel_5);
    }

    void HamTinhPT(){
        String str_soA = txtA.getText();
        String str_soB = txtB.getText();
        String str_soC = txtC.getText();
        
        double soA = Double.parseDouble(str_soA);
        double soB = Double.parseDouble(str_soB);
        double soC = Double.parseDouble(str_soC);
        
        double delta = soB * soB - 4 * soA * soC;
        
        if (delta < 0) {
            txtKetQua.setText("PT vô nghiệm");
        } else if (delta == 0) {
            double x = -soB / (2 * soA);
            txtKetQua.setText("PT có nghiệm kép: x = " + x);
        } else {
            double x1 = (-soB + Math.sqrt(delta)) / (2 * soA);
            double x2 = (-soB - Math.sqrt(delta)) / (2 * soA);
            txtKetQua.setText("PT có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
