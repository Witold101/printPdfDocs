package lt.vistar.docs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ListTrasa {
    private List<Trasa> list;
    private BigDecimal cost;

    public ListTrasa() {
        this.list= new ArrayList<>();
        this.cost=new BigDecimal(0);
    }

    public List<Trasa> getList() {
        return list;
    }

    public void buildList(Trasa trasa){
        this.cost = cost.add(trasa.getCost());
        list.add(trasa);
    }

    public BigDecimal getCost() {
        return cost;
    }
}
