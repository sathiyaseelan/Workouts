package org.saftware.regex.test;

public class LastCharRemoverTest {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		StringBuffer name=new StringBuffer("sathya");
		System.out.println(name);
		changeName(name);
		System.out.println(name);
				}
	static void changeName(StringBuffer name){
		name.append("sathiyaseelan");
		System.out.println(name);
	}
}
