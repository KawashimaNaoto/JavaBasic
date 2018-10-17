package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	public int run() {

		gasoline--;
		int run = new java.util.Random().nextInt(15) + 1;

		if (gasoline >= 0) {
			return run;

		} else {
			return -1;
		}

	}

}
