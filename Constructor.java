package jaavaTutorial;

public class Constructor {

	public static void main(String[] args) {

		// calling from country class
		Country UnitedStates = new Country("New york", 1);
		System.out.println(UnitedStates.city + UnitedStates.num);
		
		// calling from Home class
		Home sweetHome = new Home("Master bedroom", "living room", 10);
		System.out.println(sweetHome.roomOne + sweetHome.roomTwo + sweetHome.windows);

	}

}

//creating class templates 1
class Country {

	String city;
	int num;

	public Country(String cityName, int number) {
		this.city = cityName;
		this.num = number;

	}

	public void countryORcity() {
		System.out.println(this.city);
		System.out.println(this.num);
	}
}

// creating class templates 2
class Home {
	String roomOne;
	String roomTwo;
	int windows;

//class name and constructor name should be same : here class name Home and public Home is same;
	public Home(String room1, String room2, int win) {
		this.roomOne = room1;
		this.roomTwo = room2;
		this.windows = win;

	}

	public void RoomNwindow() {

		System.out.println(this.roomOne);
		System.out.println(this.roomTwo);
		System.out.println(this.windows);

	}
}