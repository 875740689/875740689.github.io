package com.jenson.ecommerce.dao;

import com.jenson.ecommerce.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分类自定义Dao
 *
 */
public interface PmsProductCategoryDao {
    /**
     * 获取包括子分类的商品分类列表
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
