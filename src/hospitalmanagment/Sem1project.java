/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

/**
 *
 * @author gpatel
 */
public class Sem1project {

    public static void main(String[] args) {
        ConnectDatabase conDB = new ConnectDatabase();
        ProjectUserInterface ui = new ProjectUserInterface();
        ui.signUpUI();
    }
}