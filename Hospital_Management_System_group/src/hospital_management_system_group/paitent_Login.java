/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system_group;
 
import hospital_management_system_group.shared.LoginDialog;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author NIAR Tech
 */
public class paitent_Login {
   public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("bob") && password.equals("secret")) {
            return true;
        }
        return false;
    }
   public void callToLoginDialog(){
        // TODO code application logic here
         final JFrame frame = new JFrame("JDialog Demo");
//        final JButton btnLogin = new JButton("Click to login");
// 
//        btnLogin.addActionListener(
//                new ActionListener(){
//                    public void actionPerformed(ActionEvent e) {
                        LoginDialog loginDlg = new LoginDialog(frame);
                        loginDlg.setVisible(true);
                        // if logon successfully
                        if(loginDlg.isSucceeded()){
//                            btnLogin.setText("Hi " + loginDlg.getUsername() + "!");
System.out.println("successfully logged in");


                        }
//                    }
//                });
 
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 100);
//        frame.setLayout(new FlowLayout());
//        frame.getContentPane().add(btnLogin);
//        frame.setVisible(true);
   }
}
