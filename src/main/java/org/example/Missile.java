package org.example;

public class Missile extends Sprite {
    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 2;

    public Missile(int x, int y) {
        super(x, y);

        initMissle();
    }

    private void initMissle() {
        loadImage("src/main/resources/missile.png");
        getImageDimensions();
    }
    public void move() {
        x += MISSILE_SPEED;
        if (x > BOARD_WIDTH) {
            visible = false;
        }
    }
}
