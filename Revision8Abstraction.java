package jaavaTutorial;

public class Revision8Abstraction {

	public static void main(String[] args) {

		Rain r = new Rain("dfsd", 5);
		r.hot();
		r.cold();

	}

}

abstract class Weather {
	String type;
	int day;

	public Weather(String t, int d) {
		this.type = t;
		this.day = d;
	}

	abstract void hot();

	abstract void cold();

	public void dispayWeather() {
		System.out.println("this is good weather.");
	}
}

class Rain extends Weather {

	public Rain(String t, int d) {
		super(t, d);
		// TODO Auto-generated constructor stub
	}

	public void hot() {
		System.out.println("weather is hot");
	}

	@Override
	public void cold() {
		System.out.println("weather is cold");

	}

}
