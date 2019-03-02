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

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      
      head(window);
      
      upperBody(window);
      
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      
      window.setColor(Color.BLACK);
      
      window.fillOval(350, 110, 20, 20);
      
      window.fillOval(250, 110, 20, 20);
      
      window.fillArc(300, 100, 100, 50, 30, 30);

   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(300, 100, 200, 200);
    
       window.setColor(Color.BLACK);
       window.drawLine(300, 100, 350, 150);
       window.drawLine(300, 100, 250, 50);
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(300, 100, 200, 200);
    
       window.setColor(Color.BLACK);
       window.drawLine(300, 100, 350, 150);
       window.drawLine(300, 100, 250, 50);

   }
}