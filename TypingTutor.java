package example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.JTextArea;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;

//Start of TypingTutor Class
public class TypingTutor {
	//Create frame
	private JFrame frmTypingTutor;

	/**
	 * Launch the application.
	 */
	//Start of main method
	public static void main(String[] args) {
		//EventQueue will run later when the method is called
		EventQueue.invokeLater(new Runnable() {
			//Start of run method
			public void run() {
				try {
					//Create an instance of keyboard class
					TypingTutor window = new TypingTutor();
					
					//set window visibility to true
					window.frmTypingTutor.setVisible(true);
				} catch (Exception e) {
					//Tracks error in stack
					e.printStackTrace();
				}
			}
		});
	}//End of main method

	/**
	 * Create the application.
	 */
	
	//Start of constructor
	public TypingTutor() {
		//Calls initialize method
		initialize();
	}//End of constructor

	
	/**
	 * Initialize the contents of the frame.
	 */
	//Start of initialize method
	private void initialize() {
		//Create new frame
		frmTypingTutor = new JFrame();
		//Set the name of the frame
		frmTypingTutor.setTitle("Typing Tutor");
		//Set dimensions of the frame
		frmTypingTutor.setBounds(100, 100, 762, 620);
		//Exit on close
		frmTypingTutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set layout
		frmTypingTutor.getContentPane().setLayout(null);

		//Create a JLabel
		JLabel intructions = new JLabel("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed. ");
		//Set font for JLabel
		intructions.setFont(new Font("Tahoma", Font.BOLD, 11));
		//Set dimensions for JLabel
		intructions.setBounds(20, 11, 606, 42);
		//Add JLabel to frame
		frmTypingTutor.getContentPane().add(intructions);
		
		//Create second JLabel
		JLabel note = new JLabel("Note: clicking the buttons with your mouse will not perform any action.");
		//Set font and size for JLabel
		note.setFont(new Font("Tahoma", Font.BOLD, 11));
		//Set dimensions for JLabel
		note.setBounds(20, 40, 539, 27);
		//Add JLabel to frame
		frmTypingTutor.getContentPane().add(note);
		
		/*Creates a series of buttons on the keyboard
		 *Sets the dimensions 
		 *Adds the button to the frame*/
		
		//Create a button 
		final JButton oneButton = new JButton("1");
		//Set the size of button
		oneButton.setBounds(67, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(oneButton);
		
		//Create a button 
		final JButton twoButton = new JButton("2");
		//Set the size of button
		twoButton.setBounds(113, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(twoButton);
		
		//Create a button
		final JButton fourButton = new JButton("4");
		//Set the size of button
		fourButton.setBounds(207, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(fourButton);
		
		//Create a button
		final JButton fiveButton = new JButton("5");
		//Set the size of button
		fiveButton.setBounds(254, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(fiveButton);
		
		//Create a button
		final JButton sixButton = new JButton("6");
		//Set the size of button
		sixButton.setBounds(300, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(sixButton);
		
		//Create a button
		final JButton sevenButton = new JButton("7");
		//Set the size of button
		sevenButton.setBounds(346, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(sevenButton);
		
		//Create a button
		final JButton eightButton = new JButton("8");
		//Set the size of button
		eightButton.setBounds(392, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(eightButton);
		
		//Create a button
		final JButton nineButton = new JButton("9");
		//Set the size of button
		nineButton.setBounds(438, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(nineButton);
		
		//Create a button
		final JButton zeroButton = new JButton("0");
		//Set the size of button
		zeroButton.setBounds(483, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(zeroButton);
		
		//Create a button
		final JButton dashButton = new JButton("-");
		//Set the size of button
		dashButton.setBounds(528, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(dashButton);
		
		//Create a button
		final JButton plusButton = new JButton("+");
		//Set the size of the button
		plusButton.setBounds(574, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(plusButton);
		
		//Create a button
		final JButton backspaceBtn = new JButton("Backspace");
		//Set the size of the button
		backspaceBtn.setBounds(618, 342, 120, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(backspaceBtn);
		
		//Create a button
		final JButton btnTab = new JButton("Tab");
		//Set the size of the button
		btnTab.setBounds(20, 389, 71, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(btnTab);
		
		//Create a button
		final JButton btnQ = new JButton("Q");
		//Set the size of the button
		btnQ.setBounds(90, 389, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(btnQ);
		
		//Create a button
		final JButton btnW = new JButton("W");
		//Set the size of the button
		btnW.setBounds(136, 389, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(btnW);
		
		//Create a button
		final JButton btnE = new JButton("E");
		//Set the size of the button
		btnE.setBounds(183, 389, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(btnE);
		
		//Create a button
		final JButton btnR = new JButton("R");
		//Set the size of the button
		btnR.setBounds(229, 389, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(btnR);
		
		//Create a button
		final JButton btnT = new JButton("T");
		//Set the size of the button
		btnT.setBounds(275, 389, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(btnT);
		
		//Create a button
		final JButton btnY = new JButton("Y");
		//Set the size of the button
		btnY.setBounds(322, 389, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnY);
		
		//Create a button
		final JButton btnU = new JButton("U");
		//Set the size of button
		btnU.setBounds(369, 389, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnU);
		
		//Create a button
		final JButton btnI = new JButton("I");
		//Set the size of button
		btnI.setBounds(416, 389, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnI);
		
		//Create a button
		final JButton btnO = new JButton("O");
		//Set the size of button
		btnO.setBounds(461, 389, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnO);
		
		//Create a button
		final JButton btnP = new JButton("P");
		//Set the size of the button
		btnP.setBounds(506, 389, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnP);
		
		//Create a button
		final JButton leftBracket = new JButton("[");
		//Set the size of the button
		leftBracket.setBounds(552, 389, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(leftBracket);
		
		//Create a button
		final JButton rightBracket = new JButton("]");
		//Set the size of button
		rightBracket.setBounds(597, 389, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(rightBracket);
		
		//Create a button
		final JButton backslash = new JButton("\\");
		//Set the size of button
		backslash.setBounds(643, 389, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(backslash);
		
		//Create a button
		final JButton btnCaps = new JButton("Caps");
		//Set the size of button
		btnCaps.setBounds(20, 435, 71, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnCaps);
		
		//Create a button
		final JButton btnA = new JButton("A");
		//Set the size of button
		btnA.setBounds(90, 435, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnA);
		
		//Create a button
		final JButton btnS = new JButton("S");
		//Set the size of button
		btnS.setBounds(136, 435, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnS);
		
		//Create a button
		final JButton btnD = new JButton("D");
		//Set the size of button
		btnD.setBounds(183, 436, 47, 47);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnD);
		
		//Create a button
		final JButton btnF = new JButton("F");
		//Set the size of button
		btnF.setBounds(229, 436, 47, 47);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnF);
		
		//Create a button
		final JButton btnG = new JButton("G");
		//Set the size of button
		btnG.setBounds(275, 435, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnG);
		
		//Create a button
		final JButton btnH = new JButton("H");
		//Set the size of button
		btnH.setBounds(322, 435, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnH);
		
		//Create a button
		final JButton btnJ = new JButton("J");
		//Set the size of button
		btnJ.setBounds(369, 436, 47, 47);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnJ);
		
		//Create a button
		final JButton btnK = new JButton("K");
		//Set the size of button
		btnK.setBounds(416, 435, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnK);
		
		//Create a button
		final JButton btnL = new JButton("L");
		//Set the size of button
		btnL.setBounds(461, 435, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnL);
		
		//Create a button
		final JButton colonBtn = new JButton(":");
		//Set the size of button
		colonBtn.setBounds(506, 435, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(colonBtn);
		
		//Create a button
		final JButton quote = new JButton("\"");
		//Set the size of button
		quote.setBounds(552, 435, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(quote);
		
		//Create a button
		final JButton btnEnter = new JButton("Enter");
		//Set the size of button
		btnEnter.setBounds(597, 435, 93, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnEnter);
		
		//Create a button
		final JButton btnShift = new JButton("Shift");
		//Set the size of button
		btnShift.setBounds(20, 481, 94, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnShift);
		
		//Create a button
		final JButton btnZ = new JButton("Z");
		//Set the size of button
		btnZ.setBounds(113, 481, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnZ);
		
		//Create a button
		final JButton btnX = new JButton("X");
		//Set the size of button
		btnX.setBounds(160, 481, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnX);
		
		//Create a button
		final JButton btnC = new JButton("C");
		//Set the size of button
		btnC.setBounds(207, 481, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnC);
		
		//Create a button
		final JButton btnV = new JButton("V");
		//Set the size of button
		btnV.setBounds(254, 481, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnV);
		
		//Create a button
		final JButton btnB = new JButton("B");
		//Set the size of button
		btnB.setBounds(300, 481, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnB);
		
		//Create a button
		final JButton btnN = new JButton("N");
		//Set the size of button
		btnN.setBounds(346, 481, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnN);
		
		//Create a button
		final JButton btnM = new JButton("M");
		//Set the size of button
		btnM.setBounds(392, 481, 47, 48);
		//Add the button to the frame
		frmTypingTutor.getContentPane().add(btnM);
		
		//Create a button
		final JButton comma = new JButton(",");
		//Set the size of button
		comma.setBounds(438, 481, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(comma);
		
		//Create a button
		final JButton period = new JButton(".");
		//Set the size of button
		period.setBounds(483, 481, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(period);
		
		//Create a button
		final JButton question = new JButton("?");
		//Set the size of button
		question.setBounds(528, 481, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(question);
		
		//Create a button
		final JButton up = new JButton("^");
		//Set the size of button
		up.setBounds(597, 481, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(up);
		
		//Create a button
		final JButton down = new JButton("v");
		//Set the size of button
		down.setBounds(597, 527, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(down);
		
		//Create a button
		final JButton right = new JButton(">");
		//Set the size of button
		right.setBounds(643, 527, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(right);
		
		//Create a button
		final JButton left = new JButton("<");
		//Set the size of button
		left.setBounds(552, 527, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(left);
		
		//Create a button
		final JButton spaceBar = new JButton("");
		//Set the size of button
		spaceBar.setBounds(229, 527, 279, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(spaceBar);
		
		//Create a button
		final JButton tildaBtn = new JButton("~");
		//Set the size of button
		tildaBtn.setBounds(20, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(tildaBtn);
		
		//Create a button
		final JButton threeButton = new JButton("3");
		//Set the size of button
		threeButton.setBounds(160, 342, 47, 48);
		//Add button to the frame
		frmTypingTutor.getContentPane().add(threeButton);
		
		//Create textArea
		JTextArea textArea = new JTextArea();
		//Add keylistener to the textArea
		textArea.addKeyListener(new KeyAdapter() {
			//Get the default colour of keyboard keys
			Color originalColor = threeButton.getBackground();
			//Keypressed method that handles the key color change when pressed
			public void keyPressed(KeyEvent e) {
				//Get the key code
				int keyCode = e.getKeyCode();
				//Switch case statement for handling keys pressed
				switch(keyCode){
					//Check for the zero key
				case KeyEvent.VK_0:
					//Change the key color background 
					zeroButton.setBackground(Color.YELLOW);
					break;
					//Check for the one key
				case KeyEvent.VK_1:
					//Change the key color background
					oneButton.setBackground(Color.YELLOW);
					break;
					//Check for the two key
				case KeyEvent.VK_2:
					//Change the key color background
					twoButton.setBackground(Color.YELLOW);
					break;
					//Check for the three key
				case KeyEvent.VK_3:
					//Change the key color background
					threeButton.setBackground(Color.YELLOW);
					break;
					//Check for the four key
				case KeyEvent.VK_4:
					//Change the key color background
					fourButton.setBackground(Color.YELLOW);
					break;
					//Check for the five key
				case KeyEvent.VK_5:
					//Change the key color background
					fiveButton.setBackground(Color.YELLOW);
					break;
					//Check for the six key
				case KeyEvent.VK_6:
					//Change the key color background
					sixButton.setBackground(Color.YELLOW);
					break;	
					//Check for the seven key
				case KeyEvent.VK_7:
					//Change the key color background
					sevenButton.setBackground(Color.YELLOW);
					break;
					//Check for the seven key
				case KeyEvent.VK_8:
					//Change the key color background
					eightButton.setBackground(Color.YELLOW);
					break;
					//Check for the nine key
				case KeyEvent.VK_9:
					//Change the key color background
					nineButton.setBackground(Color.YELLOW);
					break;
					//Check for the A key
				case KeyEvent.VK_A:
					//Change the key color background
					btnA.setBackground(Color.YELLOW);
					break;
					//Check for the B key
				case KeyEvent.VK_B:
					//Change the key color background
					btnB.setBackground(Color.YELLOW);
					break;
					//Check for the C key
				case KeyEvent.VK_C:
					//Change the key color background
					btnC.setBackground(Color.YELLOW);
					break;
					//Check for the D key
				case KeyEvent.VK_D:
					//Change the key color background
					btnD.setBackground(Color.YELLOW);
					break;
					//Check for the E key
				case KeyEvent.VK_E:
					//Change the key color background
					btnE.setBackground(Color.YELLOW);
					break;
					//Check for the F key
				case KeyEvent.VK_F:
					//Change the key color background
					btnF.setBackground(Color.YELLOW);
					break;
					//Check for the G key
				case KeyEvent.VK_G:
					//Change the key color background
					btnG.setBackground(Color.YELLOW);
					break;
					//Check for the H key
				case KeyEvent.VK_H:
					//Change the key color background
					btnH.setBackground(Color.YELLOW);
					break;
					//Check for the I key
				case KeyEvent.VK_I:
					//Change the key color background
					btnI.setBackground(Color.YELLOW);
					break;
					//Check for the J key
				case KeyEvent.VK_J:
					//Change the key color background
					btnJ.setBackground(Color.YELLOW);
					break;
					//Check for the K key
				case KeyEvent.VK_K:
					//Change the key color background
					btnK.setBackground(Color.YELLOW);
					break;
					//Check for the L key
				case KeyEvent.VK_L:
					//Change the key color background
					btnL.setBackground(Color.YELLOW);
					break;
					//Check for the M key
				case KeyEvent.VK_M:
					//Change the key color background
					btnM.setBackground(Color.YELLOW);
					break;
					//Check for the N key
				case KeyEvent.VK_N:
					//Change the key color background
					btnN.setBackground(Color.YELLOW);
					break;
					//Check for the O key
				case KeyEvent.VK_O:
					//Change the key color background
					btnO.setBackground(Color.YELLOW);
					break;
					//Check for the P key
				case KeyEvent.VK_P:
					//Change the key color background
					btnP.setBackground(Color.YELLOW);
					break;
					//Check for the Q key
				case KeyEvent.VK_Q:
					//Change the key color background
					btnQ.setBackground(Color.YELLOW);
					break;
					//Check for the R key
				case KeyEvent.VK_R:
					//Change the key color background
					btnR.setBackground(Color.YELLOW);
					break;
					//Check for the S key
				case KeyEvent.VK_S:
					//Change the key color background
					btnS.setBackground(Color.YELLOW);
					break;
					//Check for the T key
				case KeyEvent.VK_T:
					//Change the key color background
					btnT.setBackground(Color.YELLOW);
					break;
					//Check for the U key
				case KeyEvent.VK_U:
					//Change the key color background
					btnU.setBackground(Color.YELLOW);
					break;
					//Check for the V key
				case KeyEvent.VK_V:
					//Change the key color background
					btnV.setBackground(Color.YELLOW);
					break;
					//Check for the W key
				case KeyEvent.VK_W:
					//Change the key color background
					btnW.setBackground(Color.YELLOW);
					break;
					//Check for the X key
				case KeyEvent.VK_X:
					//Change the key color background
					btnX.setBackground(Color.YELLOW);
					break;
					//Check for the Y key
				case KeyEvent.VK_Y:
					//Change the key color background
					btnY.setBackground(Color.YELLOW);
					break;
					//Check for the Z key
				case KeyEvent.VK_Z:
					//Change the key color background
					btnZ.setBackground(Color.YELLOW);
					break;
					//Check for the Equals/Plus key
				case KeyEvent.VK_EQUALS:
					//Change the key color background
					plusButton.setBackground(Color.YELLOW);
					break;
					//Check for the Minus key
				case KeyEvent.VK_MINUS:
					//Change the key color background
					dashButton.setBackground(Color.YELLOW);
					break;
					//Check for the TAB key
				case KeyEvent.VK_TAB:
					//Change the key color background
					btnTab.setBackground(Color.YELLOW);
					break;
					//Check for the Shift key
				case KeyEvent.VK_SHIFT:
					//Change the key color background
					btnShift.setBackground(Color.YELLOW);
					break;
					//Check for the Enter key
				case KeyEvent.VK_ENTER:
					//Change the key color background
					btnEnter.setBackground(Color.YELLOW);
					break;
					//Check for the CAPS key
				case KeyEvent.VK_CAPS_LOCK:
					//Change the key color background
					btnCaps.setBackground(Color.YELLOW);
					break;
					//Check for the Backspace key
				case KeyEvent.VK_BACK_SPACE:
					//Change the key color background
					backspaceBtn.setBackground(Color.YELLOW);
					break;
					//Check for the Colon/Semicolon key
				case KeyEvent.VK_SEMICOLON:
					//Change the key color background
					colonBtn.setBackground(Color.YELLOW);
					break;
					//Check for the backslash key
				case KeyEvent.VK_BACK_SLASH:
					//Change the key color background
					backslash.setBackground(Color.YELLOW);
					break;
					//Check for the open bracket key
				case KeyEvent.VK_OPEN_BRACKET:
					//Change the key color background
					leftBracket.setBackground(Color.YELLOW);
					break;
					//Check for the close bracket key
				case KeyEvent.VK_CLOSE_BRACKET:
					//Change the key color background
					rightBracket.setBackground(Color.YELLOW);
					break;
					//Check for the comma key
				case KeyEvent.VK_COMMA:
					//Change the key color background
					comma.setBackground(Color.YELLOW);
					break;
					//Check for the quotation key
				case KeyEvent.VK_QUOTE:
					//Change the key color background
					quote.setBackground(Color.YELLOW);
					break;
					//Check for the period key
				case KeyEvent.VK_PERIOD:
					//Change the key color background
					period.setBackground(Color.YELLOW);
					break;
					//Check for the forward slash key
				case KeyEvent.VK_SLASH:
					//Change the key color background
					question.setBackground(Color.YELLOW);
					break;
					//Check for the space bar key
				case KeyEvent.VK_SPACE:
					//Change the key color background
					spaceBar.setBackground(Color.YELLOW);
					break;
					//Check for the tilda/back quote key
				case KeyEvent.VK_BACK_QUOTE:
					//Change the key color background
					tildaBtn.setBackground(Color.YELLOW);
					break;
					//Check for the up arrow key
				case KeyEvent.VK_UP:
					//Change the key color background
					up.setBackground(Color.YELLOW);
					break;
					//Check for the down arrow key
				case KeyEvent.VK_DOWN:
					//Change the key color background
					down.setBackground(Color.YELLOW);
					break;
					//Check for the left arrow key
				case KeyEvent.VK_LEFT:
					//Change the key color background
					left.setBackground(Color.YELLOW);
					break;
					//Check for the right arrow key
				case KeyEvent.VK_RIGHT:
					//Change the key color background
					right.setBackground(Color.YELLOW);
					break;
				}
			}
			//Keyreleased method that handles color change of keys
			public void keyReleased(KeyEvent e) {
				//Get keycode
				int keyCode = e.getKeyCode();
				//Switch case statement that handles the key pressed
				switch(keyCode){
					//Check for the zero key
				case KeyEvent.VK_0:
					//Change the key color to original background color
					zeroButton.setBackground(originalColor);
					break;			
					//Check for the one key
				case KeyEvent.VK_1:
					//Change the key color to original background color
					oneButton.setBackground(originalColor);
					break;
					//Check for the two key
				case KeyEvent.VK_2:
					//Change the key color to original background color
					twoButton.setBackground(originalColor);
					break;
					//Check for the three key
				case KeyEvent.VK_3:
					//Change the key color to original background color
					threeButton.setBackground(originalColor);
					break;
					//Check for the four key
				case KeyEvent.VK_4:
					//Change the key color to original background color
					fourButton.setBackground(originalColor);
					break;
					//Check for the five key
				case KeyEvent.VK_5:
					//Change the key color to original background color
					fiveButton.setBackground(originalColor);
					break;
					//Check for the six key
				case KeyEvent.VK_6:
					//Change the key color to original background color
					sixButton.setBackground(originalColor);
					break;	
					//Check for the seven key
				case KeyEvent.VK_7:
					//Change the key color to original background color
					sevenButton.setBackground(originalColor);
					break;
					//Check for the eight key
				case KeyEvent.VK_8:
					//Change the key color to original background color
					eightButton.setBackground(originalColor);
					break;
					//Check for the nine key
				case KeyEvent.VK_9:
					//Change the key color to original background color
					nineButton.setBackground(originalColor);
					break;
					//Check for the A key
				case KeyEvent.VK_A:
					//Change the key color to original background color
					btnA.setBackground(originalColor);
					break;	
					//Check for the B key
				case KeyEvent.VK_B:	
					//Change the key color to original background color
					btnB.setBackground(originalColor);
					break;
					//Check for the C key
				case KeyEvent.VK_C:
					//Change the key color to original background color
					btnC.setBackground(originalColor);
					break;
					//Check for the D key
				case KeyEvent.VK_D:
					//Change the key color to original background color
					btnD.setBackground(originalColor);
					break;
					//Check for the E key
				case KeyEvent.VK_E:
					//Change the key color to original background color
					btnE.setBackground(originalColor);
					break;
					//Check for the F key
				case KeyEvent.VK_F:
					//Change the key color to original background color
					btnF.setBackground(originalColor);
					break;
					//Check for the G key
				case KeyEvent.VK_G:
					//Change the key color to original background color
					btnG.setBackground(originalColor);
					break;
					//Check for the H key
				case KeyEvent.VK_H:
					//Change the key color to original background color
					btnH.setBackground(originalColor);
					break;
					//Check for the I key
				case KeyEvent.VK_I:
					//Change the key color to original background color
					btnI.setBackground(originalColor);
					break;
					//Check for the J key
				case KeyEvent.VK_J:
					//Change the key color to original background color
					btnJ.setBackground(originalColor);
					break;
					//Check for the K key
				case KeyEvent.VK_K:
					//Change the key color to original background color
					btnK.setBackground(originalColor);
					break;
					//Check for the L key
				case KeyEvent.VK_L:
					//Change the key color to original background color
					btnL.setBackground(originalColor);
					break;
					//Check for the M key
				case KeyEvent.VK_M:
					//Change the key color to original background color
					btnM.setBackground(originalColor);
					break;
					//Check for the N key
				case KeyEvent.VK_N:
					//Change the key color to original background color
					btnN.setBackground(originalColor);
					break;
					//Check for the O key
				case KeyEvent.VK_O:
					//Change the key color to original background color
					btnO.setBackground(originalColor);
					break;
					//Check for the P key
				case KeyEvent.VK_P:
					//Change the key color to original background color
					btnP.setBackground(originalColor);
					break;
					//Check for the Q key
				case KeyEvent.VK_Q:
					//Change the key color to original background color
					btnQ.setBackground(originalColor);
					break;
					//Check for the R key
				case KeyEvent.VK_R:
					//Change the key color to original background color
					btnR.setBackground(originalColor);
					break;
					//Check for the S key
				case KeyEvent.VK_S:
					//Change the key color to original background color
					btnS.setBackground(originalColor);
					break;
					//Check for the T key
				case KeyEvent.VK_T:
					//Change the key color to original background color
					btnT.setBackground(originalColor);
					break;
					//Check for the U key
				case KeyEvent.VK_U:
					//Change the key color to original background color
					btnU.setBackground(originalColor);
					break;
					//Check for the V key
				case KeyEvent.VK_V:
					//Change the key color to original background color
					btnV.setBackground(originalColor);
					break;
					//Check for the W key
				case KeyEvent.VK_W:
					//Change the key color to original background color
					btnW.setBackground(originalColor);
					break;
					//Check for the X key
				case KeyEvent.VK_X:
					//Change the key color to original background color
					btnX.setBackground(originalColor);
					break;
					//Check for the Y key
				case KeyEvent.VK_Y:
					//Change the key color to original background color
					btnY.setBackground(originalColor);
					break;
					//Check for the Z key
				case KeyEvent.VK_Z:
					//Change the key color to original background color
					btnZ.setBackground(originalColor);
					break;
					//Check for the Equals/Plus key
				case KeyEvent.VK_EQUALS:
					//Change the key color to original background color
					plusButton.setBackground(originalColor);
					break;
					//Check for the Minus key
				case KeyEvent.VK_MINUS:
					//Change the key color to original background color
					dashButton.setBackground(originalColor);
					break;
					//Check for the Tab key
				case KeyEvent.VK_TAB:
					//Change the key color to original background color
					btnTab.setBackground(originalColor);
					break;
					//Check for the Shift key
				case KeyEvent.VK_SHIFT:
					//Change the key color to original background color
					btnShift.setBackground(originalColor);
					break;
					//Check for the Enter key
				case KeyEvent.VK_ENTER:
					//Change the key color to original background color
					btnEnter.setBackground(originalColor);
					break;
					//Check for the CAPS key
				case KeyEvent.VK_CAPS_LOCK:
					//Change the key color to original background color
					btnCaps.setBackground(originalColor);
					break;
					//Check for the Backspace key
				case KeyEvent.VK_BACK_SPACE:
					//Change the key color to original background color
					backspaceBtn.setBackground(originalColor);
					break;
					//Check for the Semicolon/Colon key
				case KeyEvent.VK_SEMICOLON:
					//Change the key color to original background color
					colonBtn.setBackground(originalColor);
					break;
					//Check for the backslash key
				case KeyEvent.VK_BACK_SLASH:
					//Change the key color to original background color
					backslash.setBackground(originalColor);
					break;
					//Check for the open bracket key
				case KeyEvent.VK_OPEN_BRACKET:
					//Change the key color to original background color
					leftBracket.setBackground(originalColor);
					break;
					//Check for the close bracket key
				case KeyEvent.VK_CLOSE_BRACKET:
					//Change the key color to original background color
					rightBracket.setBackground(originalColor);
					break;
					//Check for the Comma key
				case KeyEvent.VK_COMMA:
					//Change the key color to original background color
					comma.setBackground(originalColor);
					break;
					//Check for the quotation key
				case KeyEvent.VK_QUOTE:
					//Change the key color to original background color
					quote.setBackground(originalColor);
					break;
					//Check for the period key
				case KeyEvent.VK_PERIOD:
					//Change the key color to original background color
					period.setBackground(originalColor);
					break;
					//Check for the forward slash key
				case KeyEvent.VK_SLASH:
					//Change the key color to original background color
					question.setBackground(originalColor);
					break;
					//Check for the backspace key
				case KeyEvent.VK_SPACE:
					//Change the key color to original background color
					spaceBar.setBackground(originalColor);
					break;
					////Check for the back quote/ tilda key
				case KeyEvent.VK_BACK_QUOTE:
					//Change the key color to original background color
					tildaBtn.setBackground(originalColor);
					break;
					//Check for the up arrow key
				case KeyEvent.VK_UP:
					//Change the key color to original background color
					up.setBackground(originalColor);
					break;
					//Check for the down arrow key
				case KeyEvent.VK_DOWN:
					//Change the key color to original background color
					down.setBackground(originalColor);
					break;
					//Check for the left arrow key
				case KeyEvent.VK_LEFT:
					//Change the key color to original background color
					left.setBackground(originalColor);
					break;
					//Check for the right arrow key
				case KeyEvent.VK_RIGHT:
					//Change the key color to original background color
					right.setBackground(originalColor);
					break;
				}
			}
		});
		
		//Set Dimensions for textArea
		textArea.setBounds(20, 76, 716, 255);
		//Add textArea to frame
		frmTypingTutor.getContentPane().add(textArea);
		//Set row size
		textArea.setRows(20);
		//Set column size
		textArea.setColumns(86);
		//Create JLabel
		
	}//End of initialize method

}
