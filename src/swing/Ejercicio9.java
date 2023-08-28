//Crear un men� emergente
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

public class Ejercicio9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio Men� Emergente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear el men� emergente
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Opci�n 1");
        JMenuItem menuItem2 = new JMenuItem("Opci�n 2");
        JMenuItem menuItem3 = new JMenuItem("Opci�n 3");
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        popupMenu.add(menuItem3);

        // Agregar el men� emergente a un componente (por ejemplo, un panel)
        JPanel panel = new JPanel();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
