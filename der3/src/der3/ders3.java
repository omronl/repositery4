package der3;

public class ders3 {

	public static void main(String[] args) {

		// String str = "My name is Omer.I AM FROM TURKEY";
		// System.out.println(str.length());

		// System.out.println(str);
		// System.out.println(str.charAt(4));
		// System.out.println(str.indexOf("m"));//
		//
		// indexof//contains

		String abc = "Paris Saint-Germain is rich beyond belief";
		System.out.println(abc.length());
		System.out.println(abc.replace("S", "G"));
		System.out.println(abc.replace("s", "P"));
		System.out.println(abc.contains("s2"));
		System.out.println(abc.contentEquals("s2"));
		String davul = "omer so rich";
		System.out.println(davul.contentEquals(davul));

		
		String num1= "$15.00";
		String num2= "$9.00";
		String total= "$24.00";
		System.out.println(total.replace("$", ""));
		System.out.println(total);
		
		String s1 = "95";
		String s2 = "105";
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		System.out.println(i1);
		
		
		
	}

}
