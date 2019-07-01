package der3;

public class exirces {
	public static void main(String[] args) {
		
		
		String org= "Java Exercises!";
		System.out.println(org.charAt(0));
		System.out.println(org.charAt(10));
		
		
		String st1 = "This is exercise 1";
		
		String st2 = "This is Exercise 1";
		
		System.out.println(st1==st2);
		System.out.println(st1.equalsIgnoreCase(st2));
		String org2 = "PHP Exercises and Python Exercises";
		System.out.println(org.contains("cis"));
		System.out.println(org.contains("exe"));
		
		
		String a = "$55,100.45";
		String b = "$75,000.57";
		String c = "$97,000.55";
		String total = "$227,101.57";
		
	    a = a.replace("$", "");
		
		a=a.replace(",", "");
		
		b=b.replace("$", "");
		b=b.replace(",", "");
		c=c.replace("$", "");
		c=c.replace(",", "");
		total=total.replace(",", "");
		total=total.replace("$", "");
		
		double b1=Double.parseDouble(a);
		double b2=Double.parseDouble(b);
		double c3=Double.parseDouble(c);
		double total1=Double.parseDouble(total);
		double LastTotal = b1+b2+c3;
		System.out.println("are last total and total 1 equal");
		System.out.println(LastTotal==total1);
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	}

}
