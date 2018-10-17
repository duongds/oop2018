package week5_6;


import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {
    int x=5,y=5;
    int angleX=1, angleY= 1;
    int speed =2;
    private void move{
        if(x+angleX < 0)
        {
            angleX=speed;
        }
        else if( x+angleX>getWidth()-50){
            angleX= - speed;
        }
        else if(y+angleY<0){
            angleY=speed;
        }
        else if ( y + angleX> getHeight()-50){
            angleY= - speed;
        }
        x= x+ angleX;
        y= y+ angleY;
    }

    public void paint (Graphics g)

    {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.drawRect( x,y,50,50);
        g.fillRect(x,y,50,50);

    }

}
