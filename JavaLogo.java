import java.awt.*;
import java.awt.event.*;
 
public class JavaLogo extends Frame 
{ 
       private String message = "Sakura Tea House";
       public JavaLogo ()
 
        {
 
           setTitle( "A Warm Welcoming" );
           setSize( 300,200 ); 
           setVisible( true );
 


               addWindowListener(
                      new WindowAdapter()
 
                      { public void windowClosing( WindowEvent e )

                               { System.exit( 0 );
                               }
 
                       }

                );
        }

 
 
        public static void main ( String [] args )
 
        { 
                JavaLogo me = new JavaLogo(); 
        }
 
 
 
        public void paint ( Graphics g ) 
        {
 
                g.setColor( Color.PINK );
 
                g.drawRect( 30, 40, 240, 130 );
                g.fillRect( 30, 40, 240, 130 );
 
                g.setColor( Color.WHITE );
 
                g.setFont( new Font( "ROMAN_BASELINE", Font.ITALIC, 24 ) );
 
                g.drawString( message, 50, 110);
 
                g.setColor( Color.GRAY );

                g.drawOval( 40, 30, 40, 50 );

                g.fillOval( 40, 30, 40, 50 ); 
                g.setColor( Color.GRAY ); 
                g.drawOval( 220, 140, 40, 50 );

               g.fillOval( 220, 140, 40, 50 );
       }
 
 }
