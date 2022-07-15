package object;

public class Score {
	private String subject;
	private int score;
	
	
	@Override
	public String toString() {
		return "Score [subject=" + subject + ", score=" + score + "]";
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	


}
