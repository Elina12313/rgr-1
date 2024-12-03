package controller;

import controller.action.Command;
import controller.action.CommandFactory;
import model.Model;
import view.Frame;
import view.Panel;
import view.*;
import javax.swing.*;

public class Controller {
    private Model model;
    private Frame frame;

    public Controller(Model model, Frame frame) {
        this.model = model;
        this.frame = frame;
        button();
    }

    private void button() {
        Panel panel = frame.getPanel(); //Создание панели
        //Слушатель
        panel.getCalculate().addActionListener(e -> {
            try {
                double a = Double.parseDouble(panel.getInput1()); //первое число
                double b = Double.parseDouble(panel.getInput2()); //второе число
                String operation = panel.getOperator(); //Выбираем операцию

                Command command = CommandFactory.createCommand(operation); //создаем операцию

                //исключение
                if (command == null) {
                    throw new IllegalArgumentException("Invalid operation");
                }

                //вычислить
                model.calculate(command, a, b);
                //установить в панель результат
                panel.setResult(String.valueOf(model.getResult()));

                //окошки для исключений
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Неправильный формат!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        });


    }
}
