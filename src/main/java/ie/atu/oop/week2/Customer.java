package ie.atu.oop.week2;

public class Customer extends person  {
    private int customerNumber;
    private boolean mailingList;

    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList)
    {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public Customer()
    {
        super();
        this.customerNumber =0;
        this.mailingList = false;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }
}

