package cpusimulation;

public class Job {
    String name;
    int processingTime;
    int priority;

    public Job(String name, int processingTime, int priority) {
        this.name = name;
        this.processingTime = processingTime;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public int getPriority() {
        return priority;
    }
}
