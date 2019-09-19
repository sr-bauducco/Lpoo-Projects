import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	double ope=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 51));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 102));
		panel.setForeground(new Color(51, 255, 153));
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnCelsius = new JRadioButton("Celsius");
		rdbtnCelsius.setForeground(new Color(0, 51, 51));
		rdbtnCelsius.setBackground(new Color(102, 153, 102));
		rdbtnCelsius.setBounds(62, 5, 80, 23);
		panel.add(rdbtnCelsius);
		
		JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit.setForeground(new Color(0, 51, 51));
		rdbtnFahrenheit.setBackground(new Color(102, 153, 102));
		rdbtnFahrenheit.setBounds(156, 5, 118, 23);
		panel.add(rdbtnFahrenheit);
		
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setForeground(new Color(0, 51, 51));
		rdbtnKelvin.setBackground(new Color(102, 153, 102));
		rdbtnKelvin.setBounds(295, 5, 67, 23);
		panel.add(rdbtnKelvin);
		
		textField1 = new JTextField();
		textField1.setBounds(143, 63, 205, 20);
		panel.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblDigiteAquiA = new JLabel("Digite aqui a temperatura:");
		lblDigiteAquiA.setForeground(new Color(0, 51, 51));
		lblDigiteAquiA.setBackground(new Color(0, 102, 255));
		lblDigiteAquiA.setBounds(10, 66, 132, 14);
		panel.add(lblDigiteAquiA);
		
		JLabel lblNewLabel = new JLabel("Celsius");
		lblNewLabel.setForeground(new Color(51, 0, 204));
		lblNewLabel.setBounds(75, 163, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fahrenheit");
		lblNewLabel_1.setForeground(new Color(51, 0, 204));
		lblNewLabel_1.setBounds(156, 163, 77, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kelvin");
		lblNewLabel_2.setForeground(new Color(51, 0, 255));
		lblNewLabel_2.setBounds(295, 163, 53, 14);
		panel.add(lblNewLabel_2);
		
		textField2 = new JTextField();
		textField2.setBackground(new Color(255, 255, 255));
		textField2.setBounds(48, 188, 86, 20);
		panel.add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(170, 188, 86, 20);
		panel.add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(295, 188, 86, 20);
		panel.add(textField4);
		textField4.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			double temp= Double.parseDouble(textField1.getText());
			if(rdbtnCelsius.isSelected()) {
				textField2.setText(""+temp);
				ope=(temp*1.8)+32;
				textField3.setText(""+ope);
				
			}
			
			
			}
		});
		btnNewButton.setBackground(new Color(0, 153, 102));
		btnNewButton.setForeground(new Color(0, 51, 51));
		btnNewButton.setBounds(125, 105, 132, 23);
		panel.add(btnNewButton);
	}
}
