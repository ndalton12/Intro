
public class Sentence {
	
	String s;
	
	public Sentence (String s) {
		this.s = s;
	}
	
	public static void main (String args[]) {
		Sentence hi = new Sentence("Greetings");
		
		hi.reverse();
		
		System.out.println(hi.getText());
	}
	
	public void reverse() {
		String sub = s.substring(0,1);
		s = s.substring(1);
		
		if (s.length() > 1)
			reverse();
		
		s = s.concat(sub);
	}
	
	public String getText() {
		return s;
	}
}
