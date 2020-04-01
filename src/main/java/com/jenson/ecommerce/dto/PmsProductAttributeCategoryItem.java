package com.jenson.ecommerce.dto;

import com.jenson.ecommerce.model.PmsProductAttribute;
import com.jenson.ecommerce.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 包含有分类下属性的dto
 *
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    private List<PmsProductAttribute> productAttributeList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
