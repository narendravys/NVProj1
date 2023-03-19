package com.nv.beans;

import java.util.Random;

public class Test {

	public void getMessage() {
		System.out.println("Get Message");
	}

	public int getNumber() {
		return new Random().nextInt(1000);

	}

}
