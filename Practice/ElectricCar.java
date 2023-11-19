package Practice;

public class ElectricCar  extends Car{




    @Override
    public final String drive(){
        return "Driving Electric Car";
    }

    public static void main(String[] args) {
        final Car car=new ElectricCar();
        System.out.println(car.drive());

    }

}
