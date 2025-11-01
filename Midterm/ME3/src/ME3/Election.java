package ME3;

public class Election {
	private Candidate c1, c2, c3, c4, c5;
	
	public Election() {
		Candidate c1 = new Candidate();
		Candidate c2 = new Candidate();
		Candidate c3 = new Candidate();
		Candidate c4 = new Candidate();
		Candidate c5 = new Candidate();
	}
	
	public Election(Candidate c1, Candidate c2, Candidate c3, Candidate c4, Candidate c5) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
	}
	
	public int calculateTotalVotes() {
		return this.c1.getNumVotes() + this.c2.getNumVotes() + this.c3.getNumVotes() + this.c4.getNumVotes() + this.c5.getNumVotes();
	}
	
	public double calculatePercentage(Candidate c) {
		return c.getNumVotes() / (double) calculateTotalVotes();
	}
	
	public String displayWinner() {
		Candidate[] candidates = {c1, c2, c3, c4, c5};
		
		Candidate winner = candidates[0];
		for(int i = 1; i < candidates.length; i++) {
			if(candidates[i].getNumVotes() > winner.getNumVotes()) {
				winner = candidates[i];
			}
		}
		
		return winner.getName();
	}
	
	public void displayResults() {
		System.out.println("Name	Votes Received	% of total votes");
		System.out.printf("%s\t%d\t\t%.2f%%\n", c1.getName(), c1.getNumVotes(), calculatePercentage(c1)*100);
		System.out.printf("%s\t%d\t\t%.2f%%\n", c2.getName(), c2.getNumVotes(), calculatePercentage(c2)*100);
		System.out.printf("%s\t%d\t\t%.2f%%\n", c3.getName(), c3.getNumVotes(), calculatePercentage(c3)*100);
		System.out.printf("%s\t%d\t\t%.2f%%\n", c4.getName(), c4.getNumVotes(), calculatePercentage(c4)*100);
		System.out.printf("%s\t%d\t\t%.2f%%\n", c5.getName(), c5.getNumVotes(), calculatePercentage(c5)*100);
	}
}
