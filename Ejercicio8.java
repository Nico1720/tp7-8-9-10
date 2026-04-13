import javax.swing.*;

public class Ejercicio8 extends JFrame {

    public Ejercicio8() {
        setTitle("Ejercicio 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField manzanaT1 = new JTextField(5);
        JTextField manzanaT2 = new JTextField(5);
        JTextField manzanaT3 = new JTextField(5);
        JTextField manzanaT4 = new JTextField(5);
        JTextField peraT1 = new JTextField(5);
        JTextField peraT2 = new JTextField(5);
        JTextField peraT3 = new JTextField(5);
        JTextField peraT4 = new JTextField(5);
        JButton calcularButton = new JButton("Calcular");
        JLabel resultado = new JLabel("Beneficio total: ");
        calcularButton.addActionListener(e -> {
            try {
                double m1 = Double.parseDouble(manzanaT1.getText().replace(",", "."));
                double m2 = Double.parseDouble(manzanaT2.getText().replace(",", "."));
                double m3 = Double.parseDouble(manzanaT3.getText().replace(",", "."));
                double m4 = Double.parseDouble(manzanaT4.getText().replace(",", "."));

                double p1 = Double.parseDouble(peraT1.getText().replace(",", "."));
                double p2 = Double.parseDouble(peraT2.getText().replace(",", "."));
                double p3 = Double.parseDouble(peraT3.getText().replace(",", "."));
                double p4 = Double.parseDouble(peraT4.getText().replace(",", "."));

                double totalManzanas = m1 + m2 + m3 + m4;
                double totalPeras = p1 + p2 + p3 + p4;
                double precioManzana = 2.35;
                double precioPera = 1.95;

                double beneficio = (totalManzanas * precioManzana) + (totalPeras * precioPera);

                resultado.setText("Beneficio total: " + beneficio + " €");

            } catch (NumberFormatException ex) {
                resultado.setText("Error: introduce valores válidos.");
            }
        });

        JPanel panel = new JPanel();

        panel.add(new JLabel("Manzanas T1:"));
        panel.add(manzanaT1);
        panel.add(new JLabel("T2:"));
        panel.add(manzanaT2);
        panel.add(new JLabel("T3:"));
        panel.add(manzanaT3);
        panel.add(new JLabel("T4:"));
        panel.add(manzanaT4);

        panel.add(new JLabel("Peras T1:"));
        panel.add(peraT1);
        panel.add(new JLabel("T2:"));
        panel.add(peraT2);
        panel.add(new JLabel("T3:"));
        panel.add(peraT3);
        panel.add(new JLabel("T4:"));
        panel.add(peraT4);

        panel.add(calcularButton);
        panel.add(resultado);

        add(panel);
        setSize(700, 200);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio8 ejercicio = new Ejercicio8();
            ejercicio.setVisible(true);
        });
    }
}