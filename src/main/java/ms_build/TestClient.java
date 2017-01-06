package ms_build;

public class TestClient {

	public static void main(String[] args) {
		Bike bike = new Bike();
		BikeBuilder  builder = new ConcreteBikeBuilder();
		BikeDirector director = new BikeDirector();
		director.createBike(builder);
		bike = builder.getBike();
		System.out.println("车架frame:" + bike.getFrameNumber()+"个");
		System.out.println("轮子wheel:" + bike.getWheelNumber()+"个");
	}
}
