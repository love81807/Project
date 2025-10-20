package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrderUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField ruler;
	private JTextField pen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUi frame = new OrderUi();
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
	public OrderUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setForeground(new Color(192, 192, 192));
		panel.setBounds(21, 23, 390, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("文具購物系統");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 22));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(128, 10, 150, 31);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(21, 84, 390, 242);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("名字：");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(51, 21, 65, 42);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("尺：");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(51, 73, 45, 50);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("筆：");
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_3.setBounds(50, 133, 46, 50);
		panel_1.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setBounds(126, 21, 198, 37);
		panel_1.add(name);
		name.setColumns(10);
		
		ruler = new JTextField();
		ruler.setBounds(126, 73, 198, 42);
		panel_1.add(ruler);
		ruler.setColumns(10);
		
		pen = new JTextField();
		pen.setBounds(126, 133, 198, 41);
		panel_1.add(pen);
		pen.setColumns(10);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(21, 336, 390, 100);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBounds(10, 10, 370, 80);
		panel_2.add(output);
		
		/*******event*******/
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String Name=name.getText();
				String Ruler=ruler.getText();
				String Pen=pen.getText();
				
				//Integer R=new Integer(Ruler);//Integer把String轉成為整數
				//Integer P=new Integer(Pen);
				
				int R=Integer.parseInt(Ruler);
				int P=Integer.parseInt(Pen);
				
				Order o=new Order(Name,R,P);
				
				output.setText("姓名:"+o.getName()+
						"\n尺:"+o.getPen()+" 把"+
						"\n筆:"+o.getPen()+" 隻"+
						"\n金額:"+o.getSum()+"元");
				
				
				
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(117, 191, 155, 41);
		panel_1.add(btnNewButton);

	}

}
