package week5_6;


import java.awt.*;
import java.util.Random;

abstract class Shape  {
    protected Color color = new Color((new Random()).nextInt(255),(new Random()).nextInt(255),(new Random()).nextInt(255));

    public void setColor(Color c) {
        color = c;
    }
    public Color getColor() {
        return color;
    }

    public abstract void Update();

}