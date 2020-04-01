package com.jenson.ecommerce.dao;

import com.jenson.ecommerce.dto.OmsOrderReturnApplyResult;
import com.jenson.ecommerce.dto.OmsReturnApplyQueryParam;
import com.jenson.ecommerce.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单退货申请自定义Dao
 *
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
