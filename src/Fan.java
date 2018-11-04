public class Fan
{
    public final int SLOW=1;
    public final int MEDIUM=2;
    public final int FAST=3;

    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan()
    {
        System.out.println("Creates a default fan");
    }

    public String toString()
    {
        if(on==on)
        {
            return "fan speed"+this.speed+"color"+this.color+"radius"+this.radius;
        }
        else
        {
            return "fan color"+this.color+"radius"+this.radius+"Fan is off";
        }
    }
}
