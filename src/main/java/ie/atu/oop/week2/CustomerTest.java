package ie.atu.oop.week2;

public class CustomerTest {
    public static void main(String[] args) {
        Customer first = new Customer("paul", "Gort", "232323232", 123, true);
        System.out.println(first);

        Customer second = new Customer();
        second.setName("Pat");
        second.setAddress("Mervue");
        second.setPhoneNumber("232323232");
        second.setCustomerNumber(23);
        second.setMailingList(true);
        System.out.println(second);




    }
}
