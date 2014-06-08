package org.crystal.ex.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setResizable(false);
		setTitle("CalculatorEX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("1");
		button.setBounds(161, 120, 47, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(218, 120, 47, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(275, 120, 47, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(161, 86, 47, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(218, 86, 47, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(275, 86, 47, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(161, 52, 47, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(218, 52, 47, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(275, 52, 47, 23);
		contentPane.add(button_8);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(0, 21, 322, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setBounds(218, 154, 47, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblCalculatorex = new JLabel("CalculatorEX Made By CrystalCoderz Team.");
		lblCalculatorex.setForeground(Color.WHITE);
		lblCalculatorex.setBounds(0, 0, 600, 14);
		contentPane.add(lblCalculatorex);
		
		JLabel lblTaw = new JLabel("");
		lblTaw.setIcon(new ImageIcon(Gui.class.getResource("/images/space3.jpg")));
		lblTaw.setBounds(-205, -75, 845, 764);
		contentPane.add(lblTaw);
	}
}
