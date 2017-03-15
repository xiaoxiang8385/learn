package ms_decorator;
public class Client {

    public static void main(String[] args) {
        Car car=new Car();
        car.move();

        System.out.println("------增加新功能,飞行------");
        FlyCar flyCar=new FlyCar(car);
        flyCar.move();

        System.out.println("------新增加功能，水上行驶-----");
        WaterCar waterCar=new WaterCar(car);
        waterCar.move();

        System.out.println("-----新增加两个功能，飞行与水上行驶-----");
        WaterCar waterCar2=new WaterCar(flyCar);
        waterCar2.move();

    }

}