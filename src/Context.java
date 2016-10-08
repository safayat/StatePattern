/**
 * Created by safayat on 10/7/16.
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int calculate() {
        return state.calculate();
    }


}