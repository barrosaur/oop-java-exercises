package exercise3;

public class GradeDistribution {
	private int gradeA;
	private int gradeB;
	private int gradeC;
	private int gradeD;
	private int gradeF;
	
	public void setGrade(int a, int b, int c, int d, int f) {
		this.gradeA = a;
		this.gradeB = b;
		this.gradeC = c;
		this.gradeD = d;
		this.gradeF = f;
	}
	
	public int getGradeA() {return gradeA;}
	public int getGradeB() {return gradeB;}
	public int getGradeC() {return gradeC;}
	public int getGradeD() {return gradeD;}
	public int getGradeF() {return gradeF;}
	
	public int getTotalNumGrades() {
		return gradeA + gradeB + gradeC + gradeD + gradeF;
	}
	
	public double percentage(char grade) {
		int total = getTotalNumGrades();
		if(total == 0) return 0;
		
		int count = 0;
		
		switch (Character.toUpperCase(grade)) {
		case 'A': count = gradeA; break;
		case 'B': count = gradeB; break;
		case 'C': count = gradeC; break;
		case 'D': count = gradeD; break;
		case 'F': count = gradeF; break;
		}
		
		return (double) count / total * 100.0;
	}
	
	private void drawBar(char grade, double percent) {
		System.out.print(grade + ": ");
		int asterisk = (int) Math.round(percent / 2);
		for(int i = 0; i < asterisk; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void drawBarGrade() {
		drawBar('A', percentage('A'));
		drawBar('B', percentage('B'));
		drawBar('C', percentage('C'));
		drawBar('D', percentage('D'));
		drawBar('F', percentage('F'));
	}
}
