package Week9_2;

public class SomeObject {
    String state;
    MemntoStack s=new MemntoStack();
    public SomeObject(String state){
        setState(state);
    }
    public void setState(String state) {
        this.state = state;
        new Memento(this.state).saveStateToStack(s);
    }
    public String getState() {
        return state;
    }
    public void reStoreState() throws Exception {
       state= s.undo().getState();
    }
}
