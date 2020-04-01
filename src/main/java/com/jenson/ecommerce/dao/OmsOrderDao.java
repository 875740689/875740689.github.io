package com.jenson.ecommerce.dao;

import com.jenson.ecommerce.dto.OmsOrderDeliveryParam;
import com.jenson.ecommerce.dto.OmsOrderDetail;
import com.jenson.ecommerce.dto.OmsOrderQueryParam;
import com.jenson.ecommerce.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单自定义查询Dao
 *
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
