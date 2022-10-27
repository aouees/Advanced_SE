package Week7;

public abstract class filtter {

 abstract  Image applyfiltter(Image image);


}
class my_filtter1 extends filtter{

    @Override
    public  Image applyfiltter(Image image) {
        return  new Image(image.getData()+ ": applyfiltter my_filtter1");
    }

}
class my_filtter2 extends filtter{


    @Override
    public  Image applyfiltter(Image image) {
        return  new Image(image.getData()+ ": applyfiltter my_filtter2");
    }
}
