import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenster extends JFrame implements KeyListener{
	// Variablen
	private Point Groesse = new Point(887,340);
	
	//Konstruktor
	public Fenster() {
		setTitle("PacMan");				// Titel setzten
		addKeyListener(this);			// F�ge die Tastenerkennung hinzu
		setSize(887,340);				// Gr��e festlegen
    	setVisible(true);				// sichtbar machen
	}
	
	//auf Tastendr�cke reagieren
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();	// Tastencode auslesen
		
		//Tastencode vergleichen und die Bewegungsrichtung festlegen
		//Bewegung: 1 = rechts; 2 = links; 3 = oben; 4 = unten
	    switch(keyCode) {
	    	case KeyEvent.VK_RIGHT: //Vergleich 
	    		break; //Fertig - nicht mehr weitermachen
	        case KeyEvent.VK_LEFT: //Vergleich
	        	break; //Ferig - nicht mehr weitermachen
	        case KeyEvent.VK_UP: //Verlgeich
	        	break; //Fertig - nicht mehr weitermachen
	        case KeyEvent.VK_DOWN: 
	        	break; //Ferig - nicht mehr weitermachen
	    } 
	}

	//Unn�tig - muss aber auftauchen - sagt der KeyListener
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
}