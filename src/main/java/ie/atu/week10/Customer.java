package ie.atu.week10;

public class Customer extends Person
{
    private String customerNumber;
    private boolean mailingList;

    public Customer(){
    }

    public Customer(String name, String address, String phoneNo, String customerNumber, boolean mailingList) {
        super(name, address, phoneNo);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "" +
                ", customerNumber = '" + customerNumber + '\'' +
                ", mailingList = " + mailingList +
                '}';
    }
}
