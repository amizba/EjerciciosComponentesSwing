//Crear un combox
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio ComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Selecciona una opci�n:");
        panel.add(label);

        String[] opciones = {"Opci�n 1", "Opci�n 2", "Opci�n 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        panel.add(comboBox);

        JButton boton = new JButton("Mostrar selecci�n");
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
