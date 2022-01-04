package Interface_Graphique;

import javax.swing.JFrame;

public class Login {
	public static void main(String[] a) {
	    LoginFrame frame = new LoginFrame();
	    frame.setTitle("Login Form");
	    frame.setVisible(true);
	    frame.setBounds(10, 10, 370, 600);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setResizable(false);

	

Register register = new Register();
register .setTitle("Login Form");
register .setVisible(true);
register .setBounds(10, 10, 370, 600);
register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
register.setResizable(false);

	 
}}