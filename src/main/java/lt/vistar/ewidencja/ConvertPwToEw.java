package lt.vistar.ewidencja;

import lt.vistar.RunApp;
import lt.vistar.docs.PolecenieWyjazdu;
import lt.vistar.docs.Trasa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ConvertPwToEw {
    private List<TableEPP> tableEPP;
    private List<PolecenieWyjazdu> list;

    public ConvertPwToEw() {
    }

    public void addPolecenieWyjazdu(PolecenieWyjazdu polecenieWyjazdu) {
        if (this.list == null) {
            list = new ArrayList<>();
        }
        if (this.tableEPP == null) {
            tableEPP = new ArrayList<>();
        }
        list.add(polecenieWyjazdu);

        for (Trasa lt : polecenieWyjazdu.getListTrasa().getList()) {
            TableEPP table = new TableEPP();
            table.setDataBegin(lt.getDateBegin());
            table.setWay(lt.getCityBegin() + " - " + lt.getCityEnd());
            table.setTarget(polecenieWyjazdu.getTarget());
            table.setKm(lt.getKm() + "km");
            table.setConstant(RunApp.FACTOR + "");
            table.setCost(RunApp.FACTOR.multiply(new BigDecimal(lt.getKm()))
                    .setScale(2, RoundingMode.HALF_UP));
            table.setOpis("PW"+polecenieWyjazdu.getNumber());
            tableEPP.add(table);
        }
    }


    public List<TableEPP> getTableEPP() {
        if (this.tableEPP == null) {
            tableEPP = new ArrayList<>();
        }
        return tableEPP;
    }
}
