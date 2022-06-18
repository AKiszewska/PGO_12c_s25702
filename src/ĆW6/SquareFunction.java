package ĆW6;

public class SquareFunction extends Function implements Fun{

    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    SquareFunction(double a, double b, double c){
        setA(a);
        setB(b);
        setC(c);
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a += delta;
        b += delta;
        c += delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a -= delta;
        b -= delta;
        c -= delta;
    }

    @Override
    public double f(double x) {
        return a * x * x + b * x + c;
    }
}
