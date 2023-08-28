/*Crear una aplicación que contenga un área de texto en el cuál podamos escribir y 
 * el texto convertirlo a negrita o cursiva.
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

public class Ejercicio2 {

	public static void main(String[] args) {
		EditorTexto editor = new EditorTexto();
		editor.setVisible(true);

	}

}
class EditorTexto extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;

    public EditorTexto() {
        setTitle("Editor de texto");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        boldCheckBox = new JCheckBox("Negrita");
        italicCheckBox = new JCheckBox("Cursiva");
        
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(boldCheckBox);
        checkBoxPanel.add(italicCheckBox);
        getContentPane().add(checkBoxPanel, BorderLayout.NORTH);

        boldCheckBox.addActionListener(this);
        italicCheckBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int style = Font.PLAIN;

        if (boldCheckBox.isSelected()) {
            style |= Font.BOLD;
        }
        if (italicCheckBox.isSelected()) {
            style |= Font.ITALIC;
        }

        Font font = textArea.getFont();
        Font newFont = new Font(font.getName(), style, font.getSize());
        textArea.setFont(newFont);
    }
}
        