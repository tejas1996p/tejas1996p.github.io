package RestaurantBill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JToolBar;

public class Menu 
{

	private JFrame frame;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Menu window = new Menu();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() 
	{
		initialize();
	}

	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(623, 11, 172, 53);
		lblMenu.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 54));
		frame.getContentPane().add(lblMenu);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 76, 417, 475);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Chicken Burger");
		label.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		label.setBounds(21, 33, 210, 46);
		panel.add(label);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblChickenBurgerMeal.setBounds(21, 133, 273, 46);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblCheeseBurger.setBounds(21, 242, 210, 46);
		panel.add(lblCheeseBurger);
		
		JButton btnBurger = new JButton("Burger");
		btnBurger.setBounds(144, 380, 114, 35);
		panel.add(btnBurger);
		btnBurger.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Burgers burger = new Burgers();
				burger.setVisible(true);
			}
		});
		btnBurger.setFont(new Font("Goudy Old Style", Font.PLAIN, 32));
		
		JLabel lblInr = new JLabel("------------------   49 INR");
		lblInr.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr.setBounds(115, 83, 280, 27);
		panel.add(lblInr);
		
		JLabel lblInr_1 = new JLabel("------------------   89 INR\r\n");
		lblInr_1.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr_1.setBounds(115, 190, 280, 27);
		panel.add(lblInr_1);
		
		JLabel lblInr_2 = new JLabel("------------------   65 INR");
		lblInr_2.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr_2.setBounds(115, 299, 280, 27);
		panel.add(lblInr_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(447, 75, 431, 475);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnPizza = new JButton("Pizza");
		btnPizza.setBounds(166, 380, 105, 35);
		panel_1.add(btnPizza);
		btnPizza.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Pizza pizza = new Pizza();
				pizza.setVisible(true);
			}
		});
		btnPizza.setFont(new Font("Goudy Old Style", Font.PLAIN, 32));
		
		JLabel lblMargherita = new JLabel("Margherita");
		lblMargherita.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblMargherita.setBounds(20, 33, 145, 46);
		panel_1.add(lblMargherita);
		
		JLabel lblVegTrioMeal = new JLabel("Veg. Trio Meal");
		lblVegTrioMeal.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblVegTrioMeal.setBounds(20, 133, 200, 46);
		panel_1.add(lblVegTrioMeal);
		
		JLabel lblPeriperiChicken = new JLabel("Peri-Peri Chicken");
		lblPeriperiChicken.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblPeriperiChicken.setBounds(20, 242, 239, 46);
		panel_1.add(lblPeriperiChicken);
		
		JLabel lblInr_5 = new JLabel("----------------   184 INR");
		lblInr_5.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr_5.setBounds(128, 298, 280, 27);
		panel_1.add(lblInr_5);
		
		JLabel lblInr_4 = new JLabel("----------------   149 INR\r\n");
		lblInr_4.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr_4.setBounds(128, 189, 280, 27);
		panel_1.add(lblInr_4);
		
		JLabel lblInr_3 = new JLabel("------------------   89 INR");
		lblInr_3.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr_3.setBounds(128, 82, 280, 27);
		panel_1.add(lblInr_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(901, 76, 441, 475);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnGujaratiDish = new JButton("Gujarati Dish");
		btnGujaratiDish.setBounds(117, 380, 205, 35);
		panel_2.add(btnGujaratiDish);
		btnGujaratiDish.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				GujaratiDish gujaratiDish = new GujaratiDish();
				gujaratiDish.setVisible(true);
			}
		});
		btnGujaratiDish.setFont(new Font("Goudy Old Style", Font.PLAIN, 30));
		
		JLabel lblGujaratiThali = new JLabel("Gujarati Thali");
		lblGujaratiThali.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblGujaratiThali.setBounds(23, 245, 181, 46);
		panel_2.add(lblGujaratiThali);
		
		JLabel lblKhamanHandvo = new JLabel("Khaman & Handvo");
		lblKhamanHandvo.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblKhamanHandvo.setBounds(23, 136, 256, 46);
		panel_2.add(lblKhamanHandvo);
		
		JLabel lblFarsan = new JLabel("Farsan");
		lblFarsan.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblFarsan.setBounds(23, 36, 145, 46);
		panel_2.add(lblFarsan);
		
		JLabel lblInr_6 = new JLabel("------------------   39 INR");
		lblInr_6.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr_6.setBounds(138, 81, 280, 27);
		panel_2.add(lblInr_6);
		
		JLabel lblInr_7 = new JLabel("----------------   69 INR\r\n");
		lblInr_7.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr_7.setBounds(138, 188, 280, 27);
		panel_2.add(lblInr_7);
		
		JLabel lblInr_8 = new JLabel("----------------   99 INR");
		lblInr_8.setFont(new Font("Arial Narrow", Font.PLAIN, 34));
		lblInr_8.setBounds(138, 297, 280, 27);
		panel_2.add(lblInr_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(10, 562, 1332, 77);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.setFont(new Font("Andalus", Font.PLAIN, 30));
		jbtnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		jbtnExit.setBounds(614, 21, 89, 34);
		panel_3.add(jbtnExit);
	}
}
