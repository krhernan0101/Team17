import javax.swing.*;

import java.awt.event.*;

import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome to our game!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel IDpanel = new JPanel();
        JLabel IDlabel = new JLabel("Enter your team id: ");
        JTextField IDtxt = new JTextField(10);
        JButton enter = new JButton("Enter");
        IDpanel.add(IDlabel);
        IDpanel.add(IDtxt);
        IDpanel.add(enter);

        JPanel Namepanel = new JPanel();
        JLabel Namelabel = new JLabel("Enter your name: ");
        JTextField Nametxt = new JTextField(10);
        JButton enter1 = new JButton("Enter");
        Namepanel.add(Namelabel);
        Namepanel.add(Nametxt);
        Namepanel.add(enter1);
        

        frame.getContentPane().add(BorderLayout.CENTER, IDpanel);
        frame.setVisible(true);
        enter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("pressed!");
                IDpanel.setVisible(false);
                frame.getContentPane().add(BorderLayout.CENTER, Namepanel);
            }

         });
       /*  if(enter.getModel().isPressed())
        {
            
            frame.setVisible(false);
        }*/
    }
}