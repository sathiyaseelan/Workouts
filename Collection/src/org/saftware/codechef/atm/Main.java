package org.saftware.codechef.atm;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
				double x = scanner.nextDouble();
				double b = scanner.nextDouble();
				double ret=0.0;
				if(x%5==0 && (x<(b-0.50))){
					
					ret = b-x-0.50;
				}else{
					ret =b;
				}
				NumberFormat nf = NumberFormat.getNumberInstance();
				nf.setMaximumFractionDigits(2);
				nf.setMinimumFractionDigits(2);
				System.out.println(nf.format(ret));
	}

}
