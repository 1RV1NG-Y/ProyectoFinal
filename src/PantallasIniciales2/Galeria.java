/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallasIniciales2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import proyectofinal.Login;


public class Galeria extends JFrame implements ActionListener{
    
    JButton prev,next,pausa,salir,despausa;
    JLabel imagen, descripcionG;   
    ImageIcon icono;
    int contador = 1;
    Clip clip;
  
    public Galeria(){
        this.setUndecorated(true);
         try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("src/musica.wav")));
            clip.start();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         setLayout(null);
         
         pausa = new JButton("pausar musica");
         pausa.setBounds(225,0,110,40);
         pausa.addActionListener(this);
         
         despausa = new JButton("reanudar musica");
         despausa.setBounds(335,0,120,40);
         despausa.addActionListener(this);
         
         salir = new JButton("X");
         salir.setBounds(680,0,35,35);
         salir.addActionListener(this);
         
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
         
         descripcionG = new JLabel();
         descripcionG.setBounds(280,515, 180, 70);
         
         descripcionG.setText("Habitacion sencilla");
         descripcionG.setFont(new Font("Verdana", Font.BOLD, 14));
         add(descripcionG);
         
         add(salir);
         add(pausa);
         add(despausa);
         add(prev);
         add(next);
         add(imagen);      
             
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == next){
            
            if(contador >=14){
            contador = 1;
            
            }else{
            contador++;
            }
            
        }
        
        if(e.getSource() == prev){
            
           if(contador <= 1){
               contador = 14;
           }else{
           contador--;
           }
           
        }
        
        icono = new ImageIcon("src/"+contador+".jpg"); //ruta imagenes
        imagen.setIcon(icono);
        
        
        switch(contador){
            case 1      : descripcionG.setText("Habitacion sencilla"); break;
            case 2      : descripcionG.setText("Habitacion doble"); break;
            case 3      : descripcionG.setText("Habitacion triple"); break;
            case 4      : descripcionG.setText("Piscina"); break;
            case 5      : descripcionG.setText("Spa"); break;
            case 6      : descripcionG.setText("Restaurante"); break;
            case 7      : descripcionG.setText("Restaurante afueras"); break;
            case 8,9    : descripcionG.setText("Buffet"); break;
            case 10,11  : descripcionG.setText("Bar"); break;
            case 12,13  : descripcionG.setText("Cancha"); break;
            case 14     : descripcionG.setText("Gimnasio"); break;
                    
        }
        
        if(e.getSource() == pausa){   
           clip.stop();
           
        }
        if(e.getSource() == despausa){   
           clip.start();
           
        }
        
        if(e.getSource() == salir){   
            
            
           clip.stop();
           clip.close();
           this.dispose();
        }
        
        
    }
   
    

}
