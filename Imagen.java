
package imagen;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Imagen {

   public static void main(String[] args) {
      try {

         File audioFile = new File("C:\\Users\\sebastian\\Downloads\\cr.wav");
         AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
         Clip clip = AudioSystem.getClip();
         clip.open(audioStream);

         clip.start();

         ImageIcon icono = new ImageIcon("C:\\Users\\sebastian\\Downloads\\cr7.jpg");
         JOptionPane.showMessageDialog(null,
               "<html><font size='25' color='blue'>*********************<br>********************* <br>TE AMO CULONA <br>BRRRRR <br>********************* <br>********************* </font></html>",
               "AMOR MIO", JOptionPane.INFORMATION_MESSAGE, icono);

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}