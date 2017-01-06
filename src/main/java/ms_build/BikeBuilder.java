package ms_build;

/**
 * 
 * An abstract Builder
 */
public abstract class BikeBuilder {
    //构建bike的框架
	public abstract void BuildFrame(int frameNumber);
	//构建bike的轮子
	public abstract void BuildWheels(int wheelNumber);
	//获取构建好的完整的产品
	public abstract Bike getBike();
}

