package com.jenson.ecommerce.dto;

import com.jenson.ecommerce.model.PmsProduct;
import com.jenson.ecommerce.model.SmsFlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购及商品信息封装
 *
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation{
    @Getter
    @Setter
    private PmsProduct product;
}
