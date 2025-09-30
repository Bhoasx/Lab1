public class Vect {
    private double x;
    private double y;

    public Vect(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double magnitud() {
        return Math.sqrt((x * x) + (y * y));
    }

    public Vect suma(Vect v) {
        return new Vect(this.x + v.x, this.y + v.y);
    }

    public double productoEscalar(Vect v) {
        return (this.x * x) + (this.y * y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}