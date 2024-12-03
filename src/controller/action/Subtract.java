package controller.action;

public class Subtract implements Command{
    @Override
    public double execute(double a, double b) {
        return a-b;
    }
}
