package ms_build;

/**
 * A bike as a concrete product we got finally
 *
 */
public class Bike {
    //自行车车架数量
	int frameNumber;
	//自行车轮子数量
	int wheelNumber;
	public Bike(){
		frameNumber = 1;
		wheelNumber = 4;
	}
	public int getFrameNumber() {
		return frameNumber;
	}
	
	public int getWheelNumber() {
		return wheelNumber;
	}
	
}
