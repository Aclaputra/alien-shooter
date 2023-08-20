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

        setTitle("Moving Sprite");
        setSize(400, 300);
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
