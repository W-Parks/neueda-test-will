package animals;

import java.util.ArrayList;

import animals.Whale;

public class WhaleWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Whale> whales = new ArrayList<Whale>();	//create arraylist
		
		//add objects to ArrayList
		whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
		whales.add(new Whale("Blue", "Pacific", 2001, 23, 16));	//da ba dee da ba daa
		whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
		whales.add(new Whale("Humpback", "Antarctic", 919, 13, 13));
		
		printAllDetails(whales);
		//printAtlanticNames(whales);

	}
	
	public static void printAllDetails(ArrayList<Whale> whales) {
		
		for (int i = 0; i < whales.size(); i++) {
			System.out.println(whales.toString());	//
		}
		
	}
	
	public static void printAtlanticNames(ArrayList<Whale> whales) {
		
		//If mainOcean matched Atlantic Print name of whale(s)
		
		//if (whales.mainOcean) {	
			
		//}
	}
	
	
}
