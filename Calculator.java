import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Error: Division by zero", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Calculator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The difference is: " + difference, "Calculator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The product is: " + product, "Calculator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The quotient is: " + quotient, "Calculator", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}