//Matthew Tsenkov
//COSC 311
//Program 4

import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
	//Using 3 separate write methods, for the extensions. One for Quick, one for Heap, one for Merge.
	//I used only 1 for all but that required the user to type 9 names for each file we save. Now we type 3 names each 
	//use for each sort.
	public void writeForQuickSort(int[] arrAsc, int[] arrDsc, int[] arrRandom) {
		Scanner kb = new Scanner(System.in);
		try {
			//Taking response from user about name of file
			String response = kb.next();
			//Concatenating the response + the corresponding sort. Making it an UTF-8.
			PrintWriter writer = new PrintWriter(response + "QuickAsc.txt", "UTF-8");
			for (int i = 0; i < arrAsc.length; i++) {
				//writing to arrayAscending
				writer.write(arrAsc[i] + "\n");
				//need to flush writer or we lose data
				writer.flush();
			}
			writer.close();
			PrintWriter writerDsc = new PrintWriter(response + "QuickDsc.txt", "UTF-8");
			for (int i = 0; i < arrDsc.length; i++) {
				writerDsc.write(arrDsc[i] + "\n");
				writerDsc.flush();
			}
			writerDsc.close();
			
			PrintWriter writerRand = new PrintWriter(response + "QuickRandom.txt", "UTF-8");
			for (int i = 0; i < arrRandom.length; i++) {
				writerRand.write(arrRandom[i] + "\n");
				writerRand.flush();
			}
			writerRand.close();
		} catch (Exception e) {
			e.getMessage();
			kb.close();
		}
	}
	
	public void writeForHeapSort(int[] arrAsc, int[] arrDsc, int[] arrRandom) {
		Scanner kb = new Scanner(System.in);
		try {
			String response = kb.next();
			PrintWriter writer = new PrintWriter(response + "HeapAsc.txt", "UTF-8");
			for (int i = 0; i < arrAsc.length; i++) {
				writer.write(arrAsc[i] + "\n");
				writer.flush();
			}
			writer.close();
			PrintWriter writerDsc = new PrintWriter(response + "HeapDsc.txt", "UTF-8");
			for (int i = 0; i < arrDsc.length; i++) {
				writerDsc.write(arrDsc[i] + "\n");
				writerDsc.flush();
			}
			writerDsc.close();
			
			PrintWriter writerRand = new PrintWriter(response + "HeapRandom.txt", "UTF-8");
			for (int i = 0; i < arrRandom.length; i++) {
				writerRand.write(arrRandom[i] + "\n");
				writerRand.flush();
			}
			writerRand.close();
		} catch (Exception e) {
			e.getMessage();
			kb.close();
		}
	}
	
	public void writeForMergeSort(int[] arrAsc, int[] arrDsc, int[] arrRandom) {
		Scanner kb = new Scanner(System.in);
		try {
			String response = kb.next();
			PrintWriter writer = new PrintWriter(response + "MergeAsc.txt", "UTF-8");
			for (int i = 0; i < arrAsc.length; i++) {
				writer.write(arrAsc[i] + "\n");
				writer.flush();
			}
			writer.close();
			PrintWriter writerDsc = new PrintWriter(response + "MergeDsc.txt", "UTF-8");
			for (int i = 0; i < arrDsc.length; i++) {
				writerDsc.write(arrDsc[i] + "\n");
				writerDsc.flush();
			}
			writerDsc.close();
			
			PrintWriter writerRand = new PrintWriter(response + "MergeRandom.txt", "UTF-8");
			for (int i = 0; i < arrRandom.length; i++) {
				writerRand.write(arrRandom[i] + "\n");
				writerRand.flush();
			}
			writerRand.close();
		} catch (Exception e) {
			e.getMessage();
			kb.close();
		}
	}

}
