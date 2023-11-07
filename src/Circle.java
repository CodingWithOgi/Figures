public class Circle extends ColoredFigure{
    Circle(String color,int r){
        super(color,r);
    }

    @Override
    String getName(){
        return "circle";
    }

    @Override
    double getArea(){
        return size*size*Math.PI;
    }

    @Override
    String getSizeName(){
        return "radius";
    }
}
