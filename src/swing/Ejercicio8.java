//Crear una barra de menús
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
import java.awt.event.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio Menú");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Archivo");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Abrir");
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Abrir"
                JOptionPane.showMessageDialog(null, "Se ha seleccionado Abrir");
            }
        });
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Salir");
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Salir"
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
