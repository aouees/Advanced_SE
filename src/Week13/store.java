package Week13;

public abstract class store implements subject {
    logger l;
    public store(){
        l=logger.getInstance();
    }
    public  abstract  void createOffer(offer o);
}
