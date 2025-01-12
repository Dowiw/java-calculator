import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FramedCalculator implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Times New Roman", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    FramedCalculator() {
        
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        
        FramedCalculator calc = new FramedCalculator();
    }

    public void actionPerformed(ActionEvent e) {

    }
}