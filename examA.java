package jaavaTutorial;

public class examA {

	
	//One program on inheritance multilevel 
	public static void main(String[] args) {
		Section sect = new Section("Asian lib", "parijat", 5);
		System.out.println(sect.book+sect.genre+sect.sec);
		sect.disBook();
		sect.disSec();
		
	}

}
class library {
	String book;
	String genre;
	public library (String bk, String gn) {
		this.book= bk;
		this.genre=gn;
		
		}
	public void disBook () {
		System.out.println("this is a novel.");
	}
}
class Section extends library{
	int sec;
	public Section(String bk, String gn,int sec) {
		super(bk, gn);
		this.sec=sec;
		
		
	}
	public void disSec () {
		System.out.println("this is a novel section.");
	}
	
	
}