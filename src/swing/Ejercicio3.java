/*Crea una aplicación con tres checkbox y un botón, al seleccionar un checkbox y 
 * pulsar el botón que muestre en una ventana la descripción del checkbox seleccionado.
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

public class Ejercicio3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Ejercicio Checkbox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1)); // 3 filas, 1 columna
        
        JCheckBox checkBox1 = new JCheckBox("Checkbox 1");
        JCheckBox checkBox2 = new JCheckBox("Checkbox 2");
        JCheckBox checkBox3 = new JCheckBox("Checkbox 3");
        
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        
        JButton showStatusButton = new JButton("Mostrar estado");
        showStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder status = new StringBuilder();
                status.append("Checkbox 1: ").append(checkBox1.isSelected()).append("\n");
                status.append("Checkbox 2: ").append(checkBox2.isSelected()).append("\n");
                status.append("Checkbox 3: ").append(checkBox3.isSelected()).append("\n");
                JOptionPane.showMessageDialog(frame, status.toString(), "Estado Checkbox", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        frame.add(panel, BorderLayout.CENTER);
        frame.add(showStatusButton, BorderLayout.SOUTH);
        
        frame.pack();
        frame.setVisible(true);
    }
}
