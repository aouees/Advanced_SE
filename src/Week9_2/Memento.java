package Week9_2;



public class Memento {
    String state;

    public String getState() {
        return state;
    }
    public void saveStateToStack(MemntoStack s){
        s.saveMomento(this);
    }
    public Memento(String s){
        state=s;
    }
}


