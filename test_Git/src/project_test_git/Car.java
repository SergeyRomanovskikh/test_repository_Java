package project_test_git;

public class Car {
    private String color;
    private String name;


    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void printPidor(){
        System.out.println(this.name + " хоть и машина, но все равно гей");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
