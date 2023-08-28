/*Crear una aplicación que contenga un JSpinner y un botón, al seleccionar uno de 
 * los valores de JSpinner y pulsar el botón que muestre una ventana de JOptionPane 
 * y nos informe del valor seleccionado en el JSpinner
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
import java.awt.event.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		  SwingUtilities.invokeLater(() -> {
	            createAndShowGUI();
	        });

	}
	private static void createAndShowGUI() {
        JFrame frame = new JFrame("Ejercicio JSpinner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        // Crear un modelo de spinner con valores de 0 a 100 y paso de 1
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner spinner = new JSpinner(spinnerModel);

        panel.add(spinner);

        JButton button = new JButton("Mostrar Valor");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el valor actual del spinner
                int valor = (int) spinner.getValue();
                JOptionPane.showMessageDialog(frame, "Valor seleccionado: " + valor);
            }
        });

        frame.setVisible(true);
    }
}

