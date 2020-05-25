package com.company;

public class PairCorrectTotalPoits {
    private  double correctPoints;
    private double totalPoints ;

    public PairCorrectTotalPoits(double correctPoints, double totalPoints) {
        this.correctPoints = correctPoints;
        this.totalPoints = totalPoints;
    }

    public double getCorrectPoints() {
        return correctPoints;
    }

    public void setCorrectPoints(double correctPoints) {
        this.correctPoints = correctPoints;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }
}
