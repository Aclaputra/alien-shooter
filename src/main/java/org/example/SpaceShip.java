package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class SpaceShip extends Sprite {
    private int dx;
    private int dy;
    private int x = 40;
    private int y = 60;
    private int w;
    private int h;
    private Image image;
    private ArrayList<Missile> missiles;

    public SpaceShip(int x, int y) {
        super(x, y);
        loadImage();

        initSpaceShip();
    }

    private void initSpaceShip() {
        missiles = new ArrayList<>();

        loadImage("src/main/resources/craft.png");
        getImageDimensions();
    }
    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/main/resources/craft.png");
        image = ii.getImage();

        w = image.getWidth(null);
        h = image.getHeight(null);
    }
    public void move() {
        x += dx;
        y += dy;
    }

    public ArrayList<Missile> getMissiles() {
        return missiles;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWidth() {
        return w;
    }
    public int getHeight() {
        return h;
    }
    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) fire();
        if (key == KeyEvent.VK_LEFT) dx = -2;
        if (key == KeyEvent.VK_RIGHT) dx = 2;
        if (key == KeyEvent.VK_UP) dy = -2;
        if (key == KeyEvent.VK_DOWN) dy = 2;

    }

    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) dx = 0;
        if (key == KeyEvent.VK_RIGHT) dx = 0;
        if (key == KeyEvent.VK_UP) dy = 0;
        if (key == KeyEvent.VK_DOWN) dy = 0;

    }

}
