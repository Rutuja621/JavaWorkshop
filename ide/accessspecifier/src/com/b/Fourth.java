package com.b;

import com.a.First;

public class Fourth extends First {
	public static void main(String[] args) {
		Fourth ft=new Fourth();
		System.out.println(ft.pro);//protected is access only when fourth extends the parent class properties and create object child class i.e Fourth
		System.out.println(ft.pub);
		//System.out.println(ft.def);
		//System.out.println(ft.pvt);
	}


}
