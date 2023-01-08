/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Componentes Swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio_1 {

	public static void main(String[] args) {
		MarcoTexto mimarco = new MarcoTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	}


class MarcoTexto extends JFrame {
	
	public MarcoTexto() {
		
		setBounds(500, 300, 600, 150);
		
		LaminaTexto milamina=new LaminaTexto();
		
		add(milamina);
		
		setVisible(true);
		
		
		
	}
}
class LaminaTexto extends JPanel {
	
	public LaminaTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel milamina2=new JPanel();
		
		milamina2.setLayout(new FlowLayout());
		
		resultado = new JLabel("", JLabel.CENTER); //Ubicamos la disposición de la etiqueta
		
		JLabel texto1 = new JLabel("Email: "); //Creamos la etiqueta
		
		milamina2.add(texto1); //Añadimos la etiqueta a la lámina
		
		campo1=new JTextField(20); //Creamos el campo de texto
		
		milamina2.add(campo1); //Añadimos el campo de texto a la lámina
		
		add(resultado, BorderLayout.CENTER); //Añadimos la etiqueta en el centro.
		
		JButton miboton = new JButton("Pulsar"); //Creamos el boton 
		
		PulsaTexto mievento = new PulsaTexto(); //Instanciamos la clase
		
		miboton.addActionListener(mievento); //Añadimos la acción en el botón
		
		milamina2.add(miboton); //Añadimos el botón a la lámina
		
		add(milamina2, BorderLayout.NORTH); //Ubicamos la lamina en la parte superior
		

		
	}
	
	//Esta clase nos va a permitir indicar si es correcto o incorrecto la dirección email
	//basándose en si tiene más de un arroba
	private class PulsaTexto implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
				int correcto=0; //Nos contabiliza si hay más de un arroba
			
			String email=campo1.getText().trim(); //No tener en cuenta los espacios en blanco al principio
			
			for(int i=0; i<email.length(); i++) {
				
				if(email.charAt(i)=='@'){
					
					correcto++;
					
				}
			}
			
			if(correcto!=1) {
				
				resultado.setText("Incorrecto");
				
			}else {
				
				resultado.setText("Correcto");
			}
			
			
		}

			
		}
		 
	private JTextField campo1;
	
	private JLabel resultado; 

	
	
}
