package ioOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {		
		try {
			FileInputStream inFile=new FileInputStream(new File("./Resources/DemoWrite.txt"));
			int i=inFile.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=inFile.read();
			}
			inFile.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File is not present in the directory");
		}
		catch(IOException e) {
			System.out.println("Error occured while reading from file");
			
		}
	}
}
