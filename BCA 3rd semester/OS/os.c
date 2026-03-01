#include <stdio.h>
int main(){
    
    int arrival[10], burst[10], pid[10];
    int start[10], finish[10], wait[10], turn[10];
    int i, j, n;
           
    float totalwait  = 0.0, totalturn = 0.0;
           
    printf("Name: Bibhu Shrestha \n");
    printf("Enter number of processes: ");
    scanf("%d", &n);
           
    //input
    for(i = 0; i < n; i++){
        pid[i] = i + 1;
        printf("Enter Arrival and Burst time of Process %d: ", i + 1);
        scanf("%d %d", &arrival[i], &burst[i]);
    }
                    
    // SORT BY ARRIVAL TIME (tie -> lower PID first)
    for(i = 0; i < n - 1; i++){
        for(j = i + 1; j < n; j++){
            if(arrival[j] < arrival[i] || 
               (arrival[j] == arrival[i] && pid[j] < pid[i])) {
                
                //swap arrival
                int temp = arrival[i];
                arrival[i] = arrival[j];
                arrival[j] = temp;
                                 
                //swap burst
                temp = burst[i];
                burst[i] = burst[j];
                burst[j] = temp;

                //swap pid
                temp = pid[i];
                pid[i] = pid[j];
                pid[j] = temp;
            }
        }
    }
                    
    //FCFS scheduling Calculations 
    start[0] = arrival[0];
    finish[0] = start[0] + burst[0];
                                 
    for(i = 1; i < n; i++){
        if(finish[i-1] < arrival[i])
            start[i] = arrival[i]; // CPU idle
        else
            start[i] = finish[i-1];
                                              
        finish[i] = start[i] + burst[i];
    }
                                          
    //calculate turnaround and wait time
    for(i = 0; i < n; i++){
        turn[i] = finish[i] - arrival[i];
        wait[i] = turn[i] - burst[i];
                                                   
        totalwait += wait[i];
        totalturn += turn[i];
    }

    //output  
    printf("\nProcess\tArrival\tBurst\tStart\tFinish\tTurn\tWait\n");
                                          
    for(i = 0; i < n; i++){
        printf("P%d\t%7d\t%5d\t%5d\t%5d\t%5d\t%5d\n",
               pid[i], arrival[i], burst[i], start[i], finish[i], turn[i], wait[i]);
    }
                                                         
    printf("\nAverage Waiting Time: %.2f\n", totalwait / n);
    printf("Average Turnaround Time: %.2f\n", totalturn / n);
                                                         
    return 0;
}
