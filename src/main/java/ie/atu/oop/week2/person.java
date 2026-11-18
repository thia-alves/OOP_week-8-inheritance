package ie.atu.oop.week2;

public class person {
    private String Name;
    private String address;
    private String phoneNumber;

    public person(String name, String address, String phoneNumber){
        this.Name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public person(){
        this.Name = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "person{" +
                "Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
