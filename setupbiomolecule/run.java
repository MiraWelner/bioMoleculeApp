
package setupbiomolecule;

import javax.swing.JOptionPane;

public class run {

	public static String understoodMolecules() {
		return "alkane, alkene, alkyne, carboxilic acid, ester, ketone, amine, amide, ether, aldehyde or alcohol. ";
	}

	public static String errorMessage() {
		return "Error! You have either mispelled your molecule, not used standard nomenclature (http://www.chem.uiuc.edu/GenChemReferences/nomenclature_rules.html), or input a molecule that is not an"
				+ run.understoodMolecules() + "Also, it can't have more than 10 carbons";
	}

	public static void main(String[] args) {
		String moleculeName = "";
		while (moleculeName != "stop") {

			moleculeName = JOptionPane.showInputDialog("What is your Biomolecule?").toLowerCase();

			JOptionPane.showMessageDialog(null, FunctionalGroupIdentifier.identifyType(moleculeName), moleculeName,
					JOptionPane.PLAIN_MESSAGE);
		}
		System.exit(0);

	}
}