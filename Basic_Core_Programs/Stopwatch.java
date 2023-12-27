package LogicalPrograms;

import java.util.Scanner;

public class Stopwatch {
    private long startTime = 0;
    private long endTime = 0;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return (this.endTime - this.startTime ) / 1000.0;
    }
}
