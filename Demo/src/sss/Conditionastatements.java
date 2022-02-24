package sss;

public class Conditionastatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		if(a<b){                      //compares a& b
			System.out.println("b is greater");
		}else{
			System.out.println("a is greatter");
		}
		String s="L";
		if(s.equalsIgnoreCase("S")){        // compares ignoring the case sensitivity
			System.out.println("Selenium");
		}else if(s.equalsIgnoreCase("q")){
			System.out.println("QTP");
		}
		else if(s.equalsIgnoreCase("L")){
			System.out.println("Load runner");

		}else{
			System.out.println("Invalid data");
		}
		String course="s";
		switch(course.toUpperCase()){      // converts to upper case
		case"S":
			System.out.println("Selenium");
		case"Q":
			System.out.println("QTP");
		case"L":
			System.out.println("Load Runner");
		}
	}

}
