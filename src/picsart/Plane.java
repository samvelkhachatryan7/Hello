package picsart;

public class Plane {

        private String model;
        private String country;
        private int year;
        private int hours;
        private boolean military;
        private int weight;
        private int wingspan;
        private int topSpeed;
        private int seats;
        private double cost;

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public int getHours() {
        return hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public int getWeight() {
        return weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public double getCost() {
        return cost;
    }

    public   Plane(String model, String country, int year, int hours, boolean military, int weight, int wingspan, int topSpeed, int seats, double cost){
      this.model= model;
      this.country= country;
      this.year=year;
      this.hours=hours;
      this.military=military;
      this.weight=weight;
      this.wingspan=wingspan;
      this.topSpeed=topSpeed;
      this.seats=seats;
      this.cost=cost;







  }
}








