package Cafe4me@home;

public class Departed extends AbstractEvent {

    private Long id;
    private String customerAddress;
    private String orderedContents;

    public Departed(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public String getOrderedContents() {
        return orderedContents;
    }

    public void setOrderedContents(String orderedContents) {
        this.orderedContents = orderedContents;
    }
}
