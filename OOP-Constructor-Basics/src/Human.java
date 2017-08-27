
public class Human {
	String name;
	String eyeColor;
	int age;
	int heightInches;
	
	public Human(String name, String eyeColor, int age, int heightInches){
		this.name = name;
		this.eyeColor = eyeColor;
		this.age = age;
		this.heightInches = heightInches;
	}
	
	public void speak() {
		System.out.println("Hi, my name is " + this.name);
		System.out.println("Hi, my eye's color is " + this.eyeColor);
		System.out.println("Hi, my height is " + this.heightInches + " inches");
		System.out.println("Hi, my age is " + this.age);
	}
	
}
