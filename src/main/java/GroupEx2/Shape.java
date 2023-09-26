package GroupEx2;

public interface Shape {

    public void calculateArea();


    public void calculatePerimeter();
}

class Circle implements Shape{

    @Override
    public void calculateArea() {
        double radius=5;
        double area=0;
        area=Math.PI*radius*radius;
        System.out.println(area);

    }



    @Override
    public void calculatePerimeter() {
        double radius=5;
        double perimeter=0;
        perimeter=Math.PI*radius*2;
        System.out.println(perimeter);

    }
}

class Square implements Shape {
    @Override
    public void calculateArea() {
        double length =10;
        double area=0;
        area=length*length;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
        double length=10;
        double perimeter=0;
        perimeter= length+length+length+length;
        System.out.println(perimeter);

    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape [] arr={new Circle(),new Square()};
        for(Shape a:arr){
            a.calculateArea();
            a.calculatePerimeter();
        }
    }
}

