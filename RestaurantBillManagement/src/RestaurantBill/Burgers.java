package RestaurantBill;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Burgers extends JFrame 
{

	protected static final Window Jpanel = null;

	private JPanel contentPane;
	
	private JTextField jtxtChickenBurger;
	private JTextField jtxtChickenBurgerMeal;
	private JTextField jtxtCheeseBurger;
	private JTextField jtxtQty;
	private JTextField jtxtConvert;
	
	//----- Calculator -----
	private JTextField txtDisplay;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	double[] i = new double[5];
	
	double Nigerian_Naira = 0.20;
	double US_Dollar = 64.81;
	double Kenyan_Shilling = 0.63;
	double Brazilian_Real = 20.76;
	double Canadian_Dollar = 48.65;
	double Indian_Rupee = 1.00;
	double Philippine_Peso = 1.29;
	double Indonesian_Rupiah = 0.0049;
	
	

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Burgers frame = new Burgers();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public Burgers() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 98, 615, 285);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblChi = new JLabel("Chicken Burger");
		lblChi.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblChi.setBounds(21, 22, 173, 29);
		panel.add(lblChi);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblChickenBurgerMeal.setBounds(21, 70, 242, 29);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCheeseBurger.setBounds(21, 120, 173, 29);
		panel.add(lblCheeseBurger);
		
		jtxtChickenBurger = new JTextField();
		jtxtChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtxtChickenBurger.setBounds(317, 22, 253, 29);
		panel.add(jtxtChickenBurger);
		jtxtChickenBurger.setColumns(10);
		
		jtxtChickenBurgerMeal = new JTextField();
		jtxtChickenBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtxtChickenBurgerMeal.setColumns(10);
		jtxtChickenBurgerMeal.setBounds(317, 70, 253, 29);
		panel.add(jtxtChickenBurgerMeal);
		
		jtxtCheeseBurger = new JTextField();
		jtxtCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtxtCheeseBurger.setColumns(10);
		jtxtCheeseBurger.setBounds(317, 120, 253, 29);
		panel.add(jtxtCheeseBurger);
		
		JComboBox jcmbDrinks = 	new JComboBox();
		jcmbDrinks.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			}
		});
		jcmbDrinks.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jcmbDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select a Drinks", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		jcmbDrinks.setBounds(21, 200, 173, 29);
		panel.add(jcmbDrinks);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDrinks.setBounds(21, 160, 173, 29);
		panel.add(lblDrinks);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblQty.setBounds(317, 160, 61, 29);
		panel.add(lblQty);
		
		jtxtQty = new JTextField();
		jtxtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtQty.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(317, 200, 253, 29);
		panel.add(jtxtQty);
		
		JCheckBox jCHomeDelivery = new JCheckBox("Home Delivery");
		jCHomeDelivery.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
			}
		});
		jCHomeDelivery.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jCHomeDelivery.setBounds(21, 236, 212, 29);
		panel.add(jCHomeDelivery);
		
		JCheckBox jCTax = new JCheckBox("Tax");
		jCTax.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jCTax.setBounds(317, 236, 212, 29);
		panel.add(jCTax);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 160, 549, 8);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(635, 98, 339, 285);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philippine", "India"}));
		jcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jcmbCurrency.setBounds(44, 74, 253, 36);
		panel_1.add(jcmbCurrency);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtConvert.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(44, 132, 253, 36);
		panel_1.add(jtxtConvert);
		
		
		JLabel jlblConvert = new JLabel("");
		jlblConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jlblConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblConvert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblConvert.setBounds(44, 179, 253, 36);
		panel_1.add(jlblConvert);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jbtnConvert.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				double INR = Double.parseDouble(jtxtConvert.getText());
				if(jcmbCurrency.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1 = String.format("N %.2f", INR / Nigerian_Naira);
					jlblConvert.setText(cConvert1);
				}
				if(jcmbCurrency.getSelectedItem().equals("USA"))
				{
					String cConvert1 = String.format("$ %.2f", INR / US_Dollar);
					jlblConvert.setText(cConvert1);
				}
				if(jcmbCurrency.getSelectedItem().equals("Kenyan"))
				{
					String cConvert1 = String.format("KS %.2f", INR / Kenyan_Shilling);
					jlblConvert.setText(cConvert1);
				}
				if(jcmbCurrency.getSelectedItem().equals("Canada"))
				{
					String cConvert2 = String.format("C$ %.2f", INR / Canadian_Dollar);
					jlblConvert.setText(cConvert2);
				}
				if(jcmbCurrency.getSelectedItem().equals("Brazil"))
				{
					String cConvert3 = String.format("Bra %.2f", INR / Brazilian_Real);
					jlblConvert.setText(cConvert3);
				}
				if(jcmbCurrency.getSelectedItem().equals("Indonesia"))
				{
					String cConvert4 = String.format("IDR %.2f", INR / Indonesian_Rupiah);
					jlblConvert.setText(cConvert4);
				}
				if(jcmbCurrency.getSelectedItem().equals("Philippine"))
				{
					String cConvert5 = String.format("PHP %.2f", INR / Philippine_Peso);
					jlblConvert.setText(cConvert5);
				}
				if(jcmbCurrency.getSelectedItem().equals("India"))
				{
					String cConvert6 = String.format("INR %.2f", INR / Indian_Rupee);
					jlblConvert.setText(cConvert6);
				}
			}
		});
		jbtnConvert.setBounds(44, 226, 124, 29);
		panel_1.add(jbtnConvert);
		
		JButton jbtnClose = new JButton("Close");
		jbtnClose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				jlblConvert.setText(null);
				jtxtConvert.setText(null);
				jcmbCurrency.setSelectedItem("Choose One...");

			}
		});
		jbtnClose.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtnClose.setBounds(203, 227, 94, 29);
		panel_1.add(jbtnClose);
		
		JLabel lblCureencyConverter = new JLabel("Currency Converter");
		lblCureencyConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCureencyConverter.setBounds(33, 24, 264, 41);
		panel_1.add(lblCureencyConverter);
		lblCureencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(635, 390, 339, 171);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBounds(20, 21, 66, 29);
		panel_2.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSubTotal.setBounds(20, 69, 119, 29);
		panel_2.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBounds(20, 119, 72, 29);
		panel_2.add(lblTotal);
		
		JLabel jlblTax = new JLabel("0");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(149, 21, 170, 29);
		panel_2.add(jlblTax);
		
		JLabel jlblSubTotal = new JLabel("0");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblSubTotal.setBounds(149, 69, 170, 29);
		panel_2.add(jlblSubTotal);
		
		JLabel jlblTotal = new JLabel("0");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(149, 119, 170, 29);
		panel_2.add(jlblTotal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 390, 615, 171);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCostOfDili = new JLabel("Cost of Delivery");
		lblCostOfDili.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDili.setBounds(21, 119, 173, 29);
		panel_3.add(lblCostOfDili);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfMeal.setBounds(21, 69, 242, 29);
		panel_3.add(lblCostOfMeal);
		
		JLabel lblCostOfDrink = new JLabel("Cost of Drinks");
		lblCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDrink.setBounds(21, 21, 173, 29);
		panel_3.add(lblCostOfDrink);
		
		JLabel jlblCostOfDrinks = new JLabel("0");
		jlblCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDrinks.setBounds(318, 21, 253, 29);
		jlblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2)); 
		panel_3.add(jlblCostOfDrinks);
		
		JLabel jlblCostOfMeal = new JLabel("0");
		jlblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfMeal.setBounds(318, 69, 253, 29);
		panel_3.add(jlblCostOfMeal);
		
		JLabel jlblCostOfDelivery = new JLabel("0");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery.setBounds(318, 119, 253, 29);
		panel_3.add(jlblCostOfDelivery);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(984, 98, 358, 467);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 25, 315, 420);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		//----- Calculator Raw5 -----
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(21, 316, 60, 60);
		panel_7.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(84, 316, 60, 60);
		panel_7.add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(147, 316, 60, 60);
		panel_7.add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(210, 316, 60, 60);
		panel_7.add(btnEqual);
		
		//----- Calculator Raw4 -----
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(210, 254, 60, 60);
		panel_7.add(btnDiv);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(147, 254, 60, 60);
		panel_7.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(84, 254, 60, 60);
		panel_7.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(21, 254, 60, 60);
		panel_7.add(btn1);
		
		//----- Calculator Raw3 -----
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(21, 192, 60, 60);
		panel_7.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(84, 192, 60, 60);
		panel_7.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(147, 192, 60, 60);
		panel_7.add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(210, 192, 60, 60);
		panel_7.add(btnMult);
		
		//----- Calculator Raw2 -----
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(210, 130, 60, 60);
		panel_7.add(btnSub);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(147, 130, 60, 60);
		panel_7.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(84, 130, 60, 60);
		panel_7.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(21, 130, 60, 60);
		panel_7.add(btn7);
		
		//----- Calculator Raw1 -----
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String backspace = null;
				if(txtDisplay.getText().length() > 0)
				{
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Dialog", Font.BOLD, 20));
		btnBackSpace.setBounds(21, 68, 60, 60);
		panel_7.add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(84, 68, 60, 60);
		panel_7.add(btnClear);
		
		JButton btnPrecent = new JButton("%");
		btnPrecent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPrecent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrecent.setBounds(147, 68, 60, 60);
		panel_7.add(btnPrecent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(210, 68, 60, 60);
		panel_7.add(btnPlus);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(21, 11, 248, 43);
		panel_7.add(txtDisplay);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 568, 1332, 83);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtnExit.setBounds(1005, 26, 89, 29);
		panel_5.add(jbtnExit);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				jlblCostOfDelivery.setText("0");
				jlblSubTotal.setText("0");
				jlblTotal.setText("0");
				jlblTax.setText("0");
				jlblConvert.setText("0");
				jlblCostOfDrinks.setText("0");
				jlblCostOfMeal.setText("0");
				jtxtChickenBurger.setText(null);
				jtxtChickenBurgerMeal.setText(null);
				jtxtCheeseBurger.setText(null);
				jtxtQty.setText(null);
				jtxtConvert.setText(null);
				jcmbDrinks.setSelectedItem("Select a Drinks");
				jcmbCurrency.setSelectedItem("Choose One...");

			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtnReset.setBounds(758, 26, 89, 29);
		panel_5.add(jbtnReset);
		
		JButton jbtnReceipt = new JButton("Receipt");
		jbtnReceipt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double Qty1 = Double.parseDouble(jtxtChickenBurger.getText());
				double Qty2 = Double.parseDouble(jtxtChickenBurgerMeal.getText());
				double Qty3 = Double.parseDouble(jtxtCheeseBurger.getText());
							
/*				jtxtReceipts.append("\t\nRestaurant Management Systems:\n\n" + 
									"Chicken Burger:\t\t" + Qty1 + 
									"\nChicken Burger Meal:\t\t" + Qty2 +
									"\nCheese Burger:\t\t" + Qty3 +
									"\n\nThanks for using job Estimator");
*/
				System.out.println("\t\nRestaurant Management Systems:\n\n" + 
									"Chicken Burger:\t\t" + Qty1 + 
									"\nChicken Burger Meal:\t" + Qty2 +
									"\nCheese Burger:\t\t" + Qty3 +
									"\n\nThanks for using job Estimator");
			}
		});
		jbtnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtnReceipt.setBounds(451, 26, 120, 29);
		panel_5.add(jbtnReceipt);
		
		JButton jbtnTotal = new JButton("Total");
		jbtnTotal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double ChickenBurger = Double.parseDouble(jtxtChickenBurger.getText());
				double iChickenBurger = 49.00;
				double Burger;
				
				Burger = (ChickenBurger * iChickenBurger);
				String pMeal = String.format("%.2f", Burger);
				jlblCostOfMeal.setText(pMeal);
				
				double ChickenBurgerMeal = Double.parseDouble(jtxtChickenBurgerMeal.getText());
				double iChickenBurgerMeal = 89.00;
				double BurgerMeal;
				
				BurgerMeal = (ChickenBurgerMeal * iChickenBurgerMeal);
				String cbMeal = String.format("%.2f", BurgerMeal + Burger);
				jlblCostOfMeal.setText(cbMeal);
				
				double CheeseBurger = Double.parseDouble(jtxtCheeseBurger.getText());
				double CheeseBurgerPrice = 65.00;
				double CheeseBurgerMeal;
				
				CheeseBurgerMeal = (CheeseBurger * CheeseBurgerPrice);
				String cheese = String.format("%.2f", CheeseBurgerMeal + BurgerMeal + Burger);
				jlblCostOfMeal.setText(cheese);
		
				//----- Delivery -----
				double iDelivery = 50.00;
				if(jCHomeDelivery.isSelected())
				{
					String pDelivery = String.format("%.2f", iDelivery);
					jlblCostOfDelivery.setText(pDelivery);
				}
				else
				{
					jlblCostOfDelivery.setText("0");
				}	
				
				//----- Drinks -----
				 double Drinks = Double.parseDouble(jtxtQty.getText());
				 double Tea = 10.00 * Drinks; 
				 double Ice_Tea = 12.00 * Drinks;
				 double Coffee = 11.00 * Drinks;
				 double Ice_Coffee = 13.00 * Drinks;
				 double Cola = 15.00 * Drinks;
				 double Coke = 15.00 * Drinks;
				 double Orange = 15.00 * Drinks;
				 double Apple_Juice = 20.00 * Drinks;
				 
				 if(jcmbDrinks.getSelectedItem().equals("Tea"))
				 {
					 String cTea = String.format("%.2f", Tea);
					 jlblCostOfDrinks.setText(cTea);
				 }
				 if(jcmbDrinks.getSelectedItem().equals("Ice Tea"))
				 {
					 String cIce_Tea = String.format("%.2f", Ice_Tea);
					 jlblCostOfDrinks.setText(cIce_Tea);
				 }
				 if(jcmbDrinks.getSelectedItem().equals("Coffee"))
				 {
					 String cCoffee = String.format("%.2f", Coffee);
					 jlblCostOfDrinks.setText(cCoffee);
				 }
				 if(jcmbDrinks.getSelectedItem().equals("Ice Coffee"))
				 {
					 String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					 jlblCostOfDrinks.setText(cIce_Coffee);
				 }
				 if(jcmbDrinks.getSelectedItem().equals("Cola"))
				 {
					 String cCola = String.format("%.2f", Cola);
					 jlblCostOfDrinks.setText(cCola);
				 }
				 if(jcmbDrinks.getSelectedItem().equals("Coke"))
				 {
					 String cCoke = String.format("%.2f", Coke);
					 jlblCostOfDrinks.setText(cCoke);
				 }
				 if(jcmbDrinks.getSelectedItem().equals("Orange"))
				 {
					 String cOrange = String.format("%.2f", Orange);
					 jlblCostOfDrinks.setText(cOrange);
				 }
				 if(jcmbDrinks.getSelectedItem().equals("Apple Juice"))
				 {
					 String cApple_Juice = String.format("%.2f", Apple_Juice);
					 jlblCostOfDrinks.setText(cApple_Juice);
				 }
				 if(jcmbDrinks.getSelectedItem().equals("Select a Drinks"))
				 {
					 jlblCostOfDrinks.setText("0");
				 }
				 
				 //----- Tax -----
				 double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
				 double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
				 double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
				 Double AllTotal = (cTotal1 + cTotal2 + cTotal3) / 100;
				 if(jCTax.isSelected())
				 {
					 String iTotal = String.format("%.2f", AllTotal);
					 jlblTax.setText(iTotal);
				 }
				 else
				 {
						jlblTax.setText("0");
				 }
				 
				 //----- SubTotal -----				 
				 double subTotal;
				 subTotal = (cTotal1 + cTotal2 + cTotal3);
				 String isubTotal = String.format("%.2f   INR", subTotal);
				 jlblSubTotal.setText(isubTotal);
				 
				 
				 //----- Total -----
				 double cTotal4 = Double.parseDouble(jlblTax.getText());
				 double allTotal;
				 allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				 String iTotal = String.format("%.2f   INR", allTotal);
				 jlblTotal.setText(iTotal);
				 
				 String iTaxTotal = String.format("%.2f   INR", cTotal4);
				 jlblTax.setText(iTaxTotal);

			}
		});
		jbtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtnTotal.setBounds(227, 26, 89, 29);
		panel_5.add(jbtnTotal);
		
		JLabel lblBurger = new JLabel("Burgers Bill");
		lblBurger.setBounds(431, 11, 417, 76);
		lblBurger.setFont(new Font("Tahoma", Font.BOLD, 68));
		contentPane.add(lblBurger);
		
		JButton btnBackToMenu = new JButton("BACK To MENU");
		btnBackToMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Menu menu = new Menu();
				menu.main(null);
			}
		});
		btnBackToMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBackToMenu.setBounds(26, 24, 157, 46);
		contentPane.add(btnBackToMenu);
		
		
	}
}
