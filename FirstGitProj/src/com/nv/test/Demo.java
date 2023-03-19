package com.nv.test;

import com.nv.beans.Test;
import com.nv.factory.Today;

public class Demo {
	public static void main(String[] args) {
		new Test().getMessage();
		System.out.println(new Today().getDate());
		// Under Construction
		System.out.println("This is Demo");

	}

}
