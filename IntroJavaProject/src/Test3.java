/* ClassName.java
 * John Ta
 * Intro Java D
 * Mr. Blondin
 * Date
 */


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

public class Test3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test3 window = new Test3();
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
	public Test3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// INITIAL FRAME
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Stock Prediction Application");
		lblNewLabel.setBounds(6, 6, 200, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Developed by: Niall Dalton & John Ta");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		lblNewLabel_1.setBounds(6, 20, 200, 12);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Stock Name:");
		lblNewLabel_2.setBounds(6, 49, 175, 16);
		frame.getContentPane().add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 35, 400, 3);
		frame.getContentPane().add(panel);

		textField = new JTextField("Enter stock name here");
		textField.setBounds(175, 44, 395, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		JLabel lblTotalAmountOf = new JLabel("Total Fundings:");
		lblTotalAmountOf.setBounds(6, 77, 175, 16);
		frame.getContentPane().add(lblTotalAmountOf);
		
		textField_1 = new JTextField("Enter total fundings here using digits");
		textField_1.setColumns(10);
		textField_1.setBounds(175, 72, 395, 26);
		frame.getContentPane().add(textField_1);
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_1.setText("");
			}
		});
		
		
		JLabel label = new JLabel("");
		label.setBounds(6, 105, 175, 16);
		frame.getContentPane().add(label);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(0, 105, 400, 3);
		frame.getContentPane().add(panel_2);

		JRadioButton rdbtnRiskFactor = new JRadioButton("Risk Factor");
		rdbtnRiskFactor.setBounds(6, 133, 141, 23);
		frame.getContentPane().add(rdbtnRiskFactor);

		JLabel lblOptional = new JLabel("Optional (Not default):");
		lblOptional.setBounds(6, 116, 175, 16);
		frame.getContentPane().add(lblOptional);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Predicted Graph");
		rdbtnNewRadioButton.setBounds(6, 158, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnFactoralertWords = new JRadioButton("Factor \"Alert\" Words");
		rdbtnFactoralertWords.setBounds(159, 133, 158, 23);
		frame.getContentPane().add(rdbtnFactoralertWords);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.GRAY);
		panel_3.setBounds(90, 193, 400, 3);
		frame.getContentPane().add(panel_3);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(90, 245, 400, 3);
		frame.getContentPane().add(panel_1);

		JLabel lblMaximumPredictedPrice = new JLabel("Maximum Predicted Price:");
		lblMaximumPredictedPrice.setBounds(6, 259, 175, 16);
		frame.getContentPane().add(lblMaximumPredictedPrice);

		JLabel lblMinimumPredictedPrice = new JLabel("Minimum Predicted Price:");
		lblMinimumPredictedPrice.setBounds(6, 287, 175, 16);
		frame.getContentPane().add(lblMinimumPredictedPrice);

		JLabel lblPredictedTotalTo = new JLabel("Predicted Total to Sell: ");
		lblPredictedTotalTo.setBounds(6, 315, 175, 16);
		frame.getContentPane().add(lblPredictedTotalTo);

		JLabel lblPredictedBuyTime = new JLabel("Predicted Buy Time:");
		lblPredictedBuyTime.setBounds(6, 343, 175, 16);
		frame.getContentPane().add(lblPredictedBuyTime);

		JLabel lblPredictedSellTime = new JLabel("Predicted Sell Time:");
		lblPredictedSellTime.setBounds(6, 371, 175, 16);
		frame.getContentPane().add(lblPredictedSellTime);

		textField_2 = new JTextField("N/A");
		textField_2.setColumns(10);
		textField_2.setBounds(175, 254, 395, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setEditable(false);

		textField_3 = new JTextField("N/A");
		textField_3.setColumns(10);
		textField_3.setBounds(175, 282, 395, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField("N/A");
		textField_4.setColumns(10);
		textField_4.setBounds(175, 310, 395, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setEditable(false);
		
		textField_5 = new JTextField("N/A");
		textField_5.setColumns(10);
		textField_5.setBounds(175, 338, 395, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setEditable(false);
		
		textField_6 = new JTextField("N/A");
		textField_6.setColumns(10);
		textField_6.setBounds(175, 366, 395, 26);
		frame.getContentPane().add(textField_6);
		textField_6.setEditable(false);

		JButton btnPredictStockOutput = new JButton("Predict Stock Output");
		btnPredictStockOutput.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg) {

				String stockName = "";
				double totalFunds;
				boolean riskFactor, graph, alert;

				try {
					if ((textField.getText()).isEmpty()) {
						int bob = 50 / 0;
					} else {
						stockName = textField.getText();
					}
					totalFunds = Integer.parseInt(textField_1.getText());
					riskFactor = rdbtnRiskFactor.isSelected();
					graph = rdbtnNewRadioButton.isSelected();
					alert = rdbtnFactoralertWords.isSelected();
					
					/* HEREEEEEEE */
					//File file = new File("/Users/johnta/Desktop/stockhistoricaldatabase" + "/table_"+ stockName + ".csv");
					File file = new File("C:/Users/Niall/Desktop/Neural Net/quotes_0.csv");
					
				} catch (ArithmeticException e) {
					JOptionPane.showMessageDialog(null, "Error: Input is Empty!");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		btnPredictStockOutput.setBounds(200, 208, 200, 29);
		frame.getContentPane().add(btnPredictStockOutput);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(257, 417, 1, 16);
		frame.getContentPane().add(textArea);

	}
}
