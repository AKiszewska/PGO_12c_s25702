package ĆW6;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        double minimum = a;
        double tmp = a;
        if( a > b ){
            throw new RuntimeException("'a' couldn't be greater then b");
        }
        else{
            while ( tmp <= b ){
                tmp=tmp+alpha;
                if (func.f(tmp) < func.f(minimum)){
                    minimum = tmp;
                }
            }
        }
        return func.f(minimum);
    }
}
