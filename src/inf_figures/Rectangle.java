package inf_figures;

public class Rectangle implements Figures {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double figureArea() {
        return a*b;
    }

    @Override
    public double figurePerimeter() {
        return (a+b)*2;
    }
}
