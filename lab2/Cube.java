public class Cube extends Shape3D{
    private double edge;
    public Cube(double e){
        this.edge =e;
    }
    @Override
    public double volume(){
        return Math.pow(edge,3);
    }
    @Override
    public double surfaceArea(){
        return Math.pow(edge,2);
    }
}
