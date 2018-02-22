package by.epam.preTraining.SiarheiHuba.tasks.task5.EntityClass;

import java.util.Date;

public class Container {

    private int height;
    private int length;
    private int width;
    private String type;
    private int containerID = 0;
    private Date arrivalDate;
    private Date departureDate;

    public int getContainerID() {
        return containerID;
    }

    private boolean isInsured;
    private String ShippingCompany;

    public Container() {
    }

    public Container(String type) {
        this.type = type;
    }

    public Container(String type, Date arrivalDate, Date departureDate, boolean isInsured, String shippingCompany) {
        this.type = type;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.isInsured = isInsured;
        this.ShippingCompany = shippingCompany;
        this.containerID = containerID;
        containerID++;
    }


}

