public class Sphere extends Shape3D{
    private double radius;
    public Sphere(double r){
        this.radius = r;
    }
    @Override
    public double volume(){
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
    @Override
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}
