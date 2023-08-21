package jaavaTutorial;

	//one program with overriding
public class examE {

	public static void main(String[] args) {
		television1 tel = new television1();
		tel.samsung(3);
		tel.kona(4, 10);
		tel.sony(2, 20, 30);


	}

}
class television1 {
	
public void samsung (int a) {
	System.out.println("samsung");
}
public void kona (int a, int b) {
	System.out.println("kona");
}
public void sony (int a, int b, int c) {
	System.out.println("sony");
}

}