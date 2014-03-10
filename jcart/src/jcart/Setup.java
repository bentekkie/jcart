package jcart;
import javax.swing.*;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.awt.event.*;
import java.awt.*;
public class Setup extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 200;
	private static final int HEIGHT = 300;
	
	private JLabel oneL, twoL, threeL, fourL, fiveL, sixL, sevenL, eightL, nineL;
	private JTextField oneTF, twoTF, threeTF, fourTF, fiveTF, sixTF, sevenTF, eightTF, nineTF;
	private JButton storeB;
	OutputStream output = null;
	//Button handlers:
	private StoreButtonHandler sbHandler;
	Properties prop = new Properties();
	public Setup()
	{
		oneL = new JLabel("1:", SwingConstants.RIGHT);
		twoL = new JLabel("2:", SwingConstants.RIGHT);
		threeL = new JLabel("3:", SwingConstants.RIGHT);
		fourL = new JLabel("4:", SwingConstants.RIGHT);
		fiveL = new JLabel("5:", SwingConstants.RIGHT);
		sixL = new JLabel("6:", SwingConstants.RIGHT);
		sevenL = new JLabel("7:", SwingConstants.RIGHT);
		eightL = new JLabel("8:", SwingConstants.RIGHT);
		nineL = new JLabel("9:", SwingConstants.RIGHT);
		
		oneTF = new JTextField(Sound.one);
		twoTF = new JTextField(Sound.two);
		threeTF = new JTextField(Sound.three);
		fourTF = new JTextField(Sound.four);
		fiveTF = new JTextField(Sound.five);
		sixTF = new JTextField(Sound.six);
		sevenTF = new JTextField(Sound.seven);
		eightTF = new JTextField(Sound.eight);
		nineTF = new JTextField(Sound.nine);
		
		//SPecify handlers for each button and add (register) ActionListeners to each button.
		storeB = new JButton("Store");
		sbHandler = new StoreButtonHandler();
		storeB.addActionListener(sbHandler);
		setTitle("Setup");
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(10, 2));
		
		//Add things to the pane in the order you want them to appear (left to right, top to bottom)
		pane.add(oneL);
		pane.add(oneTF);
		pane.add(twoL);
		pane.add(twoTF);
		pane.add(threeL);
		pane.add(threeTF);
		pane.add(fourL);
		pane.add(fourTF);
		pane.add(fiveL);
		pane.add(fiveTF);
		pane.add(sixL);
		pane.add(sixTF);
		pane.add(sevenL);
		pane.add(sevenTF);
		pane.add(eightL);
		pane.add(eightTF);
		pane.add(nineL);
		pane.add(nineTF);
		pane.add(storeB);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private class StoreButtonHandler implements ActionListener
	{
		

		public void actionPerformed(ActionEvent e)
		{
			

			if(oneTF.getText().trim().length() != 0)
			{
			Sound.one = oneTF.getText();
			
			}
			if(twoTF.getText().trim().length() != 0)
			{
			Sound.two = twoTF.getText();
			}
			if(threeTF.getText().trim().length() != 0)
			{
			Sound.three = threeTF.getText();
			}
			if(fourTF.getText().trim().length() != 0)
			{
			Sound.four = fourTF.getText();
			}
			if(fiveTF.getText().trim().length() != 0)
			{
			Sound.five = fiveTF.getText();
			}
			if(sixTF.getText().trim().length() != 0)
			{
			Sound.six = sixTF.getText();
			}
			if(sevenTF.getText().trim().length() != 0)
			{
			Sound.seven = sevenTF.getText();
			}
			if(eightTF.getText().trim().length() != 0)
			{
			Sound.eight = eightTF.getText();
			}
			if(nineTF.getText().trim().length() != 0)
			{
			Sound.nine = nineTF.getText();
			}

			System.out.println(Sound.one);
			System.out.println(Sound.two);
			System.out.println(Sound.three);
			System.out.println(Sound.four);
			System.out.println(Sound.five);
			System.out.println(Sound.six);
			System.out.println(Sound.seven);
			System.out.println(Sound.eight);
			System.out.println(Sound.nine);

			prop.setProperty("one", Sound.one);
			prop.setProperty("two", Sound.two);
			prop.setProperty("three", Sound.three);
			prop.setProperty("four", Sound.four);
			prop.setProperty("five", Sound.five);
			prop.setProperty("six", Sound.six);
			prop.setProperty("seven", Sound.seven);
			prop.setProperty("eight", Sound.eight);
			prop.setProperty("nine", Sound.nine);
		
				try {
					output = new FileOutputStream("config.properties");
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				File hi = new File("lock");
				if(!hi.exists()){
					hi.mkdirs();
				}
			try {
				prop.store(output, null);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.one);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.two);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.three);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.four);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.five);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.six);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.seven);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.eight);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			try {
			copyFileUsingStream(Sound.nine);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			

			
		}
	}
	
	public class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Setup rectObj = new Setup();
	}
	private static void copyFileUsingStream(String source) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    
	    File in, out;
	   
	    try {
	    	in = new File(source);
	 	    out = new File("lock/"+source);
	        is = new FileInputStream(in);
	        os = new FileOutputStream(out);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}

	}

