public class Main {

    public static void main (String[] args){
        Triangle t = new Triangle("red",2);
        Square s = new Square("black",3);
        Circle c = new Circle("yellow",1);
        t.show();
        s.show();
        c.show();

        ColoredFigure f = t;
        f.show();
    }
}
