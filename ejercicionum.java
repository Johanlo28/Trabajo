/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Ambiente
 */
public class ejercicionum{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont; 
        int i=0;                                 
           
         
        cont = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        for(i=1;i<=cont;i++){
          if (i%2==0) {
            JOptionPane.showMessageDialog(null,"El numero es: " + i); 
          }    
      }
    }
  }      
    