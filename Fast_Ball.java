import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fast_Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;

    Fast_Ball(int x, int y, int width, int height) {

        super(x,y,width,height);
        random = new Random();

        int randomx = random.nextInt(2);
        if(randomx == 0) {
            randomx--;
        }
        setXDirection(randomx*6);

        int randomy = random.nextInt(2);
        if(randomy == 0) {
            randomy--;
        }
        setYDirection(randomy*6);

    }

    public void setXDirection(int x) {
        xVelocity = x;
    }

    public void setYDirection(int y) {
        yVelocity = y;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }

}
