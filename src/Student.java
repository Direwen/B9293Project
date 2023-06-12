
public class Student {
	private static String name = "Direwen";
	private static String age = "19";
	
	public static String getName() {
		return name;
	}
	
	public static String getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getName() + " is " + getAge() + "years old.");
	}

}
