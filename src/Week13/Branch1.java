package Week13;

import java.util.ArrayList;
import java.util.List;

public class Branch1 extends store{
    List<observer> observers=new ArrayList<>();
    SMSCompany mtn=new mtnadapter();
    SMSCompany syriatel=new syriateladapter();
    public Branch1(){
        super();
    }
    @Override
   public void createOffer(offer o) {
        l.saveOffer(o);
        notifyObserver(o);
    }

    @Override
    public void registerObserver(observer x) {
        observers.add(x);
    }

    @Override
    public void unregisterObserver(observer x) {

    }

    @Override
    public void notifyObserver(offer of) {
        for (observer o:observers
             ) {
           if (o.getSMSCompany()=="mtn"){

               o.showmsg(mtn.Send(of.toString()));
           }
           else
           {
               o.showmsg(syriatel.Send(of.toString()));

           }
        }
    }
}
