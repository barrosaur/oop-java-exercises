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
	
	public int percentage(char grade) {
		int total = getTotalNumGrades();
		if(total == 0) return 0;
		
		double percentage = 0;
		
		switch (Character.toUpperCase(grade)) {
		case 'A': percentage = ((double) gradeA / total) * 100; break;
		case 'B': percentage = ((double) gradeB / total) * 100; break;
		case 'C': percentage = ((double) gradeC / total) * 100; break;
		case 'D': percentage = ((double) gradeD / total) * 100; break;
		case 'F': percentage = ((double) gradeF / total) * 100; break;
		}
		
		return (int) Math.round(percentage);
	}
	
	private void drawBar(char grade, int count) {
		System.out.print(grade + ": ");
		for(int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void drawBarGrade() {
		System.out.println("          10|       20|       30|       40|       50|       60|       70|       80|       90|     100|");
		drawBar('A', gradeA);
		drawBar('B', gradeB);
		drawBar('C', gradeC);
		drawBar('D', gradeD);
		drawBar('F', gradeF);
	}
}
