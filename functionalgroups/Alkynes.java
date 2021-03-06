package functionalgroups;
import setupbiomolecule.PrefixToCarbon;

public class Alkynes {
	public static String go(String molecule) {
		int carbons = 0;
		int endOfCarbons = molecule.indexOf("yne");
		String carbonPrefix = molecule.substring(0, endOfCarbons);
		
		carbons = PrefixToCarbon.prefixToCarbon(carbonPrefix);

		int hydrogens = carbons*2-2;
		String formula = "C"+ carbons + "H"+ hydrogens;
		return formula;
	}

}