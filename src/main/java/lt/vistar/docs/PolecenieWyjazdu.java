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
    private ListTrasa listTrasa;

    public PolecenieWyjazdu(String number, Calendar date, String name, String lastName, String position,
                            Customer customer, Calendar dateBegin, Calendar dateEnd, String carType, BigDecimal hotel
                            , ListTrasa listTrasa) {
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
        this.listTrasa = listTrasa;
    }

    public String getPosition() {
        return position;
    }

    public String getNumber() {
        return number;
    }

    public Calendar getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Calendar getDateBegin() {
        return dateBegin;
    }

    public Calendar getDateEnd() {
        return dateEnd;
    }

    public String getCarType() {
        return carType;
    }

    public BigDecimal getHotel() {
        return hotel;
    }

    public ListTrasa getListTrasa(){
        return listTrasa;
    }
}
