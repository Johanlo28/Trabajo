/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionum;

import javax.swing.JOptionPane;

/**
 *
 * @author Danna
 */
public class Ejercicionum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont; 
        int i=0;                                 
        int cant=1;   
        
        do{
            cont = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            for(i=1;i<=cont;i++){
             if (i%2==0) {
                JOptionPane.showMessageDialog(null,"El numero es: " + i); 
             }    
            }
            cant=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para reiniciar el programa o cualquier otro número para salir"));
        }while (cant==1);
        // TODO code application logic here
    }
    
}
