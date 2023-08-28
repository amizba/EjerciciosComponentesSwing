//Crear un combox
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio ComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Selecciona una opción:");
        panel.add(label);

        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        panel.add(comboBox);

        JButton boton = new JButton("Mostrar selección");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Has seleccionado: " + seleccion);
            }
        });
        panel.add(boton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
