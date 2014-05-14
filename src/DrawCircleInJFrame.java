import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class DrawCircleInJFrame extends JFrame{
    public  Integer locX;
    public Integer locY;
    public Integer height;
    public Integer width;
public DrawCircleInJFrame(Integer x,Integer y, Integer h, Integer w){
 //Set JFrame title
 super("Draw A Circle In JFrame");

 //Set default close operation for JFrame
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 //Set JFrame size
 setSize(400,400);

 //Make JFrame visible
 setVisible(true);
    locX = x;
    locY = y;
    height = h;
    width = w;
}

public void paint(Graphics g){
 super.paint(g);
    
 g.drawOval(locX,locY,height,width);
 g.setColor(Color.GREEN);
 g.fillOval(locX,locY,height,width);
}



}

