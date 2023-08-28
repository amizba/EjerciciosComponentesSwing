//Crear una barra de men�s
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
import java.awt.event.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio Men�");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Archivo");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Abrir");
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // L�gica para manejar la acci�n de "Abrir"
                JOptionPane.showMessageDialog(null, "Se ha seleccionado Abrir");
            }
        });
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Salir");
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // L�gica para manejar la acci�n de "Salir"
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
