import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class java8 extends JFrame {
private JTextField inputField;
private JTextField outputField;
private ArrayList<String> textList;
public java8() {
    super("GFA");

    
    JLabel inputLabel = new JLabel("Vvedit text: ");
    inputField = new JTextField(20);

    JLabel outputLabel = new JLabel("Polu vuvoda: ");
    outputField = new JTextField(20);
    outputField.setEditable(false); 

    JButton copyButton = new JButton("Copy");
    JButton printButton = new JButton("Dryk");
    textList = new ArrayList<>();

    
    JPanel inputPanel = new JPanel(new BorderLayout());
    inputPanel.add(inputLabel, BorderLayout.CENTER);
    inputPanel.add(inputField, BorderLayout.SOUTH);

    JPanel outputPanel = new JPanel(new BorderLayout());
    outputPanel.add(outputLabel, BorderLayout.CENTER);
    outputPanel.add(outputField, BorderLayout.SOUTH);

    
    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    c.add(inputPanel, BorderLayout.CENTER);
    c.add(outputPanel, BorderLayout.SOUTH);
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.add(copyButton);
    buttonPanel.add(printButton);
    c.add(buttonPanel, BorderLayout.EAST);

    
    copyButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String text = inputField.getText();
            outputField.setText(text);
            textList.add(text);
        }
    });

    printButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.out.println("List textov: ");
            for (String text : textList) {
                System.out.println(text);
            }
        }
    });

    
    setSize(400, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
}

public static void main(String[] args) {
    new java8();
}
}