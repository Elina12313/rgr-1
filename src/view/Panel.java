package view;

import javax.swing.*;
import java.awt.*;

public class Panel extends  JPanel {
    private JTextField input1;
    private  JTextField input2;
    private JTextField result;
    private  JComboBox<String> operator;
    private  JButton calculate;

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

    public void setResult(JTextField result) {
        this.result = result;
    }

    public JTextField getInput1() {
        return input1;
    }

    public JTextField getInput2() {
        return input2;
    }

    public JComboBox<String> getOperator() {
        return operator;
    }

    public JButton getCalculate() {
        return calculate;
    }
}
