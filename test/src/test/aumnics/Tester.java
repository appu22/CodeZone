package test.aumnics;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
		System.out.println("enter the fees ");
		int fee = scanner.nextInt();		
		app(fee);
		
//		Date date = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//		String format = formatter.format(formatter);
//		System.out.println(format);
	}
	public static  void app(int fee) {
		
		SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MM-dd");
		sdfo.format("04/21");
 		
		
		if(fee == 5000) {
			System.out.println("Your are eligable...");
		}else {
			System.out.println(" please pay fees ");
		}
		
	}

}
