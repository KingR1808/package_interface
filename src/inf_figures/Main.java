package inf_figures;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5,5);
        Square square=new Square(5);
        Сircle circle=new Сircle(5);

        System.out.println("Rectangle area and perimetr");
        figureArea(rectangle);

        System.out.println("Square area and perimetr");
        figureArea(square);

        System.out.println("Circle area and perimetr");
        figureArea(circle);

    }
    public static void figureArea(Figures ob){
        System.out.println(ob.figureArea());
        System.out.println(ob.figurePerimeter());
    }
}
