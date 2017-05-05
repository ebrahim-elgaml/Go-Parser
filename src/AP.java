
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java_cup.runtime.Symbol;


public class AP {
	public static void main(String[] args) {

		String inFile = "MS3/Go2.in";
		String outFile = "MS3/Out2.out";

		if (args.length > 1) {
			inFile = args[0];
		}

		try {
			
			FileReader fis = new FileReader(inFile);
			BufferedReader bis = new BufferedReader(fis);

			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));

			@SuppressWarnings("deprecation")
			parser parser = new parser(new Lexer(bis));
			try {
				Symbol res = parser.parse();
				String val= (String) res.value;
				System.out.println("value " +val);
				writer.write(val);
			} catch (Exception e) {
				writer.write("ParseError");
			}
			
			fis.close();
			bis.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
