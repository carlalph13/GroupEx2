package GroupEx2;

public abstract class Marks {

    double math;
    double english;
    double science;

    public Marks(double math,double english, double science){
        this.math=math;
        this.english=english;
        this.science=science;

    }




    public abstract double getPercentage();


}




class StudentA extends Marks{


    public StudentA(double math, double english, double science) {
        super(math, english, science);
    }

    @Override
    public double getPercentage( ){

        double average=math+english+science;
        average=average/3;

        return average;
    }
}

class StudentB extends StudentA{
    double art;
    public StudentB(double math, double english, double science,double art) {

        super(math, english, science);
        this.art=art;
    }

    @Override
    public double getPercentage() {
        double average = math + english + science + art;
        average=average/4;
        return average;

    }
}

class MarkerTester{
    public static void main(String[] args) {
        StudentA gail=new StudentA(88, 90, 75);
        StudentB amy=new StudentB(97, 77, 81, 90);
        System.out.println("John's average is "+gail.getPercentage());
        System.out.println("Jack's average is "+amy.getPercentage());

    }
}

