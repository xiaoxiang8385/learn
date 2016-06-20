package rmi;

import java.io.Serializable;
import java.rmi.RemoteException;

public class Student implements Serializable{

	protected Student() throws RemoteException {
		super();
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = -6988620754543678396L;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return name+age;
	}
}
