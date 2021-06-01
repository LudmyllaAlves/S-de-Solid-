/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import javax.swing.JOptionPane;

/**
 *
 * @author tatia
 */
public class Compra {
    
    private int quantidade;
    private double valorUnico = 150;
    private double total;
    
    
    
    
    


 public void valor(){
     quantidade =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")) ;
}
 public void calcular(){
     total = valorUnico * quantidade;
     System.out.println("Valor total:");
 
 }
 

      
 

 }


