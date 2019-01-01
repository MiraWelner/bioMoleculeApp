package setupbiomolecule;

public class PrefixToCarbon {
	public static int prefixToCarbon(String carbonPrefix) {
		int carbons = 0;
		
		//Find prefix
		if(carbonPrefix.equals("meth")) {
			carbons = 1;
		}
		else if(carbonPrefix.equals("eth")) {
			carbons = 2;
		}
		else if(carbonPrefix.equals("prop")) {
			carbons = 3;
		}
		else if(carbonPrefix.equals("but")) {
			carbons = 4;
		}
		else if(carbonPrefix.equals("pent")) {
			carbons = 5;
		}
		else if(carbonPrefix.equals("hex")) {
			carbons = 6;
		}
		else if(carbonPrefix.equals("hept")) {
			carbons = 7;
		}
		else if(carbonPrefix.equals("oct")) {
			carbons = 8;
		}
		else if(carbonPrefix.equals("non")) {
			carbons = 9;
		}
		else if(carbonPrefix.equals("dec")) {
			carbons = 10;
		}
		else {
			carbons = 0;
			System.out.println(ScannerClass.errorMessage());
			System.exit(0);
		}
		return carbons;
	}
}