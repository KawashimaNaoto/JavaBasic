/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee employee1 = new Employee();

			employee1.setDepartmentNm(QUATERDATA[0][0]);
			System.out.println(employee1.getDepartmentNm());
			employee1.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][0]));
			System.out.println(employee1.getDepartmentCnt());
			System.out.println(NAMEDATA[0]);
			System.out.println(MAILDATA[0]);
			System.out.println(PASSDATA[0]);

		Employee employee2 = new Employee();
			employee2.setDepartmentNm(QUATERDATA[0][1]);
			System.out.println(employee2.getDepartmentNm());
			System.out.println(NAMEDATA[1]);
			System.out.println(MAILDATA[1]);
			System.out.println(PASSDATA[1]);

		Employee employee3 = new Employee();
			employee3.setDepartmentNm(QUATERDATA[0][2]);
			System.out.println(employee3.getDepartmentNm());
			System.out.println(NAMEDATA[2]);
			System.out.println(MAILDATA[2]);
			System.out.println(PASSDATA[2]);
	}
}
