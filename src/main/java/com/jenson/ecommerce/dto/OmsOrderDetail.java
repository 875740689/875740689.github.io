package com.jenson.ecommerce.dto;

import com.jenson.ecommerce.model.OmsOrder;
import com.jenson.ecommerce.model.OmsOrderItem;
import com.jenson.ecommerce.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 *
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
