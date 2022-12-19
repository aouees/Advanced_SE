package Week13;

public class offer {
    String duration;
    String discoun;

    public offer(String d,String dd){
        duration=d;
        discoun=dd;
    }

    @Override
    public String toString() {
        return "offer{" +
                "duration='" + duration + '\'' +
                ", discoun='" + discoun + '\'' +
                '}';
    }
}
