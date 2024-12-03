package view;

import javax.swing.*;
import java.awt.*;

public class Panel extends  JPanel {
    private final JTextField input1;
    private final JTextField input2;
    private final JTextField result;
    private final JComboBox<String> operator;
    private final JButton calculate;

    public Panel(){
        setLayout(new GridLayout(2 ,1));
        JPanel inputPanel = new JPanel();

        input1 = new JTextField(10);
        input2 = new JTextField(10);

        //меню операций
        operator = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        calculate = new JButton("=");


        inputPanel.add(new JLabel("Число 1:"));
        inputPanel.add(input1);
        inputPanel.add(new JLabel("Операция:"));
        inputPanel.add(operator);
        inputPanel.add(new JLabel("Число 2:"));
        inputPanel.add(input2);
        inputPanel.add(calculate);

        JPanel resultPanel = new JPanel();
        result = new JTextField(15);
        result.setEditable(false);
        resultPanel.add(new JLabel("Результат:"));
        resultPanel.add(result);

        add(inputPanel);
        add(resultPanel);
    }

    public void setResult(String resultText) {
        result.setText(resultText);
    }

    public String getInput1() {
        return input1.getText();
    }

    public String getInput2() {
        return input2.getText();
    }

    public String getOperator() {
        return (String) operator.getSelectedItem();
    }

    public JButton getCalculate() {
        return calculate;
    }
}
