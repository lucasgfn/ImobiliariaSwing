/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import controller.CasaController;
import controller.ClienteController;
import model.Casa;
import model.Cliente;
import view.MenuView;

/**
 *
 * @author lucas
 */
public class Main {
    
    public static void main(String[] args) {
        
        
      menu();

    }
    
    
    static void menu(){
         new MenuView().setVisible(true);
        
    }
    
   
    
}
