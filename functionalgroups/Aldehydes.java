package functionalgroups;
import setupbiomolecule.PrefixToCarbon;

public class Aldehydes {
	public static String go(String molecule) {
		
		int carbons = 0;
		int hydrogens = 0;
		int endOfPrefix;
		String carbonPrefix = "";
		
		endOfPrefix = molecule.indexOf("anal");
		carbonPrefix = molecule.substring(0, endOfPrefix);
		carbons += PrefixToCarbon.prefixToCarbon(carbonPrefix);
			
		hydrogens += carbons*2;
		String formula = "C"+ carbons + "H"+ hydrogens + "O";
		return formula;
	}
}