package functionalgroups;
import setupbiomolecule.PrefixToCarbon;

public class Amides {
	public static String go(String molecule) {
		
		int carbons = 0;
		int hydrogens = 0;
		int endOfFirstPrefix;
		int endOfSecondPrefix;
		int endOfOnlyPrefix;
		String carbonPrefix;
		
		//If there are two strands of the same number of carbons
		if(molecule.substring(0, 2).equals("di")) {
			endOfOnlyPrefix = molecule.indexOf("ylamide");
			carbonPrefix = molecule.substring(2, endOfOnlyPrefix);
			carbons += 2*(PrefixToCarbon.prefixToCarbon(carbonPrefix));
		}
					
		//If there are two carbon strands
		if(molecule.length()>11){
			//gets first strand
			endOfFirstPrefix = molecule.indexOf("yl");
			String firstCarbonPrefix = molecule.substring(0, endOfFirstPrefix);
			carbons += PrefixToCarbon.prefixToCarbon(firstCarbonPrefix);
			System.out.println(carbons);
			
			//gets second strand
			endOfSecondPrefix = molecule.indexOf("ylamide");
			String secondCarbonPrefix = molecule.substring(endOfFirstPrefix+2, endOfSecondPrefix);
			carbons+= PrefixToCarbon.prefixToCarbon(secondCarbonPrefix);
			hydrogens++;
			System.out.println(carbons);

		}
		
		//If there is only one carbon strand
		else {
			endOfSecondPrefix = molecule.indexOf("ylamide");
			carbonPrefix = molecule.substring(0, endOfSecondPrefix);
			carbons += PrefixToCarbon.prefixToCarbon(carbonPrefix);
		}
				
		hydrogens += carbons*2 + 3;
		String formula = "C"+ carbons + "H"+ hydrogens + "ON";
		return formula;
	}

}