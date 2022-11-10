package Week9_2;

import java.util.Stack;

public class MemntoStack {
    Stack<Memento> states= new Stack<>();
    public void saveMomento(Memento m){
       states.push(m);
    }
    public Memento undo() throws Exception {
        if(states.size()==1) throw new Exception("no State befor that");
        states.pop();
        return states.lastElement();
    }
}