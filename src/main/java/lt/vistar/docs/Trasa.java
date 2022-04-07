package lt.vistar.docs;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static lt.vistar.RunApp.FACTOR;

public class Trasa {
    private String cityBegin;
    private String cityEnd;
    private String dateBegin;
    private String dateEnd;
    private String timeBegin;
    private String timeEnd;
    private int km;
    private BigDecimal cost;

    private SimpleDateFormat dateFormat;
    private SimpleDateFormat timeFormat;

    public Trasa() {
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.timeFormat = new SimpleDateFormat("HH:mm");
    }

    public Trasa(String cityBegin,Calendar dateTimeBegin, String cityEnd,Calendar dateTimeEnd,int km) {
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.timeFormat = new SimpleDateFormat("HH:mm");
        this.cityBegin = cityBegin;
        this.cityEnd = cityEnd;
        this.km = km;
        this.dateBegin = dateFormat.format(dateTimeBegin.getTime());
        this.timeBegin = timeFormat.format(dateTimeBegin.getTime());
        this.dateEnd = dateFormat.format(dateTimeEnd.getTime());
        this.timeEnd = timeFormat.format(dateTimeEnd.getTime());
        calcCost();
    }

    public String getCityBegin() {
        return cityBegin;
    }

    public String getCityEnd() {
        return cityEnd;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public int getKm() {
        return km;
    }

    public BigDecimal getCost() {
        return cost;
    }

    private void calcCost() {
        this.cost= FACTOR.multiply(new BigDecimal(km)).setScale(2, RoundingMode.HALF_UP);
    }
}
