package ME3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Candidate c1 = new Candidate("L1", 67);
		Candidate c2 = new Candidate("L2", 52);
		Candidate c3 = new Candidate("L3", 55);
		Candidate c4 = new Candidate("L4", 70);
		Candidate c5 = new Candidate("L5", 80);
		
		Election e1 = new Election(c1, c2, c3, c4, c5);
		System.out.println(e1.calculateTotalVotes());
		System.out.println(e1.calculatePercentage(c1));
		System.out.println("Winner: " + e1.displayWinner());
		e1.displayResults();
	}

}
