/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author new laptop
 */
public class LinFactory implements Factory{

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
