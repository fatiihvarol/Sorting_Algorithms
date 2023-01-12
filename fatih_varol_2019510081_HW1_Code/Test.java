import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.GroupLayout.SequentialGroup;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	
			String temparraysize;
			System.out.println("What size array do you want to create?");
			Scanner scan = new Scanner(System.in);
			System.out.println("Press 1 for : 1,000");
			System.out.println("Press 2 for : 10,000");
			System.out.println("Press 3 for : 100,000\n");
			temparraysize = scan.next();

			int arraysize = 1;
			if (temparraysize.equalsIgnoreCase("1"))
				arraysize = 1000;
			else if (temparraysize.equalsIgnoreCase("2"))
				arraysize = 10000;
			else if (temparraysize.equalsIgnoreCase("3"))
				arraysize = 100000;
			int array[] = new int[arraysize];
			String situation;
			System.out.println("Which situation do you prefer?");
			System.out.println("Press 1 for : Equal Integers");
			System.out.println("Press 2 for : Random Integers");
			System.out.println("Press 3 for : Increasing Integers");
			System.out.println("Press 4 for : Decreasing Integers");
			situation = scan.next();
			if (situation.equalsIgnoreCase("1")) {
				for (int i = 0; i < arraysize; i++) {
					array[i] = 10;
				}
			}
			Random rnd = new Random();
			if (situation.equalsIgnoreCase("2")) {
				for (int i = 0; i < arraysize; i++) {
					array[i] = rnd.nextInt();
				}
			}

			else if (situation.equalsIgnoreCase("3")) {
				for (int i = 0; i < arraysize; i++) {
					array[i] = i;
				}
			} else if (situation.equalsIgnoreCase("4")) {
				for (int i = 0; i < array.length; i++) {
					array[i] = array.length - i - 1;
				}
			}

			

			String algorithmnumber;
			System.out.println("Which Algorithm Do You Want to Use ?");
			System.out.println("Press 1 for : HeapSort");
			System.out.println("Press 2 for : Shell Sort");
			System.out.println("Press 3 for : Intro Sort");
			algorithmnumber = scan.next();
			double startTime = System.nanoTime();
			if (algorithmnumber.equalsIgnoreCase("1")) {
				 HeapSort heapsort=new HeapSort();
				// System.out.print("Before sorting array elements are - \n"); 
				 // heapsort.printArr(array,arraysize); 
				  heapsort.heapSort(array,arraysize);
				//  System.out.print("\nAfter sorting array elements are - \n");
				//  heapsort.printArr(array, arraysize);

			} 
			else if (algorithmnumber.equalsIgnoreCase("2")) {
				
				// System.out.print("Before sorting array elements are - \n"); 
				  ShellSort shell = new ShellSort(); 
				 // shell.printArr(array, arraysize);
				  shell.shell(array, arraysize);
				//  System.out.print("\nAfter applying shell sort, the array elements are - \n");
				 // shell.printArr(array, arraysize);

			} 
			else if (algorithmnumber.equalsIgnoreCase("3")) 
			{
				 Introsort introsort=new Introsort(arraysize);
				  
				  for (int i = 0; i < arraysize; i++) 
				  { 
					  introsort.dataAppend(array[i]);
				  }
				//  System.out.println("Before Sorting");
				 // introsort.printData();
				  introsort.sortData(); 
				 // System.out.println("After Sorting");
				 // introsort.printData();
		}
			double estimatedTime = (System.nanoTime() - startTime);
			
			//InMilisecond
			System.out.println("estimatedTime : "+estimatedTime/1000000);
			
		}

		/*
		  int a[] = {45, 7, 20, 40, 25, 23, -2}; 
		  int n = a.length;
		  System.out.print("Before sorting array elements are - \n"); 
		
		  HeapSort heapsort=new HeapSort();
		  heapsort.printArr(a, n); 
		  heapsort.heapSort(a, n);
		  System.out.print("\nAfter sorting array elements are - \n");
		  heapsort.printArr(a, n);
		  
		  System.out.println("\n\n"); 
		  int b[] = { 30, 28, 37, 5, 9, 14,
		  22, 39 }; 
		  int q = b.length;
		  System.out.print("Before sorting array elements are - \n"); 
		  ShellSort shell = new ShellSort(); 
		  shell.printArr(b, q);
		  shell.shell(b, q);
		  System.out.print("\nAfter applying shell sort, the array elements are - \n");
		  shell.printArr(b, q);
		  
		  
		  System.out.println("\n\n");
		  
		  int[] inp = { 2, 10, 24, 2, 10, 11, 27, 4, 2, 4, 28, 16, 9, 8, 28, 10, 13,
		  24, 22, 28, 0, 13, 27, 13, 3, 23, 18, 22, 8, 8 }; 
		  int nn = inp.length;
		  Introsort introsort=new Introsort(nn);
		  
		  
		  
		 
		  
		  
		  for (int i = 0; i < nn; i++) { introsort.dataAppend(inp[i]); }
		 
		  introsort.printData(); introsort.sortData(); introsort.printData();
		 */

	}


