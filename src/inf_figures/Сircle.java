package inf_figures;

public class Сircle implements Figures {
    double r;

    public Сircle(double r) {
        this.r = r;
    }

    @Override
    public double figureArea() {
        return Math.PI*Math.pow(r,r);
    }

    @Override
    public double figurePerimeter() {
        return 2*Math.PI*r;
    }
}
