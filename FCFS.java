import java.util.*;

class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of processes");
        int n = sc.nextInt();

        int[] ar = new int[n];
        int[] bt = new int[n];
        int[] wt = new int[n];
        int[] tat = new int[n];
        int[] ct = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the arrival time for process " + (i + 1) + ": ");
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the burst time for process " + (i + 1) + ": ");
            bt[i] = sc.nextInt();
        }

        ct[0] = ar[0] + bt[0];
        for (int i = 1; i < n; i++) {
            ct[i] = ct[i - 1] + bt[i];
        }

        for (int i = 0; i < n; i++) {
            tat[i] = ct[i] - ar[i];
            wt[i] = tat[i] - bt[i];
        }

        System.out.println("Process\t\tArrival Time\t\tBurst Time\t\tCompletion Time\t\tTurn Around Time\t\tWaiting Time");
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "\t\t" + ar[i] + "\t\t" + bt[i] + "\t\t" + ct[i] + "\t\t" + tat[i] + "\t\t" + wt[i]);
        }

        sc.close();
    }
}
