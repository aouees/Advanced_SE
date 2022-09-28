package Week3;

public class App {

    Factory fa;

    public App(Factory f) {
        fa = f;
    }

    public void build() {
        System.out.println("build : " + (fa instanceof Winfactory ? " Windows UI " : "Linux UI"));
        Button b = fa.createButton();
        b.paint();
        CheckBox c = fa.createCheckBox();
        c.paint();
    }
}
