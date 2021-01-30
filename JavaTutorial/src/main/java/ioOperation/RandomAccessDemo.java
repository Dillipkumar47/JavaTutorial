package ioOperation;

import java.io.*;

public class RandomAccessDemo {
	public static void main(String args[]) throws Exception {
		RandomAccessFile randomFile = new RandomAccessFile("D:\\Test\\Output.txt", "rw");
		randomFile.writeUTF("Writing Randomly");
        System.out.println("Current position:" + randomFile.getFilePointer());
        randomFile.seek(0);
		System.out.println(randomFile.readUTF());
		System.out.println("Current position:" + randomFile.getFilePointer());
		randomFile.close();
	}
}

