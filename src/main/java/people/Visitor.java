package people;

import attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;

    public ArrayList<Attraction> getVisitedAttractions() {
        return visitedAttractions;
    }

    public void setVisitedAttractions(ArrayList<Attraction> visitedAttractions) {
        this.visitedAttractions = visitedAttractions;
    }

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        visitedAttractions = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }
}
