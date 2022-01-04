package Interface_Graphique;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container container = getContentPane();
    JLabel userLabel = new JLabel("login");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JLabel passwordLabel1 = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField passwordField1 = new JPasswordField();
    JButton loginButton = new JButton("Accueil");
    JButton enregistrement = new JButton("Enregistrer");
    JCheckBox showPassword = new JCheckBox("Show Password");
   
 
    Register() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
 
    }
 
    public void setLayoutManager() {
        container.setLayout(null);
    }
 
    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        passwordLabel1.setBounds(50, 270, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        passwordField1.setBounds(150, 270, 150, 30);
        showPassword.setBounds(150, 300, 150, 30);
        loginButton.setBounds(50, 350, 100, 30);
        enregistrement.setBounds(200, 350, 100, 30);
        passwordLabel2.setBounds(50, 400, 100, 30);
 
    }
 
    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(passwordLabel1);
        container.add(userTextField);
        container.add(passwordField);
        container.add(passwordField1);
        container.add(showPassword);
        container.add(loginButton);
        container.add(enregistrement);
    }
 
    public void addActionEvent() {
        loginButton.addActionListener(this);
        enregistrement.addActionListener(this);
        showPassword.addActionListener(this);
    }
    JLabel passwordLabel2 = new JLabel("PASSWORD");
 
	@SuppressWarnings("deprecation")
	@Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
             String pwdText;
             
             @SuppressWarnings("unused")
			String pwdText1;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            pwdText1 = passwordField.getText();
           
            if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Coding Part of RESET button
        if (passwordField.getText()!= passwordField1.getText()) {
           
            passwordField.setText("");
            passwordField1.setText("");
            //JOptionPane.showMessageDialog(passwordField.getText());
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
                passwordField1.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
                passwordField1.setEchoChar('*');
            }
 
 
        }
    }
 

 
public static void main(String[] a) {
    Register register = new Register();
    register .setTitle("Login Form");
    register .setVisible(true);
    register .setBounds(10, 10, 370, 600);
    register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    register.setResizable(false);


}}
