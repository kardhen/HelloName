import greenfoot.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Ludek extends Actor
{
    //private String odpowiedz = "";
     
    
    public void act() {
        String odpowiedz = "nieznajomy";
        String powitanie = "Cześć ";
        
        if(Greenfoot.mousePressed(this)){
            do {                            
                 odpowiedz = JOptionPane.showInputDialog(null,"Jak masz na imię?","Mam pytanie", JOptionPane.PLAIN_MESSAGE);  
            } while (odpowiedz.isEmpty());
        
            powitanie = powitanie + odpowiedz;
            setImage(new GreenfootImage(powitanie, 24, Color.RED, Color.BLACK));
            Greenfoot.stop();
        }
    }    
}
