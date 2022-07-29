//Constructors are special method that runs every time you create a instance of a class.

class Program {
	int value;
	String text;
	
	public Program() {
		System.out.println("First Constructor");
		
		value = 12;
	}
	
	public Program(int value) {
		this.value = value;
		
		System.out.println("Second Contructor");
	}
	
	public Program(int value, String text) {
		this.value = value;
		this.text = text;
		
		System.out.println("Third Contructor");
	}
}

public class App {
	public static void main(String[] args) {
		Program myProgram = new Program();
		Program myProgram1 = new Program(2);
		Program myProgram2 = new Program(5, "Hi");
	}
}
