package main;

import GUI.*;

public class Main {
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
          new Login().setVisible(true);  
        });
    }
}
