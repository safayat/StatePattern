/**
 * Created by safayat on 10/7/16.
 */
public class MultiplyState implements State {
    private  int a,b;

    @Override
    public int calculate() {
        return a*b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}