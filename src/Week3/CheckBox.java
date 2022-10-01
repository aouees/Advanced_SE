
package Week3;


 abstract public class CheckBox {
       abstract void paint();
}
class LinCheckBox extends CheckBox{

    @Override
    void paint() {
        System.out.println("paint Linux CheckBox ");
    }
}

class WinCheckBox extends  CheckBox{

    @Override
    void paint() {
        System.out.println("paint Windows CheckBox");
    }

}
