/*Crear una aplicación que contenga un JSlider y un texto, de forma que si aumentamos 
 * o disminuimos el JSlider el texto cambie de tamaño
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;

public class Ejercicio6 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ejercicio JSlider");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            
            JPanel panel = new JPanel();
            
            JLabel label = new JLabel("Aprendiendo a programar en Java");
            panel.add(label);
            
            JSlider slider = new JSlider(JSlider.HORIZONTAL, 10, 50, 20);
            slider.setMajorTickSpacing(10);
            slider.setMinorTickSpacing(1);
            slider.setPaintTicks(true);
            slider.setPaintLabels(true);
            panel.add(slider);
            
            slider.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    JSlider source = (JSlider) e.getSource();
                    if (!source.getValueIsAdjusting()) {
                        int fontSize = (int) source.getValue();
                        label.setFont(new Font("Arial", Font.PLAIN, fontSize));
                    }
                }
            });
            
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}

