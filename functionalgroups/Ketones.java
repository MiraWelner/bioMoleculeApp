package functionalgroups;
import setupbiomolecule.PrefixToCarbon;

public class Ketones {
	public static String go(String molecule) {
		
		int carbons = 0;
		int hydrogens = 0;
		int endOfFirstPrefix;
		int endOfSecondPrefix;
		int endOfOnlyPrefix;
		String carbonPrefix = "";
		
		//If there are two strands of the same number of carbons
		if(molecule.substring(0, 2).equals("di")) {
			endOfOnlyPrefix = molecule.indexOf("yl ketone");
			carbonPrefix = molecule.substring(2, endOfOnlyPrefix);
			carbons += 2*(PrefixToCarbon.prefixToCarbon(carbonPrefix));
		}
		
		//If there are two carbon strands
		else if(molecule.length()>14){
			//gets first strand
			endOfFirstPrefix = molecule.indexOf("yl");
			String firstCarbonPrefix = molecule.substring(0, endOfFirstPrefix);
			carbons += PrefixToCarbon.prefixToCarbon(firstCarbonPrefix);
			
			//gets second strand
			endOfSecondPrefix = molecule.indexOf("yl ketone");
			String secondCarbonPrefix = molecule.substring(endOfFirstPrefix+3, endOfSecondPrefix);
			carbons+= PrefixToCarbon.prefixToCarbon(secondCarbonPrefix);
		}
		
		//If there is only one carbon strand
		else {
			endOfOnlyPrefix = molecule.indexOf("yl ketone");
			carbonPrefix = molecule.substring(0, endOfOnlyPrefix);
			carbons += PrefixToCarbon.prefixToCarbon(carbonPrefix);
		}
				
		hydrogens += carbons*2;
		String formula = "C"+ carbons + "H"+ hydrogens + "O";
		return formula;
	}
}