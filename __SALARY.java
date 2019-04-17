import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class __SALARY {

	private JFrame frame;
	private JTextField salaryPH;
	private JTextField w_hoursPD;
	private JTextField w_daysPM;
	private JTextField taxRate;
	private JTextField spend;
	private JTextField borrow;
	private JLabel YOS;
	private JLabel ST;
	private JLabel AS;
	private JLabel RS;
	private JLabel AB;
	private JLabel AT;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					__SALARY window = new __SALARY();
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
	public __SALARY() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 578, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setBounds(0, 0, 217, 427);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Filters");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 29, 75, 23);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int salaryPerHours, workingHoursPerDay, workingDaysPerMonth, salaryRaxRate, spended, borrowed;
				salaryPerHours = Integer.parseInt(salaryPH.getText());
				workingHoursPerDay = Integer.parseInt(w_hoursPD.getText());
				workingDaysPerMonth = Integer.parseInt(w_daysPM.getText());
				salaryRaxRate = Integer.parseInt(taxRate.getText());
				spended = Integer.parseInt(spend.getText());
				borrowed = Integer.parseInt(borrow.getText());
				
				int originalSalary 	= (salaryPerHours * workingHoursPerDay) * workingDaysPerMonth;
				int orginalTaxRate 	= (originalSalary * salaryRaxRate) / 100;
				int salaryAfterTax 	= originalSalary - orginalTaxRate;
				int afterSpend		= salaryAfterTax - spended;
				int afterBorrowed	= afterSpend - borrowed;
				int TotalLost 		= orginalTaxRate + spended + borrowed;
				
				YOS.setText(Integer.toString(originalSalary));
				ST.setText(Integer.toString(orginalTaxRate));
				AT.setText(Integer.toString(salaryAfterTax));
				AS.setText(Integer.toString(afterSpend));
				AB.setText(Integer.toString(afterBorrowed));
				RS.setText(Integer.toString(TotalLost));
			}
		});
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(118, 29, 89, 23);
		panel.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 63, 197, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter your salary, per hours:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 76, 174, 14);
		panel.add(lblNewLabel_1);
		
		salaryPH = new JTextField();
		salaryPH.setText("580");
		salaryPH.setBounds(10, 101, 197, 20);
		panel.add(salaryPH);
		salaryPH.setColumns(10);
		
		w_hoursPD = new JTextField();
		w_hoursPD.setText("7");
		w_hoursPD.setColumns(10);
		w_hoursPD.setBounds(10, 157, 197, 20);
		panel.add(w_hoursPD);
		
		JLabel lblPleaseEnterYour = new JLabel("Working hours, per day:");
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPleaseEnterYour.setBounds(10, 132, 197, 14);
		panel.add(lblPleaseEnterYour);
		
		w_daysPM = new JTextField();
		w_daysPM.setText("15");
		w_daysPM.setColumns(10);
		w_daysPM.setBounds(10, 213, 197, 20);
		panel.add(w_daysPM);
		
		JLabel lblWorkingDaysPer = new JLabel("Working days, per month:");
		lblWorkingDaysPer.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblWorkingDaysPer.setBounds(10, 188, 174, 14);
		panel.add(lblWorkingDaysPer);
		
		taxRate = new JTextField();
		taxRate.setText("5");
		taxRate.setColumns(10);
		taxRate.setBounds(10, 269, 197, 20);
		panel.add(taxRate);
		
		JLabel lblTaxRate = new JLabel("Salary tax rate:");
		lblTaxRate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTaxRate.setBounds(10, 244, 174, 14);
		panel.add(lblTaxRate);
		
		spend = new JTextField();
		spend.setText("1800");
		spend.setColumns(10);
		spend.setBounds(10, 325, 197, 20);
		panel.add(spend);
		
		JLabel lblHowMouchDid = new JLabel("How much did you spend:");
		lblHowMouchDid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblHowMouchDid.setBounds(10, 300, 174, 14);
		panel.add(lblHowMouchDid);
		
		borrow = new JTextField();
		borrow.setText("2500");
		borrow.setColumns(10);
		borrow.setBounds(10, 381, 197, 20);
		panel.add(borrow);
		
		JLabel lblHowMuchDid = new JLabel("How much did you borrow:");
		lblHowMuchDid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblHowMuchDid.setBounds(10, 356, 174, 14);
		panel.add(lblHowMuchDid);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(215, 0, 357, 427);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		YOS = new JLabel("00");
		YOS.setForeground(SystemColor.textHighlight);
		YOS.setHorizontalAlignment(SwingConstants.LEFT);
		YOS.setFont(new Font("Mohave", Font.BOLD, 40));
		YOS.setBounds(10, 87, 337, 41);
		panel_1.add(YOS);
		
		JLabel lblYourOriginalSalary = new JLabel("Your Original Salary");
		lblYourOriginalSalary.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblYourOriginalSalary.setBounds(10, 43, 337, 41);
		panel_1.add(lblYourOriginalSalary);
		
		ST = new JLabel("00");
		ST.setHorizontalAlignment(SwingConstants.LEFT);
		ST.setForeground(new Color(165, 42, 42));
		ST.setFont(new Font("Mohave", Font.BOLD, 40));
		ST.setBounds(10, 182, 168, 41);
		panel_1.add(ST);
		
		JLabel lblYourSalaryTax = new JLabel("Salary's Tax");
		lblYourSalaryTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblYourSalaryTax.setBounds(10, 144, 168, 35);
		panel_1.add(lblYourSalaryTax);
		
		AS = new JLabel("00");
		AS.setHorizontalAlignment(SwingConstants.LEFT);
		AS.setForeground(new Color(0, 128, 0));
		AS.setFont(new Font("Mohave", Font.BOLD, 40));
		AS.setBounds(10, 272, 168, 41);
		panel_1.add(AS);
		
		JLabel lblAfter = new JLabel("Minus Spended");
		lblAfter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAfter.setBounds(10, 234, 168, 35);
		panel_1.add(lblAfter);
		
		RS = new JLabel("00");
		RS.setHorizontalAlignment(SwingConstants.LEFT);
		RS.setForeground(new Color(128, 0, 0));
		RS.setFont(new Font("Mohave", Font.BOLD, 40));
		RS.setBounds(10, 362, 337, 41);
		panel_1.add(RS);
		
		JLabel lblRemainingSalary = new JLabel("Total Money You Lost");
		lblRemainingSalary.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRemainingSalary.setBounds(10, 324, 337, 35);
		panel_1.add(lblRemainingSalary);
		
		JLabel lblAfterBorrow = new JLabel("After Pay Borrowed");
		lblAfterBorrow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAfterBorrow.setBounds(179, 234, 168, 35);
		panel_1.add(lblAfterBorrow);
		
		AB = new JLabel("00");
		AB.setHorizontalAlignment(SwingConstants.LEFT);
		AB.setForeground(new Color(0, 128, 0));
		AB.setFont(new Font("Mohave", Font.BOLD, 40));
		AB.setBounds(179, 272, 137, 41);
		panel_1.add(AB);
		
		JLabel lblAfterPayTax = new JLabel("After Pay Tax");
		lblAfterPayTax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAfterPayTax.setBounds(179, 144, 168, 35);
		panel_1.add(lblAfterPayTax);
		
		AT = new JLabel("00");
		AT.setHorizontalAlignment(SwingConstants.LEFT);
		AT.setForeground(new Color(0, 128, 0));
		AT.setFont(new Font("Mohave", Font.BOLD, 40));
		AT.setBounds(179, 182, 168, 41);
		panel_1.add(AT);
		
		JLabel label = new JLabel("<");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("Mohave", Font.BOLD, 40));
		label.setBounds(323, 272, 24, 41);
		panel_1.add(label);
	}
}
