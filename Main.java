package com.company;

public class Main {
    private static final int COUNT_OF_THREADS = 4;

    public static void main(String[] args) {
        CalculationThread calculationThread = new CalculationThread(COUNT_OF_THREADS);
        long time = System.currentTimeMillis();
        PairCorrectTotalPoits pairCorrectTotalPoits = calculationThread.getPiNumber();
        System.out.println("Thread counts : " + COUNT_OF_THREADS + '\n' +
                (double) 4 * pairCorrectTotalPoits.getCorrectPoints() / pairCorrectTotalPoits.getTotalPoints() + '\n' +
                "Thread itteration : 10000000" + '\n' +
                "Time : " + (System.currentTimeMillis() - time)
        );
    }
}
