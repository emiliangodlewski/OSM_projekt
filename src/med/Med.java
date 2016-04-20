/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package med;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Med
{
    private static JMenuBar setMenu()
    {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuApplication = new JMenu("Aplikacja...");
        menuBar.add(menuApplication);
        JMenuItem menuItemClose = new JMenuItem("Zamknij");
        menuItemClose.setMnemonic(KeyEvent.VK_Q);
        menuItemClose.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        menuItemClose.setToolTipText("Zamknięcie aplikacji");
        menuItemClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }

        });
        menuApplication.add(menuItemClose);

        return menuBar;
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Rejestarcja wyników badań wirusologicznych");
        frame.setSize(800, 400);
        JPanel jpanel = new JPanel();
        frame.add(jpanel);
        frame.setJMenuBar(setMenu());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
