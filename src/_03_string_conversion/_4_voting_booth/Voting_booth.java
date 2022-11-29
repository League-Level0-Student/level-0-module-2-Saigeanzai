package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_booth {


public static void main(String[] args) {
	
	String votingAge = JOptionPane.showInputDialog("How old are you?");
	int votingAgeAsInt = Integer.parseInt(votingAge);
	if (votingAgeAsInt >= 18) {
		JOptionPane.showInputDialog(null, "Who should the next president be?");
		
		
	}
	if (votingAgeAsInt <= 17) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}