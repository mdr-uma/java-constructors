//Constructors are special method that runs every time you create a instance of a class.

class Program {
	int value;
	
	public Program() {
		System.out.println("First Constructor");
	}
}

public class App {
	public static void main(String[] args) {
		Program myProgram = new Program();
	}
}
