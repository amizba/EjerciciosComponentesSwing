/*Crear una aplicaci�n similar al ejercicio anterior pero en lugar de tres checkbox 
 * van a ser tres jradiobutton y un bot�n, al seleccionar un jradiobutton y pulsar 
 * el bot�n que muestre la descripci�n del jradiobutton seleccionado
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Componentes Swing
*
* @author Amparo Izquierdo Ba�ez
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

        option1 = new JRadioButton("Opci�n 1");
        option2 = new JRadioButton("Opci�n 2");
        option3 = new JRadioButton("Opci�n 3");
        
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        submitButton = new JButton("Enviar");
        resultLabel = new JLabel("Selecciona una opci�n y pulsa en Enviar.");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "Selecciona opci�n: ";
                if (option1.isSelected()) {
                    result += "Opci�n 1";
                } else if (option2.isSelected()) {
                    result += "Opci�n 2";
                } else if (option3.isSelected()) {
                    result += "Opci�n 3";
                } else {
                	result += "No has seleccionado ninguna opci�n";
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
                
