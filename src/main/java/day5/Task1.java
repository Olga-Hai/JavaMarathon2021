package day5;

public class Task1 {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setIssueYear(2001);
        myCar.setColor("Cosmic Black");
        myCar.setModel("BMW");

        System.out.println("I've got a " + myCar.getColor() + " " + myCar.getModel() + " car, " + myCar.getIssueYear() + " year of issue." );
    }
}

class Car {
    private int issueYear;
    private String color;
    private String model;

    public void setIssueYear(int carYear) {
        issueYear = carYear;
    }
    public int getIssueYear() {
        return issueYear;
    }

    public void setColor(String carColor) {
        color = carColor;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        model = carModel;
    }
    public String getModel() {
        return model;
    }
}
