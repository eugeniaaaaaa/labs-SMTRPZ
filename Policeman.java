package com.company.passanger;

public class Policeman extends Human {
    private String rank;
    private String gun;
    private String position;

    public Policeman(String name, String surname, int age, String rank, String gun, String position) {
        super(name, surname, age);
        this.position = position;
        this.rank = rank;
        this.gun = gun;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void adjustTraffic() {
        System.out.println("Policeman can adjust traffic");
    }

    @Override
    public String toString() {
        return super.toString()+
                "rank=" + rank + '\'' +
                ", gun='" + gun + '\'' +
                ", position='" + position +"}";
    }
}
