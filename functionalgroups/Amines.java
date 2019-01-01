package functionalgroups;
import setupbiomolecule.PrefixToCarbon;

public class Amines {
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
			System.out.println(carbons);
			
			//gets second strand
			endOfSecondPrefix = molecule.indexOf("ylamine");
			String secondCarbonPrefix = molecule.substring(endOfFirstPrefix+2, endOfSecondPrefix);
			carbons+= PrefixToCarbon.prefixToCarbon(secondCarbonPrefix);
			hydrogens++;
			System.out.println(carbons);

		}
		
		//If there is only one carbon strand
		else {
			endOfSecondPrefix = molecule.indexOf("ylamine");
			String carbonPrefix = molecule.substring(0, endOfSecondPrefix);
			carbons += PrefixToCarbon.prefixToCarbon(carbonPrefix);
		}
				
		hydrogens += carbons*2 + 3;
		String formula = "C"+ carbons + "H"+ hydrogens + "N";
		return formula;
	}

}