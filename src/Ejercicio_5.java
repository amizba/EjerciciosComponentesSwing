/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Componentes Swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		MarcoEj5 mimarco = new MarcoEj5();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
 class MarcoEj5 extends JFrame {
	
	public MarcoEj5(){
		
		setVisible(true);
		
		setBounds(550, 300, 550, 400);
		
		LaminaEj5 milamina = new LaminaEj5();
		
		add(milamina);

		
	}
}
 class LaminaEj5 extends JPanel {
	 
	 public LaminaEj5() {
		 
		 String lista[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		 
		 JSpinner control= new JSpinner(new SpinnerListModel(lista));
		 
		 Dimension d = new Dimension(150,20);
		 
		 control.setPreferredSize(d);
		 
		 add(control);

	 }
	 
	
 }

