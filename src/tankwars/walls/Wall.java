package tankwars.walls;

import tankwars.CollidableObject;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Wall implements CollidableObject {

    public Wall(){};

    @Override
    public void checkCollision(Class c) { }

    @Override
    public Rectangle getRectangle() {
        return null;
    }

    public static void setImg(BufferedImage wallImg){ }

    public void drawImage(Graphics2D buffer){ }
}
