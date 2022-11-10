package Week9_2;

public class Main {
    public static void main(String[] args)   {
        SomeObject obj=new SomeObject("init");
        System.out.println("obj.getState() = " + obj.getState());
        obj.setState("Run");
        obj.setState("Suspend");
        System.out.println("obj.getState() = " + obj.getState());
        try {
        obj.reStoreState();
        }
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        System.out.println("obj.getState() = " + obj.getState());
        try {
            obj.reStoreState();
        }
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        System.out.println("obj.getState() = " + obj.getState());
        try {
            obj.reStoreState();
        }
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        System.out.println("obj.getState() = " + obj.getState());
    }
}
