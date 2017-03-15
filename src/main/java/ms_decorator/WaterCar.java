package ms_decorator;
/**
 * 水上汽车
 */
public class WaterCar extends SuperCar{

    public WaterCar(AbstractCar car) {
        super(car);
    }

    public void swim() {
        System.out.println("水上行驶汽车");
    }
    @Override
    public void move() {
        super.move();
        swim();
    }

}