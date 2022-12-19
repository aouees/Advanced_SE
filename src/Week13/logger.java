package Week13;

import java.util.ArrayList;
import java.util.List;

public class logger {
    static logger l=null;
    List<offer> offers=new ArrayList<>();
    private logger(){

    }
    public static logger getInstance(){
        if(l==null) l =new logger();
        return  l;
    }
    public void saveOffer(offer o)
    {
        offers.add(o);
    }
    public void showOffers(){
        for (offer o:offers
             ) {
            System.out.println(o);
        }
    }
}
