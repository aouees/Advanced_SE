package Week7;

public class gray_adapter_filtter extends filtter {
    gray_filtter grayFiltter = new gray_filtter();



    @Override
    Image applyfiltter(Image image) {
        return grayFiltter.applay_gray_filtter( image);
    }
}
