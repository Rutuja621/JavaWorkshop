package com.a;

public class First {
	
	protected String pro="Protected access : accessible within same package but we can extend the properties of parent class and create object of child the we can able to access protected to another pkg";
	public String pub="Public accessm:accessible everywhere";
	String def="Default access : accessible within same packgae";
	private String pvt="Private access accessible within same classs";
	
	public static void main(String[] args) {
		First ft=new First();
		System.out.println(ft.pro);
		System.out.println(ft.pub);
		System.out.println(ft.def);
		System.out.println(ft.pvt);
	}

}
