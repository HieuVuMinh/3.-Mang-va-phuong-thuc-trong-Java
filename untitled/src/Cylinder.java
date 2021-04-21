public class Cylinder extends Circle {
    private double height;

    public Cylinder(){};

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double tinhTheTich(){
        double dt = (Math.PI * Math.pow(getRadius(), 2) *getHeight());
        return dt;
    };
}
