package jcart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.sound.sampled.*;

	public class Gui extends JFrame {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private static final int WIDTH = 400;
		private static final int HEIGHT = 300;
		
		private JButton one, two, three, four, five, six, seven, eight, nine;
		JMenuBar menuBar = new JMenuBar();
		
		//Button handlers:
		private OneButtonHandler onebHandler;
		private TwoButtonHandler twobHandler;
		private ThreeButtonHandler threebHandler;
		private FourButtonHandler fourbHandler;
		private FiveButtonHandler fivebHandler;
		private SixButtonHandler sixbHandler;
		private SevenButtonHandler sevenbHandler;
		private EightButtonHandler eightbHandler;
		private NineButtonHandler ninebHandler;
		private setupHandler setupHandler;
		
		public Gui()
		{

			setJMenuBar(menuBar);
			JMenu fileMenu = new JMenu("File");
	        menuBar.add(fileMenu);
	        JMenuItem setupAction = new JMenuItem("Sound setup");
	        setupHandler = new setupHandler();
	        setupAction.addActionListener(setupHandler);

			//SPecify handlers for each button and add (register) ActionListeners to each button.
			one = new JButton("One");
			onebHandler = new OneButtonHandler();
			one.addActionListener(onebHandler);
			two = new JButton("Two");
			twobHandler = new TwoButtonHandler();
			two.addActionListener(twobHandler);
			three = new JButton("Three");
			threebHandler = new ThreeButtonHandler();
			three.addActionListener(threebHandler);
			four = new JButton("Four");
			fourbHandler = new FourButtonHandler();
			four.addActionListener(fourbHandler);
			five = new JButton("Five");
			fivebHandler = new FiveButtonHandler();
			five.addActionListener(fivebHandler);
			six = new JButton("Six");
			sixbHandler = new SixButtonHandler();
			six.addActionListener(sixbHandler);
			seven = new JButton("Seven");
			sevenbHandler = new SevenButtonHandler();
			seven.addActionListener(sevenbHandler);
			eight = new JButton("Eight");
			eightbHandler = new EightButtonHandler();
			eight.addActionListener(eightbHandler);
			nine = new JButton("Nine");
			ninebHandler = new NineButtonHandler();
			nine.addActionListener(ninebHandler);
			
			
			setTitle("Music");
			Container pane = getContentPane();
			pane.setLayout(new GridLayout(3, 3));
			
			//Add things to the pane in the order you want them to appear (left to right, top to bottom)
			pane.add(one);
			pane.add(two);
			pane.add(three);
			pane.add(four);
			pane.add(five);
			pane.add(six);
			pane.add(seven);
			pane.add(eight);
			pane.add(nine);
	        fileMenu.add(setupAction);
			setSize(WIDTH, HEIGHT);
			setVisible(true);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		
		private class OneButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Sound.play(Sound.one);
			}
		}
		private class TwoButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Sound.play(Sound.two);
			}
		}
		private class ThreeButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Sound.play(Sound.three);
			}
		}
		private class FourButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Sound.play(Sound.four);
			}
		}
		private class FiveButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Sound.play(Sound.five);
			}
		}
		private class SixButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{				
				Sound.play(Sound.six);
			}
		}
		private class SevenButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Sound.play(Sound.seven);
			}
		}
		private class EightButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Sound.play(Sound.eight);
			}
		}
		private class NineButtonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Sound.play(Sound.nine);
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
			Gui rectObj = new Gui();
		}
		
		private class setupHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Setup.main(null);
			}
		}
		
	public static synchronized void playSound(final String url) {
		  new Thread(new Runnable() {
		  // The wrapper thread is unnecessary, unless it blocks on the
		  // Clip finishing; see comments.
		    public void run() {
		      try {
		        Clip clip = AudioSystem.getClip();
		        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
		          Main.class.getResourceAsStream("/" + url));
		        clip.open(inputStream);
		        clip.start(); 
		      } catch (Exception e) {
		        System.err.println(e.getMessage());
		      }
		    }
		  }).start();
		}}



