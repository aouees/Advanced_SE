
package Week3;

public class Main {

    public static void main(String[] args) {
        App app= new App(new Winfactory());
        app.build();
        System.out.println("********************************");
        app.fa=new LinFactory();
        app.build();
    }
    
}
