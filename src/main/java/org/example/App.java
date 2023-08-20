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
        setSize(350, 325);
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main( String[] args )
    {
        EventQueue.invokeLater(() -> {
            App ex = new App();
            ex.setVisible(true);
        });
    }
}
