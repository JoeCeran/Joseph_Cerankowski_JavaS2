package CalculatorObject;

public class CalculateObject {

    private int x;
    private int y;
    private double xD;
    private double yD;
    public int sum;
    public double sumD;

    public CalculateObject(int x, int y){
        this.x = x;
        this.y = y;
    }
    public CalculateObject(double xD, double yD){
        this.xD = xD;
        this.yD = yD;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getxD() { return xD; }

    public void setxD(double xD) { this.xD = xD; }

    public double getyD() { return yD; }

    public void setyD(double yD) { this.yD = yD; }

    public int addition(){ return x + y; }

    public double additionDouble(){ return xD + yD; }

    public int subtraction(){ return x - y; }

    public double subtractionDouble(){ return xD - yD; }

    public int multiplication(){ return x * y; }

    public double multiplicationDouble(){ return xD * yD; }

    public int division(){ return x / y; }

    public double divisionDouble(){ return xD / yD; }
}
