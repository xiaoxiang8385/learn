package ms_decorator;

//装饰角色
public class SuperCar implements AbstractCar{
    protected AbstractCar car;
    public SuperCar(AbstractCar car){
        this.car=car;
    }

    public void move() {
        car.move();
    }

}