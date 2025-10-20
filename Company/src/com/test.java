package com;

public class test {

	public static void main(String[] args) {
		Order o=new Order("a",1,2);
		System.out.println("名字:"+o.getName()+
				"\n尺:"+o.getRuler()+"把"+
				"\n筆:"+o.getPen()+"隻"+
				"\n總共:"+o.getSum()+"元");

	}

}
