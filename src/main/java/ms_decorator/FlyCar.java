package ms_decorator;
/**
 * 飞行汽车  
*/   
public class FlyCar extends SuperCar{

    public FlyCar(AbstractCar car) {
        super(car);
    }

    public void fly() {
        System.out.println("空中行驶汽车");
    }


    @Override
    public void move() {
        super.move();
         fly();
    }

}
