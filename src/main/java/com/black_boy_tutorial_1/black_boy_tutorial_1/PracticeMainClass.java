package com.black_boy_tutorial_1.black_boy_tutorial_1;


class SubClass {
	String color;
	

	void horn() {
		System.out.println(color);
	}
}




public class PracticeMainClass {	
	
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.color = "white";
		obj.horn();

	}

}
