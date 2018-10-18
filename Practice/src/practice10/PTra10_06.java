package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		final int distance = 100;

		Car car1 = new Car();
		car1.color = "Red";
		car1.gasoline = 20;

		Car car2 = new Car();
		car2.color = "Blue";
		car2.gasoline = 40;

		Car car3 = new Car();
		car3.color = "yellow";
		car3.gasoline = 60;

		Car[] cars = new Car[3];

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		for (int i = 0; i < cars.length; i++) {
			int sum = 0;
			int n = 0;
			while (true) {
				int run = cars[i].run();
				n++;

				sum += run;
//				System.out.println(sum);
				if (sum >= distance) {
					System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
					break;
				}

			}
		}
	}


}
