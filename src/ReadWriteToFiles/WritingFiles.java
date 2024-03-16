package ReadWriteToFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** 
 * WRITING TO A FILE
 * 
 * In this Example of STREAM
 *  we have created the file 'myTextFile.txt'
 *  and wrote some lines in it AND
 *  created ANOTHER  file 'myTextFile.csv'(EXCEL FILE)
 *  and wrote MULTIPLE OF TWO
 ******************************************************/

public class WritingFiles {

	public static void main(String[] args) throws IOException {

		   //Following 3 lines performs STREAM CONNECTIVITY
			File f = new File("C:\\FileWriting\\myTextFile.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			
			//Writing inside the file
			writer.write("My Kids are most beautiful gift from God.");
			writer.newLine();
			writer.write("Apurva and Arjun are very talented.");
			writer.newLine();
			writer.write("They both adore each other which is the best part.");
			writer.newLine();
			
			//Close the STREAM
			writer.close();
			
			System.out.println("Text File Created Successfully : C:\\FileWriting\\myTextFile.txt");
			
			File f1 = new File("C:\\FileWriting\\myTextFile.csv");
			FileWriter fw1 = new FileWriter(f1);
			BufferedWriter writer1 = new BufferedWriter(fw1);
			
			int num,inc=1;
			//Writing inside the file --> Multiple of 2
			
			  for(int i=0;i<10;i++){
				  for(int j=0;j<1;j++){
			//		int num = (int)(Math.random()*100);
					num=2*inc;
					writer1.write("  2  x  "+inc+"  =  "+","); // output --> 2 x 1 ; 2 x 2 ; 2 x 3 
					writer1.write(num+" \t "+","); // output --> 2, 4, 6, 8,
				}
				writer1.newLine();
	           inc++;
			
			}
			//Close the STREAM
			writer1.close();
			
			System.out.println("Excel File Created Successfully : C:\\FileWriting\\myTextFile.csv");

	}
}
