package tankwars;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Bullet implements CollidableObject {
    private BufferedImage bulletImg;
    private BufferedImage explosion;

    @Override
    public boolean checkCollision() {
        return false;
    }

    @Override
    public Rectangle getRectangle() {
        return null;
    }
}
