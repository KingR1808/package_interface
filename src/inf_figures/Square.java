package inf_figures;

public class Square implements Figures{
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double figureArea() {
        return a*a;
    }

    @Override
    public double figurePerimeter() {
        return (a+a)*2;
    }
}
