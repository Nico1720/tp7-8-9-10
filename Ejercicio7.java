import javax.swing.*;

public class Ejercicio7 extends JFrame {

    public Ejercicio7() {
        setTitle("Ejercicio 7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel resultLabel = new JLabel("El número redondeado es: ");

        submitButton.addActionListener(e -> {
            try {
                double num = Double.parseDouble(inputField.getText());
                long redondeado = Math.round(num);
                resultLabel.setText("El número redondeado es: " + redondeado);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Entrada inválida. Introduce un número decimal válido.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Escriba un número decimal: "));
        panel.add(inputField);
        panel.add(submitButton);
        panel.add(resultLabel);

        add(panel);
        setSize(600, 100);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio7 ejercicio = new Ejercicio7();
            ejercicio.setVisible(true);
        });
    }
}