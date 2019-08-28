
package wordcapitalization;
 import java.util.*;
import java.io.*;

/**
 *
 * @author adrimexico1
 */
public class wordcapitalization {

   


	public static void main( String args[] ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		PrintWriter pw = new PrintWriter( new BufferedWriter( new OutputStreamWriter( System.out ) ) );
		
		char c = (char)br.read();
		pw.print( Character.toUpperCase(c) );
		pw.println( br.readLine() );
		
		pw.close();
	}
}

    
    

