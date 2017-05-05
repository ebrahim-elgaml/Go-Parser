import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class SingleExpression {
	String head;
	String body;
	boolean isMohsen = false;
	
	public SingleExpression(String head, String body) {
		this.head = head;
		this.body = body;
	}
	
	public String toString() {
		return "head: " + this.head +", body: " +this.body;
	}
}
public class Constants {
	static int tCounter = 0;
	static Queue<SingleExpression> exQueue = new LinkedList<SingleExpression>();
	static int lCounter = 0;
	static ArrayList<String> functions = new ArrayList<String>();
	public Constants(){
	};
	
	
	public static void main(String [] args) { 
		String s = "ana ebrahim elgaml";
		System.out.println(s.replace("www", "fathy"));
	}
}
