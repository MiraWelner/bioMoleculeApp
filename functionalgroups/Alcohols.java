package functionalgroups;
import setupbiomolecule.PrefixToCarbon;
public class Alcohols {
	public static String go(String molecule) {
		int carbons = 0;
		int endOfCarbons = molecule.indexOf("anol");
		String carbonPrefix = molecule.substring(0, endOfCarbons);
		
		carbons = PrefixToCarbon.prefixToCarbon(carbonPrefix);

		int hydrogens = carbons*2+2;
		int oxygens = 1;
		String formula = "C"+ carbons + "H"+ hydrogens + "O" + oxygens;
		return formula;
    }
}