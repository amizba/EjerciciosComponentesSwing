/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Componentes Swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		MarcoEj3 mimarco = new MarcoEj3();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
 class MarcoEj3 extends JFrame {
	
	public MarcoEj3(){
		
		setBounds(550, 300, 550, 350);
		
		setVisible(true);
		
		LaminaEj3 milamina = new LaminaEj3();
		
		add(milamina);
		
	}
}
 class LaminaEj3 extends JPanel {
	 
	 public LaminaEj3() {
		 
		 setLayout(new BorderLayout());
		 
		 //Creamos el texto
		 texto = new JLabel("Bienvenidos al blog empezandojava.blogspot.com"); 
		 
		 //Añadimos el texto a la lámina en la parte central
		 add(texto, BorderLayout.CENTER);
		 
		 
		 
		 //Creamos el grupo donde van a estar lo botones
		 ButtonGroup migrupo= new ButtonGroup();
		 
		 boton1 = new JRadioButton("Pequeño", false);
		 
		 boton2 = new JRadioButton("Mediano", true); //Está activado
		 
		 boton3 = new JRadioButton("Grande", false);
		 
		 boton4 = new JRadioButton("Muy grande", false);
		 
		 //Creación de una segunda lámina
		 JPanel lamina_radio = new JPanel();
		 
		 EventoRadio mievento = new EventoRadio();
		 
		 boton1.addActionListener(mievento); //Ponemos el botón a la escucha
		 
		 boton2.addActionListener(mievento);
		 
		 boton3.addActionListener(mievento);
		 
		 boton4.addActionListener(mievento);
		 
		 //Añadimos los botones al grupo
		 migrupo.add(boton1);
		 migrupo.add(boton2);
		 migrupo.add(boton3);
		 migrupo.add(boton4);
		 
		 //Añadimos los botones a la lámina
		 lamina_radio.add(boton1);
		 lamina_radio.add(boton2);
		 lamina_radio.add(boton3);
		 lamina_radio.add(boton4);
		 
		 //Añadir esta segunda lámina a la zona sur
		 add(lamina_radio, BorderLayout.SOUTH);

	 }
	 
	 private class EventoRadio implements ActionListener{//clase interna que maneja los eventos

		@Override
		public void actionPerformed(ActionEvent e) {
		//Cuando pulsamos cualquier botón
			if(e.getSource()==boton1) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			}else if(e.getSource()==boton2) {
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
			}else if(e.getSource()==boton3) {
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
			}else if(e.getSource()==boton4) {
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
			}
			
		} 
		 
	 }
	 
	 private JLabel texto; //variable que va a contener el texto
	 
	 private JRadioButton boton1, boton2, boton3, boton4;
	
 }
