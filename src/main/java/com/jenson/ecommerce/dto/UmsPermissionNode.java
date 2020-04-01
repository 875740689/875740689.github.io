package com.jenson.ecommerce.dto;

import com.jenson.ecommerce.model.UmsPermission;

import java.util.List;

/**
 * 后台权限节点封装
 *
 */
public class UmsPermissionNode extends UmsPermission {
    
    public List<UmsPermissionNode> getChildren() {
		return children;
	}

	public void setChildren(List<UmsPermissionNode> children) {
		this.children = children;
	}

	private List<UmsPermissionNode> children;
}
