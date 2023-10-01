package splashjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class SplashJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome to our game!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        try {
            frame.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("SplashImage.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        frame.setVisible(true);
        

         
      
    }
}