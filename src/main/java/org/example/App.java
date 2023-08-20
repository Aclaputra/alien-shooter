package org.example;

import javax.swing.*;
import java.awt.EventQueue;
/**
 * Hello world!
 *
 */
public class App extends JFrame
{
    public App() {
        initUI();
    }

    private void initUI() {
        add(new Board());
        setResizable(false);
        pack();

        setTitle("Star Utility Timer");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String[] args )
    {
        EventQueue.invokeLater(() -> {
            App ex = new App();
            ex.setVisible(true);
        });
    }
}
