/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Componentes Swing
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		MarcoEj4 mimarco = new MarcoEj4();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
 class MarcoEj4 extends JFrame {
	
	public MarcoEj4(){
		
		setVisible(true);
		
		setBounds(550, 300, 550, 400);
		
		LaminaEj4 milamina = new LaminaEj4();
		
		add(milamina);

		
	}
}
 class LaminaEj4 extends JPanel {
	 
	 public LaminaEj4() {
		 
		 setLayout(new BorderLayout());//la l�mina tiene que tener una disposici�n de BorderLayout

		 //El texto que vas a aumentar o disminuir con el slider
		 rotulo = new JLabel("Bienvenidos al blog de empezandojava.blogspot.com");
		 
		 add(rotulo, BorderLayout.CENTER); //a�adimos el r�tulo a la l�mina en la parte central
		 
		 control = new JSlider(8, 50, 12); //Creamos el slider, instanciamos
		 
		 control.setMajorTickSpacing(25); //Las marcas mayores van aumentar
		 
		 control.setMinorTickSpacing(5); //Lar marcas menores que van aumentar
		 
		 control.setPaintTicks(true); //Para que se imprima las rayas de los n�meros
		 
		 control.setPaintLabels(true); //Para que aparezcan los n�meros impresos
		 
		 control.setFont(new Font("Arial", Font.ITALIC, 10)); //Cambiamos la fuente de los n�meros impresos
		 
		 control.addChangeListener(new EventoSlider()); //Ponemos el slider a la escucha
		 
		 JPanel laminaSlider = new JPanel(); //creamos una segunda l�mina
		 
		 laminaSlider.add(control); //a�adimos a la segunda l�mina el slider
		 
		 add(laminaSlider, BorderLayout.NORTH); //A�adimos la segunda l�mina en la parte superior. 
		 
		 
	 }
	//Creamos la clase interna para darle interactividad al slider
	 private class EventoSlider implements ChangeListener{ 

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			//m�todo getValue devuelve el valor del slider, es decir, dependiendo del valor que
			//seleccionemos en el slider el texto se har� m�s grande o m�s peque�o
			rotulo.setFont(new Font("Arial", Font.PLAIN, control.getValue()));
		}
		 
		 
	 }
	 
private JLabel rotulo;

private JSlider control;
	
 }
