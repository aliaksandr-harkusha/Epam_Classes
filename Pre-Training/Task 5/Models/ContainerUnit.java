package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

import java.util.GregorianCalendar;

public class ContainerUnit {

    private String type;
    private int containerID = 1;
    private GregorianCalendar arrivalDate;
    private GregorianCalendar departureDate;
    private boolean isInsured;
    private String ShippingCompany;

    public ContainerUnit(String type, GregorianCalendar arrivalDateYYYYMMDD, GregorianCalendar departureDateYYYYMMDD,
                         boolean isInsured, String shippingCompany) {
        this.type = type;
        this.arrivalDate = arrivalDateYYYYMMDD;
        this.departureDate = departureDateYYYYMMDD;
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

    public GregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    public GregorianCalendar getDepartureDate() {
        return departureDate;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public String getShippingCompany() {
        return ShippingCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContainerUnit that = (ContainerUnit) o;
        if (containerID != that.containerID) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return arrivalDate != null ? arrivalDate.equals(that.arrivalDate) : that.arrivalDate == null;
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
