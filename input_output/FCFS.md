# FCFS | First Come First Serve

###### **Sample Input and Output for FCFS**

## Question

Consider the set of 5 processes whose arrival time and burst time are given below

| Process No. | Arrival Time | Burst Time |
| ----------- | ------------ | ---------- |
| P1          | 0            | 3          |
| P2          | 1            | 2          |
| P3          | 2            | 1          |
| P4          | 3            | 4          |
| P5          | 4            | 5          |
| P6          | 5            | 2          |

## Input

Sample Input for above question

```markdown
6
0 1 2 3 4 5
3 2 1 4 5 2
```

## Output

Sample Output for the above question

```
- - - - * FCFS | First Come First Serve * - - - -
-------------------------------------------------
| P No. | AT    | BT    | CT    | TAT   | WT    |
-------------------------------------------------
| P1    | 0     | 3     | 3     | 3     | 0     |
| P2    | 1     | 2     | 5     | 4     | 2     |
| P3    | 2     | 1     | 6     | 4     | 3     |
| P4    | 3     | 4     | 10    | 7     | 3     |
| P5    | 4     | 5     | 15    | 11    | 6     |
| P6    | 5     | 2     | 17    | 12    | 10    |
-------------------------------------------------

Average Turnaround Time: 6.8333335
Average Waiting Time: 4.0
Schedule Length: 17
Throughput: 0.3529412
```

## Console

This is what you get in your console after executing the program

```
Enter Number of Processes: 6

Enter Burst Time and Arrival Time for each Process

Enter Arrival Time for all Processes: e.g. P1 P2 P3 P4 P5 (separate with spaces)
0 1 2 3 4 5

Enter Burst Time for all Processes: e.g. P1 P2 P3 P4 P5 (separate with spaces)
3 2 1 4 5 2
-------------------------
| P No. | AT    | BT    |
-------------------------
| P1    | 0     | 3     |
| P2    | 1     | 2     |
| P3    | 2     | 1     |
| P4    | 3     | 4     |
| P5    | 4     | 5     |
| P6    | 5     | 2     |
-------------------------

- - - - * FCFS | First Come First Serve * - - - -
-------------------------------------------------
| P No. | AT    | BT    | CT    | TAT   | WT    |
-------------------------------------------------
| P1    | 0     | 3     | 3     | 3     | 0     |
| P2    | 1     | 2     | 5     | 4     | 2     |
| P3    | 2     | 1     | 6     | 4     | 3     |
| P4    | 3     | 4     | 10    | 7     | 3     |
| P5    | 4     | 5     | 15    | 11    | 6     |
| P6    | 5     | 2     | 17    | 12    | 10    |
-------------------------------------------------

Average Turnaround Time: 6.8333335
Average Waiting Time: 4.0
Schedule Length: 17
Throughput: 0.3529412
```
