package ie.atu.oop.week2;

public class Tickets {
    private String eventName;
    private String holderName;
    private double basePrice;


    public Tickets(String eventName, String holderName, double basePrice) {
        this.eventName = eventName;
        this.holderName = holderName;
        this.basePrice = basePrice;
    }

    public Tickets()
    {
        this.eventName = "";
        this.holderName = "";
        this.basePrice = 0;
    }

    public String getEventName() {
        return eventName;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBasePrice() {
        return basePrice;
    }
     public double calculatePrice(){
        return basePrice;
     }

    @Override
    public String toString() {
        return "Tickets{" +
                "eventName='" + eventName + '\'' +
                ", holderName='" + holderName + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
