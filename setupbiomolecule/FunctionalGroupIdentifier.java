package setupbiomolecule;
import functionalgroups.*;
public class FunctionalGroupIdentifier {
	public static String identifyType(String molecule) {
		String stringToReturn = null;
		if(molecule.endsWith("ane")) {
			stringToReturn = Alkanes.go(molecule);
		}
		else if(molecule.endsWith("ene")) {
			stringToReturn = Alkenes.go(molecule);
		}
		else if(molecule.endsWith("yne")) {
			stringToReturn = Alkynes.go(molecule);
		}
		else if(molecule.endsWith("ol")) {
			stringToReturn = Alcohols.go(molecule);
		}
		else if(molecule.endsWith("anoic acid")) {
			stringToReturn = CarboxilicAcid.go(molecule);
		}
		else if(molecule.endsWith("one")) {
			stringToReturn = Ketones.go(molecule);
		}
		else if(molecule.endsWith("amine")) {
			stringToReturn = Amines.go(molecule);
		}
		else if(molecule.endsWith("anoate")) {
			stringToReturn = Esters.go(molecule);
		}
		else if(molecule.endsWith("ether")) {
			stringToReturn = Ethers.go(molecule);
		}
		else if(molecule.endsWith("anal")) {
			stringToReturn = Aldehydes.go(molecule);
		}
		else if(molecule.endsWith("amide")) {
			stringToReturn = Amides.go(molecule);
		}
		else if(molecule.equals("stop")) {
			System.out.println("Thanks for using this program! Please email miraewelner@gmail.com for issues and improvements");
			System.exit(0);
		}
		else {
			stringToReturn = run.errorMessage();
		}
		return stringToReturn;
	}
}