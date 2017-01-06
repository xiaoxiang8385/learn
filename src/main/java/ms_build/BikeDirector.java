package ms_build;

/**
 * 
 *组装自行车
 */
public class BikeDirector {
	
   public void createBike(BikeBuilder concreteBuilder){
	   concreteBuilder.BuildFrame(1);
	   concreteBuilder.BuildWheels(4);
   }
}

