package controller.action;

public class Multiply implements Command{
    @Override
    public double execute(double a, double b) {
        return a*b;
    }
}
