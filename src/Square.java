public class Square extends ColoredFigure{
    Square(String color,int s){
        super(color,s);
    }
    String getName(){
        return "square";
    }
    double getArea(){
        return size*size;
    }
}
