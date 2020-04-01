package com.jenson.ecommerce.dto;

import com.jenson.ecommerce.model.UmsMenu;

import java.util.List;

/**
 * 后台菜单节点封装
 *
 */
public class UmsMenuNode extends UmsMenu {
    public List<UmsMenuNode> getChildren() {
		return children;
	}

	public void setChildren(List<UmsMenuNode> children) {
		this.children = children;
	}

	private List<UmsMenuNode> children;
}
