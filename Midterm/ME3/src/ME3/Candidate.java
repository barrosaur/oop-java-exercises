package ME3;

public class Candidate {
	private String name;
	private int numVotes;
	
	public Candidate() {
		this.name = null;
		this.numVotes = 0;
	}
	
	public Candidate(String name, int numVotes) {
		this.name = name;
		this.numVotes = numVotes;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumVotes() {
		return this.numVotes;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}
}
