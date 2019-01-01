package functionalgroups;
import setupbiomolecule.PrefixToCarbon;

public class Alkanes {
	public static String go(String molecule) {
		
		int carbons = 0;
		int endOfCarbons = molecule.indexOf("ane");
		String carbonPrefix = molecule.substring(0, endOfCarbons);
		
		carbons = PrefixToCarbon.prefixToCarbon(carbonPrefix);

		int hydrogens = carbons*2+2;
		String formula = "C"+ carbons + "H"+ hydrogens;
		return formula;
	}

}