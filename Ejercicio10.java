import javax.swing.*;

public class Ejercicio10 extends JFrame {

    public Ejercicio10() {
        setTitle("Ejercicio 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField radioField = new JTextField(10);
        JButton calcularButton = new JButton("Calcular");
        JLabel resultado = new JLabel("Resultado: ");

        calcularButton.addActionListener(e -> {
            try {
                double radio = Double.parseDouble(radioField.getText().replace(",", "."));

                double longitud = 2 * Math.PI * radio;
                double area = Math.PI * Math.pow(radio, 2);

                resultado.setText(String.format(
                        "Longitud: %.2f | Área: %.2f",
                        longitud, area));

            } catch (NumberFormatException ex) {
                resultado.setText("Error: introduce un número válido.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Introduce el radio: "));
        panel.add(radioField);
        panel.add(calcularButton);
        panel.add(resultado);

        add(panel);
        setSize(400, 120);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio10 app = new Ejercicio10();
            app.setVisible(true);
        });
    }
}