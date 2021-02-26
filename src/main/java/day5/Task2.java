package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike myBike = new Motorbike(1991, "red & black",  "Yamaha");
        myBike.getColor();
        myBike.getIssueYear();
        myBike.getModel();
        System.out.println("I've got a " + myBike.getColor() + " " + myBike.getModel() + " bike, " + myBike.getIssueYear() + " year of issue.");

    }
}

class Motorbike {
    private int issueYear;
    private String color;
    private String model;

    public Motorbike(int issueYear, String color, String model) {
        this.issueYear = issueYear;
        this.color = color;
        this.model = model;
    }
    public int getIssueYear(){return issueYear;}
    public String getColor(){return color;}
    public String getModel(){return model;}


}
