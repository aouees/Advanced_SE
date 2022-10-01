
package Week3;

abstract public class Button {
   abstract void paint();
}

class LinButton extends Button {

   @Override
   void paint() {
      System.out.println("paint Linux Button ");
   }

}


class WinButton extends Button {

   @Override
   void paint() {
      System.out.println("paint Windows Button");
   }

}
