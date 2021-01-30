package ioOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fileOut=new FileOutputStream(new File("./Resources/DemoWrite.txt"));
			String names="Dillip Nayak, Satish Dubey, Nitish Singh, Mahesh Giri";
			byte[] nameBytes=names.getBytes();
			fileOut.write(nameBytes);
			System.out.println("Check the file in the directory for changes");
			fileOut.close();
			BufferedReader inFile = new BufferedReader(new FileReader(new File("./Resources/DemoWrite.txt")));
			int i=inFile.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=inFile.read();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File or Folder is not present");
		} catch (IOException e) {
			System.out.println("Error occured while writing to file.");
		}

	}

}
