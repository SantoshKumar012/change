class Shortestjob{
    public long solve (int[] bt){
   
       long waitTime = 0;
      long totalTime=0;
        int n = bt.length;
        for(int i=0;i<n;i++){
            totalTime+=bt[i];
        
        waitTime += totalTime;
        }
return waitTime / n;

    }
    public static void main(String[] args) {
        int[] jobs = {1, 2, 3, 4};

        System.out.print("Array Representing Job Durations: ");
        for (int job : jobs) {
            System.out.print(job + " ");
        }
        System.out.println();

        Shortestjob solution = new Shortestjob();
        long ans = solution.solve(jobs);
        System.out.println("Total waiting time: " + ans);
    }
}