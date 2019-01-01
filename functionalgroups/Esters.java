package functionalgroups;
import setupbiomolecule.PrefixToCarbon;

public class Esters {
	public static String go(String molecule) {
		
		int carbons = 0;
		int hydrogens = 0;
		int endOfFirstPrefix;
		int endOfSecondPrefix;
		
		//If there are two carbon strands
		if(molecule.length()>11){
			//gets first strand
			endOfFirstPrefix = molecule.indexOf("yl");
			String firstCarbonPrefix = molecule.substring(0, endOfFirstPrefix);
			carbons += PrefixToCarbon.prefixToCarbon(firstCarbonPrefix);
			
			//gets second strand
			endOfSecondPrefix = molecule.indexOf("anoate");
			String secondCarbonPrefix = molecule.substring(endOfFirstPrefix+3, endOfSecondPrefix);
			carbons+= PrefixToCarbon.prefixToCarbon(secondCarbonPrefix);
		}
		
		//If there is only one carbon strand
		else {
			endOfSecondPrefix = molecule.indexOf("anoate");
			String carbonPrefix = molecule.substring(0, endOfSecondPrefix);
			carbons += PrefixToCarbon.prefixToCarbon(carbonPrefix);
		}
				
		hydrogens += carbons*2;
		String formula = "C"+ carbons + "H"+ hydrogens + "O2";
		return formula;
	}

}