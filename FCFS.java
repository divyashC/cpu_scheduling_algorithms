/*
    @divyashC
    Date - 26th March 2022
    Time - 1:11 AM
*/
import java.util.Scanner;

public class FCFS {

    // method to print single digits with 0 (example: 1,2,3 as 01,02,03)
	public static String format(int n) {
		return (n < 10 ? "0" : "") + n;
	}

    // method to add all items in an int array
	public static float sum(int[] arr) {
		float sum = 0;
		for( int i : arr) {
    		sum += i;
		}
		return sum;
	}

    // main method
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        // getting total number of processes from user
		System.out.print("Enter Number of Processes: ");
		int total_p = sc.nextInt();

		// declaring all required arrays
		int bt[] = new int[total_p]; // burst time
		int at[] = new int[total_p]; // arrival time
		int pNo[] = new int [total_p]; // process number
        int ct[] = new int[total_p]; // completion time    
		int tat[] = new int[total_p]; // turnaround time
		int wt[] = new int[total_p]; // waiting time

		System.out.println("\n- - - -  * Enter Burst Time and Arrival Time for each Process * - - - -");

		// getting Arrival time from user
		System.out.println("\nEnter Arrival Time for all Processes: e.g. P1 P2 P3 P4 P5 (separate with spaces)");
		for (int i = 0; i < total_p; i++) {
			pNo[i] = i + 1;
			at[i] = sc.nextInt();
		}

		// getting Burst time from user
		System.out.println("\nEnter Burst Time for all Processes: e.g. P1 P2 P3 P4 P5 (separate with spaces)");
		for (int i = 0; i < total_p; i++) {
			bt[i] = sc.nextInt();
		}

		// Printing total processes, arrival time and burst time in a table
		System.out.println("\nP No | AT   |  BT");
		System.out.println("------------------");
		for (int i = 0; i < total_p; i++) {
			System.out.println("P" + pNo[i] + "   | " + format(at[i])  + "   | " + format(bt[i]));
		}	
        System.out.println("------------------");
	
        System.out.println("\n- - * FCFS | First Come First Serve * - -");

        int temp;
		for (int i = 0; i < total_p; i++) {
			for (int j = 0; j < total_p; j++) {
				// sorting all processes according to their arrival time
                if(at[i] < at[j]) {
                    temp = at[i];
                    at[i] = at[j];
                    at[j] = temp;

                    temp = pNo[i];
                    pNo[i] = pNo[j];
                    pNo[j] = temp;

                    temp = bt[i];
                    bt[i] = bt[j];
                    bt[j] = temp;
                }
			}
		}

		 // Printing solution table
		System.out.println("\nP No | AT   | BT   | CT   | TAT  | WT");
		System.out.println("---------------------------------------");
		for (int i = 0; i < total_p; i++) {

            /* calculating completion time for each process
            for first process, completion time is equal to its burst time 
            but for reset processes, completion time is sum of 
            previous process' completion time and current process' burst time */

			ct[i] = i == 0 ? bt[i] : (ct[i-1] < at[i] ? at[i] : ct[i-1])  + bt[i]; 

            // turn around time is the difference between completion time and arrival time
			tat[i] = ct[i] - at[i];

            // waiting time is the difference between turn around time and burst time
			wt[i] = tat[i] - bt[i];

            /* printing all values in a tabular format
            format() method is called to concat 0 to single digits (example: 1,2,3 as 01,02,03)
            to have a properly formatted table */

			System.out.println("P" + pNo[i] + "   | " + format(at[i]) + "   | " + format(bt[i]) + "   | " + format(ct[i]) + "   | " + format(tat[i]) + "   | " + format(wt[i]));
			
		}
		System.out.println("---------------------------------------");

        // average turn around time = sum of all turn around times / total number of processes
		System.out.println("\nAverage Turnaround Time: " + (sum(tat) / total_p));

        // average waiting time = sum of all waiting times / total number of processes
		System.out.println("Average Waiting Time: " + (sum(wt) / total_p));

        // schedule length = total time taken to complete all processes - first arrival time
        System.out.println("Schedule Length: " + (ct[total_p-1] - at[0]));

        // through put = no. of processes / schedule length (answer in float)
        System.out.println("Throughput: " + (float)total_p / (ct[total_p-1] - at[0]));

    }
}
