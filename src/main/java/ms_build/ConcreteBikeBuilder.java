package ms_build;

/**
 * 
 *构建自行车的各个部件
 */
public class ConcreteBikeBuilder extends BikeBuilder {
    Bike  bike;
    public ConcreteBikeBuilder(){
    	bike = new Bike();
    }
	@Override
	public void BuildFrame(int frameNumber) {
		bike.frameNumber = frameNumber;
	}

	@Override
	public void BuildWheels(int wheelNumber) {
		bike.wheelNumber = wheelNumber;
	}

	@Override
	public Bike getBike() {
		
		return bike;
	}

}
