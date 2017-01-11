import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class Calculators {

	private JFrame frame;
	private JTextField textField;
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculators window = new Calculators();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculators() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 153));
		frame.setBounds(100, 100, 233, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 218, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//First row
		JButton btnBackSpace = new JButton("\u2190");
		btnBackSpace.setForeground(new Color(51, 153, 153));
		btnBackSpace.setBackground(new Color(51, 153, 204));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String BackSpace = null;
				if(textField.getText().length() > 0){
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				BackSpace = strB.toString();
				textField.setText(BackSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnBackSpace.setBounds(6, 50, 50, 50);
		frame.getContentPane().add(btnBackSpace);
		
		
		JButton btnClear = new JButton("C");
		btnClear.setForeground(new Color(51, 153, 153));
		btnClear.setBackground(new Color(51, 153, 204));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextComponent jTextField = null;
				textField.setText("");
				
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnClear.setBounds(62, 50, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setForeground(new Color(51, 153, 153));
		btnPercent.setBackground(new Color(51, 153, 204));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
				
				//String EnterNumber = textField.getText() +btnPercent.getText();
				//textField.setText(EnterNumber);
			}
		});
		btnPercent.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPercent.setBounds(118, 50, 50, 50);
		frame.getContentPane().add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(new Color(51, 153, 153));
		btnPlus.setBackground(new Color(51, 153, 204));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
				//String EnterNumber = textField.getText() +btnPlus.getText();
				//textField.setText(EnterNumber);
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPlus.setBounds(174, 50, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//Second row
		JButton btnN7 = new JButton("7");
		btnN7.setForeground(new Color(51, 153, 153));
		btnN7.setBackground(new Color(51, 153, 204));
		btnN7.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() +btnN7.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btnN7.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN7.setBounds(6, 101, 50, 50);
		frame.getContentPane().add(btnN7);
		
		JButton btnN8 = new JButton("8");
		btnN8.setForeground(new Color(51, 153, 153));
		btnN8.setBackground(new Color(51, 153, 204));
		btnN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN8.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN8.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN8.setBounds(62, 101, 50, 50);
		frame.getContentPane().add(btnN8);
		
		JButton btnN9 = new JButton("9");
		btnN9.setForeground(new Color(51, 153, 153));
		btnN9.setBackground(new Color(51, 153, 204));
		btnN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN9.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN9.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN9.setBounds(118, 101, 50, 50);
		frame.getContentPane().add(btnN9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setForeground(new Color(51, 153, 153));
		btnMinus.setBackground(new Color(51, 153, 204));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
				//String EnterNumber = textField.getText() +btnMinus.getText();
				//textField.setText(EnterNumber);
			}
		});
		btnMinus.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnMinus.setBounds(174, 101, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		//Second row
		JButton btnN4 = new JButton("4");
		btnN4.setForeground(new Color(51, 153, 153));
		btnN4.setBackground(new Color(51, 153, 204));
		btnN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN4.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN4.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN4.setBounds(6, 157, 50, 50);
		frame.getContentPane().add(btnN4);
		
		JButton btnN5 = new JButton("5");
		btnN5.setForeground(new Color(51, 153, 153));
		btnN5.setBackground(new Color(51, 153, 204));
		btnN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN5.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN5.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN5.setBounds(62, 157, 50, 50);
		frame.getContentPane().add(btnN5);
		
		JButton btnN6 = new JButton("6");
		btnN6.setForeground(new Color(51, 153, 153));
		btnN6.setBackground(new Color(51, 153, 204));
		btnN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN6.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN6.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN6.setBounds(118, 157, 50, 50);
		frame.getContentPane().add(btnN6);
		
		JButton btnMult = new JButton("*");
		btnMult.setForeground(new Color(51, 153, 153));
		btnMult.setBackground(new Color(51, 153, 204));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
				//String EnterNumber = textField.getText() +btnMult.getText();
				//textField.setText(EnterNumber);
			}
		});
		btnMult.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnMult.setBounds(174, 157, 50, 50);
		frame.getContentPane().add(btnMult);
		
		//Third row
		JButton btnN1 = new JButton("1");
		btnN1.setForeground(new Color(51, 153, 153));
		btnN1.setBackground(new Color(51, 153, 204));
		btnN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN1.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN1.setBounds(6, 213, 50, 50);
		frame.getContentPane().add(btnN1);
		
		JButton btnN2 = new JButton("2");
		btnN2.setForeground(new Color(51, 153, 153));
		btnN2.setBackground(new Color(51, 153, 204));
		btnN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN2.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN2.setBounds(62, 213, 50, 50);
		frame.getContentPane().add(btnN2);
		
		JButton btnN3 = new JButton("3");
		btnN3.setForeground(new Color(51, 153, 153));
		btnN3.setBackground(new Color(51, 153, 204));
		btnN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN3.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN3.setBounds(118, 213, 50, 50);
		frame.getContentPane().add(btnN3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setForeground(new Color(51, 153, 153));
		btnDiv.setBackground(new Color(51, 153, 204));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
				
				//String EnterNumber = textField.getText() +btnDiv.getText();
				//textField.setText(EnterNumber);
			}
		});
		btnDiv.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnDiv.setBounds(174, 213, 50, 50);
		frame.getContentPane().add(btnDiv);		
		

		//Fourth row
		JButton btnN0 = new JButton("0");
		btnN0.setForeground(new Color(51, 153, 153));
		btnN0.setBackground(new Color(51, 153, 204));
		btnN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnN0.getText();
				textField.setText(EnterNumber);
			}
		});
		btnN0.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnN0.setBounds(6, 269, 50, 50);
		frame.getContentPane().add(btnN0);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(new Color(51, 153, 153));
		btnDot.setBackground(new Color(51, 153, 204));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() +btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnDot.setBounds(62, 269, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+/-");
		btnPM.setForeground(new Color(51, 153, 153));
		btnPM.setBackground(new Color(51, 153, 204));
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
				
				//String EnterNumber = textField.getText() +btnPM.getText();
				//textField.setText(EnterNumber);
			}
		});
		btnPM.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPM.setBounds(118, 269, 50, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setForeground(new Color(51, 153, 153));
		btnEquals.setBackground(new Color(51, 153, 204));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				if(operations == "+"){
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if (operations == "-"){
					
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if (operations == "*"){
					
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if (operations == "/"){
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if (operations == "%"){
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else {
					//total2 = 0;
					textField.setText("");
				}
				
				//String EnterNumber = textField.getText() +btnEquals.getText();
				//textField.setText(EnterNumber);
			}
		});
		btnEquals.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnEquals.setBounds(174, 269, 50, 50);
		frame.getContentPane().add(btnEquals);		
	}
}
