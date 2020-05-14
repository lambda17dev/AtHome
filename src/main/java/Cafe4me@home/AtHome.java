package Cafe4me@home;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="AtHome_table")
public class AtHome {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String customerAddress;
    private String oeredContents;
    private Integer atHomeStatus;


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
    public String getOeredContents() {
        return oeredContents;
    }

    public void setOeredContents(String oeredContents) {
        this.oeredContents = oeredContents;
    }
    public Integer getAtHomeStatus() {
        return atHomeStatus;
    }

    public void setAtHomeStatus(Integer atHomeStatus) {
        this.atHomeStatus = atHomeStatus;
    }




}
