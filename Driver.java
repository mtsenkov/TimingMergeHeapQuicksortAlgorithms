//Matthew Tsenkov
//COSC 311
//Program 4

public class Driver {
	public static void main(String[] args) {
		ReadFile read = new ReadFile();
		//Creating the 9 arrays
		int[] quickAscending = new int[10000];
		int[] quickDescending = new int[10000];
		int[] quickRandom = new int[10000];

		int[] heapAscending = new int[10000];
		int[] heapDescending = new int[10000];
		int[] heapRandom = new int[10000];

		int[] mergeAscending = new int[10000];
		int[] mergeDescending = new int[10000];
		int[] mergeRandom = new int[10000];
		
		//Adding data to each array.
		//This is adding to Ascending arrays of each sort
		read.readFileAscending(quickAscending);
		read.readFileAscending(heapAscending);
		read.readFileAscending(mergeAscending);
		
		//Adding data to descending arrays of each sort.
		read.readFileDescending(quickDescending);
		read.readFileDescending(heapDescending);
		read.readFileDescending(mergeDescending);
		
		//Adding data to random arrays of each sort
		read.readFileRandom(quickRandom);
		read.readFileRandom(heapRandom);
		read.readFileRandom(mergeRandom);

		// QuickSort
		QuickSort quickSort = new QuickSort();
		
		
		long nano_startTimeForQuickSortAscending = System.nanoTime(); //Starting time
		quickSort.quickSort(quickAscending, 0, quickAscending.length - 1);// Quick Ascending
		long nano_endTimeForQuickSortAscending = System.nanoTime(); //Starting a second timer.
		//Subtracting start time from end time to get the time in nanoseconds it took to sort the array.
		long totalTimeQuickSortAscending = nano_endTimeForQuickSortAscending - nano_startTimeForQuickSortAscending;

		long nano_startTimeForQuickSortDescending = System.nanoTime();
		quickSort.quickSort(quickDescending, 0, quickDescending.length - 1); // Quick Descending
		long nano_endTimeForQuickSortDescending = System.nanoTime();
		long totalTimeQuickSortDescending = nano_endTimeForQuickSortDescending - nano_startTimeForQuickSortDescending;

		long nano_startTimeForQuickSortRandom = System.nanoTime();
		quickSort.quickSort(quickRandom, 0, quickRandom.length - 1); // Quick Random
		long nano_endTimeForQuickSortRandom = System.nanoTime();
		long totalTimeQuickSortRandom = nano_endTimeForQuickSortRandom - nano_startTimeForQuickSortRandom;

		// HeapSort
		HeapSort heapSort = new HeapSort();

		long nano_startTimeForHeapSortAscending = System.nanoTime();
		heapSort.sort(heapAscending); // Heap Ascending
		long nano_endTimeForHeapSortAscending = System.nanoTime();
		long totalTimeHeapSortAscending = nano_endTimeForHeapSortAscending - nano_startTimeForHeapSortAscending;

		long nano_startTimeForHeapSortDescending = System.nanoTime();
		heapSort.sort(heapDescending); // Heap Descending
		long nano_endTimeForHeapSortDescending = System.nanoTime();
		long totalTimeHeapSortDescending = nano_endTimeForHeapSortDescending - nano_startTimeForHeapSortDescending;

		long nano_startTimeForHeapSortRandom = System.nanoTime();
		heapSort.sort(heapRandom); // Heap Random
		long nano_endTimeForHeapSortRandom = System.nanoTime();
		long totalTimeHeapSortRandom = nano_endTimeForHeapSortRandom - nano_startTimeForHeapSortRandom;

		//MergeSort
		MergeSort mergeSort = new MergeSort();

		long nano_startTimeForMergeSortAscending = System.nanoTime();
		mergeSort.mergeSort(mergeAscending, 0, mergeAscending.length - 1); // Merge Ascending
		long nano_endTimeForMergeSortAscending = System.nanoTime();
		long totalTimeHeapMergeSortAscending = nano_endTimeForMergeSortAscending - nano_startTimeForMergeSortAscending;

		long nano_startTimeForMergeSortDescending = System.nanoTime();
		mergeSort.mergeSort(mergeDescending, 0, mergeDescending.length - 1); // Merge Descending
		long nano_endTimeForMergeSortDescending = System.nanoTime();
		long totalTimeMergeSortDescending = nano_endTimeForMergeSortDescending - nano_startTimeForMergeSortDescending;

		long nano_startTimeForMergeSortRandom = System.nanoTime();
		mergeSort.mergeSort(mergeRandom, 0, mergeRandom.length - 1); // Merge Random
		long nano_endTimeForMergeSortRandom = System.nanoTime();
		long totalTimeMergeSortRandom = nano_endTimeForMergeSortRandom - nano_startTimeForMergeSortRandom;
		
		//Creating and printing a table out of all sorts in a neat way.
		System.out.println("Table summarizing all of the sorts (time is in nano seconds): \n");
		System.out.println("\t\t" + "QuickSort" + "\tHeapSort" + "\tMergeSort");
		System.out.println("Ascending" + "\t" + totalTimeQuickSortAscending + "\t" + totalTimeHeapSortAscending + "\t\t"
				+ totalTimeHeapMergeSortAscending);
		System.out.println("Random" + "\t\t" + totalTimeQuickSortDescending + "\t" + totalTimeHeapSortDescending
				+ "\t\t" + totalTimeMergeSortDescending);
		System.out.println("Descending" + "\t" + totalTimeQuickSortRandom + "\t\t" + totalTimeHeapSortRandom + "\t\t"
				+ totalTimeMergeSortRandom);
	
		//Making the writer in order to write the arrays to disk.
		WriteFile write = new WriteFile();
		
		//Writing for Quick
		System.out.println("\nEnter a name for quick sort without using an extention.");
		write.writeForQuickSort(quickAscending, quickDescending, quickRandom);
		
		//Writing for Heap
		System.out.println("\nEnter a name for heap sort without using an extention.");
		write.writeForHeapSort(heapAscending, heapDescending, heapRandom);
		
		//Writing for Merge
		System.out.println("\nEnter a name for merge sort without using an extention.");
		write.writeForMergeSort(mergeAscending, mergeDescending, mergeRandom);
	}
}