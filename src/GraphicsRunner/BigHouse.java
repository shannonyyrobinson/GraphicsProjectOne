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
      window.fillRect(200, 100, 100, 200);
      
      window.fillRect(100, 210, 50, 50);
      window.fillRect(300, 210, 50, 50);
      
      window.setColor(Color.DARK_GRAY);
      window.fillRect(200, 250, 300, 100);
      

   }
}