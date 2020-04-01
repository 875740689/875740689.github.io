package com.jenson.ecommerce.dto;

import com.jenson.ecommerce.model.SmsFlashPromotionSession;

/**
 * 包含商品数量的场次信息
 *
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
  
    public Long getProductCount() {
		return productCount;
	}

	public void setProductCount(Long productCount) {
		this.productCount = productCount;
	}

	private Long productCount;
}
