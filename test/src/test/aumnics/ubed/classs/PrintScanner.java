package test.aumnics.ubed.classs;

import test.aumnics.ubed.interfa.I_Printer;
import test.aumnics.ubed.interfa.I_Scanner;

public  class PrintScanner implements I_Printer,I_Scanner{

	@Override
	public S_Scanner scan(S_Scanner s_Scanner) {
		return s_Scanner;
	}

	@Override
	public P_Printer print(P_Printer p_Printer) {
		return p_Printer;
	}




}
