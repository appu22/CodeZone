package test.aumnics.ubed;

import test.aumnics.ubed.classs.P_Printer;
import test.aumnics.ubed.classs.PrintScanner;
import test.aumnics.ubed.classs.PrinterManager;
import test.aumnics.ubed.classs.S_Scanner;
import test.aumnics.ubed.classs.ScannerManager;

public class EnteryPointTester {
	
	
	
	public static void main(String[] args) {
		
		P_Printer p_Printer = new P_Printer();
		S_Scanner s_scanner = new S_Scanner();
		
		
		PrinterManager printerManager =new  PrinterManager();
		ScannerManager scannerManager = new ScannerManager();
		
		printerManager.PrintDocument(p_Printer);
		scannerManager.ScanDocument(s_scanner);
		
		PrintScanner printScanner = new PrintScanner();
		
		
		P_Printer print = printScanner.print(p_Printer);
		S_Scanner scan = printScanner.scan(s_scanner);
		
		
		printerManager.PrintDocument(print);
		scannerManager.ScanDocument(scan);
	}

}
