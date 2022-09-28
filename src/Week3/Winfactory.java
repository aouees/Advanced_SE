
package Week3;

public class Winfactory implements Factory{

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
