package der3;

public class wrapperClassExercise {public static void main(String[] args) {
	
	
	String s1 ="$10,150.55";
	
	String s2 ="15,120.40";
	String s3 = "$25,150.60";
	
	String total = "$50,451.55";
	String s11 =s1.replace("$", "");
	String s111 = s11.replace(",", "");
	String s1111 = s111.replace(".", "");
	String s22= s2.replace("$", "");
	String s222= s22.replace(",", "");
	String s2222= s222.replace(".", "");
	String s33=s3.replace("$", "");
	String s333=s33.replace(",", "");
	String s3333=s333.replace(".", "");
	
	String total1 =total.replace("$", "");
	String total11=total1.replace(",", "");
	String total111=total11.replace(".", "");
	
	Double a = Double.valueOf(total111);
	System.out.println(a);
	
	System.out.println(a.equals(total111));
	
	
	
}

}
