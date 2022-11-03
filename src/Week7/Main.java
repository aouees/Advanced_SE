package Week7;

public class Main {
    public static void main(String[] args) {
        Image[] images =new Image[] { new Image("image 1") ,new Image("image 2"),new Image("image 3")};
        Image_view imageView=new Image_view();
        filtter myfiltter1=new my_filtter1();
        filtter myfiltter2=new my_filtter2();
        filtter grayfiltter=new gray_adapter_filtter();

        for (Image i:images
             ) {
            imageView.show_Image(i);
            imageView.show_Image(myfiltter1.applyfiltter(i));
            imageView.show_Image(myfiltter2.applyfiltter(i));
            imageView.show_Image(grayfiltter.applyfiltter(i));
        }


    }
}
