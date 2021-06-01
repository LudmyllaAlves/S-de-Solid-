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
public class Produto {
    private String nome;
    private int numeroIden;
    private int quantidade;
    
      public void descriçao(){
     nome = JOptionPane.showInputDialog("Digite um nome:");}
    
    
      public boolean disponiblilidade(){
      if(quantidade>=1){
          System.out.println("Compra disponivel");
      return true;}
      
      else{
          System.out.println("Escolha outro produtos");
          return false;
      }
      
 
 
 
}}
