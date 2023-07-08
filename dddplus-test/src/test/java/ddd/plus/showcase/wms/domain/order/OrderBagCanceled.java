package ddd.plus.showcase.wms.domain.order;

import io.github.dddplus.model.BoundedDomainModel;

import java.util.Set;

public class OrderBagCanceled extends BoundedDomainModel<OrderBag> {

    OrderBagCanceled(OrderBag bag) {
        this.model = bag;
    }

    public Set<OrderNo> orderNos() {
        return unbounded().orderNos();
    }

    public Set<OrderLineNo> orderLineNos() {
        return unbounded().orderLineNos();
    }

}
