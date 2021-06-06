package Ex19;

public class Person {
    private int height, weight;
    public void setHealth(int height, int weight)
    {
        this.height = height;
        this.weight = weight;
    }
    public double determineBMI()
    {
        // bmi = (weight / (height × height)) * 703
        double new_weight = (double) weight;
        double bmi = (new_weight / (height * height)) * 703;
        return bmi;
    }
}
