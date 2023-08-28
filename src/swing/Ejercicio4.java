/*Crear una aplicación similar al ejercicio anterior pero en lugar de tres checkbox 
 * van a ser tres jradiobutton y un botón, al seleccionar un jradiobutton y pulsar 
 * el botón que muestre la descripción del jradiobutton seleccionado
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Componentes Swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio4 {

	public static void main(String[] args) {
    
		JRadioButtonEjercicio jradio = new JRadioButtonEjercicio();
		
		jradio.setVisible(true);
    }
}
 class JRadioButtonEjercicio extends JFrame {
    private JRadioButton option1, option2, option3;
    private JButton submitButton;
    private JLabel resultLabel;

    public JRadioButtonEjercicio() {
        setTitle("Ejercicio JRadioButton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        option1 = new JRadioButton("Opción 1");
        option2 = new JRadioButton("Opción 2");
        option3 = new JRadioButton("Opción 3");
        
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        submitButton = new JButton("Enviar");
        resultLabel = new JLabel("Selecciona una opción y pulsa en Enviar.");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "Selecciona opción: ";
                if (option1.isSelected()) {
                    result += "Opción 1";
                } else if (option2.isSelected()) {
                    result += "Opción 2";
                } else if (option3.isSelected()) {
                    result += "Opción 3";
                } else {
                	result += "No has seleccionado ninguna opción";
                }
                resultLabel.setText(result);
            }
        });

        setLayout(new GridLayout(5, 1));
        add(option1);
        add(option2);
        add(option3);
        add(submitButton);
        add(resultLabel);

        setVisible(true);
    }
 }
                
