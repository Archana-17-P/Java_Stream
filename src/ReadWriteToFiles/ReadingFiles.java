package ReadWriteToFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/** READING FROM A FILE
 * 
 *  The file created in 'WritingFiles.java' example,
 *  'myTextFile.txt' AND 'myTextFile.csv'(EXCEL FILE).
 *   In this Example of STREAM, 
 *   we read those files.
 *   
 ******************************************************/


public class ReadingFiles {

	
	public static void main(String[] args) throws IOException {
	
		//Following 3 lines performs STREAM CONNECTIVITY
		System.out.println("Reading from TEXT file :");
		System.out.println("========================");
		File f = new File("C:\\FileWriting\\myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);

		String line = null;
		while((line = reader.readLine())!=null){
			System.out.println(line);
		} 
		reader.close(); //Closing the connection
		
		System.out.println("\nReading from EXCEL file : Multiple 0f 2");
		System.out.println("=========================================");
		File f1 = new File("C:\\FileWriting\\myTextFile.csv");
		FileReader fr1 = new FileReader(f1);
		BufferedReader reader1 = new BufferedReader(fr1);

		String line1 = null;
		while((line1 = reader1.readLine())!=null){
			System.out.println(line1);
		}
            
		reader1.close();

	}

}
