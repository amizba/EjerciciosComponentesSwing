/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Componentes Swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Ejercicio_2 {

	public static void main(String[] args) {
		MarcoEj2 mimarco = new MarcoEj2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	}


class MarcoEj2 extends JFrame {
	
	public MarcoEj2() {
		
		setBounds(500, 300, 600, 150);
		
		LaminaEj2 milamina=new LaminaEj2();
		
		add(milamina);
		
		setVisible(true);
		
		
		
	}
}
class LaminaEj2 extends JPanel {
	
	public LaminaEj2() {
		
		setLayout(new BorderLayout());
		
		JPanel laminasuperior = new JPanel();
		
		laminasuperior.setLayout(new GridLayout(2,2 ));

		add(laminasuperior, BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("Usuario: ");
		
		JLabel etiqueta2 = new JLabel("Contraseña: ");
		
		CompruebaPass mievento = new CompruebaPass();
		
		JTextField c_user = new JTextField(15); //Una longitud de 15 columnas
		
		c_pass = new JPasswordField(15); //Los campos de contraseña van encriptados
		
		c_pass.getDocument().addDocumentListener(mievento);
		
		laminasuperior.add(etiqueta1);
		
		laminasuperior.add(c_user);
		
		laminasuperior.add(etiqueta2);
		
		laminasuperior.add(c_pass);
		
		JButton enviar=new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);

		
	}
	private class CompruebaPass implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] contrasena;
			
			contrasena=c_pass.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				
				c_pass.setBackground(Color.red);
				
			}else {
				
				c_pass.setBackground(Color.white);
			}
			
		}

			
		

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		
	}
	JPasswordField c_pass;
}

	
		
	
	
