package week3.day1;

public class LearnStatic {
	
	static String name = "Hari";
	int id;

	public static void getDetails() {
		System.out.println("Static Method");
		name = "Haja";
		System.out.println(LearnStatic.name);
		System.out.println(new LearnStatic().id);
	}
	
	public static void main(String[] args) {
		LearnStatic st = new LearnStatic();
	//	st.getDetails();
		System.out.println(name);
		name = "Babu";
		System.out.println(name);
		LearnStatic.getDetails();
	}
}
