
/* This Code Contains Main Frame which will take you to another window to fill in
 * certain details. The image set as Background of frame is not visible on jar file because
 * it is local to the System.
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	Image icon =new ImageIcon("Image.jpg").getImage();
	Image bg;
    JButton yes, close;
    JPanel panel;
	
	MyFrame(){
		this.setTitle("ASTRO PREDICTION");
		bg = new ImageIcon("i_low.png").getImage();
		this.setIconImage(icon);
		this.setVisible(true);
	    this.setSize(500,500);
	    this.getContentPane().setBackground(new Color(140,82,169));
	    this.setLocationRelativeTo(null);
	    
	    label = new JLabel();
	    label.setAlignmentX(CENTER_ALIGNMENT);
	    label.setBounds(100,100,200,200);
	    label.setFont(new Font("Monospaced",Font.BOLD,20));
	    label.setForeground(new Color(140,130,140));
	    label.setText(" Predict Your SunSign Traits!!");
	    this.add(label);
	    
	    panel = new JPanel();
	    panel.setAlignmentX(BOTTOM_ALIGNMENT);
	    this.add(panel);
	    
	    yes= new JButton("YES , SURE !");
	    yes.setBounds(400,400,40,40);
	    yes.setBackground(new Color(140,130,140));
	    yes.setFocusable(false);
	    yes.addActionListener(this);
	    panel.add(yes);
	    
	    close = new JButton("No ! NOT INTRESTED ");
	    close.addActionListener(this);
	    close.setBounds(480,400,40, 40);
	    close.setBackground(new Color(140,130,140));
	    close.setFocusable(false);
	    panel.add(close);
	    
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout());
	    this.setResizable(false);
	    
		
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(bg, 0, 0,this);
	   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    if(e.getSource() == yes) {
	     new intro();
	    	this.dispose();
	    }
		
	    else
	    	if(e.getSource() == close) {
	    		System.exit(0);
	    	}
	}
	
	

}
