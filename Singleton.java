package com.fortinet;

public class Singleton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton x = MySingleton.getInstance();
		MySingleton y = MySingleton.getInstance();
		MySingleton z = MySingleton.getInstance();

		// Proof to show x, y, z has same reference

		System.out.println(x == y);
		System.out.println(y == z);

		System.out.println("Address of x : " + x);
		System.out.println("Address of y : " + y);
		System.out.println("Address of z : " + z);

	}

}

class MySingleton {
	private static MySingleton obj = null;
	private MySingleton() {}

	public static MySingleton getInstance()
	{
		if (obj == null)
			obj = new MySingleton();
		return obj;
	}
}


