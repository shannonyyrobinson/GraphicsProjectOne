package GraphicsRunner;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.YELLOW);

      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.BLACK);
      window.fillRect(350, 400, 100, 300);
      
      window.fillRect(250, 250, 75, 75);
      window.fillRect(450, 250, 75, 75);
      
      window.setColor(Color.DARK_GRAY);
      window.fillRect(150, 100, 500, 100);
      
      window.setColor(Color.GREEN);
      window.fillOval(180, 450, 150, 100);
      window.fillOval(480, 450, 150, 100);

   }
}