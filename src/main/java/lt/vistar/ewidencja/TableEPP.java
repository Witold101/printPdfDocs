package lt.vistar.ewidencja;

import java.math.BigDecimal;

public class TableEPP {
    private String dataBegin;
    private String way;
    private String target;
    private String km;
    private String constant;
    private BigDecimal cost;
    private String opis;

    public TableEPP(){

    }

    public TableEPP(String dataBegin, String way, String target, String km, String constant
            , BigDecimal cost, String opis) {
        this.dataBegin = dataBegin;
        this.way = way;
        this.target = target;
        this.km = km;
        this.constant = constant;
        this.cost = cost;
        this.opis = opis;
    }

    public void setDataBegin(String dataBegin) {
        this.dataBegin = dataBegin;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getDataBegin() {
        return dataBegin;
    }

    public String getWay() {
        return way;
    }

    public String getTarget() {
        return target;
    }

    public String getKm() {
        return km;
    }

    public String getConstant() {
        return constant;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }
}
