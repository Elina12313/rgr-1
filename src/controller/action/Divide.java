package controller.action;

public class Divide implements Command{
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }
}
