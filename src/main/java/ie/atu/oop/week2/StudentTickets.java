package ie.atu.oop.week2;

public class StudentTickets extends Tickets {
    private String studentId;

    public StudentTickets(String studentId ,String eventName, String holderName, double basePrice){
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public StudentTickets(String studentId) {
        this.studentId = studentId;
    }

    public StudentTickets(String eventName, String holderName, double basePrice) {
        super(eventName,holderName,basePrice);
    }

    public StudentTickets() {
        this.studentId = "";
    }

    @Override
    public double calculatePrice(){
        return getBasePrice() *0.8;
    }
}