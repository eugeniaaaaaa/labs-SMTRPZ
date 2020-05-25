package com.company.passanger;

 public class FireFighter extends Human {
    private String rank;
    private int countOfExtinguishedFires;

    public FireFighter(String name, String surname, int age, String rank, int countOfExtinguishedFires) {
        super(name, surname, age);
        this.rank = rank;
        this.countOfExtinguishedFires = countOfExtinguishedFires;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getCountOfExtinguishedFires() {
        return countOfExtinguishedFires;
    }

    public void setCountOfExtinguishedFires(int countOfExtinguishedFires) {
        this.countOfExtinguishedFires = countOfExtinguishedFires;
    }

    public void putOutTheFire() {
        System.out.println("Fire fightre put out the fire");
    }

    @Override
    public String toString() {
        return super.toString()+ "rank='" + rank + '\'' +
                ", countOfExtinguishedFires=" + countOfExtinguishedFires +
                " }";
    }
}
