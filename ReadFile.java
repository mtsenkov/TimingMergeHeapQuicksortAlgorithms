//Matthew Tsenkov
//COSC 311
//Program 4

import java.io.File;
import java.util.Scanner;

public class ReadFile {
	private Scanner dataAscend;
	private Scanner dataDescend;
	private Scanner dataRandom;
	
	//Uses dataAscend.txt to read from and adds it to the corresponding array.
	public void readFileAscending(int[] arr) {
		try {
			dataAscend = new Scanner(new File("dataAscend.txt"));
		} catch (Exception e) {
			System.out.println("File not found.");
		}
		int i = 0;
		while(dataAscend.hasNextInt()) {
			arr[i++] = dataAscend.nextInt();
		}
		dataAscend.close();
	}
	
	//Uses dataDescend.txt to read from and adds it to the corresponding array.
	public void readFileDescending(int[] arr) {
		try {
			dataDescend = new Scanner(new File("dataDescend.txt"));
		} catch (Exception e) {
			System.out.println("File not found.");
		}
		int i = 0;
		while(dataDescend.hasNextInt()) {
			arr[i++] = dataDescend.nextInt();
		}
		dataDescend.close();
	}
	
	//Uses dataRandom.txt to read from and adds it to the corresponding array.
	public void readFileRandom(int[] arr) {
		try {
			dataRandom = new Scanner(new File("dataRandom.txt"));
		} catch (Exception e) {
			System.out.println("File not found.");
		}
		int i = 0;
		while(dataRandom.hasNextInt()) {
			arr[i++] = dataRandom.nextInt();
		}
		dataRandom.close();
	}
}
