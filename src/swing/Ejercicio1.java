/*Validar si un mail está correctamente escrito o no. El mail se ha de introducir 
 * dentro de un campo de texto y ha de informar la aplicación si es válido o no.
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) {
		ValidarEmail mail = new ValidarEmail();
		mail.setVisible(true);

	}

}
class ValidarEmail extends JFrame {
    private JTextField emailTextField;
    private JLabel resultLabel;

    public ValidarEmail() {
        setTitle("Validación de Correo Electrónico");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Ingrese un correo electrónico:");
        emailTextField = new JTextField(20);
        JButton validateButton = new JButton("Validar");
        resultLabel = new JLabel();
        
        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTextField.getText();
                if (isValidEmail(email)) {
                    resultLabel.setText("Correo electrónico válido.");
                    resultLabel.setForeground(Color.GREEN);
                } else {
                    resultLabel.setText("Correo electrónico inválido.");
                    resultLabel.setForeground(Color.RED);
                }
            }
        });

        panel.add(label);
        panel.add(emailTextField);
        panel.add(validateButton);

        add(panel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}




