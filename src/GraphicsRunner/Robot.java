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

      window.fillOval(300, 50, 200, 125);
      
      window.setColor(Color.BLACK);
      
      window.fillOval(450, 100, 20, 20);
      
      window.fillOval(350, 100, 20, 20);
      
      window.fillOval(400, 125, 10, 10);
      
      window.setColor(Color.RED);
      
      window.drawArc(355, 60, 100, 100, 220, 100);

   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(300, 175, 200, 150);
    
       window.setColor(Color.BLACK);
       window.drawLine(200, 150, 300, 200);
       window.drawLine(500, 200, 600, 150);
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(300, 350, 200, 100);
    
       window.setColor(Color.BLACK);
       window.drawLine(200, 500, 300, 425);
       window.drawLine(500, 425, 600, 500);

   }
}