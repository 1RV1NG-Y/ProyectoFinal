/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallasIniciales2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Galeria extends JFrame implements ActionListener{
    
    JButton prev,next;
    JLabel imagen;   
    ImageIcon icono;
    int contador = 1;
  
    public Galeria(){
         
         
         setLayout(null);
         
         prev = new JButton("<");
         prev.setBounds(10,230,60,45);
         prev.addActionListener(this);
         
         imagen = new JLabel();
          icono = new ImageIcon("src/1.jpg");
         imagen.setIcon(icono);
         imagen.setBounds(0,-60, 730, 600);
         
         next = new JButton(">");
         next.setBounds(645, 230, 60, 45);
         next.addActionListener(this);
         
         add(prev);
         add(next);
         add(imagen);       
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == next){
            
            if(contador >=10){
            contador = 1;
            
            }else{
            contador++;
            }
            
        }
        
        if(e.getSource() == prev){
            
           if(contador <= 1){
               contador = 10;
           }else{
           contador--;
           }
           
        }
        
        icono = new ImageIcon("src/"+contador+".jpg");
        imagen.setIcon(icono);
        
    }
   
    

}
