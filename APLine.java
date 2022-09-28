public class APLine {

    private int intA;
    private int intB;
    private int intC;

    public APLine(int a, int b, int c) {
        intA = a;
        intB = b;
        intC = c;
    }

    public double getSlope() {
        return (-1.0 * intA) / intB; 
    }

    public boolean isOnLine(int x, int y) {
        return (intA * x) + (intB * y) + intC == 0;
    }
}
