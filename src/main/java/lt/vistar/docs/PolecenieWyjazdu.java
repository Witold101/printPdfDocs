package lt.vistar.docs;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PolecenieWyjazdu {
    private String number;
    private String date;
    private String name;
    private String lastName;
    private String position;
    private Customer customer;
    private String dateBegin;
    private String dateEnd;
    private String carType;
    private String target;
    private BigDecimal hotel;
    private ListTrasa listTrasa;

    public PolecenieWyjazdu(String number, Calendar date, String name, String lastName, String position,
                            Customer customer, Calendar dateBegin, Calendar dateEnd, String carType,String target,
                            BigDecimal hotel, ListTrasa listTrasa) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.number = number;
        this.date = dateFormat.format(date.getTime());
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.customer = customer;
        this.dateBegin = dateFormat.format(dateBegin.getTime());
        this.dateEnd = dateFormat.format(dateEnd.getTime());
        this.carType = carType;
        this.target = target;
        this.hotel = hotel;
        this.listTrasa = listTrasa;
    }

    public String getPosition() {
        return position;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
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

    public String getDateBegin() {
        return dateBegin;
    }

    public String getDateEnd() {
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

    public String getTarget() {
        return target;
    }
}
