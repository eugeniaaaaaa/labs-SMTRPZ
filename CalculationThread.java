package com.company;

import java.util.Random;

public class CalculationThread extends Thread {
    private static final double CIRCLE_RADIUS = 1;
    private int totalPoints;
    private int correctPoints ;
    private int countOfThreads;

    CalculationThread(int countOfThreads) {
        this.countOfThreads = countOfThreads;
    }

    @Override
    public void run() {
        for (int itter = 0; itter < 1000000 / countOfThreads; itter++) {
            double x = new Random().nextDouble() * CIRCLE_RADIUS;
            double y = new Random().nextDouble() * CIRCLE_RADIUS;
            if (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(CIRCLE_RADIUS, 2)) {
                correctPoints++;
            }
            totalPoints++;
        }
    }

    public PairCorrectTotalPoits getPiNumber() {
        CalculationThread[] calculationThreads = new CalculationThread[countOfThreads];
        for (int itter = 0; itter < countOfThreads; itter++) {
            CalculationThread calculationThread = new CalculationThread(countOfThreads);
            calculationThread.start();
            calculationThreads[itter] = calculationThread;
        }
        double resCorrectPoints  = 0.0;
        double resTotalPoints = 0.0 ;
        for(CalculationThread thread : calculationThreads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resCorrectPoints += thread.correctPoints;
            resTotalPoints += thread.totalPoints;
        }
        return new PairCorrectTotalPoits(resCorrectPoints,resTotalPoints);
    }
}

