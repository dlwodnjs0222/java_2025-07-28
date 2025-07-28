package sec01.esc02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEX02 {

	public static void main(String[] args) throws IOException {
		Reader re = new FileReader("c:/tmp/test2.text");
		
		char[] buf = new char[100];
		
		while (true) {
			int rcn = re.read(buf);
			if(rcn == -1) break;
			for(int i = 0; i<rcn; i++) {
				System.out.println(buf[i]);
			}
		}
		re.close();

	}

}
