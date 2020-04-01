package com.jenson.ecommerce.dao;

import com.jenson.ecommerce.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 自定义商品属性分类Dao
 *
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含商品属性的商品属性分类列表
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
