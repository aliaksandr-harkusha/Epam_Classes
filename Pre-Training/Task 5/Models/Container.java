package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

import java.util.Date;

public class Container {

    private String type;
    private int containerID = 1;
    private Date arrivalDate;
    private Date departureDate;
    private boolean isInsured;
    private String ShippingCompany;

    public Container(String type, Date arrivalDate, Date departureDate, boolean isInsured, String shippingCompany) {
        this.type = type;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.isInsured = isInsured;
        this.ShippingCompany = shippingCompany;
        this.containerID = containerID;
        containerID++;
    }

    public String getType() {
        return type;
    }

    public int getContainerID() {
        return containerID;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public String getShippingCompany() {
        return ShippingCompany;
    }

    public boolean equals(Container cont) {
        if (!(this.type == cont.getType()))
            return false;
        else if (!(this.getArrivalDate().compareTo(cont.getArrivalDate()) == 0))
            return false;
        else if (!(this.getDepartureDate().compareTo(cont.getDepartureDate()) == 0))
            return false;
        else if (!(this.getShippingCompany().equals(cont.getShippingCompany())))
            return false;
        else if (!(this.isInsured() == cont.isInsured()))
            return false;
        else return true;
    }

    @Override
    public String toString() {
        return "Container id: " + containerID + ", type " + type + ", arrivalDate: " + arrivalDate + ", departureDate: " +
                departureDate;
    }

    @Override
    public int hashCode() {
        return 42 * (this.containerID + this.getType().hashCode() + this.getArrivalDate().hashCode());
    }
}
