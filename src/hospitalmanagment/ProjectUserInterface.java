package hospitalmanagment;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author gpatel
 */
public class ProjectUserInterface {

    

    void signUpUI() {
        JFrame mainFrame;
        JTextField nameInput, emailInput, passwordInput, confirmPasswordInput;
        JLabel nameLabel, emailLabel, passwordLabel, confirmPasswordLabel, signUpMessage;
        JButton signUp,openLogin;
        
        mainFrame = new JFrame("User Registration");

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(350, 100, 200, 30);
        nameInput = new JTextField("");
        nameInput.setBounds(400, 100, 200, 30);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(350, 150, 200, 30);
        emailInput = new JTextField("");
        emailInput.setBounds(400, 150, 200, 30);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(325, 200, 200, 30);
        passwordInput = new JTextField("");
        passwordInput.setBounds(400, 200, 200, 30);

        confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(275, 250, 200, 30);
        confirmPasswordInput = new JTextField("");
        confirmPasswordInput.setBounds(400, 250, 200, 30);

        signUpMessage = new JLabel("Thank you for registering with us click here to Login.");
        signUpMessage.setBounds(350,150, 400, 30);
        
        signUp = new JButton("SIGN UP");
        signUp.setBounds(400, 300, 200, 30);
        
        openLogin = new JButton("Login");
        openLogin.setBounds(400, 200, 200, 30);
        
        signUp.addActionListener((ActionEvent e) -> {
            mainFrame.getContentPane().removeAll();
            mainFrame.add(signUpMessage);
            mainFrame.add(openLogin);
            mainFrame.repaint();
            //  CALL SIGNUP FUCNTION
        });
        openLogin.addActionListener((ActionEvent e) ->{
            loginInUI();
            mainFrame.dispose();
        });
        mainFrame.add(nameLabel);
        mainFrame.add(nameInput);

        mainFrame.add(emailLabel);
        mainFrame.add(emailInput);

        mainFrame.add(passwordLabel);
        mainFrame.add(passwordInput);

        mainFrame.add(confirmPasswordLabel);
        mainFrame.add(confirmPasswordInput);

        mainFrame.add(signUp);

        mainFrame.getRootPane().setDefaultButton(signUp);
        mainFrame.setSize(1000, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setLocation(dim.width / 2 - mainFrame.getSize().width / 2, dim.height / 2 - mainFrame.getSize().height / 2);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    void loginInUI() {
        JFrame mainFrame;
        JTextField emailInput, passwordInput;
        JLabel emailLabel, passwordLabel;
        JButton login,openSignUp;

        mainFrame = new JFrame("Welcome to Hospital Management System");

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(350, 150, 200, 30);
        emailInput = new JTextField("");
        emailInput.setBounds(400, 150, 200, 30);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(325, 200, 200, 30);
        passwordInput = new JTextField("");
        passwordInput.setBounds(400, 200, 200, 30);

        login = new JButton("Login");
        login.setBounds(400,250, 200, 30);
        
        openSignUp = new JButton("SignUp");
        openSignUp.setBounds(400,300,200,30);
        
        login.addActionListener((ActionEvent e) -> {
            //  CALL LOGIN FUNCTION
            System.out.println("Login Done...!");
        });
        
        openSignUp.addActionListener((ActionEvent e) -> {
            signUpUI();
            mainFrame.dispose();
        });
        
        mainFrame.add(emailLabel);
        mainFrame.add(emailInput);

        mainFrame.add(passwordLabel);
        mainFrame.add(passwordInput);

        mainFrame.add(login);
        mainFrame.add(openSignUp);

        mainFrame.getRootPane().setDefaultButton(login);
        mainFrame.setSize(1000, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setLocation(dim.width / 2 - mainFrame.getSize().width / 2, dim.height / 2 - mainFrame.getSize().height / 2);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    };
}
