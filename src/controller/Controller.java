package controller;

import model.Model;
import view.Frame;
import view.Panel;

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

    }
}
