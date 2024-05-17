package cpusimulation;


import java.util.LinkedList;
import java.util.Queue;


class CpuSimulation {
    Queue<Job> queue;
    int waitingTime;
    int turnaroundTime;
    int totalJobs;

    public CpuSimulation() {
        queue = new LinkedList<>();
        waitingTime = 0;
        turnaroundTime = 0;
        totalJobs = 0;
    }

    public void addJob(Job job) {
        queue.add(job);
        totalJobs++;
    }

    public void runScheduler() {
        while (!queue.isEmpty()) {
            Job currentJob = getHighestPriorityJob();
            System.out.println("Processing job: " + currentJob.getName());
            waitingTime += totalJobs - 1;
            turnaroundTime += waitingTime + currentJob.getProcessingTime();
            System.out.println("Waiting time: " + waitingTime);
            System.out.println("Turnaround time: " + turnaroundTime);
            totalJobs--;
        }
    }
    private Job getHighestPriorityJob() {
        Job highestPriorityJob = null;
        for (Job job : queue) {
            if (highestPriorityJob == null || job.getPriority() < highestPriorityJob.getPriority()) {
                highestPriorityJob = job;
            }
        }
        queue.remove(highestPriorityJob);
        return highestPriorityJob;
    }

    public static void main(String[] args) {
        CpuSimulation scheduler = new CpuSimulation();

        scheduler.addJob(new Job("Job1", 5,2));
        scheduler.addJob(new Job("Job2", 3,1));
        scheduler.addJob(new Job("Job3", 2,3));

        scheduler.runScheduler();
    }
}