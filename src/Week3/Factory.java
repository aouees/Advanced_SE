
package Week3;

public interface Factory {
    Button createButton();
    CheckBox createCheckBox();
}

class Winfactory implements Factory{

    @Override
    public Button createButton() {
        System.out.println("createButton <<windows factory >>");
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        System.out.println("createCheckBox <<windows factory >>");
        return new WinCheckBox();
    }
}
class LinFactory implements Factory{

    @Override
    public Button createButton() {
        System.out.println("createButton <<linux factory >>");
        return new LinButton();

    }

    @Override
    public CheckBox createCheckBox() {
        System.out.println("createCheckBox <<linux factory >>");
        return new LinCheckBox();
    }

}