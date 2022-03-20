package lt.vistar.docs;

import java.util.Calendar;

public class PolecenieWyjazdu {
    private String number;
    private Calendar date;
    private String name;
    private String lastName;
    private String position;
    private Customer customer;
    private Calendar dateBegin;
    private Calendar dateEnd;
    private String carType;

    public PolecenieWyjazdu(String number, Calendar date, String name, String lastName, String position,
                            Customer customer, Calendar dateBegin, Calendar dateEnd, String carType) {
        this.number = number;
        this.date = date;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.customer = customer;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.carType = carType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Calendar getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Calendar dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Calendar getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Calendar dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
