package lt.vistar.docs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
    private BigDecimal hotel;

    public PolecenieWyjazdu(String number, Calendar date, String name, String lastName, String position,
                            Customer customer, Calendar dateBegin, Calendar dateEnd, String carType, BigDecimal hotel) {
        this.number = number;
        this.date = date;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.customer = customer;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.carType = carType;
        this.hotel = hotel;
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

    public BigDecimal getHotel() {
        return hotel;
    }

    public void setHotel(BigDecimal hotel) {
        this.hotel = hotel;
    }
}
