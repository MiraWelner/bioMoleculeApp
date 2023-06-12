package setupbiomolecule;
import setupbiomolecule.*;
import java.util.Scanner;

public class ScannerClass {
	public static String understoodMolecules() {
		return "alkane, alkene, alkyne, carboxilic acid, ester, ketone, amine, amide, ether, aldehyde or alcohol. ";
	}
	public static String errorMessage() {
		return "Error! You have either mispelled your molecule, not used standard nomenclature (http://www.chem.uiuc.edu/GenChemReferences/nomenclature_rules.html), or input a molecule that is not an" +  ScannerClass.understoodMolecules() + "Also, it can't have more than 10 carbons";
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String moleculeName = "";
		System.out.println("Enter any "  + understoodMolecules() + "with 10 or fewer carbons. \nIt MUST be in IUPAC standard nomenclature!! \nThis program will tell you the formula! Type 'stop' to stop.");
		while(!moleculeName.equals("stop")) {
			System.out.println("What is your Biomolecule?");
			moleculeName = scan.nextLine().toLowerCase();
			System.out.println(FunctionalGroupIdentifier.identifyType(moleculeName));
		}
		scan.close();
	}
}
